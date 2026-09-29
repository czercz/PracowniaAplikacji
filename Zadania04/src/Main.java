void main() {

    // ZADANIE 1

    int[] tablica1 = {1, 2, 3, 4, 5, 6};
    int[] tablica2 = {10, 20, 30, 40, 50};

    System.out.println("ZADANIE 1");

    System.out.println("Co drugi element pierwszej tablicy:");

    for (int i = 0; i < tablica1.length; i = i + 2) {
        System.out.println(tablica1[i]);
    }

    System.out.println("Co drugi element drugiej tablicy:");

    for (int i = 0; i < tablica2.length; i = i + 2) {
        System.out.println(tablica2[i]);
    }


    // ZADANIE 2

    int[] liczby2 = {5, 12, 3, 25, 8, 17};

    int najwieksza2 = liczby2[0];

    for (int i = 1; i < liczby2.length; i++) {

        if (liczby2[i] > najwieksza2) {
            najwieksza2 = liczby2[i];
        }
    }

    System.out.println("ZADANIE 2");
    System.out.println("Największa liczba: " + najwieksza2);


    // ZADANIE 3

    String[] slowa3 = {"ala", "kot", "samochod", "dom", "komputer"};

    System.out.println("ZADANIE 3");

    for (String slowo3 : slowa3) {
        System.out.println(slowo3.toUpperCase());
    }


    // ZADANIE 4

    String[] slowa4 = new String[5];

    System.out.println("ZADANIE 4");

    System.out.println("Podaj 1 slowo: ");
    Scanner slowo1sc4 = new Scanner(System.in);
    slowa4[0] = slowo1sc4.next();

    System.out.println("Podaj 2 slowo: ");
    Scanner slowo2sc4 = new Scanner(System.in);
    slowa4[1] = slowo2sc4.next();

    System.out.println("Podaj 3 slowo: ");
    Scanner slowo3sc4 = new Scanner(System.in);
    slowa4[2] = slowo3sc4.next();

    System.out.println("Podaj 4 slowo: ");
    Scanner slowo4sc4 = new Scanner(System.in);
    slowa4[3] = slowo4sc4.next();

    System.out.println("Podaj 5 slowo: ");
    Scanner slowo5sc4 = new Scanner(System.in);
    slowa4[4] = slowo5sc4.next();

    for (int i = 4; i >= 0; i--) {

        String odwrocone4 = "";

        for (int j = slowa4[i].length() - 1; j >= 0; j--) {
            odwrocone4 = odwrocone4 + slowa4[i].charAt(j);
        }

        System.out.println(odwrocone4);
    }


    // ZADANIE 5

    int[] liczby5 = new int[8];

    System.out.println("ZADANIE 5");
    System.out.println("Podaj 8 liczb:");

    Scanner liczby5sc = new Scanner(System.in);

    for (int i = 0; i < liczby5.length; i++) {
        liczby5[i] = liczby5sc.nextInt();
    }

    for (int i = 0; i < liczby5.length - 1; i++) {

        for (int j = 0; j < liczby5.length - 1; j++) {

            if (liczby5[j] > liczby5[j + 1]) {

                int pomocnicza5 = liczby5[j];
                liczby5[j] = liczby5[j + 1];
                liczby5[j + 1] = pomocnicza5;
            }
        }
    }

    System.out.println("Posortowane liczby:");

    for (int i = 0; i < liczby5.length; i++) {
        System.out.println(liczby5[i]);
    }


    // ZADANIE 6

    int[] liczby6 = new int[5];

    System.out.println("ZADANIE 6");
    System.out.println("Podaj 5 liczb:");

    Scanner liczby6sc = new Scanner(System.in);

    for (int i = 0; i < liczby6.length; i++) {
        liczby6[i] = liczby6sc.nextInt();
    }

    for (int i = 0; i < liczby6.length; i++) {

        int silnia6 = 1;

        for (int j = 1; j <= liczby6[i]; j++) {
            silnia6 = silnia6 * j;
        }
        
        System.out.println("Silnia liczby " + liczby6[i] + " wynosi: " + silnia6);
    }


    // ZADANIE 7

    String[] tablica7a = {"Ala", "ma", "kota", "i", "psa"};
    String[] tablica7b = {"Ala", "ma", "kota", "i", "psa"};

    boolean takieSame7 = true;

    if (tablica7a.length != tablica7b.length) {

        takieSame7 = false;

    } else {

        for (int i = 0; i < tablica7a.length; i++) {

            if (!tablica7a[i].equals(tablica7b[i])) {
                takieSame7 = false;
            }
        }
    }

    System.out.println("ZADANIE 7");

    if (takieSame7) {
        System.out.println("Tablice są takie same");
    } else {
        System.out.println("Tablice nie są takie same");
    }


    // ZADANIE 8

    int[] liczby8 = new int[10];

    Random losowanie8 = new Random();

    for (int i = 0; i < liczby8.length; i++) {
        liczby8[i] = losowanie8.nextInt(21) - 10;
    }

    System.out.println("ZADANIE 8");
    System.out.println("Zawartość tablicy:");

    for (int i = 0; i < liczby8.length; i++) {
        System.out.println(liczby8[i]);
    }

    int najmniejsza8 = liczby8[0];
    int najwieksza8 = liczby8[0];
    int suma8 = 0;

    for (int i = 0; i < liczby8.length; i++) {

        if (liczby8[i] < najmniejsza8) {
            najmniejsza8 = liczby8[i];
        }

        if (liczby8[i] > najwieksza8) {
            najwieksza8 = liczby8[i];
        }

        suma8 = suma8 + liczby8[i];
    }

    double srednia8 = (double) suma8 / liczby8.length;

    int mniejsze8 = 0;
    int wieksze8 = 0;

    for (int i = 0; i < liczby8.length; i++) {

        if (liczby8[i] < srednia8) {
            mniejsze8++;
        }

        if (liczby8[i] > srednia8) {
            wieksze8++;
        }
    }

    System.out.println("Najmniejsza liczba: " + najmniejsza8);
    System.out.println("Największa liczba: " + najwieksza8);
    System.out.println("Średnia: " + srednia8);
    System.out.println("Liczb mniejszych od średniej: " + mniejsze8);
    System.out.println("Liczb większych od średniej: " + wieksze8);

    System.out.println("Tablica od końca:");

    for (int i = liczby8.length - 1; i >= 0; i--) {
        System.out.println(liczby8[i]);
    }


    // ZADANIE 9

    int[] liczby9 = new int[20];

    Random losowanie9 = new Random();

    for (int i = 0; i < liczby9.length; i++) {
        liczby9[i] = losowanie9.nextInt(10) + 1;
    }

    System.out.println("ZADANIE 9");

    System.out.println("Zawartość tablicy:");

    for (int i = 0; i < liczby9.length; i++) {
        System.out.println(liczby9[i]);
    }

    System.out.println("Ile razy powtarza się każda liczba:");

    for (int i = 1; i <= 10; i++) {

        int ile9 = 0;

        for (int j = 0; j < liczby9.length; j++) {

            if (liczby9[j] == i) {
                ile9++;
            }
        }

        System.out.println(i + " powtarza się " + ile9 + " razy");
    }
}
