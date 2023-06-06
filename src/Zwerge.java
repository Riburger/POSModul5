import java.util.concurrent.ThreadLocalRandom;

public class Zwerge extends Charakter{

    private int angriffswert;

    public Zwerge(String name) {
        super(name);
        this.angriffswert = ThreadLocalRandom.current().nextInt(15, 25 + 1);
    }

    public int getAngriffswert() {
        return angriffswert;
    }

    public void setAngriffswert(int angriffswert) {
        this.angriffswert = angriffswert;
    }


    @Override
    public void spezialfaehigkeitAktivieren() {
        if (getLebenspunkte() < 50) {
            super.spezialfaehigkeitAktivieren();
        }
    }

    @Override
    public void spezialfaehigkeitDeaktivieren() {
        super.spezialfaehigkeitDeaktivieren();
    }

    @Override
    public void angreifen(Charakter gegner) {
        this.angriffswert = ThreadLocalRandom.current().nextInt(15, 25 + 1);
        if (this.isSpezialfaehigkeitAktiv()){
            double wahrscheinlichkeit = ThreadLocalRandom.current().nextDouble(0.0, 0.9 + 0.1);
            if (this.getLebenspunkte() <= 10 && wahrscheinlichkeit*10 <= 7 || this.getLebenspunkte() <= 20 && wahrscheinlichkeit*10 <= 5 || this.getLebenspunkte() <= 50 && wahrscheinlichkeit*10 <= 3){
            setAngriffswert(angriffswert*2);
            }else setAngriffswert(angriffswert/2);

        }
        gegner.schadenNehmen(angriffswert);
    }

    @Override
    public void setSpezialfaehigkeitAktiv(boolean spezialfaehigkeitAktiv) {
        super.setSpezialfaehigkeitAktiv(spezialfaehigkeitAktiv);

    }
}
