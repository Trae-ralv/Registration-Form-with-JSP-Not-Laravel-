/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.102
 * Generated at: 2025-03-14 02:14:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css\">\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("    <title>Form</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./css/register.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"body-container\">\r\n");
      out.write("        <div class=\"container-fluid content\">\r\n");
      out.write("            <div class=\"container\" id=\"main-container\">\r\n");
      out.write("                <img src=\"./images/logo.svg\" height=\"80px\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col\">\r\n");
      out.write("                        <h2 class=\"text-start mb-4\">Register New Account</h2>\r\n");
      out.write("                        <p>By registering with us, you agree to our <a class=\"link text-decoration-none\" href=\"\">\r\n");
      out.write("                                Terms & Regulations</a></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col\">\r\n");
      out.write("                        <form action=\"processForm\" method=\"post\">\r\n");
      out.write("                            <div class=\"mb-4 row\">\r\n");
      out.write("                                <div class=\"col-12 col-lg-6 mb-4 mb-lg-0\">\r\n");
      out.write("                                    <div class=\"form-floating\">\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"f_name\" name=\"f_name\"\r\n");
      out.write("                                            placeholder=\"First Name\" required>\r\n");
      out.write("                                        <label for=\"f_name\">First Name</label>\r\n");
      out.write("                                        <div class=\"error-message\" id=\"f_name_error\"></div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-12 col-lg-6\">\r\n");
      out.write("                                    <div class=\"form-floating\">\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"l_name\" name=\"l_name\"\r\n");
      out.write("                                            placeholder=\"Last Name\" required>\r\n");
      out.write("                                        <label for=\"l_name\">Last Name</label>\r\n");
      out.write("                                        <div class=\"error-message\" id=\"l_name_error\"></div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"mb-4\">\r\n");
      out.write("                                <div class=\"form-floating\">\r\n");
      out.write("                                    <input type=\"email\" class=\"form-control\" id=\"email\" name=\"email\"\r\n");
      out.write("                                        placeholder=\"Email Address\" required>\r\n");
      out.write("                                    <label for=\"email\">Email Address</label>\r\n");
      out.write("                                    <div class=\"error-message\" id=\"email_error\"></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"mb-4\">\r\n");
      out.write("                                <div class=\"form-floating\">\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"phone_no\" name=\"phone_no\"\r\n");
      out.write("                                        placeholder=\"Phone Number\" pattern=\"[0-9]{3}-[0-9]{7,11}\" required>\r\n");
      out.write("                                    <label for=\"phone_no\">Phone Number</label>\r\n");
      out.write("                                    <div class=\"error-message\" id=\"phone_no_error\"></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"mb-4\">\r\n");
      out.write("                                <div class=\"form-floating\">\r\n");
      out.write("                                    <input type=\"password\" class=\"form-control\" id=\"password\" name=\"password\"\r\n");
      out.write("                                        placeholder=\"Password\" pattern=\"^(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*?,]).{8,}$\" required>\r\n");
      out.write("                                    <label for=\"password\">Password</label>\r\n");
      out.write("                                    <div class=\"error-message\" id=\"password_error\"></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"mb-4\">\r\n");
      out.write("                                <div class=\"form-floating\">\r\n");
      out.write("                                    <input type=\"password\" class=\"form-control\" id=\"c_password\" name=\"c_password\"\r\n");
      out.write("                                        placeholder=\"Confirm Password\" required>\r\n");
      out.write("                                    <label for=\"c_password\">Confirm Password</label>\r\n");
      out.write("                                    <div class=\"error-message\" id=\"c_password_error\"></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"text-start\" id=\"submit-container\">\r\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary mt-3\" id=\"submit-button\" disabled>Submit Disabled</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"sub-container\">\r\n");
      out.write("            <p class=\"ps-4\">&copy; 2025 XYZ Solutions Pte. Ltd. All Rights Reserved</p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"./javascript/register.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
