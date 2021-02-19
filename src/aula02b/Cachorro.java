package aula02b;

public class Cachorro {
    String nome;
    int peso;
    String corOlhos;
    int quantPatas;
    int tamanho;
    Boolean latir;

    void  status1(){
        System.out.println("Qual o nome: "+ this.nome);
        System.out.println("Qual o peso: "+ this.peso);
        System.out.println("Cor de olhos: "+ this.corOlhos);
        System.out.println("Quantas patas? "+ this.quantPatas);
        System.out.println("Ele sabe latir? "+ this.latir);
        System.out.println("Tamanho: "+ this.tamanho);

    }

    void  latir(){
        if(tamanho > 60){
            System.out.println("Woof Woof!!");
        }else if(tamanho > 14){
            System.out.println("Ruff Ruff!!");
        }else{
            System.out.println("Yip Yip!!");
        }
    }

}
