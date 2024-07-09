//Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
//aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
//digitado, mostrar a mensagem "NENHUM NUMERO PAR"

import java.util.Scanner;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner ler = new Scanner(System.in);

    System.out.println("Informe a quantidade de elementos do vetor: ");
    int quantidade = ler.nextInt();

    int[] vetor = new int[quantidade];
    int total=0, divisor=0;

    for (int i=0; i< vetor.length; i++){

        System.out.println("Informe o valor do "+(i+1)+"° número:");
        vetor[i] = ler.nextInt();

        if (vetor[i] % 2 == 0){
            total+=vetor[i];
            divisor++;
        }

    }

    if (divisor>=1){
        int media = total/divisor;
        System.out.printf("Média dos pares: %.1f\n",(double) media );
    }else{
        System.out.println("Nenhum número é par");
    }










    }
}