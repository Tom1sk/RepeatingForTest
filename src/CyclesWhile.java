import java.util.Scanner;

public class CyclesWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Vítejte v kalkulačce");
        System.out.println("Zadejte první číslo:");
        float a = Float.parseFloat(sc.nextLine());
        System.out.println("Zadejte druhé číslo:");
        float b = Float.parseFloat(sc.nextLine());
        System.out.println("Zvolte si operaci:");
        System.out.println("1 - sčítání");
        System.out.println("2 - odčítání");
        System.out.println("3 - násobení");
        System.out.println("4 - dělení");
        int volba = Integer.parseInt(sc.nextLine());
        float vysledek = 0;
        switch (volba) {
            case 1:
                vysledek = a + b;
                break;
            case 2:
                vysledek = a - b;
                break;
            case 3:
                vysledek = a * b;
                break;
            case 4:
                vysledek = a / b;
                break;
        }
        if ((volba > 0) && (volba < 5)) {
            System.out.println("Výsledek: " + vysledek);
        }
        else {
            System.out.println("Neplatná volba");
        }
        System.out.println("Děkuji za použití kalkulačky.");
    }
}
