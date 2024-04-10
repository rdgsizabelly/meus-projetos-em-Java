/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoyoutube;

/**
 *
 * @author BELA
 */
public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, String sexo, int idade, String login) {
        super(nome, sexo, idade);
        this.login = login;
        this.totAssistido = 0; 
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
    public void viuMaisUm(){
        
    }
    @Override
    protected void ganharExp() {

    }

    @Override
    public String toString() {
        return super.toString() + "\nGafanhoto{" + "login = " + login + ", totAssistido = " + totAssistido + '}';
    }
    
}
