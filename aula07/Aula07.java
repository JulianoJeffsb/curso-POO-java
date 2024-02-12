public class Aula07 {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6]; 
        l[0] = new Lutador("Pretty boy", "frança", 31, 1.75f, 68.9f, 11, 2, 1);
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 11, 2, 1);
        l[2] = new Lutador("Snapshadow", "EUA", 31, 1.75f, 80.9f, 11, 2, 1);
        l[3] = new Lutador("Dead Code", "Austrália", 31, 1.75f, 81.9f, 11, 2, 1);
        l[4] = new Lutador("UFOCobol", "Brasil", 31, 1.75f, 119.9f, 11, 2, 1);
        l[5] = new Lutador("Nerdaart", "EUA", 31, 1.75f, 105.9f, 11, 2, 1);
        
Luta UEC01 = new Luta();
UEC01.marcarLuta(l[1], l[1]);
UEC01.lutar();
l[0].status();
l[1].status();
    }
}
// javac Aula07.java Controlador.java Lutador.java
//java Aula07
//javac Aula07.java Controlador.java Lutador.java Luta.java && java Aula07