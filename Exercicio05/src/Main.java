//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
//o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
//considerando a primeira posição como 0 (zero).

import java.awt.event.WindowFocusListener;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);
        int n;

        System.out.println("Informe a quantidade de números que serão digitados: ");
        n = ler.nextInt();

        double[] numeros = new double[n];

        for (int i=0; i< numeros.length;i++){
            System.out.println("Informe o "+(i+1)+"° número:");
            numeros[i]=ler.nextDouble();
        }

        double maiorNumero=numeros[0];

        for (int i=0; i<numeros.length; i++){

            if (numeros[i]>maiorNumero){
                maiorNumero = numeros[i];
            }
        }

        System.out.println("Maior número: "+maiorNumero);
        int posicao=0;
        for (int i=0; i < numeros.length; i++) {
            if (numeros[i] == maiorNumero) {
                posicao = i;
            }
        }
        System.out.println("Posição do maior número: "+posicao);
    }
}