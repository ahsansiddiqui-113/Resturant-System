package instant_feast;

import java.util.Arrays;
import java.util.Scanner;

public class KFC extends Restaurant {
    String[] kfc;

//   private final String k_1="350/-";
//   private final String k_2="590/-";
//   private final String k_3="750/-";
//   private final String k_4="890/-";
//   private final String k_5="200/-";

    private String k_1;
    private String k_2;
    private String k_3;
    private String k_4;
    private String k_5;

    public void setK_1(String k_1) {
        this.k_1 = k_1;
    }

    public void setK_2(String k_2) {
        this.k_2 = k_2;
    }

    public void setK_3(String k_3) {
        this.k_3 = k_3;
    }

    public void setK_4(String k_4) {
        this.k_4 = k_4;
    }

    public void setK_5(String k_5) {
        this.k_5 = k_5;
    }

    public KFC() {
        kfc=new String[5];
        for (int i=0;i<kfc.length;i++){
            kfc[0]="Crunch Burger";
            kfc[1]="Hot Wings";
            kfc[2]="Zinger Burger";
            kfc[3]="Mighty Burger";
            kfc[4]="Ice Cream";
        }
    }
//    public void kfc(){
//        System.out.println("1)"+kfc[0]+"\t"+k_1+"\n2)"+kfc[1]+"\t"+k_2+"\n3)"+kfc[2]
//                +"\t"+k_3+ "\n4)"+kfc[3]+"\t"+k_4+"\n5)"+kfc[4]+"\t"+k_5);
//    }

    public  void kfc(){
        KFC kfc=new KFC();
        kfc.setK_1("200");
        kfc.setK_2("250");
        kfc.setK_3("300");
        kfc.setK_4("350");
        kfc.setK_5("400");
    }

}
