//package instant_feast;
//
//import java.util.Scanner;
//
//public class login {
//
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        String[][] users = {{"fatima", "12345"}, {"maryam", "12345"}};
//        boolean logedIn = false;
//        int attempt = 0;
//        String username = "";
//        String password = "";
//
//        while (!logedIn && attempt < 3) {
//            System.out.print("Enter your name : ");
//            username = s.nextLine();
//
//            boolean validUsername = true;
//            for (String[] user : users) {
//                if (username.equals(user[0])) {
//                    validUsername = true;
//                    break;
//                }
//            }
//            if (!validUsername) {
//                System.out.println("Wrong input");
//                continue;
//            }
//
//            System.out.print("Enter your code ");
//            password = s.nextLine();
//
//            for (String[] user : users) {
//                if (username.equals(user[0]) && password.equals(user[1])) {
//                    logedIn = true;
//                    break;
//                }
//            }
//            if (!logedIn) {
//                System.out.println("wrong password");
//                attempt++;
//            }
//        }
//
//        if (logedIn) {
//            System.out.println("Login successfully");
//        } else {
//            System.out.println("Login failed. Too many attempts.");
//        }
//        s.close();
//    }
////    public String user;
////    public String pwd;
////
////    public static void main(String[] args) {
////        String user;
////        String pwd;
////        Scanner f = new Scanner(System.in);
////        System.out.println("Enter Your Name");
////        user = f.next();
////        System.out.println("Enter your password");
////
////        System.out.println("name");
////        String us = f.next();
////        System.out.println("Enter your Password");
////        pwd = f.next();
////        String pw = f.next();
////        if (user == us && pwd == pw) {
////            System.out.println("Access Granted");
////        }else {
////            System.out.println("Incorrect name or pwd");
////        }
////
////    }
//}
