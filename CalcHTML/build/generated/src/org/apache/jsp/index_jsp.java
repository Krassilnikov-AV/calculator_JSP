package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>_CALCULATOR_</title>\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                background-color:#AFA;\n");
      out.write("            }\n");
      out.write("            #box {\n");
      out.write("                position: absolute;\n");
      out.write("                top: 50%;\n");
      out.write("                left: 50%;\n");
      out.write("                margin: -90px 0 0 -190px;\n");
      out.write("                width: 360px;\n");
      out.write("                height: 150px;\n");
      out.write("                border: outset 6px green;\n");
      out.write("                background-color: #AAA;\n");
      out.write("                padding:10px;\n");
      out.write("            }\n");
      out.write("            table {\n");
      out.write("                width: 100%;\n");
      out.write("                height: 100%;\n");
      out.write("                border: solid red 1px;\n");
      out.write("            }\n");
      out.write("            td {\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"box\">\n");
      out.write("            <form name=\"add\" action=\"CalcServlet\" method=\"POST\">\n");
      out.write("                <table> \n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"text\" name=\"n1\" size=\"12\"></td>\n");
      out.write("                        <td><input type=\"text\" name=\"n2\" size=\"12\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"submit\" name=\"b1\" value=\"Сложить\"/></td>\n");
      out.write("                        <td><input type=\"submit\" name=\"b2\" value=\"Очистить\"/>   \n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </form>\n");
      out.write("            <form name=\"mult\" action=\"CalcServlet\" method=\"POST\">\n");
      out.write("                <table> \n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"text\" name=\"n1\" size=\"12\"></td>\n");
      out.write("                        <td><input type=\"text\" name=\"n2\" size=\"12\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"submit\" name=\"b1\" value=\"Умножить\"/>      \n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"submit\" name=\"b2\" value=\"Очистить\"/>   \n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </form>\n");
      out.write("<!--            JSP code: shows result if it is present. -->          \n");
      out.write("            ");
String result = (String) request.getAttribute("result");
                    if (result != null){
                        out.println("<h2>" + result + "</h2>");
                    }
            
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
