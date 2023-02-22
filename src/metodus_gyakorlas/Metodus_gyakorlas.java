package metodus_gyakorlas;

public class Metodus_gyakorlas {

    public static void main(String[] args) {
        String szoveg = "";
        kiir(szoveg);
    }

    private static int elso10szamosszege() {
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += 1;
        }
        return osszeg;
    }

    private static int osszead(int a, int b) {
        return a + b;
    }
    
    private static int negyszamosszege(int a, int b, int c, int d) {
        return a + b + c + d;
    }
    
     private static int haromszamgyok(int a, int b, int c) {
        int szam = a + b + c;
         return (int) Math.sqrt(szam);
    }

    private static void kiir(String szoveg) {
        szoveg = Integer.toString(elso10szamosszege());
        System.out.println("első tíz szám összege: "+szoveg);
        szoveg = Integer.toString(osszead(1, 2));
        System.out.println("a+b: "+szoveg);
        szoveg = Integer.toString(negyszamosszege(3, 4, 1, 5));
        System.out.println("a+b+c+d: "+szoveg);
        szoveg = Integer.toString(haromszamgyok(2, 5, 1));
        System.out.println("(sqrt(a+b+c)): "+szoveg);
    }

}
