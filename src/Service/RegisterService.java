package Service;

import DataBase.DataBase;
import Entities.User;
import Repository.IUserRepository;
import Repository.UserRepository;

import java.sql.Connection;
import java.util.Scanner;

public class RegisterService {
    private Connection connection;
    private Scanner scanner;

    private IUserRepository userRepository;

    public RegisterService(Connection connection, Scanner scanner){
        this.connection = connection;
        this.scanner = scanner;
        userRepository = new UserRepository(connection);
    }
    public void register(){
        System.out.println("Enter name :");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Enter email :");
        String email = scanner.nextLine();
        System.out.println("Enter mobileNo : ");
        int mobNumber = scanner.nextInt();
        User user = new User(name,email,mobNumber);
        boolean updated = userRepository.saveUser(user);

        if(updated){
            System.out.println("User registered successfully");
        }else{
            System.out.println("Try again!");
        }
    }








}
