import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    Scanner s;
    public static void main(String[] args) {
        System.out.println("Welcome to Library Management System!\n" + "1.Login\n2.New User");
        s = new Scanner(System.in);
        int n = s.nextInt();

        switch (n){
            case 1:
                login();

            case 2:
                newUser();

            default:
                System.out.println("ERROR!");
        }

        private void login() {
            System.out.println("Enter phone number: ");
            String phoneNumber = s.next();
            System.out.println("Enter Email : ");
            String email = s.next();
        }

        private static void newUser(){
            System.out.println("Enter name : ");
            String name = s.next();
            System.out.println("Enter phone number : ");
            String phoneNumber = s.next();
            System.out.println("Enter email : ");
            String email = s.next();
            System.out.println("1. Admin\n2.Normal User");
            int n2 = s.nextInt();

            if(n2 == 1){
                User admin = new Admin(name, email, phoneNumber);
            }
            else{
                User user = new User(name, email, phoneNumber);
            }
        }

    }
}