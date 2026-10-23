public class Main {
    public static void main(String[] args) {
        System.out.println("Mój wiek to: " + zwrocWiek());

        System.out.println("Moje imię to: " + zwrocImie());

        obliczIWypisz(10, 5);
    }

    public static int zwrocWiek() {
        return 17;
    }

    public static String zwrocImie() {
        return "Judyta";
    }

    public static void obliczIWypisz(int a, int b) {
        int suma = a + b;
        int roznica = a - b;
        int iloczyn = a * b;

        System.out.println("Suma: " + suma);
        System.out.println("Różnica: " + roznica);
        System.out.println("Iloczyn: " + iloczyn);
    }
}