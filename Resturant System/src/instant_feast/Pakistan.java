package instant_feast;

public class Pakistan extends Dishes{
    String[] paki;

//   private final String p_1="200/-";
//   private final String p_2="250/-";
//   private final String p_3="300/-";
//   private final String p_4="350/-";
//   private final String p_5="400/-";

    private String p_1;
    private String p_2;
    private String p_3;
    private String p_4;
    private String p_5;

    public void setP_1(String p_1) {
        this.p_1 = p_1;
    }

    public void setP_2(String p_2) {
        this.p_2 = p_2;
    }

    public void setP_3(String p_3) {
        this.p_3 = p_3;
    }

    public void setP_4(String p_4) {
        this.p_4 = p_4;
    }

    public void setP_5(String p_5) {
        this.p_5 = p_5;
    }

    Pakistan() {
        paki = new String[5];
        for (int i=0;i<paki.length;i++){
            paki[0]="Biryani";
            paki[1]="Haleem";
            paki[2]="Nihari";
            paki[3]="Chicken Tikka";
            paki[4]="Sheer Khurma";
        }
    }
//    public void pak() {
//        System.out.println("1)"+paki[0]+"\t"+p_1+"\n2)"+paki[1]+"\t"+p_2+"\n3)"+paki[2]
//                +"\t"+p_3+ "\n4)"+paki[3]+"\t"+p_4+"\n5)"+paki[4]+"\t"+p_5);
//    }

    public void pak(){
        Pakistan pa=new Pakistan();
        pa.setP_1("200");
        pa.setP_2("250");
        pa.setP_3("300");
        pa.setP_4("350");
        pa.setP_5("400");
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
