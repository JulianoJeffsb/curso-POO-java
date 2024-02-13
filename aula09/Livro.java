public class Livro implements Publicacao 
{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean abreto;
    private Pessoa leitor;

    
    
    
    public String detalhes() {
        return "Livro [titulo=" + titulo + "\n, autor=" + autor + "\n, totPaginas=" + totPaginas + "\n, pagAtual=" + pagAtual
                + "\n, abreto=" + abreto + "\n, leitor=" + leitor.getNome() + "\n, leitor=" + leitor.getSexo() +"]";
    }

    

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.abreto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAbreto() {
        return abreto;
    }

    public void setAbreto(boolean abreto) {
        this.abreto = abreto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }



    @Override
    public void abrir() {
        this.abreto = true;
        
    }

    @Override
    public void fechar() {
        this.abreto = false;
        
    }

    @Override
    public void folhear(int p) {
        this.pagAtual = p;
        
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
        
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }




    
        
    

}