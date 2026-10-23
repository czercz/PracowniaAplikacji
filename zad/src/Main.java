//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    import java.util.Scanner;

    public class Zadanie1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Podaj ciąg znaków: ");
            String tekst = scanner.nextLine();

            if (tekst.isEmpty()) {
                System.out.println("Podany ciąg jest pusty.");
                return;
            }

            char ostatniZnak = Character.toLowerCase(tekst.charAt(tekst.length() - 1));
            String tekstDoAnalizy = tekst.toLowerCase();

            int licznik = 0;
            for (int i = 0; i < tekstDoAnalizy.length(); i++) {
                if (tekstDoAnalizy.charAt(i) == ostatniZnak) {
                    licznik++;
                }
            }

            System.out.println("Wynik: " + licznik);
        }
    }
    import java.util.Scanner;

    public class Zadanie2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Podaj ciąg znaków: ");
            String tekst = scanner.nextLine();

            String odwrocony = new StringBuilder(tekst).reverse().toString();

            System.out.println("Wynik: " + odwrocony);
        }
    }


}
