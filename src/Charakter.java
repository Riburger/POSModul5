public class Charakter {

    private String name;

    private int lebenspunkte;

    private boolean spezialfaehigkeitAktiv;

    public Charakter(String name) {
        this.name = name;
        this.spezialfaehigkeitAktiv = false;
        this.lebenspunkte = 100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLebenspunkte() {
        return lebenspunkte;
    }

    public void setLebenspunkte(int lebenspunkte) {
        this.lebenspunkte = lebenspunkte;
    }

    public boolean isSpezialfaehigkeitAktiv() {
        return spezialfaehigkeitAktiv;
    }

    public void setSpezialfaehigkeitAktiv(boolean spezialfaehigkeitAktiv) {
        this.spezialfaehigkeitAktiv = spezialfaehigkeitAktiv;
    }
    public void spezialfaehigkeitAktivieren(){
        this.spezialfaehigkeitAktiv = true;
    }

    public void spezialfaehigkeitDeaktivieren(){
        this.spezialfaehigkeitAktiv = false;
    }
    public void schadenNehmen(int punkte){
        this.lebenspunkte = lebenspunkte - punkte;
    }

    public void angreifen(Charakter gegner){

    }
}
