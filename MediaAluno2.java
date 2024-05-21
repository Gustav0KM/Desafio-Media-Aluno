package com.mycompany.mediaaluno2;
import java.util.ArrayList;
import java.util.Scanner;

public class MediaAluno2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolha;
        ArrayList<Aluno> arrayAlu = new ArrayList<Aluno>();
        
        do{
        System.out.print("""
                           |------------Digite um numero!----------|
                           
                            1. Inserir na lista
                            2. Excluir da lista
                            3. Mostrar alunos
                            4. Sair
                         
                           |---------------------------------------|
                           -->""");
        
        escolha = sc.nextInt();
        sc.nextLine();
        
        switch(escolha){
            case 1 -> { 
                float acumulador = 0;
                
                System.out.print("Qual o nome do aluno? "); 
                String nome = sc.nextLine();
                
                System.out.print("Qual a idade do aluno? "); 
                int idade = sc.nextInt();
                
                System.out.print("Qual a primeira nota do aluno? "); 
                float nota1 = sc.nextFloat();
                while(nota1 > 10){
                    System.out.println("ERRO! Nota maior que 10 pontos!");
                    System.out.println("Qual a primeira nota do aluno? "); 
                    nota1 = sc.nextFloat();
                }
                
                System.out.print("Qual a segunda nota do aluno? "); 
                float nota2 = sc.nextFloat();
                while(nota2 > 10){
                    System.out.println("ERRO! Nota maior que 10 pontos!");
                    System.out.println("Qual a segunda nota do aluno? "); 
                    nota2 = sc.nextFloat();
                }
                
                System.out.print("Qual a terceira nota do aluno? "); 
                float nota3 = sc.nextFloat();
                while(nota3 > 10){
                    System.out.println("ERRO! Nota maior que 10 pontos!");
                    System.out.println("Qual a terceira nota do aluno? "); 
                    nota3 = sc.nextFloat();
                }
                
                acumulador = nota1 + nota2 + nota3;
                float media = acumulador / 3;
                
                Aluno AlunoNovo = new Aluno(nome, idade, nota1, nota2, nota3, media, acumulador);
                arrayAlu.add(AlunoNovo);
                
                AlunoNovo.status();
                }
                
            case 2 -> {
                if (arrayAlu.isEmpty()){
                    System.out.println("Nenhum aluno encontrado!");
                    break;       
                }
                System.out.println("Qual o nome do aluno que deseja excluir? \n");
                System.out.println("Alunos cadastrados: ");
                for(Aluno j: arrayAlu){
                    System.out.println(j.getNome());
                }
                String alunoDelet = sc.nextLine();
                for (Aluno aluno: arrayAlu){
                    if (aluno.getNome().equalsIgnoreCase(alunoDelet)){
                        arrayAlu.remove(aluno);
                        System.out.println("Aluno removido!");
                        break;
                    }
      
                }
                System.out.println("Aluno nao encontrado!");
            }
            
            case 3 -> {
                for(Aluno percorrerAluno: arrayAlu){
                    System.out.println(percorrerAluno);
                    System.out.println("");
                }
                
            }
        }
                 
        }while(escolha != 4);
    }
}
