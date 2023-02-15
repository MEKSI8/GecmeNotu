import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double fizik, mat, turkce, kimya, muzik,toplam = 0,count = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Fizik notunuzu girin:");
        fizik=input.nextDouble();

        System.out.println("Matematik notunuzu girin:");
        mat=input.nextDouble();

        System.out.println("Türkçe notunuzu girin:");
        turkce=input.nextDouble();

        System.out.println("Kimya notunuzu girin:");
        kimya=input.nextDouble();

        System.out.println("Muzik notunuzu girin:");
        muzik=input.nextDouble();

        if (fizik >= 0 && fizik <= 100) {
            toplam += fizik;
            count++;
        }

        if (mat >= 0 && mat <= 100) {
            toplam += mat;
            count++;
        }

        if (turkce >= 0 && turkce <= 100) {
            toplam += turkce;
            count++;
        }
        if (kimya >= 0 && kimya <= 100) {
            toplam += kimya;
            count++;
        }
        if (muzik >= 0 && muzik <= 100) {
            toplam += muzik;
            count++;
        }

        if (toplam/count>=55){
            System.out.println(toplam/count+" ile GEÇTİNİZ");
        }else {
            System.out.println(toplam/count+" ile KALDINIZ");
        }


    }
}