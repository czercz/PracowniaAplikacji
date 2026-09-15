void main() {
    //zadanie1

    System.out.println("Podaj liczbę, aby sprawdzić czy jest podzielna przez 3");
    Scanner liczba1sc = new Scanner(System.in);
    int liczba1 = liczba1sc.nextInt();

    if (liczba1 % 3 == 0) {
        System.out.println("Liczba " + liczba1 + " jest podzielna przez 3");
    } else {
        System.out.println("Liczba " + liczba1 + " nie jest podzielna przez 3");
    }

    //zadanie2
    System.out.println("Podaj pierwszy bok");
    Scanner bok1sc = new Scanner(System.in);
    int bok1 = bok1sc.nextInt();
    System.out.println("Podaj drugi bok");
    Scanner bok2sc = new Scanner(System.in);
    int bok2 = bok2sc.nextInt();
    System.out.println("Podaj trzeci bok");
    Scanner bok3sc = new Scanner(System.in);
    int bok3 = bok3sc.nextInt();

    if (bok1 + bok2 > bok3 && bok1 + bok3 > bok2 && bok2 + bok3 > bok1) {
        System.out.println("Z boków: " + bok1 + ", " + bok2 + ", " + bok3 + " można zbudować trójkąt");
    } else {
        System.out.println("Z boków: " + bok1 + ", " + bok2 + ", " + bok3 + " nie można zbudować trójkąta");
    }

    //zadanie3
    System.out.println("Podaj pierwsza liczbe");
    Scanner liczbaasc = new Scanner(System.in);
    int liczbaa = liczbaasc.nextInt();
    System.out.println("Podaj druga liczbe");
    Scanner liczbabsc = new Scanner(System.in);
    int liczbab = liczbabsc.nextInt();

    if (liczbaa > liczbab) {
        System.out.println("Liczba " + liczbaa + " jest największa");
    } else {
        System.out.println("Liczba " + liczbab + " jest największa");
    }


    //zadanie4

    System.out.println("Podaj pierwsza liczbe");
    Scanner liczbacsc = new Scanner(System.in);
    int liczbac = liczbacsc.nextInt();
    System.out.println("Podaj druga liczbe");
    Scanner liczbadsc = new Scanner(System.in);
    int liczbad = liczbadsc.nextInt();
    System.out.println("Podaj trzecia liczbe");
    Scanner liczbaesc = new Scanner(System.in);
    int liczbae = liczbaesc.nextInt();

    if (liczbac > liczbad && liczbac > liczbae) {
        System.out.println("Liczba " + liczbac + " jest największa");
    } else if (liczbac < liczbad && liczbad > liczbae) {
        System.out.println("Liczba " + liczbad + " jest największa");
    } else {
        System.out.println("Liczba " + liczbae + " jest największa");
    }

    //zadanie5
    System.out.println("Podaj nazwe miesiąca: ");
    Scanner miessc = new Scanner(System.in);

    int miesiac = miessc.nextInt();

    String nazwa = switch (miesiac) {
        case 1 -> "Styczen";
        case 2 -> "Luty";
        case 3 -> "Marzec";
        case 4 -> "Kwiecien";
        case 5 -> "Maj";
        case 6 -> "Czerwiec";
        case 7 -> "Lipiec";
        case 8 -> "Sierpien";
        case 9 -> "Wrzesien";
        case 10 -> "Pazdziernik";
        case 11 -> "Listopad";
        case 12 -> "Grudzien";
        default -> "Nieprawidlowy numer miesiaca";

    };
    System.out.println(nazwa);

    //zadanie6
    String mojeimie = "Adam";
    System.out.println("Podaj swoje imie: ");
    Scanner imiesc = new Scanner(System.in);

    String imie = imiesc.nextLine();

    if (imie.equals(mojeimie)) {
        System.out.println("Twoje imie jest takie samo jak moje");
    } else {
        System.out.println("Masz inaczej na imie niz ja");
    }

    //zadanie7

    System.out.println("Podaj wiek: ");
    Scanner wiekSc = new Scanner(System.in);

    int wiek = wiekSc.nextInt();

    String wynik = (wiek >= 18) ? "Jesteś pełnoletni" : "Nie jesteś pełnoletni";

    System.out.println(wynik);


    //zadanie8
    System.out.println("Podaj rok: ");
    Scanner roksc = new Scanner(System.in);

    int rok = roksc.nextInt();

    String wynik2 = (rok % 4 == 0 && rok % 100 != 0 || rok % 400 == 0) ? "Rok przestepny" : "Nie jest rokiem przestepnym";

    System.out.println(wynik2);

    //zadanie9
    System.out.println("Podaj wage: ");
    Scanner wagasc = new Scanner(System.in);
    double waga = wagasc.nextDouble();
    System.out.println("Podaj wzrost: ");
    Scanner wzrostsc = new Scanner(System.in);
    double wzrost = wzrostsc.nextDouble();

    double bmi = waga / (wzrost * wzrost);

    String wynik3 = (bmi < 18.5) ? "niedowaga" : (bmi <= 24.9) ? "waga prawidlowa" : "nadwaga";

    System.out.println("BMI: " + bmi);
    System.out.println(wynik3);

    //zadanie 10

    System.out.println("Podaj cene towaru: ");
    Scanner cenasc = new Scanner(System.in);
    double cena = cenasc.nextDouble();

    System.out.println("Podaj liczbe rat: ");
    Scanner ratysc = new Scanner(System.in);
    int raty = ratysc.nextInt();

    if (cena < 100 || cena > 10000) {
        System.out.println("Nieprawidlowa cena");
    } else if (raty < 6 || raty > 48) {
        System.out.println("Nieprawidlowa liczba rat");
    } else {

        double oprocentowanie;

        if (raty <= 12) {
            oprocentowanie = 0.025;
        } else if (raty <= 24) {
            oprocentowanie = 0.05;
        } else {
            oprocentowanie = 0.10;
        }

        double rata = (cena + cena * oprocentowanie) / raty;

        System.out.println("Miesieczna rata wynosi: " + rata + " zl");
    }
    System.out.println("Prosty kalkulator");

    System.out.println("Podaj pierwsza liczbe: ");
    Scanner liczba4sc = new Scanner(System.in);
    double liczba4 = liczba4sc.nextDouble();

    System.out.println("Podaj symbol operacji: ");
    Scanner operacjasc = new Scanner(System.in);
    char operacja = operacjasc.next().charAt(0);

    System.out.println("Podaj druga liczbe: ");
    Scanner liczba5sc = new Scanner(System.in);
    double liczba5 = liczba5sc.nextDouble();

    switch (operacja) {

        case '+':
            System.out.println("Wynik: " + (liczba4 + liczba5));
            break;

        case '-':
            System.out.println("Wynik: " + (liczba4 - liczba5));
            break;

        case '*':
            System.out.println("Wynik: " + (liczba4 * liczba5));
            break;

        case '/':
            if (liczba5 == 0) {
                System.out.println("Nie mozna dzielic przez zero");
            } else {
                System.out.println("Wynik: " + (liczba4 / liczba5));
            }
            break;

        default:
            System.out.println("Bledny symbol operacji");
    }

}
