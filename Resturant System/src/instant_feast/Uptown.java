package instant_feast;

public class Uptown extends Restaurant {
    String[] uptown;

//   private final String u_1 = "350/-";
//   private final String u_2 = "80/-";
//   private final String u_3 = "100/-";
//   private final String u_4 = "450/-";
//   private final String u_5 = "550/-";

    private String u_1;
    private String u_2;
    private String u_3;
    private String u_4;
    private String u_5;

    public void setU_1(String u_1) {
        this.u_1 = u_1;
    }

    public void setU_2(String u_2) {
        this.u_2 = u_2;
    }

    public void setU_3(String u_3) {
        this.u_3 = u_3;
    }

    public void setU_4(String u_4) {
        this.u_4 = u_4;
    }

    public void setU_5(String u_5) {
        this.u_5 = u_5;
    }

    public Uptown() {
        uptown = new String[5];
        for (int i = 0; i < uptown.length; i++) {
            uptown[0] = "Coffee";
            uptown[1] = "Double crunch Burger";
            uptown[2] = "Soft Drinks";
            uptown[3] = "Pasta";
            uptown[4] = "Chicken Grilled Sandwich";
        }
    }

//    public void uptowns() {
//        System.out.println("1)" + uptown[0] + "\t" + u_1 + "\n2)" + uptown[1] + "\t" + u_2 + "\n3)" + uptown[2]
//                + "\t" + u_3 + "\n4)" + uptown[3] + "\t" + u_4 + "\n5)" + uptown[4] + "\t" + u_5);
//    }

    public void uptowns(){
        Uptown town =new Uptown();
        town.setU_1("200");
        town.setU_2("250");
        town.setU_3("300");
        town.setU_4("350");
        town.setU_5("400");

    }

    @Override
    public void rest() {
        super.rest();
    }

    @Override
    public void order() {
        super.order();
    }

}
