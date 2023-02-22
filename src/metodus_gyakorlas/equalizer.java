package metodus_gyakorlas;

public class Equalizer {

    public static void main(String[] args) {
        kockak();

    }

    private static void kockak() {
            eq(0);
            eq(0);
            eq(0);
            eq(0);
            eq(0);
    }

    private static void eq(int a) {
        int min = 3;
        int max = 7;
        if (a == 0){
        int rand = (int) (Math.random() * (max - min + 1) + min);
        int index = 0;
        while (index < rand) {
            System.out.printf("\u001B[45m" + " ");
            index++;
        }
        System.out.println();
    }
        else{
            int index = 0;
            while (index < a){
                System.out.printf("\u001B[45m" + " ");
                index++;
            }
            System.out.println("");
        }
    }
}
