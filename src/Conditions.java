import java.util.Scanner;
public class Conditions {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Zadej nějaké číslo, ze kterého spočítám odmocninu: ");
            int a = Integer.parseInt(sc.nextLine());
            if (a >= 0) {
                System.out.println("Zadal jsi číslo větší nebo rovno 0, to znamená, že ho mohu odmocnit!");
                double o = Math.sqrt(a);
                System.out.println("Odmocnina z čísla " + a + " je " + o);
            } else if (a == 0) {
                System.out.println("Číslo nemůže být 0");
            } else {
                System.out.println("Odmocnina ze záporného čísla neexistuje v oboru reálných čísel!");
            }
            System.out.println("Děkuji za zadání");
        }
}


