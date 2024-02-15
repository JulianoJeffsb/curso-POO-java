public class Tecnico extends Aluno {
    private String registroProfissinal;

    public void praticar() {
        System.out.println("Profissinal registrado com suceso " + this.getNome());
    }
    @Override
    public void pagarMensalidade() {
        System.out.println(this.getNome() + " é necessario fazer o Pagamento ");
    }
    public String getRegistroProfissinal() {
        return registroProfissinal;
    }
    public void setRegistroProfissinal(String registroProfissinal) {
        this.registroProfissinal = registroProfissinal;
    }
    
        
}
