import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double kg, boy, indeks;
        System.out.println("Lutfen kilonuzu giriniz:");
        System.out.println("Lutfen boyunuzu metre cinsinden giriniz: ");
        kg = input.nextDouble();
        boy = input.nextDouble();
        indeks= kg / (boy*boy);
        System.out.println("Vucut kitle indeksiniz; " + indeks);

    }
}