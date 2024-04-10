/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoyoutube;

/**
 *
 * @author BELA
 */
public abstract class Pessoa {
    protected String nome, sexo;
    protected int idade, experiencia;
    protected abstract void ganharExp();

    public Pessoa(String nome, String sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.experiencia = 0;
    }
    
    
    @Override
    public String toString() {
        return  nome + ", sexo = " + sexo + ", idade = " + idade + ", experiencia = " + experiencia + '}';
    }
    
}
