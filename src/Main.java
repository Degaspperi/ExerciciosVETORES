//Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
//e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a quantidade de números que serão informados:");
        int n = ler.nextInt();

        while (n<0 || n>10){
            System.out.println("É necessário que seja um número inteiro de 1 à 10");
            System.out.println("Informe a quantidade de números que serão informados:");
            n = ler.nextInt();
        }

        int vect[] = new int[n];

        for (int i=0; i<vect.length; i++){
            System.out.println("Informe o "+(i+1)+"° número:");
            vect[i]= ler.nextInt();
        }

        System.out.println("Números negativos:");

        for (int i=0; i< vect.length; i++){
            if (vect[i]<0) {
                System.out.println(vect[i]);
            }
        }



    }
}