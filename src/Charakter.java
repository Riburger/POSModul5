public class Charakter {

    private String name;

    private int lebenspunkte;

    private boolean spezialfaehigkeitAktiv;

    public Charakter(String name, boolean spezialfaehigkeitAktiv) {
        this.name = name;
        this.spezialfaehigkeitAktiv = spezialfaehigkeitAktiv;
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

    public void schadenNehmen(int punkte){

    }

    public void angreifen(){

    }
}
