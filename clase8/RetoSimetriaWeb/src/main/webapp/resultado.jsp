<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="pe.edu.isil.retosimetria.ValidadorReto" %>
<%@ page import="pe.edu.isil.retosimetria.HtmlSeguro" %>
<%
    request.setCharacterEncoding("UTF-8");
    String error = null;
    ValidadorReto reto = null;
    if (!"POST".equalsIgnoreCase(request.getMethod())) {
        error = "Debes enviar el formulario.";
    } else {
        String codigoTexto = request.getParameter("codigo");
        String fraseTexto = request.getParameter("frase");
        if (codigoTexto == null || fraseTexto == null) {
            error = "Faltan campos en la solicitud.";
        } else {
            try {
                int codigo = Integer.parseInt(codigoTexto.trim());
                reto = new ValidadorReto(codigo, fraseTexto);
            } catch (NumberFormatException ex) {
                error = "El código debe ser un número entero válido.";
            } catch (IllegalArgumentException ex) {
                error = ex.getMessage();
            }
        }
    }
%>
<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Reto Simetría Web | Resultado</title>
  <link rel="stylesheet" href="estilos.css">
</head>
<body><main><section class="card">
  <span class="badge">Resultado del reto</span>
  <% if (error != null) { %>
    <h1>Revisa los datos</h1>
    <p class="alert"><%= HtmlSeguro.escapar(error) %></p>
  <% } else { %>
    <h1>Evaluación completada</h1>
    <p><strong>Código:</strong> <%= reto.getCodigo() %></p>
    <p><strong>Frase:</strong> <%= HtmlSeguro.escapar(reto.getFrase()) %></p>
    <div class="grid">
      <div class="item"><strong>Capicúa</strong><span><%= reto.esCapicua() %></span></div>
      <div class="item"><strong>Primo</strong><span><%= reto.esPrimo() %></span></div>
      <div class="item"><strong>Palíndromo</strong><span><%= reto.esPalindromo() %></span></div>
    </div>
    <p class="score">Puntaje: <%= reto.puntaje() %> / 3</p>
    <p><strong>Nivel:</strong> <%= HtmlSeguro.escapar(reto.nivel()) %></p>
  <% } %>
  <a class="button" href="index.jsp">Intentar otro reto</a>
</section></main></body>
</html>