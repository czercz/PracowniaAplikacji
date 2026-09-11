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

        System.out.println("To " + farenhajty + "farenhajtów");
    


}
