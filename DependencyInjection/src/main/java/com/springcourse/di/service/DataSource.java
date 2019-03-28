package com.springcourse.di.service;

public class DataSource
{
    private String user;

    private String password;

    private String url;

    private String javaHome;

    public String getUser()
    {
        return user;
    }

    public void setUser(String user)
    {
        this.user = user;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getUrl()
    {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public void setEnv(String property)
    {
        this.javaHome = property;

    }

    public String getEnv()
    {
        return javaHome;

    }

}
