

void main() {
    //zadanie1
    System.out.println("Podaj dodatnia liczbe calkowita:");
    Scanner n1sc = new Scanner(System.in);
    int n1 = n1sc.nextInt();

    System.out.print("Wynik: ");
    for (int i = 1; i <= n1; i += 2) {
        System.out.print(i + (i + 2 <= n1 ? ", " : ""));
    }
    System.out.println();

    //zadanie2
    System.out.println("Podaj liczbe calkowita dodatnia n:");
    Scanner n2sc = new Scanner(System.in);
    int n2 = n2sc.nextInt();
    int potega = 1;

    System.out.println("Potegi liczby 2:");
    while (potega <= n2) {
        System.out.println(potega);
        potega *= 2;
    }

    //zadanie3
    System.out.println("Podawaj liczby (0 konczy wpisywanie):");
    Scanner liczba3sc = new Scanner(System.in);
    int suma3 = 0;
    int liczba3 = liczba3sc.nextInt();

    while (liczba3 != 0) {
        suma3 += liczba3;
        Scanner liczba3kolejnasc = new Scanner(System.in);
        liczba3 = liczba3kolejnasc.nextInt();
    }
    System.out.println("Suma podanych liczb wynosi: " + suma3);

    //zadanie4
    System.out.println("Podaj pierwszy element ciagu (0 konczy od razu):");
    Scanner pierwszasc = new Scanner(System.in);
    int pierwsza = pierwszasc.nextInt();

    if (pierwsza != 0) {
        int min = pierwsza;
        int max = pierwsza;

        System.out.println("Podaj kolejne liczby (0 konczy):");
        Scanner lsc = new Scanner(System.in);
        int l = lsc.nextInt();

        while (l != 0) {
            if (l < min) min = l;
            if (l > max) max = l;
            Scanner lkolejnasc = new Scanner(System.in);
            l = lkolejnasc.nextInt();
        }

        int sumaMinMax = min + max;
        double srednia = (double) sumaMinMax / 2;

        System.out.println("Najmniejsza: " + min);
        System.out.println("Najwieksza: " + max);
        System.out.println("Suma najwiekszej i najmniejszej: " + sumaMinMax);
        System.out.println("Srednia arytmetyczna min i max: " + srednia);
    } else {
        System.out.println("Brak danych.");
    }

    //zadanie5
    Random rand = new Random();
    int wylosowana = rand.nextInt(100) + 1;
    int strzal;

    System.out.println("Zgadnij liczbe od 1 do 100:");
    do {
        Scanner strzalsc = new Scanner(System.in);
        strzal = strzalsc.nextInt();

        if (strzal > wylosowana) {
            System.out.println("Podałeś za dużą wartość");
        } else if (strzal < wylosowana) {
            System.out.println("Podałeś za małą wartość");
        } else {
            System.out.println("Gratulacje");
        }
    } while (strzal != wylosowana);

    //zadanie6
    System.out.println("Podaj znak wypelnienia prostokata:");
    Scanner znaksc = new Scanner(System.in);
    char znak = znaksc.next().charAt(0);

    System.out.println("Podaj x (lewy gorny rog):");
    Scanner xsc = new Scanner(System.in);
    int x = xsc.nextInt();

    System.out.println("Podaj y (lewy gorny rog):");
    Scanner ysc = new Scanner(System.in);
    int y = ysc.nextInt();

    System.out.println("Podaj szerokosc a:");
    Scanner asc = new Scanner(System.in);
    int a = asc.nextInt();

    System.out.println("Podaj wysokosc b:");
    Scanner bsc = new Scanner(System.in);
    int b = bsc.nextInt();

    for (int i = 1; i < y; i++) {
        System.out.println();
    }
    for (int i = 0; i < b; i++) {
        for (int j = 1; j < x; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < a; j++) {
            System.out.print(znak);
        }
        System.out.println();
    }

    //zadanie7
    System.out.println("Podaj wysokosc choinki n (>0):");
    Scanner n7sc = new Scanner(System.in);
    int n7 = n7sc.nextInt();

    for (int i = 1; i <= n7; i++) {
        for (int j = 0; j < n7 - i; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < (2 * i - 1); j++) {
            System.out.print("*");
        }
        System.out.println();
    }

    //zadanie8
    System.out.println("Podaj liczbe do obliczenia silni:");
    Scanner n8sc = new Scanner(System.in);
    int n8 = n8sc.nextInt();
    long silnia = 1;

    for (int i = 1; i <= n8; i++) {
        silnia *= i;
    }
    System.out.println("Silnia wynosi: " + silnia);

    //zadanie9
    System.out.println("Podaj slowo do sprawdzenia:");
    Scanner slowosc = new Scanner(System.in);
    String slowo = slowosc.next();
    String odwrocone = new StringBuilder(slowo).reverse().toString();

    if (slowo.equalsIgnoreCase(odwrocone)) {
        System.out.println("Slowo jest palindromem");
    } else {
        System.out.println("Slowo nie jest palindromem");
    }

    //zadanie10
    System.out.println("Wynik zadania 10");
    zewnetrzna:
    for (int i = 1; i <= 10; i++) {
        if (i % 2 != 0) {
            continue;
        }
        for (int j = 1; j <= 10; j++) {
            if (j > i) {
                continue zewnetrzna;
            }
            System.out.println("i = " + i + ", j = " + j);
        }
    }
}