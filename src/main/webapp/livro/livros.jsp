<%@page import="model.Livro"%>
<%@page import="java.util.List"%>
<%
	List<Livro> lista = (List<Livro>) request.getAttribute("livros");
	out.print(lista);
%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Gerenciamento de Livros</title>
    <link rel="stylesheet" href="livros.css">
    <link rel="stylesheet" href="../index.css">
</head>
<body>
    <header>
        <h1>Sistema de Gerenciamento de Biblioteca</h1>
        <nav>
            <ul>
                <li><a href="../index.jsp">Home</a></li>
                <li><a href="livros.jsp">Livros</a></li>
                <li><a href="autores.jsp">Autores</a></li>
                <li><a href="usuarios.jsp">Usu�rios</a></li>
                <li><a href="emprestimos.jsp">Empr�stimos</a></li>
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
                    <th>T�tulo</th>
                    <th>Autor</th>
                    <th>Data de Publica��o</th>
                    <th>Categoria</th>
                    <th>A��es</th>
                </tr>
            </thead>
            <tbody>
                <!-- Linhas de exemplo, voc� vai popular isso dinamicamente -->
                <tr>
                    <td>1</td>
                    <td>O Alquimista</td>
                    <td>Paulo Coelho</td>
                    <td>1988</td>
                    <td>Fic��o</td>
                    <td>
                        <button class="btn-edit">Editar</button>
                        <button class="btn-delete">Excluir</button>
                    </td>
                </tr>
            </tbody>
        </table>
    </main>
    <footer>
        <p>&copy; 2024 Sistema de Gerenciamento de Biblioteca</p>
    </footer>
</body>
</html>
