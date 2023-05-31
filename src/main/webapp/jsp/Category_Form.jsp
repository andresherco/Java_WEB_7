<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <!-- METADATA -->
    <!-- charset para caracteres especiales -->
    <meta charset="UTF-8" />
    <!-- autor -->
    <meta name="author" content="Andres Felipe Hernandez Corredor" />
    <!-- description -->
    <meta name="description" content="ingreso de nombre eh id de categoria en java web" />
    <!-- keywords -->
    <meta name="keywords" content="ingresar un nombre y una id de una categoria" />
    <!-- minium responsive viewport -->
    <meta name="viewport " content="width=device-width, initial-scale=1.0 " />
    <!-- TITLE -->
    <title> Formulario de categorias</title>
    <!-- FAVICON -->
    <link rel="shortcut icon" type="image/png" href="/img/mqdefault.jpg"/>
    <!-- CSS -->
    <!-- bootstrap css / icons -->
    <!-- custom CSS -->
    <link rel="stylesheet" href="../css/Categories.css">
</head>
<body>
<h1 class="form-title">Formulario de Categorias</h1>
<form>
     <label for="id">ID:</label>
    <input type="text" id="id" name="id" placeholder="Ingresa la ID" pattern="[A-Za-z0-9]{3,10}" required>
    <small>La ID debe tener entre 3 y 10 caracteres alfanuméricos.</small>

    <label for="nombre">Nombre:</label>
    <input type="text" id="nombre" name="nombre" placeholder="Ingresa tu nombre" pattern="[A-Za-z ]{1,50}" required>
    <small>El nombre solo puede contener letras y espacios, con un máximo de 50 caracteres.</small>

    <button type="submit">Enviar</button>
</form>
<!-- JS -->
<!-- bootstrap js -->
</body>
</html>
