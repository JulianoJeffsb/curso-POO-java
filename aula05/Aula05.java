public class Aula05 {
    public static void main(String[] args){
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abriConta("CC");

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Creuza");
        p2.abriConta("CP");

        p1.depositar(100);
        p2.depositar(500);
        p2.sacar(50);
        p1.estadoAtual();
        p2.estadoAtual();
    }

}
// javac Aula05.java ContaBanco.java  * criar aquivos .class
// javac Aula05.java ContaBanco.java && java Aula05  * compilar e execultar