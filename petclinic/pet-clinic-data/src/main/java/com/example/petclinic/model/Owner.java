package com.example.petclinic.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="owners")
public class Owner extends Person
{
	@Column(name="address")
    private String address;

	@Column(name="city")
    private String city;

	@Column(name="telephone")
    private String telephone;
   
	@OneToMany(cascade=CascadeType.ALL, mappedBy="owner")
    Set<Pet> pets = new HashSet<>();
    
	public Set<Pet> getPets()
	{
		return pets;
	}

	public void setPets(Set<Pet> pets)
	{
		this.pets = pets;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
}
