import java.sql.*;
import java.util.ArrayList;

public class ProdutosDAO {
    
    public ArrayList<ProdutosDTO> listarProdutos(){
        ArrayList<ProdutosDTO> listagem = new ArrayList<>();
        String sql = "SELECT * FROM produtos";

        try (Connection conn = conectaDAO.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery()) {

        while (rs.next()) {
            ProdutosDTO produto = new ProdutosDTO();
            produto.setId(rs.getInt("id"));
            produto.setNome(rs.getString("nome"));
            produto.setValor(rs.getInt("valor"));
            produto.setStatus_Vendido(rs.getString("status_vendido"));

            listagem.add(produto);
        }
        } catch (SQLException e) {
                e.printStackTrace();
        }
        return listagem;
    }
    
    public boolean cadastrarESalvarProduto(ProdutosDTO produto) {
        String sql = "INSERT INTO produtos (nome, valor, status_vendido) VALUES (?, ?, ?)";

        try (Connection conn = conectaDAO.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, produto.getNome());
            stmt.setInt(2, produto.getValor());
            stmt.setString(3, produto.getStatus_Vendido());

            stmt.executeUpdate();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean venderProduto(int id) {
        String sql = "UPDATE produtos SET status_vendido = 'Vendido' WHERE id = ?";

        try (Connection conn = conectaDAO.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, id);

            int rowsUpdated = stmt.executeUpdate();
            return rowsUpdated > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public ArrayList<ProdutosDTO> listarProdutosVendidos() {
        ArrayList<ProdutosDTO> listagem = new ArrayList<>();
        String sql = "SELECT * FROM produtos WHERE status_vendido = 'Vendido'";

        try (Connection conn = conectaDAO.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                ProdutosDTO produto = new ProdutosDTO();
                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setValor(rs.getInt("valor"));
                produto.setStatus_Vendido(rs.getString("status_vendido"));

                listagem.add(produto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listagem;
    }
}