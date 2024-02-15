public class ControleRemoto implements Controlador {
    
    // Atributos
    private int Volume;
    private boolean ligado;
    private boolean tocando;
    // Métodos especiais
    
    public ControleRemoto() {
       this.Volume = 50;
       this.ligado = false;
       this.tocando = false; 
    }

    private int getVolume() {
        return Volume;
    }

    private void setVolume(int volume) {
        Volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    
    public void ligar() {
        this.setLigado(true);
    }

    
    public void desligar() {
        this.setLigado(false);
    }


    public void abrirMenu() {
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i+=10) {
            System.out.print("|");
        }
    }

    
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }


    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 5);
        }
    }

    
    public void menosVolome() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 5);            
        }
    }

    
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(0);
        }
    }

    
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    
    public void play() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(true);
        }
    }

    
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        }
    }
    
    
    
    
}
