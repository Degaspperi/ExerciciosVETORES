//Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
//terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
//o vetor C gerado.

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("Quantos valores terá cada vetor: ");
        int n = ler.nextInt();

        int [] vetor1 = new int[n];
        int [] vetor2 = new int[n];
        int [] vetor3 = new int[n];

        for (int i=0; i< vetor1.length;i++){

            System.out.println("Informe o valor do "+(i+1)+"° do primeiro vetor:");
            vetor1[i] = ler.nextInt();

        }

        for (int i=0; i< vetor2.length;i++){

            System.out.println("Informe o valor do "+(i+1)+"° do segundo vetor:");
            vetor2[i] = ler.nextInt();

        }

        System.out.println("Vetor resultante: ");
        for (int i=0; i<vetor3.length; i++){
            vetor3[i] = vetor2[i] + vetor1[i];
            System.out.println(vetor3[i]);
        }

    }
}