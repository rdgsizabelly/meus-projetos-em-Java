package projetopessoas;

public class Professor extends Pessoa{
    private String especialidade;
    private double salario;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void aumSalario(double aum){
        this.setSalario(this.getSalario() + aum);
    }
}
