public class ProjetoLivro
{
    
    public static void main(String[] args)
    {
        Pessoa[] p = new Pessoa[3];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa ("Juliano", 34, "M");   
        p[1] = new Pessoa ("Isneíde", 31, "F");
        p[2] = new Pessoa ("Klaus", 6, "M");

        l[0] = new Livro("A", "D", 300, p[0]);
        l[1] = new Livro("B", "E", 58, p[2]);
        l[2] = new Livro("C", "F", 1000, p[1]);

        System.out.println(l[2].detalhes());
        System.out.println(l[1].detalhes());
        System.out.println(l[0].detalhes());

    }
}






// javac Pessoa.java Livro.java Publicacao.java ProjetoLivro.java