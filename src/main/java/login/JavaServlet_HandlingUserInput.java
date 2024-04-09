package login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class JavaServlet_HandlingUserInput extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // JDBC URL, username, and password of MySQL server
        String url = "jdbc:mysql://localhost:3306/your_database";
        String user = "username";
        String password = "password";

        //* JDBC connection *//
        // Query
        String query = "INSERT INTO `jdbc_training`.`customer` (`CUSTOMER_ID`, `CUSTOMER_NAME`) VALUES('"+ coral.getCompTaxNum()+"','"+ coral.getCompName()+ "');";


        try {
            // connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_training", "root", "Pa$$w0rd");

            // passing query to the connect socket
            PreparedStatement pstmt = conn.prepareStatement(query);

            // Set the values for the prepared statement
            pstmt.setString(1, request.getParameter("name"));
            pstmt.setString(2, request.getParameter("email"));
            pstmt.setString(3, request.getParameter("phone"));

            // Execute the query to insert data
            int rows = pstmt.executeUpdate();

            // Close the connection and statement objects
            pstmt.close();
            conn.close();

            // If insertion was successful, display success message
            if (rows > 0) {
                out.println("<h3>Record inserted successfully</h3>");
            } else {
                out.println("<h3>Failed to insert record</h3>");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
