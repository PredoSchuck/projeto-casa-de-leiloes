import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ProdutosDAO {
    
    Connection conn;
    PreparedStatement prep;
    ResultSet resultset;
    ArrayList<ProdutosDTO> listagem = new ArrayList<>();
    
    public void cadastrarProduto (ProdutosDTO produto){
        
        
        //conn = new conectaDAO().connectDB();
        
        
    }
    
    public ArrayList<ProdutosDTO> listarProdutos(){
        ArrayList<ProdutosDTO> listagem = new ArrayList<>();
        
        ProdutosDTO p1 = new ProdutosDTO();
        p1.setId(1);
        p1.setNome("Produto A");
        p1.setValor(100);
        p1.setStatus("Disponível");
        
        ProdutosDTO p2 = new ProdutosDTO();
        p2.setId(2);
        p2.setNome("Produto B");
        p2.setValor(150);
        p2.setStatus("Indisponível");
        
        listagem.add(p1);
        listagem.add(p2);
        
        return listagem;
    }
    
    public boolean cadastrarProduto(String nome){
        return true;
    }
}