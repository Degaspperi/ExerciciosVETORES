//Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
//mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
//os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.

import java.util.Scanner;
import java.util.Locale;
import java.util.spi.LocaleNameProvider;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);
        System.out.println("Quantos elementos terá o vetor? ");
        int elementos = ler.nextInt();
        double total=0;
        double [] numero = new double[elementos];

        for (int i=0; i<numero.length; i++){
            System.out.println("Informe o "+(i+1)+"° número:");
            numero[i] = ler.nextDouble();
            total+=numero[i];
        }

        double media=total/numero.length;
        System.out.printf("Média do vetor: %.3f\n", media);


        System.out.println("Números abaixo da média:");
        for (int i=0; i<numero.length; i++){
            if (numero[i]<media){
                System.out.println(numero[i]);
            }
        }


    }
}