package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class confirmacion_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=utf-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>Plataforma Web - Suscribete</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/main.css\" type=\"text/css\"/>    \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <br>\n");
      out.write("        <h1>¡Tu compra fue realizada con exito!</h1>\n");
      out.write("\n");
      out.write("        <p>Aqui esta el resumen de su compra.</p><br>\n");
      out.write("\n");
      out.write("        <h2>RESUMEN</h2>\n");
      out.write("        <label>Titulo:</label>\n");
      out.write("        <span> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item1.titulo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span><br>\n");
      out.write("\n");
      out.write("        <label>Autor:</label>\n");
      out.write("        <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item2.autor}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span><br>   \n");
      out.write("\n");
      out.write("        <label>Genero:</label>\n");
      out.write("        <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item3.genero}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span><br><br>          \n");
      out.write("        \n");
      out.write("        <h2>INFORMACION DE PAGO</h2>\n");
      out.write("        <label>Titular:</label>\n");
      out.write("        <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.firstName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span><br>       \n");
      out.write("        \n");
      out.write("        <label>Num. Tarjeta:</label>\n");
      out.write("        <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.numTarjeta}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span><br>     \n");
      out.write("        \n");
      out.write("        <label>Total:</label>\n");
      out.write("        <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.total}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span><br><br>    \n");
      out.write("\n");
      out.write("        <h2>¡Gracias por su compra!</h2>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
