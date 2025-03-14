<%@page contentType="text/html;charset=UTF-8" language="java"%>
<%@ page import="java.sql.*" %>
<html>

<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <title>Form</title>
    <link rel="stylesheet" href="./css/register.css">
</head>
<body>
    <div class="body-container">
        <div class="container-fluid content">
            <div class="container" id="main-container">
                <div class="row align-items-center">
                    <div class="col-12 col-lg-2">
                        <img src="./images/logo.svg" height="80px">
                    </div>
                    <div class="col-12 col-lg-10">
                        <h2 class="text-start mb-4">Registration Successful</h2>
                        <p>Congratulations, your account has been successfully created!</p>
                    </div>
                    <%
                        String userId = request.getParameter("user_id");
                        if (userId != null && !userId.trim().isEmpty()) {
                        Connection conn = null;
                        PreparedStatement pstmt = null;
                        ResultSet rs = null;
                        try {
                            // Database connection details
                            Class.forName("com.mysql.cj.jdbc.Driver");
                            String url = "jdbc:mysql://localhost:3306/xyz_solutions";
                            String dbUsername = "root";
                            String dbPassword = "";
                            conn = DriverManager.getConnection(url, dbUsername, dbPassword);

                            // SQL query to fetch user details
                            String sql = "SELECT f_name, l_name, email, phone_no FROM user WHERE user_id = ?";
                            pstmt = conn.prepareStatement(sql);
                            pstmt.setInt(1, Integer.parseInt(userId)); // Set the user_id parameter
                            rs = pstmt.executeQuery();

                            if (rs.next()) {
                                String fName = rs.getString("f_name");
                                String lName = rs.getString("l_name");
                                String email = rs.getString("email");
                                String phoneNo = rs.getString("phone_no");
                            %>
                            <div class="col"></div>
                            <div class="col-12 col-md-8 mt-3 d-flex align-self-center">
                                <table class="table">
                                    <tbody>
                                        <tr>
                                            <th scope="row">First Name</th>
                                            <td>
                                                <%= fName != null ? fName : "Not provided" %>
                                            </td>
                                        </tr>
                                        <tr>
                                             <th scope="row">Last Name</th>
                                             <td>
                                                <%= lName != null ? lName : "Not provided" %>
                                             </td>
                                        </tr>
                                        <tr>
                                            <th scope="row">Email</th>
                                            <td>
                                                <%= email != null ? email : "Not provided" %>
                                            </td>
                                        </tr>
                                        <tr>
                                            <th class="border-0" scope="row">Phone Number</th>
                                            <td class="border-0">
                                                <%= phoneNo != null ? phoneNo : "Not provided" %>
                                            </td>
                                        </tr>
                                    </tbody>
                                </table>

                            </div>
                            <div class="col"></div>
                            <%
                                } else {
                                    out.println("<p>Error: No user registered with ID " + userId + ".</p>");
                                }
                            } catch (NumberFormatException e) {
                                out.println("<p>Error: Invalid user ID format.</p>");
                            } catch (ClassNotFoundException | SQLException e) {
                                out.println("<p>Error retrieving details: " + e.getMessage() + "</p>");
                            } finally {
                                // Clean up resources
                                if (rs != null) try { rs.close(); } catch (SQLException e) { /* ignore */ }
                                if (pstmt != null) try { pstmt.close(); } catch (SQLException e) { /* ignore */ }
                                if (conn != null) try { conn.close(); } catch (SQLException e) { /* ignore */ }
                            }
                        } else {
                            out.println("<p>Error: No user ID provided in the request.</p>");
                        }
                    %>
                </div>
                <div class="row align-items-center">
                <div class="col"></div>
                    <div class="col-12 col-md-8 mt-3">
                        <div class="auto-navigate-section">
                            <p class="mb-2">Redirecting in <span id="countdown">15</span> seconds...</p>
                            <div class="progress">
                                <div class="progress-bar bg-success" role="progressbar" id="progressBar"
                                     style="width: 100%" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100"></div>
                            </div>
                        </div>
                    </div>
                    <div class="col-3 text-end" id="submit-container">
                        <a class="btn btn-primary mt-3" href="./">Continue</a>
                    </div>
                </div>
            </div>
        </div>
        <div class="sub-container">
            <p class="ps-4">&copy; 2025 XYZ Solutions Pte. Ltd. All Rights Reserved</p>
        </div>
    </div>

    <script src="./javascript/regsuccess.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>

</html>