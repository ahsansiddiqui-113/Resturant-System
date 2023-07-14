package instant_feast;

import java.util.ArrayList;

public class Italian extends Dishes{
   String[] ital;
   private final String i_1="200/-";
   private final String i_2="250/-";
   private final String i_3="300/-";
   private final String i_4="350/-";
   private final String i_5="400/-";

    @Override
    public void dish() {
        super.dish();
    }

    @Override
    public void order() {
        super.order();
    }

    Italian() {
        ital = new String[5];
        for (int i=0;i<ital.length;i++){
            ital[0]="Pizza Margherita";
            ital[1]="Lasagna";
            ital[2]="Ravioli";
            ital[3]="Spaghetti Carbonara";
            ital[4]="Cannoli";
        }
    }
    public void itl() {
        System.out.println("1)"+ital[0]+"\t"+i_1+"\n2)"+ital[1]+"\t"+i_2+"\n3)"+ital[2]
                           +"\t"+i_3+ "\n4)"+ital[3]+"\t"+i_4+"\n5)"+ital[4]+"\t"+i_5);

    }


//    public void italian(){
//       dish.add("Pizza Margherita\n");
//       dish.add("Lasagna\n");
//       dish.add("Ravioli");
//       dish.add("Spaghetti Carbonara\n");
//       dish.add("Cannoli.\n");
//   }


}
