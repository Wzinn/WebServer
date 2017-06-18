package accounts;

import dataSets.UsersDataSet;
import dbService.DBException;
import dbService.DBService;
import dbService.DBServiceImpl;

public class AccountService {

    private DBService dbService;

    public AccountService() {
        dbService = new DBServiceImpl();
    }

    public void addNewUser(String login, String password, String name) {
        try {
            dbService.addUser(login, password, name);
        } catch (DBException dbe) {
            dbe.printStackTrace();
        }
    }

    public UsersDataSet getUserByLogin(String login) {
        try {
            return dbService.getUser(login);
        } catch (DBException dbe) {
            dbe.printStackTrace();
        }
        return null;
    }

}
