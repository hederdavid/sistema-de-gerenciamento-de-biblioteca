<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Cadastrar Livro</title>
    <link rel="stylesheet" type="text/css" href="cadastrarLivro.css">
</head>
<body>
    <div class="container">
        <h1>Cadastrar Livro</h1>
        <form name="frmCadastrarLivro" action="../LivroServlet" method="post">
            <label for="titulo">Título:</label>
            <input type="text" id="titulo" name="titulo" required>

            <label for="autor">Autor:</label>
            <input type="text" id="autor" name="autor" required>

            <label for="dataPublicacao">Data de Publicação:</label>
            <input type="date" id="dataPublicacao" name="dataPublicacao" required>

            <label for="categoria">Categoria:</label>
            <input type="text" id="categoria" name="categoria" required>

            <button type="submit">Cadastrar</button>
        </form>
    </div>

</body>
</html>
