import java.util.Random;
import java.util.Scanner;

public class Kampfarena {

    private Charakter charakter1;

    private Charakter charakter2;

    private Charakter gewinner;

    public Kampfarena(Charakter charakter1, Charakter charakter2) {
        this.charakter1 = charakter1;
        this.charakter2 = charakter2;
    }

    public void fight(){

        Random random = new Random();
        Charakter angreifer = random.nextBoolean() ? charakter1 : charakter2;
        Charakter opfer = random.nextBoolean() ? charakter2 : charakter1;

        while(gewinner == null){
        kampfsimulieren(angreifer, opfer);

        Charakter temp = angreifer;
        angreifer = opfer;
        opfer = temp;

        }
        System.out.println("Der Gewinner ist " + gewinner.getName() + " er hat mit " + gewinner.getLebenspunkte() + " überlebt");
    }

    public void kampfsimulieren(Charakter angreifer, Charakter opfer){
        Scanner scanner = new Scanner(System.in);
        System.out.println(angreifer.getName() + " " + angreifer.getLebenspunkte() + " ist am Zug. Bitte wählen sie eine Aktion");
        System.out.println("1 - Angreifen ");
        System.out.println("2 - Spezialfähigkeit aktivieren");
        System.out.println("3 - Spezialfähigkeit deaktivieren");
        int aktion = Integer.valueOf(scanner.nextLine());

        switch (aktion) {

            case 1:
                angreifer.angreifen(opfer);
                break;

            case 2:
                angreifer.spezialfaehigkeitAktivieren();
                break;

            case 3:
                angreifer.spezialfaehigkeitDeaktivieren();
                break;

            default:
                System.out.println("Ungültige Aktion - Bitte wählen Sie aus 1, 2 oder 3");
                return;
        }

        if (opfer.getLebenspunkte() <= 0){
            gewinner = angreifer;
        }
    }
}
