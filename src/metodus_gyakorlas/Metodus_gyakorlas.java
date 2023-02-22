package metodus_gyakorlas;

public class Metodus_gyakorlas {

    public static void main(String[] args) {

    }
    
 private static int elso10szamosszege(){   
   int osszeg = 0;
   for (int i = 0; i < 10; i++) {
    osszeg +=1;
 }
   return osszeg;
}
    private static int osszead(int a, int b) {
        return a+b;
    }

    private static void kiir(String szoveg) {
        szoveg = Integer.toString( elso10szamosszege());
        System.out.println(szoveg);
        szoveg = Integer.toString( osszead(1 ,2));
        System.out.println(szoveg);
    }

 
 
 
}
