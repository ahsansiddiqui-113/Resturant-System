package instant_feast;

public class Quetta extends Restaurant {

    String[] quetta;

   private final String q_1 = "100/-";
   private final String q_2 = "80/-";
   private final String q_3 = "120/-";
   private final String q_4 = "200/-";
   private final String q_5 = "150/-";


    public Quetta() {
        quetta = new String[5];
        for (int i = 0; i < quetta.length; i++) {
            quetta[0] = "Simple Paratha";
            quetta[1] = "Chai";
            quetta[2] = "Cheese Paratha";
            quetta[3] = "Chicken Cheese Paratha";
            quetta[4] = "Kashmiri Chai";
        }
    }

    public void Quetta() {
        System.out.println("1)" + quetta[0] + "\t" + q_1 + "\n2)" + quetta[1] + "\t" + q_2 + "\n3)" + quetta[2]
                + "\t" + q_3 + "\n4)" + quetta[3] + "\t" + q_4 + "\n5)" + quetta[4] + "\t" + q_5);

    }
}
