/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.91
 * Generated at: 2024-09-19 06:59:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.tap.model.User;
import com.tap.model.Menu;
import java.util.ArrayList;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.LinkedHashSet<>(4);
    _jspx_imports_classes.add("com.tap.model.User");
    _jspx_imports_classes.add("com.tap.model.Menu");
    _jspx_imports_classes.add("java.util.ArrayList");
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Menu</title>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"styles/menu.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <header>\r\n");
      out.write("        <h1>Restaurant Menu</h1>\r\n");
      out.write("        <nav>\r\n");
      out.write("            <a href=\"home\">Home</a>\r\n");
      out.write("            ");

            User loggedInUser = (User) session.getAttribute("loggedInUser");
            if (loggedInUser != null) {
            
      out.write("\r\n");
      out.write("            <label for=\"userActions\">User Options:</label>\r\n");
      out.write("            <select id=\"userActions\" onchange=\"location = this.value;\">\r\n");
      out.write("                <option value=\"#\">-- Select an option --</option>\r\n");
      out.write("                <option value=\"cart\">View Cart</option>\r\n");
      out.write("                <option value=\"orderHistory\">View Order History</option>\r\n");
      out.write("                <option value=\"updateUser\">Update Profile</option>\r\n");
      out.write("                <option value=\"logout\">Log Out</option>\r\n");
      out.write("            </select>\r\n");
      out.write("            ");

            } else {
            
      out.write("\r\n");
      out.write("            <a href=\"login.jsp\">Login</a> | \r\n");
      out.write("            <a href=\"signup.jsp\">Register</a>\r\n");
      out.write("            ");

            }
            
      out.write("\r\n");
      out.write("        </nav>\r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("    <h2>Menu Items</h2>\r\n");
      out.write("    <section class=\"menu-list\">\r\n");
      out.write("        ");

        ArrayList<Menu> menuList = (ArrayList<Menu>) session.getAttribute("menuList");
        if (menuList != null && !menuList.isEmpty()) {
        
      out.write("\r\n");
      out.write("        <div class=\"menu-items\">\r\n");
      out.write("            ");

            for (Menu menu : menuList) {
            
      out.write("\r\n");
      out.write("            <div class=\"menu-card\">\r\n");
      out.write("                <img src=\"images/menu/");
      out.print( menu.getImgpath() );
      out.write("\" alt=\"Image of ");
      out.print( menu.getItemName() );
      out.write("\" class=\"menu-image\">\r\n");
      out.write("                <h3>");
      out.print( menu.getItemName() );
      out.write("</h3>\r\n");
      out.write("                <p>Description: ");
      out.print( menu.getDescription() );
      out.write("</p>\r\n");
      out.write("                <p>Price: Rs.");
      out.print( menu.getPrice() );
      out.write("</p>\r\n");
      out.write("                <p>");
      out.print( menu.isAvailable() ? "Available" : "Not Available" );
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("                <form action=\"cart\" method=\"post\">\r\n");
      out.write("                    <input type=\"hidden\" name=\"menuid\" value=\"");
      out.print( menu.getMenuid() );
      out.write("\">\r\n");
      out.write("                    <label for=\"quantity");
      out.print( menu.getMenuid() );
      out.write("\">Quantity:</label>\r\n");
      out.write("                    <input type=\"number\" id=\"quantity");
      out.print( menu.getMenuid() );
      out.write("\" name=\"quantity\" value=\"1\" min=\"1\">\r\n");
      out.write("                    <input type=\"submit\" class=\"add-to-cart-btn\" value=\"Add to Cart\">\r\n");
      out.write("                    <input type=\"hidden\" name=\"action\" value=\"add\">\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            ");

            }
            
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        ");

        } else {
        
      out.write("\r\n");
      out.write("        <p>No menu items available.</p>\r\n");
      out.write("        ");

        }
        
      out.write("\r\n");
      out.write("    </section>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
