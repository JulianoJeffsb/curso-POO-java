
public class Aula12 
{
    public static void main(String[]args)
    {
        //Animal n = new Animal();
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        System.out.println("Características dos mamíferos: ");
        m.setPeso(25.5f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();

        System.out.println("\nCaracterísticas dos répteis: ");
        r.setPeso(5.5f);
        r.setCorEscama("Verde");
        r.alimentar();
        r.locomover();
        r.emitirSom();

        System.out.println("\nCaracterísticas dos peixes: ");
        p.setPeso(15.5f);
        p.setCorEscama("Cinsa");
        p.alimentar();
        p.locomover();
        p.emitirSom();

        System.out.println("\nCaracterísticas das aves: ");
        a.setPeso(25.5f);
        a.setCorPena("Branca");
        a.alimentar();
        a.locomover();
        a.emitirSom();

        
        
    }
}