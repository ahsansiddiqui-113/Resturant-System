package instant_feast;

import java.util.Scanner;

public class Restaurant {

    public void rest() {
        Scanner f = new Scanner(System.in);
        System.out.println("Enter your choice");
        System.out.println("1)KFC\t" + "2)Loaded\t" + "3)Uptown\t" + "4)Quetta\t" + "5)Savour" + "\t6)Go Back to Menu");
        int input = f.nextInt();
        switch (input) {
            case 1:
                if (input == 1) {
                    KFC kfc = new KFC();
                    kfc.kfc();
                }
                break;
            case 2:
                if (input == 2) {
                    Loaded load = new Loaded();
                    load.loaded();
                }
                break;
            case 3:
                if (input == 3) {
                    Uptown up = new Uptown();
                    up.uptowns();
                }
                break;
            case 4:
                if (input == 4) {
                    Quetta queta = new Quetta();
                    queta.Quetta();
                }
                break;
            case 5:
                if (input == 5) {
                    Savour sav = new Savour();
                    sav.savours();
                }
                break;
            case 6:
                if (input == 6) {
                    Working obj = new Working();
                    obj.start();
                }
                break;
        }
    }
    public void order(){
        System.out.println("thanks for visiting come again: ");
    }
}


