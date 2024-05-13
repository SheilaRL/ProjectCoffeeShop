package Clases;
import java.util.List;

/**
 * Class to store a list of users to work with it.
 * @author sheilaRodríguez.
 */
public class UserLists
{
    List<User> userList;
    List<Client> clients;
    List<Employee> employees;

    /**
     * Function to add users to the list.
     *
     */
    public void addUsers (User users)
    {

        if (userList instanceof Client)
        {
            clients.add((Client)users);
        }

    else
        {
            employees.add((Employee)users);
        }

        userList.add(users);
    }
}
