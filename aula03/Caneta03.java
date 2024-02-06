public class Caneta03 {
    public String modelo;
    public String cor;
    public float ponta;
    protected int carga;
    protected boolean tampada;
    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }
    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO! não posso rabiscar");
        } else {
            System.out.println("Estou rabiscando");
        }
    }
    protected void tampar() {
        this.tampada = true;
    }
    protected void destampar() {
        this.tampada = false;

    }
}
// javac Aula03.java Caneta03.java && java Aula03