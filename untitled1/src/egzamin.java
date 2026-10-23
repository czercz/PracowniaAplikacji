
    import java.time.LocalTime;

    public class egzamin {
        private String nazwa_przedmiotu;
        private LocalDate data;
        private LocalTime godzina_rozpoczęcia;
        private LocalTime godzina_zakończenia;
        public static void start() {
        }
        public static void stop() {
        }
        public egzamin(String nazwaPrzedmiotu, LocalDate data) {
            this.nazwaPrzedmiotu = nazwaPrzedmiotu;
            this.data = data;
        }

        public egzamin(String nazwa_przedmiotu, LocalDate data, LocalTime godzina_rozpoczęcia, LocalTime godzina_zakończenia) {
            this.nazwa_przedmiotu = nazwa_przedmiotu;
            this.data = data;
            this.godzina_rozpoczęcia = godzina_rozpoczęcia;
            this.godzina_zakończenia = godzina_zakończenia;
        }
    }


