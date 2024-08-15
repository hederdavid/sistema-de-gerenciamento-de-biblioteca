<%@page import="model.Livro"%>
<%@page import="java.util.List"%>
<%
	List<Livro> livros = (List<Livro>) request.getAttribute("livros");
%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Gerenciamento de Livros</title>
    <link rel="stylesheet" href="livros.css">
    <link rel="stylesheet" href="index.css">
</head>
<body>
    <header>
        <h1>Sistema de Gerenciamento de Biblioteca</h1>
        <nav>
            <ul>
                <li><a href="index.jsp">Home</a></li>
                <li><a href="livros.jsp">Livros</a></li>
                <li><a href="autores.jsp">Autores</a></li>
                <li><a href="usuarios.jsp">Usuários</a></li>
                <li><a href="emprestimos.jsp">Empréstimos</a></li>
            </ul>
        </nav>
    </header>
    <main>
        <h2>Gerenciamento de Livros</h2>
        <a href="cadastrarLivro.jsp"><button class="btn-add">Adicionar Novo Livro</button> </a>
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Título</th>
                    <th>Autor</th>
                    <th>Data de Publicação</th>
                    <th>Categoria</th>
                    <th>Ações</th>
                </tr>
            </thead>
            <tbody>
                <!-- Linhas de exemplo, você vai popular isso dinamicamente -->
                <%for (Livro livro : livros) { %>
				<tr>
					<td><%=livro.getId()%></td>
					<td><%=livro.getTitulo()%></td>
					<td><%=livro.getAutor()%></td>
					<td><%=livro.getDataPublicacao()%></td>
					<td><%=livro.getCategoria()%></td>
					<td>
						<a href="select?idcon=<%=livro.getId() %>" class="btn-edit">Editar</a>
						<a href="" class="btn-delete">Excluir</a>
					</td>
					
				</tr>
			<%} %>
            </tbody>
        </table>
    </main>
    <footer>
        <p>&copy; 2024 Sistema de Gerenciamento de Biblioteca</p>
    </footer>
</body>
</html>
