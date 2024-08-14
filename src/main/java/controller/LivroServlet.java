package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.LivroDAO;
import model.Livro;

@WebServlet("/LivroServlet")
public class LivroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LivroServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Obtém os parâmetros do formulário
        String titulo = request.getParameter("titulo");
        String autor = request.getParameter("autor");
        String dataPublicacao = request.getParameter("dataPublicacao");
        String categoria = request.getParameter("categoria");

        // Cria um objeto Livro
        Livro livro = new Livro();
        livro.setTitulo(titulo);
        livro.setAutor(autor);
        livro.setDataPublicacao(dataPublicacao);
        livro.setCategoria(categoria);

        // Salva o livro no banco de dados
        LivroDAO livroDAO = new LivroDAO();
        boolean sucesso = livroDAO.salvarLivro(livro);

        // Redireciona ou mostra uma mensagem de sucesso ou erro
        if (sucesso) {
        	System.out.println("Salvo com sucesso");
            response.sendRedirect("livro/livros.jsp");
        } else {
        	System.out.println("Erro ao salvar");
            response.getWriter().write("Erro ao cadastrar o livro. Por favor, tente novamente.");
        }
	}

}
