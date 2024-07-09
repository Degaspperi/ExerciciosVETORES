//Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
//tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
//bem como os nomes dessas pessoas caso houver.

import java.util.Scanner;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        System.out.printf("Quantas pessoas serão farão parte da pesquisa? ");
        int n = ler.nextInt();
        Pessoa[] pessoas = new Pessoa[n];

        for (int i=0; i< pessoas.length; i++){
            System.out.println("Dados da "+(i+1)+"° pessoa:");
            System.out.printf("Nome: ");
            ler.nextLine();
            String nome = ler.nextLine();

            System.out.printf("Idade: ");
            int idade = ler.nextInt();
            System.out.printf("Altura: ");
            double altura = ler.nextDouble();
            pessoas[i] = new Pessoa(nome,idade, altura);
        }

        double totalAltura=0;
        for (int i=0; i< pessoas.length; i++){
            totalAltura = pessoas[i].getAltura()+totalAltura;
        }
        double alturaMedia = totalAltura/ pessoas.length;
        System.out.printf("Altura média: %.2f\n",alturaMedia);
        int menor16=0;

        for (int i=0; i<pessoas.length; i++){
            if (pessoas[i].getIdade()<16){
                menor16++;
            }
        }

        double porcentagemMenor16 = ((double)menor16/pessoas.length) * 100;
        System.out.println("Pessoas com menos de 16 anos: "+porcentagemMenor16+"%");

        for (int i=0; i<pessoas.length; i++){
            if (pessoas[i].getIdade()<16){
                System.out.println(pessoas[i].getNome());
            }
        }

    }
}