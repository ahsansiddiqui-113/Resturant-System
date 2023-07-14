package instant_feast;

import java.util.Arrays;

public class China extends Dishes{
    String[] chi;

// private final String c_1="200/-";
// private final String c_2="250/-";
// private final String c_3="300/-";
// private final String c_4="350/-";
// private final String c_5="400/-";
    private String c_1;
    private String c_2;
    private String c_3;
    private String c_4;

    public void setC_1(String c_1) {
        this.c_1 = c_1;
    }

    public void setC_2(String c_2) {
        this.c_2 = c_2;
    }

    public void setC_3(String c_3) {
        this.c_3 = c_3;
    }

    public void setC_4(String c_4) {
        this.c_4 = c_4;
    }

    public void setC_5(String c_5) {
        this.c_5 = c_5;
    }

    private String c_5;




    public String getC_1() {
        return c_1;
    }

    public String getC_2() {
        return c_2;
    }

    public String getC_3() {
        return c_3;
    }

    public String getC_4() {
        return c_4;
    }

    public String getC_5() {
        return c_5;
    }

    China() {
        chi = new String[5];
        for (int i=0;i<chi.length;i++){
            chi[0]="Steamed Fish";
            chi[1]="Chow Mein";
            chi[2]="Dumplings";
            chi[3]="Kung Pao Chicken ";
            chi[4]="Fried Rice";
        }
    }
//    public void chin() {
//        System.out.println("1)"+chi[0]+"\t"+setc+"\n2)"+chi[1]+"\t"+c_2+"\n3)"+chi[2]
//                +"\t"+c_3+ "\n4)"+chi[3]+"\t"+c_4+"\n5)"+chi[4]+"\t"+c_5);
//    }

    public void chin(){
        China chin=new China();
        chin.setC_1("200");
        chin.setC_2("250");
        chin.setC_3("300");
        chin.setC_4("350");
        chin.setC_5("400");

    }

    @Override
    public void dish() {
        super.dish();
    }

    @Override
    public void order() {
        super.order();
    }
}
