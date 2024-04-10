package projetolivro;

public class ProjetoLivro {

    public static void main(String[] args) {
        
        Pessoa p[] = new Pessoa[2];
        Livro l[] = new Livro[3];
        
        p[0] = new Pessoa("Bibi", "F", 20);
        p[1] = new Pessoa("Lela", "F", 20);
        l[0] = new Livro("Detona", "Ralf", 500, p[0]);
        l[1] = new Livro("Como ser mais homem", "Felipe", 350, p[1]);
        l[2] = new Livro("Como superar ex", "Bianca", 2, p[1]);
        
        System.out.println(l[0].detalhes());
        l[0].abrir();
        l[0].avancarPag();
        System.out.println("");
        System.out.println(l[0].detalhes());
        l[0].folhear( 500);
        System.out.println("");
        System.out.println(l[0].detalhes());
        p[0].fazerAniversario();
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
    }
    
}
