//Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
//no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
//os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
//igual a 6.0 (seis)

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);
        System.out.println("A nota de quantos alunos será informada: ");
        int quantidade = ler.nextInt();
        ler.nextLine();
        Aluno10[] aluno = new Aluno10[quantidade];

        for (int i=0; i< aluno.length; i++){
            System.out.println("Informe o nome do "+(i+1)+"° aluno: ");
            String nomeAluno = ler.nextLine();
            System.out.println("Informe a primeira nota do "+(i+1)+"° aluno:");
            double nota1 = ler.nextDouble();
            System.out.println("Informe a segunda nota do "+(i+1)+"° aluno: ");
            double nota2 = ler.nextDouble();
            ler.nextLine();
            aluno[i] = new Aluno10(nomeAluno, nota1, nota2);

        }

        System.out.println("Alunos aprovados: ");

        for (int i=0; i< aluno.length; i++){
            if (aluno[i].media()>=6){
                System.out.println(aluno[i].getNome());
            }
        }

    }
}