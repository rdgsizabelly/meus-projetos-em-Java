package uef;

import java.util.Random;

public class Luta {
    private Lutador desafiante;
    private Lutador desafiado;
    private int rounds;
    private boolean aprovada;

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria() == l2.getCategoria() && l1 != l2){
            this.aprovada = true;
            this.desafiante = l1;
            this.desafiado = l2;
        }else{
            this.aprovada = false;
            this.desafiante = null;
            this.desafiado = null;
        }
    }
    public void lutar(){
        if(this.aprovada){
            System.out.println("##DESAFIADO##");
            this.desafiado.apresentar();
            System.out.println("##DESAFIANTE##");
            this.desafiante.apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);// 0 1 2
            System.out.println("=========RESULTADO DA LUTA========");
            switch(vencedor){
                case 0:
                    System.out.println("Empate!");
                    this.desafiado.empatarLutar();
                    this.desafiante.empatarLutar();
                    break;
                case 1:
                    System.out.println(this.desafiado.getNome() + "venceu");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLutar();
                    break;
                case 2:
                    System.out.println(this.desafiante.getNome() + " venceu");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLutar();
                    break;
            }
        }else{
            System.out.println("Luta não aprovada");
        }
        System.out.println("========================================");
    }
}
