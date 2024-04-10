<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Transaction History</title>
</head>
<body>
    <h1>Transaction History</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Type</th>
            <th>Description</th>
            <th>Amount</th>
            <th>Date</th>
        </tr>
        <%
            ResultSet transactions = (ResultSet) request.getAttribute("transactions");
            while (transactions.next()) {
                int id = transactions.getInt("id");
                String type = transactions.getString("type");
                String description = transactions.getString("description");
                double amount = transactions.getDouble("amount");
                java.sql.Date date = transactions.getDate("date");
        %>
        <tr>
            <td><%= id %></td>
            <td><%= type %></td>
            <td><%= description %></td>
            <td><%= amount %></td>
            <td><%= date %></td>
        </tr>
        <%
            }
        %>
    </table>
</body>
</html>