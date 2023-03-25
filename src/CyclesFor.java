import java.util.Scanner;

public class CyclesFor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mocninátor");
        System.out.println("==========");
        System.out.println("Zadejte základ mocniny: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Zadejte exponent: ");
        int n = Integer.parseInt(sc.nextLine());

        int vysledek = a;
        for (int i = 0; i < (n - 1); i++) {
            vysledek = vysledek * a;
        }

        System.out.println("Výsledek: " + vysledek);
        System.out.println("Děkuji za použití mocninátoru");
    }
}
