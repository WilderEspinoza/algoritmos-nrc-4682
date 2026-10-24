<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Reto Simetría Web | Registro</title>
  <link rel="stylesheet" href="estilos.css">
</head>
<body>
  <main><section class="card">
    <span class="badge">ISIL · Repaso POO · Sesión 08</span>
    <h1>Reto Simetría Web</h1>
    <p class="lead">Ingresa un código y una frase. Java evaluará si el código
       es capicúa y primo, y si la frase es palíndroma.</p>
    <form action="resultado.jsp" method="post" accept-charset="UTF-8">
      <label for="codigo">Código numérico (0 a 999999)</label>
      <input id="codigo" name="codigo" type="number" min="0" max="999999"
             step="1" value="131" required>
      <label for="frase">Frase (máximo 80 caracteres)</label>
      <input id="frase" name="frase" type="text" maxlength="80"
             value="somos" required>
      <button type="submit">Evaluar reto</button>
    </form>
  </section></main>
</body>
</html>