public class Aula {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa();
        /*Visitante v1 = new Visitante();
        v1.setNome("A");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());*/
        /*Aluno a1 = new Aluno();
        a1.setNome("Cláudio");
        a1.setMatricula(1111);
        a1.setCurso("informática");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();*/
        /*Bolsista b1 = new Bolsista();
        b1.setNome("Jubileu");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();*/
        Professor pr1 = new Professor();
        pr1.setNome("Jose");
        System.out.println(pr1.toString());
        System.out.println(pr1.receberAumento(100.01f));
        Tecnico t1 = new Tecnico();
        t1.setNome("Pedro");
        t1.pagarMensalidade();
    }

}
