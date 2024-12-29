import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ProdutosDAO {
    
    Connection conn;
    PreparedStatement prep;
    ResultSet resultset;
    ArrayList<ProdutosDTO> listagem = new ArrayList<>();
    
    public boolean cadastrarESalvarProduto(ProdutosDTO produto){
        String sql = "INSERT INTO produtos (nome, valor, status_vendido) VALUES (?, ?, ?)";

    try (Connection conn = conectaDAO.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setString(1, produto.getNome());
        stmt.setInt(2, produto.getValor());
        stmt.setString(3, produto.getStatus());

        stmt.executeUpdate();
        return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public ArrayList<ProdutosDTO> listarProdutos(){
        ArrayList<ProdutosDTO> listagem = new ArrayList<>();
        return listagem;
    }
}