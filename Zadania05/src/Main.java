



    // Zadanie 1
    public int mojWiek() {
        return 18;
    }

    // Zadanie 2
    public String mojeImie() {
        return "Adam";
    }

    // Zadanie 3
    public void obliczenia(double a, double b) {
        System.out.println("Suma: " + (a + b));
        System.out.println("Różnica: " + (a - b));
        System.out.println("Iloczyn: " + (a * b));
    }

    // Zadanie 4
    public boolean czyParzysta(int liczba) {
        return liczba % 2 == 0;
    }

    // Zadanie 5
    public boolean czyPodzielnaPrzez3i5(int liczba) {
        return liczba % 3 == 0 && liczba % 5 == 0;
    }

    // Zadanie 6
    public double potegaTrzecia(double liczba) {
        return liczba * liczba * liczba;
    }

    // Zadanie 7
    public double pierwiastek(double liczba) {
        return Math.sqrt(liczba);
    }

    // Zadanie 8
    public boolean czyTrojkatProstokatny(double a, double b, double c) {

        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }

        if (a >= b && a >= c) {
            return a * a == b * b + c * c;
        } else if (b >= a && b >= c) {
            return b * b == a * a + c * c;
        } else {
            return c * c == a * a + b * b;
        }
    }

    // Zadanie 9
    public char ostatniZnak(String tekst) {
        return tekst.charAt(tekst.length() - 1);
    }

    // Zadanie 10
    public boolean czyPalindrom(String tekst) {

        tekst = tekst.toLowerCase();

        int lewy = 0;
        int prawy = tekst.length() - 1;

        while (lewy < prawy) {
            if (tekst.charAt(lewy) != tekst.charAt(prawy)) {
                return false;
            }

            lewy++;
            prawy--;
        }

        return true;
    }

    // Zadanie 11
    public int sumaTablicy(int[] tablica) {

        int suma = 0;

        for (int liczba : tablica) {
            suma += liczba;
        }

        return suma;
    }

    // Zadanie 12
    public int zliczWystapienia(String tekst, char znak) {

        int licznik = 0;

        for (int i = 0; i < tekst.length(); i++) {
            if (tekst.charAt(i) == znak) {
                licznik++;
            }
        }

        return licznik;
    }


    void main(){

        // Zadanie 1
        System.out.println("Mój wiek: " + mojWiek());

        // Zadanie 2
        System.out.println("Moje imię: " + mojeImie());

        // Zadanie 3
        obliczenia(10, 5);

        // Zadanie 4
        System.out.println("Czy 8 jest parzyste? " + czyParzysta(8));

        // Zadanie 5
        System.out.println("Czy 15 jest podzielne przez 3 i 5? "
                + czyPodzielnaPrzez3i5(15));

        // Zadanie 6
        System.out.println("3 do potęgi 3: " + potegaTrzecia(3));

        // Zadanie 7
        System.out.println("Pierwiastek z 16: " + pierwiastek(16));

        // Zadanie 8
        System.out.println("Czy 3, 4, 5 tworzą trójkąt prostokątny? "
                + czyTrojkatProstokatny(3, 4, 5));

        // Zadanie 9
        System.out.println("Ostatni znak słowa Witaj: "
                + ostatniZnak("Witaj"));

        // Zadanie 10
        System.out.println("Czy kajak jest palindromem? "
                + czyPalindrom("kajak"));

        System.out.println("Czy Kajak jest palindromem? "
                + czyPalindrom("Kajak"));

        System.out.println("Czy kot jest palindromem? "
                + czyPalindrom("kot"));

        // Zadanie 11
        int[] liczby = {1, 7, 20, 100};

        System.out.println("Suma tablicy: "
                + sumaTablicy(liczby));

        // Zadanie 12
        int liczbaLiterA = zliczWystapienia("Ala ma kota", 'a');

        System.out.println("Liczba wystąpień litery a: "
                + liczbaLiterA);
    }