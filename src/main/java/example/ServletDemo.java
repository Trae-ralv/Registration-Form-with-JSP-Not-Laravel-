package example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

//Input/Output Exceptions

@WebServlet("/processForm")
//@WebServlet(name = "ServletDemo", urlPatterns = {"/ServletDemo"})
public class ServletDemo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");

        String url = "jdbc:mysql://localhost:3306/xyz_solutions";
        String dbUsername = "root";
        String dbPassword = "";

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet generatedKeys = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, dbUsername, dbPassword);

            String f_name = request.getParameter("f_name");
            String l_name = request.getParameter("l_name");
            String email = request.getParameter("email");
            String phone_no = request.getParameter("phone_no");
            String password = request.getParameter("password");

            String sql = "INSERT INTO user (f_name, l_name, email, phone_no, password) VALUES (?, ?, ?, ?, ?)";
            pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);;
            pstmt.setString(1, f_name);
            pstmt.setString(2, l_name);
            pstmt.setString(3, email);
            pstmt.setString(4, phone_no);
            pstmt.setString(5, password);

            int insertRow = pstmt.executeUpdate();
            if (insertRow > 0) {
                generatedKeys = pstmt.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int userId = generatedKeys.getInt(1); // Get the auto-incremented ID
                    String redirectUrl = "./regsuccess.jsp?user_id=" + userId;
                    response.sendRedirect(redirectUrl);
                } else {
                    throw new SQLException("Failed to retrieve user_id after insertion.");
                }
            } else {
                out.println("<h3>Registration Failed</h3>");
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            out.println("<h3>Error message: " + e.getMessage() + "</h3>");
        } finally {
            try {
                if (generatedKeys != null) generatedKeys.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                request.setAttribute("errorMessage", "Error closing resources: " + e.getMessage());
                request.getRequestDispatcher("/error.jsp").forward(request, response);
            }
        }
    }
}

