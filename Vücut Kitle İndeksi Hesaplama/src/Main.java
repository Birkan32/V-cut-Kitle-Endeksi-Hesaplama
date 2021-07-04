import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        double kilo , boy ,vücutKitleEndeksi;
        Scanner input = new Scanner(System.in) ;
        System.out.print("Lütfen Boyunuzu (metre) Cinsinden Giriniz :");
         boy =input.nextDouble() ;
        System.out.print("Lütfen Kilonuzu (kg) Cinsinden Giriniz :");
         kilo =input.nextDouble() ;
        vücutKitleEndeksi = kilo / (boy * boy) ;

        System.out.println(vücutKitleEndeksi);
    }
}
