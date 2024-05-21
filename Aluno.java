
package com.mycompany.mediaaluno2;

public class Aluno {
    private String nome;
    private int idade;
    private float nota1;
    private float nota2;
    private float nota3;
    private float media;
    private float acumulador;

    public Aluno(String nome, int idade, float nota1, float nota2, float nota3, float media, float acumulador) {
        this.nome = nome;
        this.idade = idade;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.media = media;
        this.acumulador = acumulador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }
    public void status(){
        System.out.println("Media: " + this.media);
        System.out.println("Total notas: " + this.acumulador);
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nIdade:" + idade + "\nNota 1:" + nota1 + "\nNota 2:" + nota2 + "\nNota 3:" + nota3 + "\nMedia: " + media + "\nSomatorio: " + acumulador;
    }
    
    
}

