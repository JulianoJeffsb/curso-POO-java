public class ProjetoPessoas {
    public static void main(String[] args)
    {
        // Progama pricipal
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p1.setIdade(20);
        p1.setSexo("M");
        p2.setNome("Maria");
        p2.setIdade(23);
        p2.setSexo("F");
        p3.setNome("Cláudio");
        p3.setIdade(21);
        p3.setSexo("M");
        p4.setNome("Fabiana");
        p4.setIdade(19);
        p4.setSexo("F");

        

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
