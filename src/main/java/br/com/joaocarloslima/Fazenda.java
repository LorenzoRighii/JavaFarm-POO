package br.com.joaocarloslima;

import java.util.ArrayList;
import java.util.List;

public class Fazenda {

    private List<Terreno> terrenos;
    private Celeiro celeiro;

    public Fazenda() {

        terrenos = new ArrayList<>();
        celeiro = new Celeiro();

        for (int x = 0; x < 13; x++) {
            for (int y = 0; y < 13; y++) {
                terrenos.add(new Terreno(x, y));
            }

        }
    }

    public void plantarBatata(int x, int y) {
        Terreno terreno = getTerreno(x, y);
        if (!terreno.estaOcupado() && celeiro.getQtdeBatatas() > 0) {
            celeiro.consumirBatata();
            terreno.plantar(new Batata());
        }
    }

    public void plantarCenoura(int x, int y) {
        Terreno terreno = getTerreno(x, y);

        if (!terreno.estaOcupado() && celeiro.getQtdeCenouras() > 0) {
            celeiro.consumirCenoura();
            terreno.plantar(new Cenoura());
        }
    }

    public void plantarMorango(int x, int y) {
        Terreno terreno = getTerreno(x, y);
        if (!terreno.estaOcupado() && celeiro.getQtdeMorangos() > 0) {
            celeiro.consumirMorango();
            terreno.plantar(new Morango());
        }
    }

    public void colher(int x, int y) {
        Terreno terreno = getTerreno(x,y);
        if (terreno != null){
            terreno.colher(celeiro);
        }


    }

    public Terreno getTerreno(int x, int y) {
        for (Terreno terreno : terrenos) {
            if (terreno.getX() == x && terreno.getY() == y) {
                return terreno;
            }
        }
        return null;
    }

    public Celeiro getCeleiro() {
        return celeiro;
    }
}
