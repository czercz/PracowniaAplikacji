import jdk.swing.interop.SwingInterOpUtils;

void main() {

        String imie1 = "Ania";
        String imie2 = "Bartek";
        String imie3 = "Kasia";
        System.out.println(imie1);
        System.out.println(imie2);
        System.out.println(imie3);

        String mojeimie = "Adam";
        int rokurodzenia = 2007;
        double liczba = 0.66;
        System.out.println("Mam na imie "+mojeimie+", mam " + (2026-rokurodzenia) + " lat i będę pisać maturę za " + liczba + " roku");

        System.out.println("Podaj stopinie na dworze: ");
        Scanner stopniesc =  new Scanner(System.in);

        double stopnie = stopniesc.nextDouble();
        double farenhajty = (1.8*stopnie)+32.0;

        System.out.println("To " + farenhajty + " farenhajtów");

        System.out.println("Podaj bok a: ");
        Scanner bokasc =  new Scanner(System.in);
        double boka = bokasc.nextDouble();
        System.out.println("Podaj bok b: ");
        Scanner bokbsc =  new Scanner(System.in);
        double bokb = bokasc.nextDouble();
        System.out.println("Podaj bok c: ");
        Scanner bokcsc =  new Scanner(System.in);
        double bokc = bokasc.nextDouble();

        System.out.println("Obwód trójkąta: " + (boka+bokb+bokc));

        System.out.println("Podaj 1 slowo: ");
        Scanner slowo1sc =  new Scanner(System.in);
        String slowo1 = slowo1sc.next();
        System.out.println("Podaj 2 slowo: ");
        Scanner slowo2sc =  new Scanner(System.in);
        String slowo2 = slowo2sc.next();
        System.out.println("Podaj 3 slowo: ");
        Scanner slowo3sc =  new Scanner(System.in);
        String slowo3 = slowo3sc.next();

        System.out.println(slowo3 + ", " + slowo2 + ", " + slowo1);

        
}
