package ru.mirea.lab2;
import java.lang.*;

public class author
{
    private String name;
    private String email;
    private char gender;

    public author(String n, String e, char g)
    {
        name=n;
        email=e;
        gender=g;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setGender(char gender)
    {
        this.gender = gender;
    }

    public String getName()
    {
        return name;
    }

    public String getEmail()
    {
        return email;
    }

    public char getGender()
    {
        return gender;
    }

    @Override
    public String toString()
    {
        return "автор " + this.name + " (" + this.gender + ")" + " на адрес электроной почты " + this.email;
    }
}