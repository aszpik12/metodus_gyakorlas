package metodus_gyakorlas;

public class Equalizer {

    private static int rand = 0;

    public static void main(String[] args) {
        kockak();

    }

    private static void kockak() {
        eq();
        eq(3, true);
        eq(12);
        eq(true);
        eq(3);
    }

    private static void eq() {
        int min = 3;
        int max = 7;
        rand = (int) (Math.random() * (max - min + 1) + min);
        int index = 0;
        while (index < rand) {
            System.out.printf("\u001B[45m" + " ");
            index++;
        }
        System.out.println();

    }

    private static void eq(int sorszam) {
        int index = 0;
        while (index < sorszam) {
            System.out.printf("\u001B[45m" + " ");
            index++;
        }
        System.out.println();
    }

    private static void eq(boolean szamolas) {

        int min = 3;
        int max = 7;
        rand = (int) (Math.random() * (max - min + 1) + min);
        int index = 0;
        while (index < rand) {
            System.out.printf("\u001B[45m" + " ");
            index++;
        }
               if (szamolas == true){
            System.out.println("\u001B[40m(" + rand + ")");
    }
        else{
            System.out.println("");
        }
    }

    private static void eq(int sorszam, boolean szamolas) {
                 
        int index = 0;
        while (index < sorszam) {
            System.out.printf("\u001B[45m" + " ");
            index++;
        }
        
        if (szamolas == true){
            System.out.println("\u001B[40m(" + sorszam + ")");
    }
        else{
            System.out.println("");
        }
   }

}
