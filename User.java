package Clases;

/**
 * Class to store information about users.
 * @author sheilaRodríguez.
 */
public class User
{
    private String userID;
    private String name;
    private String surname;
    private String email;
    private String password;
    private String phoneNumber;
    private String adress;
    private String typeOfUser;


    public User(String userID, String name, String surname, String email,
                String password, String phoneNumber, String adress, String typeOfUser)
    {
        this.userID = userID;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.adress = adress;
        this.typeOfUser = typeOfUser;
    }

    public User()
    {
        userID = " ";
        name = " ";
        surname = " ";
        email = " ";
        password = " ";
        phoneNumber = " ";
        adress = " ";
        typeOfUser = " ";
    }

    public String getUserID()
    {
        return userID;
    }

    public void setUserID(String userID)
    {
        this.userID = userID;
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

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public String getAdress()
    {
        return adress;
    }

    public void setAdress(String adress)
    {
        this.adress = adress;
    }

    public String getTypeOfUser()
    {
        return typeOfUser;
    }

    public void setTypeOfUser(String typeOfUser)
    {
        this.typeOfUser = typeOfUser;
    }

    @Override
    public String toString()
    {
        return userID + ":" + name + surname + "," + email + "\n " +
                password + "," + typeOfUser;
    }
}
