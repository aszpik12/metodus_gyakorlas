package metodus_gyakorlas;

public class QRcode {

    public static void main(String[] args) {
        qr();
        System.out.println("**************************");
        qr(20);
    }

    private static void qr() {
        qr(10);
    }    
  private static void qr(int szam) {
        int min = 1;
        int max = szam;
        int rand, rand1;
        int sor = 0;
        while (sor < szam/2) {
            int index = 0;
            while (index < szam) {
                rand = (int) (Math.random() * (max - min + 1) + min);
                rand1 = (int) (Math.random() * ((max + max) - (min + max) + 1) + (min + max));
                if (index == rand || index == rand1) {
                    System.out.printf("\u001B[43m" + " ");
                } else {
                    System.out.printf("\u001B[40m" + " ");
                }
                index++;
            }
            sor++;
            System.out.println("");
        }

    }
}
