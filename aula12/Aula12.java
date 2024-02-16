
public class Aula12 
{
    public static void main(String[]args)
    {
        //Animal n = new Animal();
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new ave();

        m.setPeso(25.5f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();
    
    }
}