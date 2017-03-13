package AppLayer;

import java.util.ArrayList;

public class Users
{
    private ArrayList<User> userArrayList;

    public Users()
    {
        this.userArrayList = new ArrayList<User>();
    }

    public void addUser(User userObject)
    {
        userArrayList.add(userObject);
    }

    public ArrayList<User> getUserArrayList() {
        return userArrayList;
    }
}