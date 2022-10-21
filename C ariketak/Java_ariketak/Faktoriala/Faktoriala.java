package Java_ariketak.Faktoriala;


import java.util.Scanner;

public class Faktoriala {
    public static void main(String[] args) {
        int faktoriala = 1;
        int zenbakia;

        System.out.println("Sartu zenbaki bat: ");
        Scanner sc = new Scanner(System.in);
        zenbakia = sc.nextInt();
        while (zenbakia < 1) {
            System.out.println("Zenbakia ezin da izan 1 baino txikiagoa");
            System.out.println("Sartu zenbaki bat: ");
            zenbakia = sc.nextInt();

        }
        for (int i = zenbakia; i > 1; i--) {
            faktoriala *= i;
        }
        System.out.println(faktoriala);

    }
}
