public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta(null, null, null);
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta(null, null, null);
        c2.modelo = "Bic";
        c2.cor = "Preta";
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
}
//  javac Aula02.java Caneta.java
//  java Aula02