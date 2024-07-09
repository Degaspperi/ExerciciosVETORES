//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
//- Imprimir todos os elementos do vetor
//- Mostrar na tela a soma e a média dos elementos do vetor

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a quantidade de números que serão informados:");
        int n = ler.nextInt();
        double somatoriaTotal=0, media;
        double[] numero = new double[n];

        for (int i=0; i<numero.length; i++){
            System.out.println("Informe o "+(i+1)+"° número:");
            numero[i]=ler.nextDouble();
        }

        System.out.printf("Valores: ");
        for (int i=0; i<numero.length; i++){
            System.out.printf(" %.2f",numero[i]);
        }

        for (int i=0; i<numero.length; i++){
            somatoriaTotal = somatoriaTotal + numero[i];
        }
        System.out.printf("\nSoma: %.2f",somatoriaTotal);

        media = somatoriaTotal/numero.length;
        System.out.printf("\nMedia: %.2f",media);

    }
}