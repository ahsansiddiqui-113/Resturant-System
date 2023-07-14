package instant_feast;

public class Savour extends  Restaurant {

    String[] savour;

   private final String s_1 = "350/-";
   private final String s_2 = "80/-";
   private final String s_3 = "100/-";
   private final String s_4 = "450/-";
   private final String s_5 = "550/-";


    public Savour() {

        savour = new String[5];

        for (int i = 0; i < savour.length; i++) {
            savour[0] = "Simple Pulao";
            savour[1] = "Salad";
            savour[2] = "Soft Drink";
            savour[3] = "Chicken Pulao Single";
            savour[4] = "Chicken Pulao Full";
        }
    }

    public void savours() {
        System.out.println("1)" + savour[0] + "\t" + s_1 + "\n2)" + savour[1] + "\t" + s_2 + "\n3)" + savour[2]
                + "\t" + s_3 + "\n4)" + savour[3] + "\t" + s_4 + "\n5)" + savour[4] + "\t" + s_5);
    }
}
