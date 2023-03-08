<%@ page import="com.example.lesson2.Customer" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="css/style.css" rel="stylesheet">
    <title>Title</title>
    <style>
        html {
            background-color: #e5e5e5;
        }
        table {
            margin: 0 auto;
            background-color: gray;
            border: 1px solid black;
        }
        th {
            text-transform: capitalize;
        }
        th, td {
            background-color: #e5e5e5;
            border: 1px solid black;
        }
    </style>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>id</th>
        <th>firstName</th>
        <th>secondName</th>
        <th>gender</th>
        <th>age</th>
        <th>city</th>
        <th>company</th>
        <th>department</th>
        <th>position</th>
        <th>login</th>
        <th>password</th>
        <th>recoveryPassphrase</th>
        <th>salary</th>
        <th>bonusPercent</th>
        <th>tax</th>
    </tr>
    </thead>
    <tbody>
    <%
        List<Customer> customers = (List<Customer>) request.getAttribute("customersList");
        for (Customer customer : customers) {
//                  For printing in response we must use out object not PrintWriter
            out.print("<tr><td>" + customer.getId() + "</td><td>" +
                    customer.getFirstName() + "</td><td>" + customer.getSecondName() + "</td><td>" + customer.getGender() +
                    "</td><td>" + customer.getAge() + "</td><td>" + customer.getCity() + "</td><td>" +
                    customer.getCompany() + "</td><td>" + customer.getDepartment() + "</td><td>" + customer.getPosition() +
                    "</td><td>" + customer.getLogin() + "</td><td>" + customer.getPassword() + "</td><td>" +
                    customer.getRecoveryPassphrase() + "</td><td>" + customer.getSalary() + "</td><td>" + customer.getBonusPercent() +
                    "</td><td>" + customer.getTax() + "</td></tr>");
        }
    %>
    </tbody>
</table>
</body>
</html>