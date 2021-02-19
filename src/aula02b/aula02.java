package aula02b;

public class aula02 {
    public static void main (String [] args){
        /**
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.modelo = "Hostnet";
        c2.cor = "Preta";
        c2.destampar();
        c2.rabiscar();
        c2.status();
         */

        Cachorro cao = new Cachorro();
        cao.nome = "Fred";
        cao.corOlhos = "Castanhos";
        cao.peso = 13;
        cao.tamanho = 60;
        cao.quantPatas = 4;
        cao.latir = true;
        cao.latir();
        cao.status1();

    }
}
