import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int k ,toplam = 0 ,sayac = 0,ortalama ;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı Giriniz : " );
        k = inp.nextInt();

        for (int i = 0; i <= k; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sayac = sayac + 1;
                toplam = toplam + i;
            }

        }
        ortalama=toplam/sayac;
        System.out.print(" ortalama: " + ortalama );
    }
}
