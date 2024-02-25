package ApplicationLayer;

import DataBase.DataBase;
import Service.LoginService;
import Service.RegisterService;

import java.sql.Connection;
import java.util.Scanner;

public class StartApplication {
    private Connection connection;
    private Scanner scanner;
    private RegisterService registerService;
    private LoginService loginService;

    public StartApplication(){
        connection = DataBase.getInstance().getConnection();
        scanner = new Scanner(System.in);
        registerService = new RegisterService(connection,scanner);
        loginService = new LoginService(connection,scanner);
    }
    public void start(){
        System.out.println("Welcome to Login System: ");
        System.out.println("Choose option ");
        System.out.println("1. Registration");
        System.out.println("2. Login");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:{
                registerService.register();
                break;
            }
            case 2:{
                loginService.login();
                break;
            }
        }

    }
}
