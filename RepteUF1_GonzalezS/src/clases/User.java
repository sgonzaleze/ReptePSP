/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author cep
 */
public class User
{

    private String nameuser;

    private ArrayList<User> users;

    private String password;

    private String rpassword;

    private String name;

    private String surname;

    private String email;

    private int numtel;

    private int numacc;

    public User(String nameuser, String password, String rpassword, String name,
            String surname, String email, int numtel, int numacc)
    {
        this.nameuser = nameuser;
        this.password = password;
        this.rpassword = rpassword;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.numtel = numtel;
        this.numacc = numacc;

    }

    public String getNameuser()
    {
        return nameuser;
    }

    public void setNameuser(String nameuser)
    {
        this.nameuser = nameuser;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getRpassword()
    {
        return rpassword;
    }

    public void setRpassword(String rpassword)
    {
        this.rpassword = rpassword;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public int getNumtel()
    {
        return numtel;
    }

    public void setNumtel(int numtel)
    {
        this.numtel = numtel;
    }

    public int getNumacc()
    {
        return numacc;
    }

    public void setNumacc(int numacc)
    {
        this.numacc = numacc;
    }

    public void UserNameLength(String nameuser)
    {
        System.out.println("Tu nombre de usuario es: " + nameuser.length());
    }


}
