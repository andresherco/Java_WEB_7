package co.edu.co.login.servlets;

import co.edu.co.login.model.beans.User;
import co.edu.co.login.model.repository.Repository;
import co.edu.co.login.model.repository.UserRepositoryImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;


@WebServlet ("/register-user")
public class RegisterUserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // todo collect all form data
        String user_firstname = request.getParameter("user_firstname");
        String user_lastname = request.getParameter("user_lastname");
        String user_email = request.getParameter("user_email");
        String user_password = request.getParameter("user_password");

        // todo fill it up in a User bean

        User user = new User(user_firstname,user_lastname,user_email,user_password);


        // todo Repository layer and save the user object to DB

        Repository<User> repository = new UserRepositoryImpl();
        int rows = 0;

        try{
            rows = repository.saveObj(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // todo prepare an information message for user about success or failure of the operation

        // String infoMessage = null;

        if (rows == 0){

            //infoMessage = "Ocurrio un error !";
            System.out.println("Ocurrio un error !");
        }else {
            System.out.println("La informacion ah sido guardada exitosamente");
        }

        // Todo write the message back to the page in client browser
    }
} //RegistreUserServlet