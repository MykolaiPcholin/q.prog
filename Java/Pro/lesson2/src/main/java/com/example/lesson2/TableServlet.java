package com.example.lesson2;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jakarta.servlet.annotation.*;

public class TableServlet extends HttpServlet {

    private List<Customer> customers = Arrays.asList(
            new Customer(1,"Soul","Goodman","male",45,"Alebookerke","Smitt&Wesson","owners","boss","login1","password1","sudo_recovery",1000000,20,10),
            new Customer(2,"Alex","Adams","male",30,"Alebookerke","Smitt&Wesson","owners","headmanager","login2","password12","sudo_recovery",100000,5,0),
            new Customer(3,"Ben","Aflick","male",27,"Alebookerke","Smitt&Wesson","owners","headmanager","login3","password3","sudo_recovery",100000,15,15),
            new Customer(4,"Mike","Rurk","male",51,"Alebookerke","Smitt&Wesson","owners","headmanager","login4","password4","sudo_recovery",100000,25,5),
            new Customer(5,"Jon","Wick","male",21,"Alebookerke","Smitt&Wesson","owners","headmanager","login5","password5","sudo_recovery",100000,35,20),
            new Customer(6,"James","Bond","male",42,"Alebookerke","Smitt&Wesson","owners","headmanager","login6","password6","sudo_recovery",100000,5,35),
            new Customer(7,"Nike","Jhordan","male",31,"Alebookerke","Smitt&Wesson","sales","teamlead","login7","password7","sudo_recovery",35000,10,15),
            new Customer(8,"Den","Boy","male",19,"Alebookerke","Smitt&Wesson","sales","manager","login8","password8","sudo_recovery",15000,20,10),
            new Customer(9,"Ann","Bell","female",22,"Alebookerke","Smitt&Wesson","sales","manager","login9","password9","sudo_recovery",17000,5,5),
            new Customer(10,"Mary","Poppins","female",33,"Alebookerke","Smitt&Wesson","tech spec","teamlead","login10","password10","sudo_recovery",30000,10,25),
            new Customer(11,"Tom","Henks","male",44,"Alebookerke","Smitt&Wesson","tech spec","manager","login11","password11","sudo_recovery",14500,15,20),
            new Customer(12,"Richard","Mellosy","male",40,"Alebookerke","Smitt&Wesson","tech spec","manager","login12","password12","sudo_recovery",18000,10,15),
            new Customer(13,"Mark","Twen","male",47,"Alebookerke","Smitt&Wesson","tech spec","manager","login13","password13","sudo_recovery",12000,20,5),
            new Customer(14,"Lili","Potter","female",55,"Alebookerke","Smitt&Wesson","tech spec","manager","login14","password14","sudo_recovery",15000,30,10),
            new Customer(15,"Adam","Alexandrios","male",32,"Alebookerke","Smitt&Wesson","tech spec","manager","login15","password15","sudo_recovery",11000,0,20)
    );

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        request.setAttribute("customersList", customers);
        request.setAttribute("customers", getCustomerTable());
        request.getRequestDispatcher("/table.jsp").forward(request, response);
    }

    public String getCustomerTable () {
        StringBuilder sb = new StringBuilder();
        for (Customer customer : customers) {
            sb.append("<tr><td class=number>")
                    .append(customer.getId())
                    .append("</td><td>")
                    .append(customer.getFirstName())
                    .append("</td><td>")
                    .append(customer.getSecondName())
                    .append("</td></tr>")
                    .append(customer.getGender())
                    .append("</td><td>")
                    .append(customer.getAge())
                    .append("</td></tr>")
                    .append(customer.getCity())
                    .append("</td><td>")
                    .append(customer.getCompany())
                    .append("</td></tr>")
                    .append(customer.getDepartment())
                    .append("</td><td>")
                    .append(customer.getPosition())
                    .append("</td></tr>")
                    .append(customer.getLogin())
                    .append("</td><td>")
                    .append(customer.getPassword())
                    .append("</td></tr>")
                    .append(customer.getRecoveryPassphrase())
                    .append("</td><td>")
                    .append(customer.getSalary())
                    .append("</td></tr>")
                    .append(customer.getBonusPercent())
                    .append("</td><td>")
                    .append(customer.getTax())
                    .append("</td></tr>");
        }
        return sb.toString();
    }
}
