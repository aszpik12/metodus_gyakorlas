package metodus_gyakorlas;

public class equalizer {
     public static void main(String[] args) {
         eq();
         eq();
         eq();
         eq();
         eq();
         
    }

    private static void eq() {
        int min = 1;
        int max = 6;

        int rand = (int) (Math.random()*(max-min+1)+min);
        int index = 0;
        while (index < rand) {
            System.out.printf("\u001B[45m" + " ");
            index++;
        }
        System.out.println();
    }
}
