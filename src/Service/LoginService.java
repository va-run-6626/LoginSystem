package Service;

import Repository.IUserRepository;
import Repository.UserRepository;

import java.sql.Connection;
import java.util.Scanner;

public class LoginService {
    private Connection connection;
    private Scanner scanner;

    private IUserRepository userRepository;
    public LoginService(Connection connection, Scanner scanner){
        this.connection = connection;
        this.scanner = scanner;
        userRepository = new UserRepository(connection);
    }

    public void login(){

    }
}
