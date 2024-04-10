package projetopessoas;

public class ProjetoPessoas {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedroca");
        p2.setNome("Maria");
        p3.setNome("Ryan");
        p4.setNome("Mateus");
        
        p2.setCurso("tecnico da informacao");
        p3.setSalario(3.000);
        p4.setSetor("Dev");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
    
}
