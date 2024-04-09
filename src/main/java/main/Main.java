package main;
import customer.Company;
import java.sql.*;
import java.util.Date;


public class Main {
    public static void main(String[] args) throws Exception {

        // Create a new company object
        Company coral = new Company();
        coral.setCompName("Coral Technology");
        coral.setCompTaxNum(1234567890L);
        coral.setDateOfFounding(new Date(2020, 3, 12));
        coral.setCompWebsite("www.coraltech.com");
        coral.setCompIndustry("Technology");
        coral.setCompSize("Medium");

        //* JDBC connection *//
        // Query
        String query = "INSERT INTO `jdbc_training`.`customer` (`CUSTOMER_ID`, `CUSTOMER_NAME`) VALUES(?, ?, ?))";

        // connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_training", "root", "Pa$$w0rd");

        // passing query to the connect socket
        PreparedStatement st = con.prepareStatement(query);

        // execution
        st.execute();

        // closing
        con.close();

    }
}
