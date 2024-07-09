//Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
//tela todos os números pares, e também a quantidade de números pares.

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int n = ler.nextInt();
        int numerosPares=0;
        int[] numero = new int[n];

        for (int i=0; i<numero.length; i++){
            System.out.println("Informe o valor do "+(i+1)+"° número: ");
            numero[i]= ler.nextInt();

        }



        System.out.println("Número pares: ");
        for(int i=0; i< numero.length; i++){

            if(numero[i] %2==0){
                System.out.println(numero[i]);
                numerosPares++;
            }
        }
        System.out.println("Quantidade de números pares: "+numerosPares);

    }
}