package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import model.Livro;
import util.Conexao;

public class LivroDAO {
	
	//CREATE
	public boolean salvarLivro(Livro livro) {
        String create = "INSERT INTO livros(titulo, autor, data_publicacao, categoria) values (?,?,?,?)";
        try {
            Connection con = Conexao.conectar();
            PreparedStatement pst = con.prepareStatement(create);
            pst.setString(1, livro.getTitulo());
            pst.setString(2, livro.getAutor());
            pst.setDate(3, java.sql.Date.valueOf(livro.getDataPublicacao()));
            pst.setString(4, livro.getCategoria());
            pst.executeUpdate();
            con.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
//    public List<Livro> listarLivrosCadastrados(Livro livro) {
//    	List<Livro> livros = new ArrayList<>();
//    	String read = "SELECT * FROM livros ORDER BY titulo";
//    	try {
//    		Connection con = Conexao.conectar();
//    		PreparedStatement pst = con.prepareStatement(read);
//  			ResultSet rs = pst.executeQuery();
//  			while(rs.next()) {
//  				String idcon = rs.getString(1);
//  				String nome = rs.getString(2);
//  				String fone = rs.getString(3);
//  				String email = rs.getString(4);
//  				
//  				contatos.add(new JavaBeans(idcon, nome, fone, email));	
//  			}
//  			con.close();
//  			return contatos;
//            
//            
//        } catch (ClassNotFoundException e) {
//            System.out.println("Driver JDBC não encontrado: " + e.getMessage());
//            return null;
//        } catch (SQLException e) {
//            System.out.println("Erro ao acessar o banco de dados: " + e.getMessage());
//            return null;
//        } catch (Exception e) {
//            System.out.println("Erro inesperado: " + e.getMessage());
//            return null;
//        }
//    }

}
