package dbService;

import dataSets.UsersDataSet;

public interface DBService {

<<<<<<< HEAD
    long addUser(String login, String password, String name) throws DBException;

=======
    long addUser(String login, String password) throws DBException;

    long addUser(String login, String password, String name) throws DBException;

>>>>>>> refactoring
    UsersDataSet getUser(String login) throws DBException;

}
