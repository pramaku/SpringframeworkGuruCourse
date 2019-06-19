package com.example.di.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

public class FakeDataSource
{
	private String user;
	private String pass;
	private String url;

	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "FakeDataSource [user=" + user + ", pass=" + pass + ", url=" + url + "]";
	}

	
	
}
