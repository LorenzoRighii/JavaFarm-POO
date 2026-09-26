package br.com.joaocarloslima;

public class Terreno {
    private Batata batata;
    private Cenoura cenoura;
    private Morango morango;
    private int x;
    private int y;

    public Terreno(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void plantar(Batata batata) {
        this.batata = batata;
    }

    public void plantar(Cenoura cenoura) {
        this.cenoura = cenoura;
    }

    public void plantar(Morango morango) {
        this.morango = morango;
    }

    public void colher(Celeiro celeiro) {

        if (batata != null && batata.podeColher()) {
            celeiro.armazenarBatata();
            batata = null;
        }
        if (cenoura != null && cenoura.podeColher()) {
            celeiro.armazenarCenoura();
            cenoura = null;

        }
        if (morango != null && morango.podeColher()) {
            celeiro.armazenarMorango();
            morango = null;
        }

    }

    public boolean estaOcupado() {
        return batata != null || cenoura != null || morango != null;
    }


    public Batata getBatata() {
        return batata;
    }

    public void setBatata(Batata batata) {
        this.batata = batata;
    }

    public Cenoura getCenoura() {
        return cenoura;
    }

    public void setCenoura(Cenoura cenoura) {
        this.cenoura = cenoura;
    }

    public Morango getMorango() {
        return morango;
    }

    public void setMorango(Morango morango) {
        this.morango = morango;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
