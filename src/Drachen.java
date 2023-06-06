import java.util.concurrent.ThreadLocalRandom;

public class Drachen extends Charakter{

    private int angriffswert;


    public Drachen(String name) {
        super(name);
        this.angriffswert = ThreadLocalRandom.current().nextInt(20, 25 + 1);
    }

    public int getAngriffswert() {
        return angriffswert;
    }

    public void setAngriffswert(int angriffswert) {
        this.angriffswert = angriffswert;
    }



    @Override
    public void spezialfaehigkeitAktivieren() {
        super.spezialfaehigkeitAktivieren();

            int malus = ThreadLocalRandom.current().nextInt(5, 10 + 1);
            setAngriffswert(getAngriffswert() - malus);
            setLebenspunkte(getLebenspunkte() + 10);

    }

    @Override
    public void spezialfaehigkeitDeaktivieren() {
        super.spezialfaehigkeitDeaktivieren();
            int malus = ThreadLocalRandom.current().nextInt(5, 10 + 1);
            setAngriffswert(getAngriffswert() + malus);
            setLebenspunkte(getLebenspunkte() - 10);

    }




    public void angreifen(Charakter gegner){
        this.angriffswert = ThreadLocalRandom.current().nextInt(20, 25 + 1);
        gegner.schadenNehmen(angriffswert);
    }
}
