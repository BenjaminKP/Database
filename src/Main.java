import AppLayer.Users;
import ControllerLayer.UsersController;
import DataLayer.UsersDb;
import UILayer.UsersView;

public class Main {

        public static void main(String[] args){


                    Users usersModel = new Users();
                    UsersView usersView = new UsersView();
                    UsersDb usersDb = new UsersDb();
                    UsersController usersController = new UsersController(usersModel, usersView, usersDb);

                    usersController.usersMenuController ();
                }
}
