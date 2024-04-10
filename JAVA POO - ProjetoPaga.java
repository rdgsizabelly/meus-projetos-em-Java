package tiposherança;

public class TiposHerança {

    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("Julia");
        v1.setIdade(21);
        v1.setSexo("F");
        System.out.println(v1.toString());
        Aluno a1 = new Aluno();
        a1.setNome("Felipe");
        a1.setIdade(21);
        a1.setSexo("Faz");
        a1.setCurso("Informatica da putaria");
        a1.setMatricula(6969);
        System.out.println(a1.toString());
        Bolsista b1 = new Bolsista();
        b1.setNome("Aline");
        b1.setIdade(20);
        b1.setSexo("F");
        b1.setCurso("Nada");
        b1.renovarBolsa();
        b1.pagarMensalidade();
        b1.fazerAniversario();
        b1.setBolsa(12);
        System.out.println(b1.toString());
    }
    
}
