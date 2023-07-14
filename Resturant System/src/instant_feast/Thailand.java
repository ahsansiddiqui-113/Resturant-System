package instant_feast;

public class Thailand extends Dishes{
    String[] thai;

//   private final String t_1="200/-";
//   private final String t_2="250/-";
//   private final String t_3="300/-";
//   private final String t_4="350/-";
//   private final String t_5="400/-";

    private String t_1;
    private String t_2;
    private String t_3;
    private String t_4;
    private String t_5;

    public void setT_1(String t_1) {
        this.t_1 = t_1;
    }

    public void setT_2(String t_2) {
        this.t_2 = t_2;
    }

    public void setT_3(String t_3) {
        this.t_3 = t_3;
    }

    public void setT_4(String t_4) {
        this.t_4 = t_4;
    }

    public void setT_5(String t_5) {
        this.t_5 = t_5;
    }

    Thailand(){
        thai = new String[5];
        for (int i=0;i<thai.length;i++){
            thai[0]="Green Curry";
            thai[1]="Som Tam";
            thai[2]="Massaman Curry";
            thai[3]="Mango Sticky Rice ";
            thai[4]="Larb";
        }
    }
//    public void thai() {
//        System.out.println("1)"+thai[0]+"\t"+t_1+"\n2)"+thai[1]+"\t"+t_2+"\n3)"+thai[2]
//                +"\t"+t_3+ "\n4)"+thai[3]+"\t"+t_4+"\n5)"+thai[4]+"\t"+t_5);
//    }
    public void thai(){
        Thailand thai=new Thailand();
        thai.setT_1("200");
        thai.setT_2("250");
        thai.setT_3("300");
        thai.setT_4("350");
        thai.setT_5("400");
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
