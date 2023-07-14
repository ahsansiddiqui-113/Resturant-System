package instant_feast;

import java.util.Scanner;

public class Working {
    Scanner f = new Scanner(System.in);

    public void name() {
        System.out.println("\n            Tap n' Eat");
        System.out.println(".....................................");
    }

    public void work() {

        System.out.println("If you dont have an account press 1 to make one...\n" +
                "\n...other wise press 2 if already have an account ");
        int sign = f.nextInt();

        switch (sign) {
            case 1:
                if (sign == 1) {

                    Working obj1 = new Working();
                    obj1.sign();

                }
                break;
            case 2:

                if (sign == 2) {

                    Working obj = new Working();
                    obj.log();

                }
                break;
        }
    }
    public void sign(){
        System.out.println("Enter your name");
        String namme = f.nextLine();

        System.out.println("Enter a 8 digit password");
        String pass = f.nextLine();

        System.out.println("Your Account has been made\n"+"\nplease login using Your name and password and enjoy");

        System.out.println("User Name");
        String namee=f.nextLine();

        System.out.println("Password");
        String paas=f.nextLine();

        if (namme.equals(namee) && pass.equals(paas)){
            start();

        }else {
            System.out.println("Login unsuccessful...try later!");
            work();

        }

    }

    public void log() {

        System.out.println("enter the username: ");
        String username = f.nextLine();
        System.out.println("enter the password: ");
        String password = f.nextLine();

        if (username.equals("fatima") || username.equals("fatima") && password.equals("12345") || password.equals("123456")) {
            start();
        } else{
            System.out.println("Login unsuccessful...try later!");
            work();
        }
    }
    public void start(){
        System.out.println("           Order Choice");
        System.out.println("  Restaurant(0)\t\t" + "Dishes(1)");

        Scanner f = new Scanner(System.in);
        int input = f.nextInt();

        switch (input) {
            case 0:
                if (input == 0) {

                    Restaurant res = new Restaurant();
                    res.rest();
                }
                break;

            case 1:
                if (input == 1) {
                    Dishes m = new Dishes();
                    m.dish();
                }
                break;
        }
        System.out.println("Order Now\t Just Click The One you Want...");
        int order = f.nextInt();

        switch (order) {
            case 1:
                if (order == 1) {
                    Dishes order1 = new Dishes();

                    order1.order();
                }
                break;
            case 2:
                if (order == 2) {
                    Dishes order2 = new Dishes();
                    order2.order();
                }
                break;
            case 3:
                if (order == 3) {
                    Dishes order3 = new Dishes();
                    order3.order();
                }
                break;
            case 4:
                if (order == 4) {
                    Dishes order4 = new Dishes();
                    order4.order();
                }
                break;
            case 5:
                if (order == 5) {
                    Dishes order5 = new Dishes();
                    order5.order();
                }
                break;
            case 6:
                if (input == 6) {
                    Working obj = new Working();
                    obj.work();
                }
                break;
        }

    }
}
