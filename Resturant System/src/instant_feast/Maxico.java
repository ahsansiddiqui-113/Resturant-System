package instant_feast;

public class Maxico extends Dishes {
    String[] maxi;

   private final String m_1="200/-";
   private final String m_2="250/-";
   private final String m_3="300/-";
   private final String m_4="350/-";
   private final String m_5="400/-";

    Maxico(){
        maxi = new String[5];
        for (int i=0;i<maxi.length;i++){
            maxi[0]="Tacos";
            maxi[1]="Salsa";
            maxi[2]="Fajitas";
            maxi[3]="Burritos";
            maxi[4]="Sopes";
        }
    }
    public void max() {
        System.out.println("1)"+maxi[0]+"\t"+m_1+"\n2)"+maxi[1]+"\t"+m_2+"\n3)"+maxi[2]
                +"\t"+m_3+ "\n4)"+maxi[3]+"\t"+m_4+"\n5)"+maxi[4]+"\t"+m_5);
    }
}
