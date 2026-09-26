package br.com.joaocarloslima;

public class Batata {
    int tamanho;
    int tempoDeVida;
    int tempoDeCrescimento;


    public Batata() {
        tamanho = 1;
        tempoDeVida = 0;
        tempoDeCrescimento = 3;

    }

    public void crescer(){
        tempoDeVida++;
        if (tempoDeVida % tempoDeCrescimento == 0 && tamanho < 4) {
            tamanho++;
        }
    }

    public boolean podeColher(){
        return tamanho == 4;
    }

    public String getImagem() {
        return "images/batata" + tamanho + ".png";

    }

}
