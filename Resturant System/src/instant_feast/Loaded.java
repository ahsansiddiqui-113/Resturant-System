package instant_feast;

public class Loaded extends Restaurant {
    String[] loaded;

//   private final String l_1="400/-";
//   private final String l_2="250/-";
//   private final String l_3="500/-";
//   private final String l_4="650/-";
//   private final String l_5="900/-";

    private String l_1;
    private String l_2;
    private String l_3;
    private String l_4;
    private String l_5;

    public void setL_1(String l_1) {
        this.l_1 = l_1;
    }

    public void setL_2(String l_2) {
        this.l_2 = l_2;
    }

    public void setL_3(String l_3) {
        this.l_3 = l_3;
    }

    public void setL_4(String l_4) {
        this.l_4 = l_4;
    }

    public void setL_5(String l_5) {
        this.l_5 = l_5;
    }

    Loaded(){
        loaded = new String[5];
        for (int i=0;i<loaded.length;i++){
            loaded[0]="Crunchy Wings";
            loaded[1]="French Fries";
            loaded[2]="Loaded Fries";
            loaded[3]="Burger";
            loaded[4]="Finger Fish";
        }
    }
//    public void loaded() {
//        System.out.println("1)"+loaded[0]+"\t"+l_1+"\n2)"+loaded[1]+"\t"+l_2+"\n3)"+loaded[2]
//                +"\t"+l_3+ "\n4)"+loaded[3]+"\t"+l_4+"\n5)"+loaded[4]+"\t"+l_5);
//    }
    public void loaded(){
        Loaded load=new Loaded();
        load.setL_1("200");
        load.setL_2("250");
        load.setL_3("300");
        load.setL_4("350");
        load.setL_5("400");
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
