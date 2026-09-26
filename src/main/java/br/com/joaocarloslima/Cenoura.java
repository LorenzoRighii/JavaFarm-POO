package br.com.joaocarloslima;

public class Cenoura {
    int tamanho;
    int tempoDeVida;
    int tempoDeCrescimento;


    public Cenoura() {
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
        return "images/cenoura" + tamanho + ".png";

    }
}
