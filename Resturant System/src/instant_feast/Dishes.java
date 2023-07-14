package instant_feast;


import java.util.Scanner;

public class Dishes {
     public void dish() {
          Scanner f = new Scanner(System.in);
          System.out.println("Enter your choice");
          System.out.println("1)Pakistani\t" + "2)Italian\t" + "3)Mexican\t" + "4)Thai\t" + "5)Chinese" + "\t6)Go Back To Main");
          int input = f.nextInt();
          switch (input) {

               case 1:
                    if (input == 1) {
                         Pakistan obj = new Pakistan();
                         obj.pak();
                    }
                    break;
               case 2:
                    if (input == 2) {
                         Italian obj = new Italian();
                         obj.itl();
                    }
                    break;
               case 3:
                    if (input == 3) {
                         Maxico obj = new Maxico();
                         obj.max();

                    }
                    break;
               case 4:
                    if (input == 4) {
                         Thailand obj = new Thailand();
                         obj.thai();

                    }
                    break;
               case 5:
                    if (input == 5) {
                         China obj = new China();
                         obj.chin();

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

          System.out.println("Thanku For Your Order"+"\nOur Rider Will be THere Within 30 min ");

          }


}
