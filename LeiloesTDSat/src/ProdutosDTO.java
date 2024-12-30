public class ProdutosDTO {
    private int id;
    private String nome;
    private int valor;
    private String status_Vendido;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getStatus_Vendido() {
        return status_Vendido;
    }

    public void setStatus_Vendido(String status_vendido) {
        this.status_Vendido = status_vendido;
    }
}