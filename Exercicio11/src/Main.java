//Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
//que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
//de homens.

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);
        System.out.println("Serão informadas quantas pessoas? ");
        int quantidade = ler.nextInt();
        double alturaF=0;
        int totalHomens = 0, totalMulher = 0;

        Pessoa10[] pessoa = new Pessoa10[quantidade];

        for (int i=0; i< pessoa.length; i++){
            System.out.println("Altura da "+(i+1)+"° pessoa: ");
            double altura = ler.nextDouble();
            System.out.println("Gênero da "+(i+1)+"° pessoa: ");
            char genero = ler.next().charAt(0);
            pessoa[i]=new Pessoa10(altura, genero);

            if (pessoa[i].getGenero()=='f'){
                totalMulher ++;
                alturaF+=pessoa[i].getAltura();

            } else if (pessoa[i].getGenero()=='m') {
                totalHomens++;
            }
        }

        double maiorAltura = pessoa[0].getAltura();
        double menorAltura = pessoa[0].getAltura();

        for (int i=0; i< pessoa.length; i++){
            if (maiorAltura<pessoa[i].getAltura()){
                maiorAltura = pessoa[i].getAltura();
            }else if(menorAltura>pessoa[i].getAltura()){
                menorAltura = pessoa[i].getAltura();
            }
        }

        double mediaAlturaF = alturaF/totalMulher;

        System.out.printf("Menor altura: %.2f\n",menorAltura);
        System.out.printf("Maior altura: %.2f\n",maiorAltura);
        System.out.printf("Média da altura feminina: %.2f\n",mediaAlturaF);
        System.out.println("Número de homens: "+totalHomens);

    }
}