/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.60
 * Generated at: 2020-12-14 09:13:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.view.client.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class navbar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/G:/UNIFY/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/UNIFY/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153359882000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1607933404077L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody;

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
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("      ");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("      \r\n");
      out.write(" <div class=\"navbar navbar-default mega-menu\" role=\"navigation\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-responsive-collapse\">\r\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <a class=\"navbar-brand\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                        <img id=\"logo-header\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${url}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/img/logo.png\" alt=\"Logo\">\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("                <div class=\"collapse navbar-collapse navbar-responsive-collapse\">\r\n");
      out.write("                    <!-- Shopping Cart -->\r\n");
      out.write("                   ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/view/client/view/cart.jsp", out, false);
      out.write("\r\n");
      out.write("                    <!-- End Shopping Cart -->\r\n");
      out.write("\r\n");
      out.write("                    <!-- Nav Menu -->\r\n");
      out.write("                    <ul class=\"nav navbar-nav\">\r\n");
      out.write("                        <!-- Pages -->\r\n");
      out.write("                        <li class=\"dropdown active\">\r\n");
      out.write("                            <a href=\"javascript:void(0);\" class=\"dropdown-toggle\" data-hover=\"dropdown\" data-toggle=\"dropdown\">\r\n");
      out.write("                                Pages\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul class=\"dropdown-menu\">\r\n");
      out.write("                                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">Index</a></li>\r\n");
      out.write("                                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/product/list\">Product Page</a></li>\r\n");
      out.write("                                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/product/list\">Filter Grid Page</a></li>\r\n");
      out.write("                                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/member/cart\">Cart</a></li>\r\n");
      out.write("                                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/member/order\">Checkout</a></li>\r\n");
      out.write("                                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/login\">Login</a></li>\r\n");
      out.write("                                <li class=\"active\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/register\">Register</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <!-- End Pages -->\r\n");
      out.write("\r\n");
      out.write("                        <!-- Promotion -->\r\n");
      out.write("                        <li class=\"dropdown\">\r\n");
      out.write("                            <a href=\"javascript:void(0);\" class=\"dropdown-toggle\" data-hover=\"dropdown\" data-toggle=\"dropdown\">\r\n");
      out.write("                                Promotion\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul class=\"dropdown-menu\">\r\n");
      out.write("                                <li class=\"dropdown-submenu\">\r\n");
      out.write("                                    <a href=\"javascript:void(0);\">Jeans</a>\r\n");
      out.write("                                    <ul class=\"dropdown-menu\">\r\n");
      out.write("                                        <li><a href=\"#\">Skinny Jeans</a></li>\r\n");
      out.write("                                        <li><a href=\"#\">Bootcut Jeans</a></li>\r\n");
      out.write("                                        <li><a href=\"#\">Straight Cut Jeans</a></li>\r\n");
      out.write("                                    </ul>    \r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"dropdown-submenu\">\r\n");
      out.write("                                    <a href=\"javascript:void(0);\">Shoes</a>\r\n");
      out.write("                                    <ul class=\"dropdown-menu\">\r\n");
      out.write("                                        <li><a href=\"#\">Sandals</a></li>\r\n");
      out.write("                                        <li><a href=\"#\">Heels</a></li>\r\n");
      out.write("                                    </ul>    \r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <!-- End Promotion -->\r\n");
      out.write("\r\n");
      out.write("                        <!-- Gifts -->\r\n");
      out.write("                        <li class=\"dropdown mega-menu-fullwidth\">\r\n");
      out.write("                            <a href=\"javascript:void(0);\" class=\"dropdown-toggle\" data-hover=\"dropdown\" data-toggle=\"dropdown\">\r\n");
      out.write("                                Gifts\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul class=\"dropdown-menu\">\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <div class=\"mega-menu-content\">\r\n");
      out.write("                                        <div class=\"container\">\r\n");
      out.write("                                            <div class=\"row\">\r\n");
      out.write("                                                <div class=\"col-md-3 col-sm-12 col-xs-12 md-margin-bottom-30\">\r\n");
      out.write("                                                    <h3 class=\"mega-menu-heading\">Pellentes que nec diam lectus</h3>\r\n");
      out.write("                                                    <p>Proin pulvinar libero quis auctor pharet ra. Aenean fermentum met us orci, sedf eugiat augue pulvina r vitae. Nulla dolor nisl, molestie nec aliquam vitae, gravida sodals dolor...</p>\r\n");
      out.write("                                                    <button type=\"button\" class=\"btn-u btn-u-dark\">Read More</button>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"col-md-3 col-sm-4 col-xs-4 md-margin-bottom-30\">\r\n");
      out.write("                                                    <a href=\"#\"><img class=\"product-offers img-responsive\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${url}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/img/blog/01.jpg\" alt=\"\"></a>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"col-md-3 col-sm-4 col-xs-4 sm-margin-bottom-30\">\r\n");
      out.write("                                                    <a href=\"#\"><img class=\"product-offers img-responsive\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${url}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/img/blog/02.jpg\" alt=\"\"></a>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"col-md-3 col-sm-4 col-xs-4\">\r\n");
      out.write("                                                    <a href=\"#\"><img class=\"product-offers img-responsive\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${url}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/img/blog/03.jpg\" alt=\"\"></a>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div><!--/end row-->\r\n");
      out.write("                                        </div><!--/end container-->\r\n");
      out.write("                                    </div><!--/end mega menu content-->  \r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul><!--/end dropdown-menu-->\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <!-- End Gifts -->\r\n");
      out.write("\r\n");
      out.write("                        <!-- Books -->\r\n");
      out.write("                        <li class=\"dropdown mega-menu-fullwidth\">\r\n");
      out.write("                            <a href=\"javascript:void(0);\" class=\"dropdown-toggle\" data-hover=\"dropdown\" data-toggle=\"dropdown\">\r\n");
      out.write("                                Books\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul class=\"dropdown-menu\">\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <div class=\"mega-menu-content\">\r\n");
      out.write("                                        <div class=\"container\">\r\n");
      out.write("                                            <div class=\"row\">\r\n");
      out.write("                                                <div class=\"col-md-2 col-sm-6\">\r\n");
      out.write("                                                    <h3 class=\"mega-menu-heading\">Clothe</h3>\r\n");
      out.write("                                                    <ul class=\"list-unstyled style-list\">\r\n");
      out.write("                                                        <li><a href=\"#\">New in</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Coats &amp; Jackets</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Jeans</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Dresses</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Shorts</a> <span class=\"label label-danger-shop\">New</span></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Skirts</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">T-Shirts</a></li>\r\n");
      out.write("                                                    </ul>\r\n");
      out.write("                                                    <h3 class=\"mega-menu-heading\">Shoes</h3>\r\n");
      out.write("                                                    <ul class=\"list-unstyled style-list\">\r\n");
      out.write("                                                        <li><a href=\"#\">Boots</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">FLats</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Heels</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Sandals</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Sports</a></li>\r\n");
      out.write("                                                    </ul>\r\n");
      out.write("                                                </div>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"col-md-2 col-sm-6\">\r\n");
      out.write("                                                    <h3 class=\"mega-menu-heading\">Accessories</h3>\r\n");
      out.write("                                                    <ul class=\"list-unstyled style-list\">\r\n");
      out.write("                                                        <li><a href=\"#\">All accessories</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Bags &amp; Purses</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Scarvs &amp; Hats</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Jewellery</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Fragrance &amp; Beauty</a></li>\r\n");
      out.write("                                                    </ul>\r\n");
      out.write("                                                    <h3 class=\"mega-menu-heading\">Lingerie</h3>\r\n");
      out.write("                                                    <ul class=\"list-unstyled style-list\">\r\n");
      out.write("                                                        <li><a href=\"#\">Linger</a> <span class=\"label label-danger-shop\">New</span></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Slippers</a></li>\r\n");
      out.write("                                                    </ul>\r\n");
      out.write("                                                    <h3 class=\"mega-menu-heading\">Nightwear</h3>\r\n");
      out.write("                                                    <ul class=\"list-unstyled style-list\">\r\n");
      out.write("                                                        <li><a href=\"#\">Nightwear</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Socks</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Tights</a></li>\r\n");
      out.write("                                                    </ul>\r\n");
      out.write("                                                </div>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"col-md-2 col-sm-6\">\r\n");
      out.write("                                                    <h3 class=\"mega-menu-heading\">Mixed</h3>\r\n");
      out.write("                                                    <ul class=\"list-unstyled style-list\">\r\n");
      out.write("                                                        <li><a href=\"#\">New in</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Coats &amp; Jackets</a> <span class=\"label label-danger-shop\">New</span></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Jeans</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Dresses</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Shorts</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Skirts</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">T-shirts</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Boots</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Flats</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Heels</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Sandals</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Sports</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Socks</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Tights</a></li>\r\n");
      out.write("                                                    </ul>\r\n");
      out.write("                                                </div>        \r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"col-md-2 col-sm-6\">\r\n");
      out.write("                                                    <h3 class=\"mega-menu-heading\">Clothe</h3>\r\n");
      out.write("                                                    <ul class=\"list-unstyled style-list\">\r\n");
      out.write("                                                        <li><a href=\"#\">New in</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Coats &amp; Jackets</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Jeans</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Dresses</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Shorts</a> <span class=\"label label-danger-shop\">New</span></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Skirts</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">T-shirts</a></li>\r\n");
      out.write("                                                    </ul>\r\n");
      out.write("                                                    <h3 class=\"mega-menu-heading\">Shoes</h3>\r\n");
      out.write("                                                    <ul class=\"list-unstyled style-list\">\r\n");
      out.write("                                                        <li><a href=\"#\">Boots</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Flats</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Heels</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Sandals</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Sports</a></li>\r\n");
      out.write("                                                    </ul>\r\n");
      out.write("                                                </div>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"col-md-2 col-sm-6\">\r\n");
      out.write("                                                    <h3 class=\"mega-menu-heading\">Accessories</h3>\r\n");
      out.write("                                                    <ul class=\"list-unstyled style-list\">\r\n");
      out.write("                                                        <li><a href=\"#\">All accessories</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Bags &amp; Purses</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Scarvs &amp; Hats</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Jewellery</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Fragrance &amp; Beauty</a></li>\r\n");
      out.write("                                                    </ul>\r\n");
      out.write("                                                    <h3 class=\"mega-menu-heading\">Lingerie</h3>\r\n");
      out.write("                                                    <ul class=\"list-unstyled style-list\">\r\n");
      out.write("                                                        <li><a href=\"#\">Linger</a> <span class=\"label label-danger-shop\">New</span></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Slippers</a></li>\r\n");
      out.write("                                                    </ul>\r\n");
      out.write("                                                    <h3 class=\"mega-menu-heading\">Nightwear</h3>\r\n");
      out.write("                                                    <ul class=\"list-unstyled style-list\">\r\n");
      out.write("                                                        <li><a href=\"#\">Nightwear</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Socks</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Tights</a></li>\r\n");
      out.write("                                                    </ul>\r\n");
      out.write("                                                </div>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"col-md-2 col-sm-6\">\r\n");
      out.write("                                                    <h3 class=\"mega-menu-heading\">Mixed</h3>\r\n");
      out.write("                                                    <ul class=\"list-unstyled style-list\">\r\n");
      out.write("                                                        <li><a href=\"#\">New in</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Coats &amp; Jackets</a> <span class=\"label label-danger-shop\">New</span></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Jeans</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Dresses</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Shorts</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Skirts</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">T-shirts</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Boots</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Flats</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Heels</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Sandals</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Sports</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Socks</a></li>\r\n");
      out.write("                                                        <li><a href=\"#\">Tights</a> <span class=\"label label-danger-shop\">New</span></li>\r\n");
      out.write("                                                    </ul>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div><!--/end row-->\r\n");
      out.write("                                        </div><!--/end container-->\r\n");
      out.write("                                    </div><!--/end mega menu content-->  \r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul><!--/end dropdown-menu-->\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <!-- End Books -->\r\n");
      out.write("\r\n");
      out.write("                        <!-- Clothes -->\r\n");
      out.write("                        <li class=\"dropdown\">\r\n");
      out.write("                            <a href=\"javascript:void(0);\" class=\"dropdown-toggle\" data-hover=\"dropdown\" data-toggle=\"dropdown\" data-delay=\"1000\">\r\n");
      out.write("                                Clothes\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul class=\"dropdown-menu\">\r\n");
      out.write("                                <li><a href=\"http://localhost:8080/UNIFY/product/category?cate_id=1\">Men</a></li>\r\n");
      out.write("                                <li><a href=\"http://localhost:8080/UNIFY/product/category?cate_id=2\">WOMEN</a></li>\r\n");
      out.write("                                <li><a href=\"http://localhost:8080/UNIFY/product/category?cate_id=3\">CHILDREN</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <!-- End Clothes -->\r\n");
      out.write("\r\n");
      out.write("                        <!-- Main Demo -->\r\n");
      out.write("                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">Main Demo</a></li>\r\n");
      out.write("                        <!-- Main Demo -->\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <!-- End Nav Menu -->                    \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>    \r\n");
      out.write("        </div>            ");
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

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f0_reused = false;
    try {
      _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f0.setParent(null);
      // /view/client/view/navbar.jsp(4,6) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue("/view/client/static");
      // /view/client/view/navbar.jsp(4,6) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setVar("url");
      int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
      if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      _jspx_th_c_005furl_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f0, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f0_reused);
    }
    return false;
  }
}
