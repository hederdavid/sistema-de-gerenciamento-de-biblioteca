package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
    public List<Livro> listarLivrosCadastrados() {
    	List<Livro> livros = new ArrayList<>();
    	String read = "SELECT * FROM livros ORDER BY titulo";
    	try {
    		Connection con = Conexao.conectar();
    		PreparedStatement pst = con.prepareStatement(read);
  			ResultSet rs = pst.executeQuery();
  			while(rs.next()) {
  				int id = Integer.parseInt(rs.getString(1));
  				String titulo = rs.getString(2);
  				String autor = rs.getString(3);
  				String dataPublicacao = rs.getString(4);
  				String categoria = rs.getString(5);
  				
  				livros.add(new Livro(id, titulo, autor, dataPublicacao, categoria));	
  			}
  			con.close();
  			System.out.println(livros);
  			return livros;   
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
            return null;
        }
    }

}
