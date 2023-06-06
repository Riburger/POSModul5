public class app {
         public static void main(String[] args) {
            Charakter charakter1 = new Drachen("Drache");
            Charakter charakter2 = new Zwerge("Zwerg");
            Kampfarena arena = new Kampfarena(charakter1, charakter2);
            arena.fight();
        }
    }


