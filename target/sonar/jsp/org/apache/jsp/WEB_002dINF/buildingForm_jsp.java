/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: JspC/ApacheTomcat9
 * Generated at: 2020-05-22 00:55:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import acres.dto.UserInfo;

public final class buildingForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("acres.dto.UserInfo");
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n    \n<!DOCTYPE html>\n<html lang=\"en\">\n  <head>\n  \t<base href=\"/\">\n    <meta charset=\"utf-8\">\n    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">    \n    <title>Home Property | List a Property</title>\n\n    <!-- Favicon -->\n    <link rel=\"shortcut icon\" href=\"img/favicon.ico\" type=\"image/x-icon\">\n   \n    \n    <!-- Font awesome -->\n    <link href=\"css/font-awesome.css\" rel=\"stylesheet\">\n    <!-- Bootstrap -->\n    <link href=\"css/bootstrap.css\" rel=\"stylesheet\">   \n    <!-- slick slider -->\n    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/slick.css\">\n    <!-- price picker slider -->\n    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/nouislider.css\">\n    <!-- Fancybox slider -->\n    <link rel=\"stylesheet\" href=\"css/jquery.fancybox.css\" type=\"text/css\" media=\"screen\" /> \n    <!-- Theme color -->\n    <link id=\"switcher\" href=\"css/theme-color/default-theme.css\" rel=\"stylesheet\">     \n\n    <!-- Main style sheet -->\n    <link href=\"css/style.css\" rel=\"stylesheet\">    \n");
      out.write("\n   \n    <!-- Google Font -->\n    <link href='https://fonts.googleapis.com/css?family=Vollkorn' rel='stylesheet' type='text/css'>    \n    <link href='https://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'>\n      \n    <script src=\"https://code.jquery.com/jquery-1.12.4.min.js\"></script>\n      \n    \n    <link rel=\"stylesheet\" href=\"css/page.css\">\n\n    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n    <!--[if lt IE 9]>\n      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n    <![endif]-->\n  \n\n  </head>\n  <body>\n \n  <!-- Pre Loader -->\n  <div id=\"aa-preloader-area\">\n    <div class=\"pulse\"></div>\n  </div>\n  <!-- SCROLL TOP BUTTON -->\n    <a class=\"scrollToTop\" href=\"#\"><i class=\"fa fa-angle-double-up\"></i></a>\n  <!-- END SCROLL TOP BUTTON -->\n\n\n  <!-- Start header section -->\n");
      out.write("  <header id=\"aa-header\">  \n    <div class=\"container\">\n      <div class=\"row\">\n        <div class=\"col-md-12\">\n          <div class=\"aa-header-area\">\n            <div class=\"row\">\n              <div class=\"col-md-6 col-sm-6 col-xs-6\">\n                <div class=\"aa-header-left\">\n                  <div class=\"aa-telephone-no\">\n                    <span class=\"fa fa-phone\"></span>\n                    1-900-523-3564\n                  </div>\n                  <div class=\"aa-email hidden-xs\">\n                    <span class=\"fa fa-envelope-o\"></span> info@markups.com\n                  </div>\n                </div>              \n              </div>\n              <div class=\"col-md-6 col-sm-6 col-xs-6\">\n                ");

				  UserInfo user = (UserInfo) session.getAttribute("currentUser");
				  if(user == null){
						out.print("<div class='aa-header-right' style='display:block'>" +
				                  "<a href='register.test' class='aa-register'>Register</a>" +
				                  "<a href='login.test' class='aa-login'>Login</a> </div>");
				  }else{
						out.print("<div class='aa-header-right' id='loggedIn' style='display:block'>" +
			                	"<a href='user_info' class='aa-register'>" + user.getUsername() + "</a>" +
			                	"<a href='/users/logout' class='aa-login'>Logout</a></div>"); 
				  } 
      out.write("\n              </div>\n            </div>\n          </div>\n        </div>\n      </div>\n    </div>\n  </header>\n  <!-- End header section -->\n  <!-- Start menu section -->\n  <section id=\"aa-menu-area\">\n    <nav class=\"navbar navbar-default main-navbar\" role=\"navigation\">  \n      <div class=\"container\">\n        <div class=\"navbar-header\">\n          <!-- FOR MOBILE VIEW COLLAPSED BUTTON -->\n          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\n            <span class=\"sr-only\">Toggle navigation</span>\n            <span class=\"icon-bar\"></span>\n            <span class=\"icon-bar\"></span>\n            <span class=\"icon-bar\"></span>\n          </button>\n          <!-- LOGO -->                                               \n          <!-- Text based logo -->\n          <a class=\"navbar-brand aa-logo\" href=\"welcome\"> Home<span>Property</span></a>\n          <!-- Image based logo -->\n          <!-- <a class=\"navbar-brand aa-logo-img\" href=\"index.html\"><img src=\"img/logo.png\" alt=\"logo\"></a> -->                   \n");
      out.write("        </div>\n        <div id=\"navbar\" class=\"navbar-collapse collapse\">\n          <ul id=\"top-menu\" class=\"nav navbar-nav navbar-right aa-main-nav\">\n            <li><a href=\"welcome\">HOME</a></li>\n             <li class=\"dropdown\">\n              <a class=\"dropdown-toggle\" data-toggle=\"dropdown\">PROPERTIES <span class=\"caret\"></span></a>\n              <ul class=\"dropdown-menu\" role=\"menu\">                \n              \t<li><a href=\"/properties/_search\">ALL PROPERTIES</a></li>\n                <li><a href=\"search/properties/propertyType=Residential\">RESIDENTIAL PROPERTIES</a></li>\n                <li><a href=\"search/properties/propertyType=Commercial\">COMMERCIAL PROPERTIES</a></li>                                            \n              </ul>\n            </li>\n            <li class=\"active\"><a href=\"list_property.test\">LIST PROPERTY</a></li>                                         \n            <li><a href=\"contact.html\">CONTACT</a></li>          \n          </ul>                          \n        </div><!--/.nav-collapse -->       \n");
      out.write("      </div>          \n    </nav> \n  </section>\n  <!-- End menu section -->\n\n  <!-- Start Proerty header  -->\n\n  <section id=\"aa-property-header\">\n    <div class=\"container\">\n      <div class=\"row\">\n        <div class=\"col-md-12\">\n          <div class=\"aa-property-header-inner\">\n            <h2>List Property</h2>\n            <ol class=\"breadcrumb\">\n            <li><a href=\"#\">HOME</a></li>            \n            <li class=\"active\">LIST PROPERTY</li>\n          </ol>\n          </div>\n        </div>\n      </div>\n    </div>\n  </section> \n  <!-- End Property header  -->\n  <section id=\"aa-gallery\">\n    <div class=\"container\">\n      <div class=\"row\">\n        <div class=\"col-md-12\">\n          <div class=\"aa-gallery-area\">\n            <div class=\"aa-title\">\n              <h2>Let's Post Your Property!</h2>\n              <span></span>\n               <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Excepturi commodi eum dolorem aut eos, debitis quaerat reiciendis, officiis consectetur ducimus atque suscipit ab at tempora!</p>\n");
      out.write("               ");
 if (user ==  null){
            	   out.print("<a href='login.test' style='text-decoration: underline'>Please Login to List a Property</a><br/>");
               } 
      out.write("\n               ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${error}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\n            </div>\n            <!-- Form Start -->\n            \n            <form id=\"buildingForm\" action=\"insert_property.test\" method=\"post\">\n            <!--First Tab-->\n            <fieldset id=\"first\" class=\"tab\">\n            \t\t<br/>\n                    <label>List Property For:<span style=\"color:red\">*</span></label><br/>\n                <input type=\"radio\" name=\"propertyList\" value=\"Sale\"/><label>Sale</label><br/>\n                <input type=\"radio\" name=\"propertyList\" value=\"Rent\"/><label>Rent</label>\n                <br/><br/>\n                    <label for=\"listing_type\">Property Type:<span style=\"color: red\">*</span></label><br/>\n                <input type=\"radio\" name=\"propertyType\" value=\"Residential\"/><label for=\"propertyType\">Residential</label>\n                <input type=\"radio\" name=\"propertyType\" value=\"Commercial\"/><label for=\"listing_Type\">Commercial</label><br/>\n\n                <!--Residential Division-->\n                <div class=\"Residential box\" style=\"display:none\">\n                    <input type=\"radio\" name=\"reBuildingType\" value=\"Apartment\"/><label for=\"Apartment\">Apartment/Flat/Building Floor</label><br/>\n");
      out.write("                    <input type=\"radio\" name=\"reBuildingType\" value=\"Residental Land\"/><label for=\"Residential Land\">Residential Land</label><br/>\n                    <input type=\"radio\" name=\"reBuildingType\" value=\"House\"><label for=\"House\">House</label><br/><input type=\"radio\" name=\"reBuildingType\" value=\"Other\">\n                    <label for=\"Other\">Other</label><br/><br/>\n                    <div class=\"Apartment box2\" style=\"display:none\">\n                    \t<label>Apartment Type:</label><br/>\n\t                    <select name=\"apartmentType\" required>\n\t                    \t<option selected disabled hidden=true>Apartment Type</option>\n\t                        <option value=\"Studio Apartment\">Studio Apartment</option>\n\t                        <option value=\"Residential Apartment\">Residential Apartment</option>\n\t                        <option value=\"Serviced Apartment\">Serviced Apartment</option>\n\t                        <option value=\"Independent Apartment\">Independent/Builder Floor</option>\n\t                    </select>\n");
      out.write("                    </div>\n                     <div class=\"House box2\" style=\"display:none\">\n                     \t<label>House Type:</label>\n\t                    <select name=\"houseType\">\n\t                    \t<option selected disabled hidden=true>House Type</option>\n\t                        <option value=\"Independent House / Villa\">Independent House / Villa</option>\n\t                        <option value=\"Farm House\">Farm House</option>\n\t                    </select><br/>\n                    </div>\n                </div>\n                \n                <!--Commercial Division-->\n                <div class=\"Commercial box\" style=\"display:none\">\n                    <input type=\"radio\" name=\"comBuildingType\" value=\"Office\">\n                    <label for=\"Offices\">Offices</label><br/>\n                    <input type=\"radio\" name=\"comBuildingType\" value=\"Retail\">\n                    <label for=\"Retail\">Retail</label><br/>\n                    <input type=\"radio\" name=\"comBuildingType\" value=\"Land\">\n                    <label for=\"Land\">Land</label><br/>\n");
      out.write("                    <input type=\"radio\" name=\"comBuildingType\" value=\"Storage\">\n                    <label for=\"Industry Storage\">Industry Storage</label><br/>\n                    <input type=\"radio\" name=\"comBuildingType\" value=\"Hospitality\">\n                    <label for=\"Hospitality\">Hospitality</label><br/>\n                    <input type=\"radio\" name=\"comBuildingType\" value=\"Others\">\n                    <label for=\"Others\">Others</label><br/><br/>\n                    <div class=\"Office box3\" style=\"display:none\">\n                    \t<label>Office Type:</label>\n\t                    <select name=\"officeType\">\n\t                    \t<option selected disabled hidden=true>Office Types</option>\n\t                        <option value=\"Commercial Office\">Commercial Office</option>\n\t                        <option value=\"Office in IT Park\">Office in IT Park</option>\n\t                        <option value=\"Office in Business Park\">Office in Business Park</option>\n\t                        <option value=\"Business Center\">Business Center</option>\n");
      out.write("\t                        <option value=\"Time Share\">Time Share Office</option>\n\t                    </select>\n                    </div>\n                    <div class=\"Retail box3\" style=\"display:none\">\n                    \t<label>Retail Type:</label>\n                    \t<select name=\"retailType\">\n                    \t\t<option selected disabled hidden=true>Retail Types</option>\n\t                        <option value=\"Commercial Shop\">Commercial Shop</option>\n\t                        <option value=\"Commercial Showroom\">Commercial Showroom</option>\n\t                        <option value=\"Space in Retail Mall\">Space in Retail Mall</option>\n                    \t</select>\n                    </div>\n                    <div class=\"Land box3\"style=\"display:none\">\n                    \t<label>Land Type:</label>\n                    \t<select name=\"landType\">\n                    \t<option selected disabled hidden=true>Land Types</option>\n                        <option value=\"Commercial Land\">Commercial Land</option>\n                        <option value=\"Agricultural Land\">Agricultural Land</option>\n");
      out.write("                        <option value=\"Industrial Land\">Industrial Land</option>\n                    </select>\n                    </div>\n                    <div class=\"Storage box3\" style=\"display:none\">\n                    \t<label>Storage Type:</label>\n                    \t <select name=\"industryType\">\n                    \t <option selected disabled hidden=true>Storage Types</option>\n                        <option value=\"Warehouse\">Warehouse</option>\n                        <option value=\"Cold Storage\">Cold Storage</option>\n                    </select>\n                    </div>\n                    <div class=\"Hospitality box3\" style=\"display:none\">\n\t                    <label>Hospitality Type:</label>\n\t                    <select name=\"hospitalityType\">\n\t                    \t<option selected disabled hidden=true>Hospitality Type</option>\n\t                        <option value=\"Hotel / Resorts\">Hotel / Resorts</option>\n\t                        <option value=\"Guesthouse / Banquet Halls\">Guesthouse / Banquet Halls</option>\n");
      out.write("\t                    </select>\n                    </div>\n                    <br/><br/>\n                    <label for=\"multipleProperty\">Multiple Property Units?</label><br/>\n                    <input type=\"radio\" name=\"multipleProperty\" value=\"Yes\">\n                    <label for=\"Yes\">Yes</label>\n                    <input type=\"radio\" name=\"multipleProperty\" value=\"No\">\n                    <label for=\"No\">No</label><br/><br/>\n                    <br/>\n                </div>\n                \n                <input class=\"next\" type=\"button\" value=\"Let's Get Started!\"/>\n            </fieldset>\n\n            <!--Second Tab-->\n            <fieldset class=\"tab\">\n                   <label for=\"address\">Address<span style=\"color:red\">*</span></label>\n                   <input type=\"text\" name=\"address\" placeholder=\"House Number and Street Name\" required><br/>\n                    <label for=\"city\">City<span style=\"color:red\">*</span></label>\n                   <input type=\"text\" name=\"city\" placeholder=\"City\" required><br/>\n");
      out.write("                    <label for=\"state\">State<span style=\"color:red\">*</span></label>\n                    <select name=\"state\" required>\n\t\t\t\t\t\t<option value=\"AL\">Alabama</option>\n\t\t\t\t\t\t<option value=\"AK\">Alaska</option>\n\t\t\t\t\t\t<option value=\"AZ\">Arizona</option>\n\t\t\t\t\t\t<option value=\"AR\">Arkansas</option>\n\t\t\t\t\t\t<option value=\"CA\">California</option>\n\t\t\t\t\t\t<option value=\"CO\">Colorado</option>\n\t\t\t\t\t\t<option value=\"CT\">Connecticut</option>\n\t\t\t\t\t\t<option value=\"DE\">Delaware</option>\n\t\t\t\t\t\t<option value=\"DC\">District Of Columbia</option>\n\t\t\t\t\t\t<option value=\"FL\">Florida</option>\n\t\t\t\t\t\t<option value=\"GA\">Georgia</option>\n\t\t\t\t\t\t<option value=\"HI\">Hawaii</option>\n\t\t\t\t\t\t<option value=\"ID\">Idaho</option>\n\t\t\t\t\t\t<option value=\"IL\">Illinois</option>\n\t\t\t\t\t\t<option value=\"IN\">Indiana</option>\n\t\t\t\t\t\t<option value=\"IA\">Iowa</option>\n\t\t\t\t\t\t<option value=\"KS\">Kansas</option>\n\t\t\t\t\t\t<option value=\"KY\">Kentucky</option>\n\t\t\t\t\t\t<option value=\"LA\">Louisiana</option>\n\t\t\t\t\t\t<option value=\"ME\">Maine</option>\n\t\t\t\t\t\t<option value=\"MD\">Maryland</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"MA\">Massachusetts</option>\n\t\t\t\t\t\t<option value=\"MI\">Michigan</option>\n\t\t\t\t\t\t<option value=\"MN\">Minnesota</option>\n\t\t\t\t\t\t<option value=\"MS\">Mississippi</option>\n\t\t\t\t\t\t<option value=\"MO\">Missouri</option>\n\t\t\t\t\t\t<option value=\"MT\">Montana</option>\n\t\t\t\t\t\t<option value=\"NE\">Nebraska</option>\n\t\t\t\t\t\t<option value=\"NV\">Nevada</option>\n\t\t\t\t\t\t<option value=\"NH\">New Hampshire</option>\n\t\t\t\t\t\t<option value=\"NJ\">New Jersey</option>\n\t\t\t\t\t\t<option value=\"NM\">New Mexico</option>\n\t\t\t\t\t\t<option value=\"NY\">New York</option>\n\t\t\t\t\t\t<option value=\"NC\">North Carolina</option>\n\t\t\t\t\t\t<option value=\"ND\">North Dakota</option>\n\t\t\t\t\t\t<option value=\"OH\">Ohio</option>\n\t\t\t\t\t\t<option value=\"OK\">Oklahoma</option>\n\t\t\t\t\t\t<option value=\"OR\">Oregon</option>\n\t\t\t\t\t\t<option value=\"PA\">Pennsylvania</option>\n\t\t\t\t\t\t<option value=\"RI\">Rhode Island</option>\n\t\t\t\t\t\t<option value=\"SC\">South Carolina</option>\n\t\t\t\t\t\t<option value=\"SD\">South Dakota</option>\n\t\t\t\t\t\t<option value=\"TN\">Tennessee</option>\n\t\t\t\t\t\t<option value=\"TX\">Texas</option>\n\t\t\t\t\t\t<option value=\"UT\">Utah</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"VT\">Vermont</option>\n\t\t\t\t\t\t<option value=\"VA\">Virginia</option>\n\t\t\t\t\t\t<option value=\"WA\">Washington</option>\n\t\t\t\t\t\t<option value=\"WV\">West Virginia</option>\n\t\t\t\t\t\t<option value=\"WI\">Wisconsin</option>\n\t\t\t\t\t\t<option value=\"WY\">Wyoming</option>\n\t\t\t\t\t</select><br/>\n                    <label for=\"projectName\">Housing Title<span style=\"color:red\">*</span></label>\n                   <input type=\"text\" name=\"projectName\" placeholder=\"Housing Title\" required><br/><br/>\n                <br/>\n                <input type=\"button\" class=\"previous\" value=\"Previous\"/>\n                <input type=\"button\" class=\"next\" value=\"Next\">\n            </fieldset>\n\n            <!--Third Tab-->\n            <fieldset class=\"tab\">\n                <label for=\"plotArea\">Plot Area<span style=\"color:red\">*</span></label>\n                <input type=\"text\" name=\"plotArea\" placeholder=\"Plot Area\" required>\n                <label>sq. ft</label><br/>\n                <br/>\n                <label for=\"roomNum\">Number of Rooms:<span style=\"color:red\">*</span></label><br/>\n");
      out.write("                <select name=\"roomNum\" required> \n                \t<option value=\"None\">None</option>\n                    <option value=\"1\">1</option>\n                    <option value=\"2\">2</option>\n                    <option value=\"3\">3</option>\n                    <option value=\"4\">4</option>\n                    <option value=\"5\">5</option>\n                    <option value=\"6\">6</option>\n                    <option value=\"7\">7</option>\n                    <option value=\"8\">8</option>\n                    <option value=\"9\">9</option>\n                    <option value=\"9+\">9+</option>\n                </select><br/>\n                <label for=\"washroomNum\">Washrooms:<span style=\"color:red\">*</span></label><br/>\n                <select name=\"washroomNum\" required>\n                    <option value=\"None\">None</option>\n                    <option value=\"Shared\">Shared</option>\n                    <option value=\"1\">1</option>\n                    <option value=\"2\">2</option>\n                    <option value=\"3\">3</option>\n");
      out.write("                    <option value=\"4\">4</option>\n                    <option value=\"5\">5</option>\n                    <option value=\"6\">6</option>\n                    <option value=\"7\">7</option>\n                    <option value=\"8\">8</option>\n                    <option value=\"9\">9</option>\n                    <option value=\"9+\">9+</option>\n                </select><br/>\n                <br/>\n                <br/>\n                <label for=\"availability\">Availability:<span style=\"color:red\">*</span></label>\n                <select name=\"availability\" required>\n                \t<option value=\"New Construction\">New Construction</option>\n                    <option value=\"Under Construction\">Under Construction</option>\n                    <option value=\"Ready to Move\">Ready to Move</option>\n                </select><br/>\n                <label for=\"possessionBy\">Possession By:<span style=\"color:red\">*</span></label>\n                <select name=\"possessionBy\" required>\n                \t<option value=\"Not Applicable\">Not Applicable</option>\n");
      out.write("                    <option value=\"Within 3 months\">Within 3 months</option>\n                    <option value=\"Within 6 months\">Within 6 months</option>\n                    <option value=\"By 2021\">By 2021</option>\n                    <option value=\"By 2022\">By 2022</option>\n                    <option value=\"By 2023\">By 2023</option>\n                    <option value=\"By 2024\">By 2024</option>\n                    <option value=\"By 2025\">By 2025</option>\n                    <option value=\"By 2026\">By 2026</option>\n                </select><br/>\n                <label for=\"ageOfProperty\">Age of Property:<span style=\"color:red\">*</span></label>\n                <select name=\"ageOfProperty\" required>\n                    <option value=\"0-1 year old\">0-1 year old</option>\n                    <option value=\"2-3 years old\">2-3 years old</option>\n                    <option value=\"4-6 years old\">4-6 years old</option>\n                    <option value=\"7-10 years old\">7-10 years old</option>\n                    <option value=\"11-15 years old\">11-15 years old</option>\n");
      out.write("                    <option value=\"16-25 years old\">16-25 years old</option>\n                    <option value=\"26+ years old\">26+ years old</option>\n                </select><br/><br/>\n                <input type=\"button\" class=\"previous\" value=\"Previous\"/>\n                <input type=\"button\" class=\"next\" value=\"Next\">\n            </fieldset>\n\n            <!--Fourth Tab-->\n            <fieldset class=\"tab\">\n                    <label for=\"ownership\">Ownership:<span style=\"color:red\">*</span></label>\n                    <select name=\"ownership\" required>\n                        <option value=\"Freehold\">Freehold</option>\n                        <option value=\"Leasehold\">Leasehold</option>\n                        <option value=\"Power of Attorney\">Power of Attorney</option>\n                        <option value=\"Cooperative Society\">Cooperative Society</option>\n                    </select><br/><br/>\n                    <div class=\"Rent box4\" style=\"display:none\">\n                    \t<label for=\"expectedRent\">Expected Rent:<span style=\"color:red\">*</span> $</label>\n");
      out.write("                    \t<input type=\"number\" step=0.01 name=\"expectedRent\"><br/><br/>\n                    </div>\n                    <div class=\"Sale box4\" style=\"display:none\">\n                    \t<label for=\"expectedPrice\">Expected Price:<span style=\"color:red\">*</span> $</label>\n                    \t<input type=\"number\" step=0.01 name=\"expectedPrice\"><br/>\n                    </div>\n                    <br/>\n                    <label>Provide a description for your property:<span style=\"color:red\">*</span></label><br/>\n                    <textarea name=\"description\" rows=\"13\" cols=\"60\" required></textarea><br/><br/>\n                    <label for=\"amenities\">Choose amenities that building offers:</label><br/>\n                    <input type=\"checkbox\" name=\"amenities\" value=\"In-Unit Laundry\"/><label>In-Unit Laundry</label><br/>\n                    <input type=\"checkbox\" name=\"amenities\" value=\"Nearby Parks\"/><label>Nearby Parks</label><br/>\n                    <input type=\"checkbox\" name=\"amenities\" value=\"Free Wifi\"/><label>Free Wifi</label><br/>\n");
      out.write("                    <input type=\"checkbox\" name=\"amenities\" value=\"Nearby Shopping\"/><label>Nearby Shopping</label><br/>\n                    <input type=\"checkbox\" name=\"amenities\" value=\"Public Transportation\"/><label>Public Transportation</label><br/>\n                    <input type=\"checkbox\" name=\"amenities\" value=\"Nearby Entertainment\"/><label>Nearby Entertainment</label><br/>\n                    <input type=\"checkbox\" name=\"amenities\" value=\"Included Heating\"/><label>Included Heating</label><br/>\n                    <input type=\"checkbox\" name=\"amenities\" value=\"Concierge Service\"/><label>Concierge Service</label><br/>\n                    <input type=\"checkbox\" name=\"amenities\" value=\"Nearby Restaurants\"/><label>Nearby Restaurants</label><br/>\n                    <br/><br/>\n                    <label for=\"imgUpload\">Upload Property Images:</label><br/>\n                    <input type=\"file\" id=\"img\" name=\"img\" accept=\"image/*\" multiple>\n                    <br/>\n                    <br/>\n                    <input type=\"button\" class=\"previous\" value=\"Previous\"/>\n");
      out.write("                    <input class=\"submit\" type=\"submit\" value=\"Submit Building\">\n            </fieldset>\n            <ul class=\"progressbar\">\n                <span class=\"progress\"></span>\n                <span class=\"progress\"></span>\n                <span class=\"progress\"></span>\n                <span class=\"progress\"></span>\n            </ul>\n        </form>\n        </div>\n        </div>\n        </div>\n        </div>\n </section>\n\n  <!-- Footer -->\n  <footer id=\"aa-footer\">\n    <div class=\"container\">\n      <div class=\"row\">\n        <div class=\"col-md-12\">\n        <div class=\"aa-footer-area\">\n          <div class=\"row\">\n            <div class=\"col-md-3 col-sm-6 col-xs-12\">\n              <div class=\"aa-footer-left\">\n               <p>Designed by <a rel=\"nofollow\" href=\"http://www.markups.io/\">MarkUps.io</a></p>\n              </div>\n            </div>\n            <div class=\"col-md-3 col-sm-6 col-xs-12\">\n              <div class=\"aa-footer-middle\">\n                <a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("                <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\n                <a href=\"#\"><i class=\"fa fa-google-plus\"></i></a>\n                <a href=\"#\"><i class=\"fa fa-youtube\"></i></a>\n              </div>\n            </div>\n            <div class=\"col-md-6 col-sm-12 col-xs-12\">\n              <div class=\"aa-footer-right\">\n                <a href=\"welcome\">Home</a>\n                <a href=\"#\">Support</a>\n                <a href=\"#\">License</a>\n                <a href=\"#\">FAQ</a>\n                <a href=\"#\">Privacy and Term</a>\n              </div>\n            </div>            \n          </div>\n        </div>\n      </div>\n      </div>\n    </div>\n  </footer>\n  <!-- / Footer -->\n\n  <!-- jQuery library -->\n  <!--<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script> -->\n  <script src=\"js/jquery.min.js\"></script>   \n  <!-- Include all compiled plugins (below), or include individual files as needed -->\n  <script src=\"js/bootstrap.js\"></script>   \n  <!-- slick slider -->\n  <script type=\"text/javascript\" src=\"js/slick.js\"></script>\n");
      out.write("  <!-- Price picker slider -->\n  <script type=\"text/javascript\" src=\"js/nouislider.js\"></script>\n   <!-- mixit slider -->\n  <script type=\"text/javascript\" src=\"js/jquery.mixitup.js\"></script>\n  <!-- Add fancyBox -->        \n  <script type=\"text/javascript\" src=\"js/jquery.fancybox.pack.js\"></script>\n  <!-- Custom js -->\n  <script src=\"js/custom.js\"></script>\n  <script src=\"js/page.js\"></script>\n  \n  </body>\n</html>");
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