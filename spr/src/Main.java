

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wybierz zadanie (1-5):");
        int wybor = scanner.nextInt();

        switch (wybor) {
            //1
            case 1:
                System.out.print("Podaj promien kola: ");
                double promien = scanner.nextDouble();
                double obwod = 2 * Math.PI * promien;
                System.out.println("Obwod kola wynosi: " + obwod);
                break;

            //2
            case 2:
                String poprawnyLogin = "user";
                String poprawneHaslo = "haslo";
                System.out.print("Podaj login: ");
                String login = scanner.next();
                System.out.print("Podaj haslo: ");
                String haslo = scanner.next();
                if (login.equals(poprawnyLogin) && haslo.equals(poprawneHaslo)) {
                    System.out.println("Zalogowano");
                } else if (login.equals(poprawnyLogin)) {
                    System.out.println("Błędne hasło");
                } else {
                    System.out.println("Błąd logowania");
                }
                break;

            //3
            case 3:
                System.out.print("Podaj liczbe x: ");
                int x = scanner.nextInt();
                for (int i = 1; i <= x; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("o");
                    }
                    System.out.println();
                }
                break;

            //4
            case 4:
                System.out.print("Podaj dzielną: ");
                double dzelna = scanner.nextDouble();
                System.out.print("Podaj dzielnik: ");
                double dzielnik = scanner.nextDouble();
                if (dzielnik != 0) {
                    double wynik = dzelna / dzielnik;
                    System.out.println("Wynik: " + wynik);
                } else {
                    System.out.println("Błąd: Nie można dzielić przez zero!");
                }
                break;

            //5
            case 5:
                System.out.print("Podaj wysokość choinki (n): ");
                int n = scanner.nextInt();
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= (2 * i - 1); k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Niepoprawny numer zadania.");
                break;
        }
        scanner.close();

    }
}
