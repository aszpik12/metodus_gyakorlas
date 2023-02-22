package metodus_gyakorlas;

public class Metodus_gyakorlas {

    public static void main(String[] args) {

    }
    
 private static void elso10szamosszege(){   
   int osszeg = 0;
   for (int i = 0; i < 10; i++) {
    osszeg +=1;
 }
}
    private static int osszead() {
        int a = 0;
        int b = 0;
        int szam = a+b;
        kiir(a, b, szam);
        return szam;
    }

    private static void kiir(int a, int b, int szam) {
        System.out.printf("%d + %d = %d\n", a, b, szam);
    }

 
 
 
}
