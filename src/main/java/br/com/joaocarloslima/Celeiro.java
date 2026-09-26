package br.com.joaocarloslima;

public class Celeiro {

    private int capacidade;
    private int qtdebatatas;
    private int qtdecenoura;
    private int qtdemorangos;

    public Celeiro() {
        capacidade = 30;
        qtdebatatas = 10;
        qtdecenoura = 10;
        qtdemorangos = 10;
    }

    public void armazenarBatata() {
        if (getEspacoDisponivel() < 2) {
            throw new RuntimeException("Celeiro cheio");
        }

        qtdebatatas += 2;
    }

    public void armazenarCenoura() {
        if (getEspacoDisponivel() < 2) {
            throw new RuntimeException("Celeiro cheio");
        }

        qtdecenoura += 2;
    }

    public void armazenarMorango() {
        if (getEspacoDisponivel() < 2) {
            throw new RuntimeException("Celeiro cheio");
        }

        qtdemorangos += 2;
    }

    public void consumirBatata() {
        if (qtdebatatas <= 0) {
            throw new RuntimeException("Sem batatas no celeiro");
        }

        qtdebatatas--;
    }

    public void consumirCenoura() {
        if (qtdecenoura <= 0) {
            throw new RuntimeException("Sem cenouras no celeiro");
        }

        qtdecenoura--;
    }

    public void consumirMorango() {
        if (qtdemorangos <= 0) {
            throw new RuntimeException("Sem morangos no celeiro");
        }

        qtdemorangos--;
    }

    public double getOcupacao() {
        return ((double) (qtdebatatas + qtdecenoura + qtdemorangos)
                / capacidade) * 100;
    }

    public int getEspacoDisponivel() {
        return capacidade - (qtdebatatas + qtdecenoura + qtdemorangos);
    }

    public boolean celeiroCheio() {
        return getEspacoDisponivel() == 0;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getQtdeBatatas() {
        return qtdebatatas;
    }

    public int getQtdeCenouras() {
        return qtdecenoura;
    }

    public int getQtdeMorangos() {
        return qtdemorangos;
    }
}