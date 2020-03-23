<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
    <title>HW3</title>
    <style>
        table {
            color: #333;
            font-family: Helvetica, Arial, sans-serif;
            width: 640px;
            border-collapse: collapse;
            border-spacing: 0;
        }

        td, th {
            border: 1px solid #CCC;
            height: 30px;
        }

        th{
            background: black;
            font-weight: bold;
            color: white;
        }

        td{
            text-align: left;
        }

        tbody tr:nth-child(even) {
            background-color: #a3a3a3;
        }
    </style>
</head>
<body>

<h1>Black Ace Sports</h1>

<table>
    <tr>
        <th>Description</th>
        <th>Price</th>
        <th>Color</th>
    </tr>
    <c:forEach var = "listitem" items = "${inventorylist}">
        <tr>
            <td>${listitem.description}</td>
            <td>${listitem.price}</td>
            <td>${listitem.color}</td>
            <td></td>
        </tr>
    </c:forEach>
</table>

<h3> Owned By Marc Rodriguez</h3>
</body>
</html>
