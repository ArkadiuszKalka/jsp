<%@ page import="eu.infoshare.pl.ExampleModel" %>
<%@ page import="eu.infoshare.pl.Book" %>
<html>
<body>
<h2>Hello World!</h2>
Zegar: <%= new java.util.Date() %>
<%-- Komentarz --%>
<!-- Komentarz -->
<table border=”2”>
<%
    ExampleModel exampleModel =new ExampleModel();
    exampleModel.addBook();
    for (Book book: exampleModel.lista){%>
<tr>
    <td><%= book.getName()%></td><td><%=book.getYear()%></td><td><%=book.getAuthor()%></td>
</tr>
<%
    }
%>
</table>
</body>
</html>
