//Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
//devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
//da pessoa mais velha.

    import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("Os dados de quantas pessoas serão informados? ");
        int quantidade = ler.nextInt();

        Pessoa09[] pessoa = new Pessoa09[quantidade];
        int maiorIdade=0;
        for (int i=0; i< pessoa.length; i++){
            System.out.println("Informe seu nome: ");
            String nome = ler.next();

            System.out.println("Informe sua idade: ");
            int idade = ler.nextInt();
            pessoa[i] = new Pessoa09(nome,idade);

        }
        maiorIdade = pessoa[0].getIdade();
        for (int i=0; i< pessoa.length; i++){
            if (pessoa[i].getIdade()>maiorIdade){
                maiorIdade = pessoa[i].getIdade();
            }
        }

        System.out.println("Pessoa mais velha: ");

        for (int i=0; i< pessoa.length; i++){
            if (pessoa[i].getIdade()==maiorIdade){
                System.out.println(pessoa[i].getNome());
            }
        }
    }
}