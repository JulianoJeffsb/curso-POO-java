public class Caneta 
{
    String modelo;
    float ponta;
    String cor;
    private boolean tampada;

    public Caneta(String m, String c, Float p) {  // este é o Metodo Contrutor
        this.modelo = m;
        this.cor = c;
        this.setPonta(p);
        this.tampar();
    }

    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String m) {
        this.modelo = m;
    }

    public float getPonta() {
        return this.ponta;
    }
    public void setPonta(float p) {
        this.ponta = p;
    }
    public void tampar() {
        this.tampada = true;
    }
    public void destampar() {
        this.tampada = false;
    }
    


    public void status() {
        System.out.println("SOBRE A CANETA");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor:" + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }

    public void rabiscar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'rabiscar'");
    } 

}
