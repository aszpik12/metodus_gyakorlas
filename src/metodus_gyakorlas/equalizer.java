package metodus_gyakorlas;

public class Equalizer {

    public static void main(String[] args) {
        kockak();

    }

    private static void kockak() {
            for (int i = 0; i < 5; i++) {
                eq();
        }
    }

    private static void eq() {
        int min = 3;
        int max = 7;

        int rand = (int) (Math.random() * (max - min + 1) + min);
        int index = 0;
        while (index < rand) {
            System.out.printf("\u001B[45m" + " ");
            index++;
        }
        System.out.println();
    }
}
