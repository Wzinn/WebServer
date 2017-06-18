package dbService;

import dataSets.UsersDataSet;

public interface DBService {

    long addUser(String login, String password, String name) throws DBException;

    long addUser(String login, String password) throws DBException;

    UsersDataSet getUser(String login) throws DBException;

}
