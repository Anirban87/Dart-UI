package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.client.FindIterable;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import com.mongodb.client.MongoCursor;
import static com.mongodb.client.model.Filters.*;
import com.mongodb.client.result.DeleteResult;
import static com.mongodb.client.model.Updates.*;
import com.mongodb.client.result.UpdateResult;
import java.util.ArrayList;
import java.util.List;

public final class test_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>Template</title>\n");
      out.write("\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("  <link rel=\"stylesheet/less\" href=\"less/sidebar.less\">\n");
      out.write("  <link href=\"//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("            *{margin:0px}\n");
      out.write("                    \n");
      out.write("                    /* Chevron buttons */\n");
      out.write("\t\t\tbody{text-align:center}\n");
      out.write("\t\t\t.btn \n");
      out.write("\t\t\t{ \n");
      out.write("                            margin-top: 25px; margin-left:30px; border-top-color:#2874a6; border-bottom-color:#2874a6;\n");
      out.write("                        }\n");
      out.write("\t\t\t.btn-arrow-right \n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\tposition: relative;\n");
      out.write("\t\t\t\tpadding-left: 28px;\n");
      out.write("\t\t\t\tpadding-right: 18px;\n");
      out.write("                                background-color:#2874a6;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t.btn-arrow-right:before,\n");
      out.write("\t\t\t.btn-arrow-right:after,\n");
      out.write("\t\t\t.btn-arrow-left:before,\n");
      out.write("\t\t\t.btn-arrow-left:after \n");
      out.write("\t\t\t{ \n");
      out.write("\t\t\t\tcontent:\"\";\n");
      out.write("\t\t\t\tposition: absolute;\n");
      out.write("\t\t\t\ttop: 5px; \n");
      out.write("\t\t\t\twidth: 22px; \n");
      out.write("\t\t\t\theight:     22px; \n");
      out.write("\t\t\t\tbackground: inherit; \n");
      out.write("\t\t\t\tborder: #2874a6; \n");
      out.write("\t\t\t\tborder-left-color: transparent; \n");
      out.write("\t\t\t\tborder-bottom-color: transparent; \n");
      out.write("\t\t\t\tborder-radius: 0px 4px 0px 0px; \n");
      out.write("\t\t\t\t-webkit-border-radius: 0px 4px 0px 0px;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t.btn-arrow-right:before,.btn-arrow-right:after \n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\ttransform: rotate(45deg); \n");
      out.write("\t\t\t\t-webkit-transform: rotate(45deg);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t.btn-arrow-left:before,.btn-arrow-left:after \n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\ttransform: rotate(225deg); \n");
      out.write("\t\t\t\t-webkit-transform: rotate(225deg);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t.btn-arrow-right:before,.btn-arrow-left:before \n");
      out.write("\t\t\t{ \n");
      out.write("\t\t\t\tleft: -11px;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t.btn-arrow-right:after,.btn-arrow-left:after \n");
      out.write("\t\t\t{ \n");
      out.write("\t\t\t\tright: -11px;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t.btn-arrow-right:after,.btn-arrow-left:before \n");
      out.write("\t\t\t{ \n");
      out.write("\t\t\t\tz-index: 1;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t.btn-arrow-right:before,.btn-arrow-left:after \n");
      out.write("\t\t\t{ \n");
      out.write("\t\t\t\tbackground-color: #0b2a3d;\n");
      out.write("\t\t\t}\n");
      out.write("\t\n");
      out.write("\t\t\t#table{padding-top:30px; font-size:11px; text-align:justify; color:#666;}\n");
      out.write("                        #StageGate{padding-bottom:18px; padding-bottom:3px; text-align:center}\n");
      out.write("\t\t\t\n");
      out.write("\t/*navigation*/\t\t\n");
      out.write("\n");
      out.write("\n");
      out.write("body \n");
      out.write("{\n");
      out.write("  margin: 0px;\n");
      out.write("  padding: 0px;\n");
      out.write("  background-color:#2e5167;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#promotebtn{width:80px; height:34px; border-radius:4px; background-color:#d8dad9; color:black; border-right-color:#898989; border-bottom-color:#898989; font-size:13px}\n");
      out.write("#navHeading{padding-left:10px; padding-bottom:4px; font-family:verdana; font-size:23px}\n");
      out.write("#navHeading a{text-decoration:none}\n");
      out.write("\n");
      out.write("/*Top navigation styling*/\n");
      out.write("        #font{font-family:Verdana; border-bottom:solid 1px #0; color:white;}\n");
      out.write("        #font:hover {color:#5b9bc7; border-bottom:solid 1px #5b9bc7; background-color:transparent;}        \n");
      out.write("\t\t#fontDropdown{font-size:13px; font-family:Verdana; color:#707b7c;-webkit-transition-duration: 0.5s}\n");
      out.write("        #fontDropdown:hover{font-size:13px; font-family:Verdana; color:#ecf0f1; background-color:#707b7c; -webkit-transition-duration: 0.5s}\n");
      out.write("\n");
      out.write("body{overflow-y:scroll; overflow-x:hidden; background-color:#0b2a3d}\n");
      out.write(".scrollbar{ \n");
      out.write("   \n");
      out.write("    max-height: 200px;\n");
      out.write("    overflow-x:hidden;\n");
      out.write("    overflow-y:scroll; \n");
      out.write("    min-width: 135px;\n");
      out.write("    \n");
      out.write("   }\n");
      out.write("  #ex4::-webkit-scrollbar { width:8px;background-color:#2c546d;} \n");
      out.write("  #ex4::-webkit-scrollbar-thumb { background-color:#abb2b9; border-radius:10px; }\n");
      out.write("  #ex4::-webkit-scrollbar-thumb:hover { background-color:#aeb6bf; border:1px solid #808b96; }\n");
      out.write("  #ex4::-webkit-scrollbar-thumb:active { background-color:#aeb6bf; border:1px solid #808b96; }\n");
      out.write("\n");
      out.write("  \n");
      out.write("  \n");
      out.write("</style>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("\tfunction sizeSelect100()\n");
      out.write("\t{\n");
      out.write("\t\tdocument.getElementById(\"demo\").innerHTML=\"Well of size 100 selected\";\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction sizeSelect50()\n");
      out.write("\t{\n");
      out.write("\t\tdocument.getElementById(\"demo\").innerHTML=\"Well of size 50 selected\";\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction sizeSelect20()\n");
      out.write("\t{\n");
      out.write("\t\tdocument.getElementById(\"demo\").innerHTML=\"Well of size 20 selected\";\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction sizeSelect10()\n");
      out.write("\t{\n");
      out.write("\t\tdocument.getElementById(\"demo\").innerHTML=\"Well of size 10 selected\";\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction backgroundColor(color)\n");
      out.write("\t{\n");
      out.write("\t\tdocument.getElementById(\"click\").style.background=color;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction myFunc2()\n");
      out.write("\t{\n");
      out.write("\t\tdocument.getElementById(\"01\").style.color=\"red\";\n");
      out.write("\t}\n");
      out.write("        \n");
      out.write("        function toggle(source) \n");
      out.write("        {\n");
      out.write("        checkboxes = document.getElementsByName('values');\n");
      out.write("        for(var i=0, n=checkboxes.length;i<n;i++) \n");
      out.write("            {\n");
      out.write("                checkboxes[i].checked = source.checked;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("       function goma()\n");
      out.write("       {\n");
      out.write("           window.location = 'DisplayPromoted.jsp';\n");
      out.write("       }\n");
      out.write("        function goUN()\n");
      out.write("       {\n");
      out.write("           window.location = 'DisplayPromoted1.jsp'; \n");
      out.write("       }\n");
      out.write("       function goHM()\n");
      out.write("       {\n");
      out.write("           window.location = 'DisplayPromoted2.jsp'; \n");
      out.write("       }\n");
      out.write("       function goPG()\n");
      out.write("       {\n");
      out.write("           window.location = 'DisplayPromoted3.jsp'; \n");
      out.write("       }\n");
      out.write("  </script>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body style=\"overflow:hidden\">\n");
      out.write("  \n");
      out.write("        ");
 long count,count1,count2,count3,count4 = 0;
            long total = 0;
            
             try 
             {
                MongoClient mongoClient = new MongoClient();
                MongoDatabase database = mongoClient.getDatabase("rig_witsml");
                MongoCollection collection = database.getCollection("well");
                BasicDBObject searchQuery = new BasicDBObject().append("flag", 0);
                BasicDBObject searchQuery1 = new BasicDBObject().append("flag", 2);
                BasicDBObject searchQuery2 = new BasicDBObject().append("flag", 4);
                BasicDBObject searchQuery3 = new BasicDBObject().append("flag", 6);
                BasicDBObject searchQuery4 = new BasicDBObject().append("flag", 8);
                count = collection.count(searchQuery);
                count1 = collection.count(searchQuery1);
                count2 = collection.count(searchQuery2);
                count3 = collection.count(searchQuery3);
                count4 = collection.count(searchQuery4);
                total = collection.count();
                
        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-md-12\">\n");
      out.write("            <nav class=\"navbar\" style=\"background-color:#2e5167\">\n");
      out.write("                <div class=\"container\" style=\"margin-top:-1px;\">\n");
      out.write("                    <div class=\"navbar-header\" style=\"margin-left:-64px;\">\n");
      out.write("                        <a class=\"navbar-brand\" href=\"#\" style=\"font-size:25px; font-family:Verdana; color:white\"><span class=\"fa fa-home\" style=\"font-size:20px; margin-right:10px\"></span>DRILLING ANALYTICS</a>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                        <ul class=\"nav navbar-nav\" style=\"font-size:15px; margin:-10px 0 -8px 65px; height:59px\">\n");
      out.write("                            <li>\n");
      out.write("                                <a  id=\"font\" href=\"#\" style=\"height:50px; background-color:#2e5167\">\n");
      out.write("                                    <i class=\"fa fa-bar-chart\"></i>\n");
      out.write("                                    <span> DASHBOARD</span>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"dropdown\">\n");
      out.write("                                <a  style=\"background-color:#2e5167; height:50px\" id=\"font\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><i class=\"fa fa-line-chart\"></i>\n");
      out.write("                                    <span> PATTERNS</span>\n");
      out.write("                                    <span class=\"caret\"></span>\n");
      out.write("                                </a>\n");
      out.write("                                <ul class=\"dropdown-menu\">\n");
      out.write("                                    <li><a id=\"fontDropdown\" href=\"main pattern.jsp\">GENERATION</a></li>\n");
      out.write("                                    <li><a id=\"fontDropdown\" href=\"#\">DETECTION</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li> \n");
      out.write("                            \n");
      out.write("                       </ul>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("      </div>\n");
      out.write("\t  \n");
      out.write("    </div>        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("<div id=\"StageGate\">    \n");
      out.write("    <button type=\"button\" class=\"btn btn-info btn-arrow-right\" style=\"background-color:#1d79fd\">Data Loading</button>\n");
      out.write("    <button id=\"click\" type=\"button\" class=\"btn btn-info btn-arrow-right\" onclick=\"goma()\">Mnemonic Harmonization</button>\n");
      out.write("    <button type=\"button\" class=\"btn btn-info btn-arrow-right\" onclick=\"goUN()\">Unit Normalization</button>\n");
      out.write("    <button type=\"button\" class=\"btn btn-info btn-arrow-right\" onclick=\"goHM()\">Data Aggregation</button>\n");
      out.write("    <button type=\"button\" class=\"btn btn-info btn-arrow-right\" onclick=\"goPG()\">Pattern Generation</button>\n");
      out.write("</div>\t\n");
      out.write("    \n");
      out.write("<!--Displaying Dynamic table rows selected-->\n");
      out.write("<div class=\"row\" style=\"padding-bottom:0px; margin-top:0px; color:white\">\n");
      out.write("    <div class=\"col-sm-1\"></div>\n");
      out.write("    <div class=\"col-sm-2\" style=\"padding-left:150px\">");
out.println(count);
      out.write('/');
      out.write(' ');
out.print(total);
      out.write("</div>\n");
      out.write("    <div class=\"col-sm-2\" style=\"padding-left:90px\">");
out.println(count1);
      out.write('/');
      out.write(' ');
out.print(total);
      out.write("</div>\n");
      out.write("    <div class=\"col-sm-2\" style=\"padding-left:70px\">");
out.println(count2);
      out.write('/');
      out.write(' ');
out.print(total);
      out.write("</div>\n");
      out.write("    <div class=\"col-sm-2\" style=\"padding-right:45px\">");
out.println(count3);
      out.write('/');
      out.write(' ');
out.print(total);
      out.write("</div>\n");
      out.write("    <div class=\"col-sm-2\" style=\"padding-right:110px\">");
out.println(count4);
      out.write('/');
      out.write(' ');
out.print(total);
      out.write("</div>\n");
      out.write("   \n");
      out.write("</div>    \n");
      out.write("\t<form method=\"post\" action=\"stage.jsp\">\n");
      out.write("<div class=\"row\" style=\"margin-bottom:0px\">\n");
      out.write("          \n");
      out.write("            <div class=\"col-sm-4\"></div>\n");
      out.write("            <div class=\"col-sm-4\">\n");
      out.write("                <p id=\"demo\" style=\"padding-top:12px; font-size:11px\"></p>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"col-sm-4\"> \n");
      out.write("                 <div class=\"btn-sm\">\n");
      out.write("                    \n");
      out.write("                     <button type=\"button\" class=\"btn-sm dropdown-toggle\" style=\"background-color:#d8dad9; color:black; font-size:13px\" data-toggle=\"dropdown\">Well Size\n");
      out.write("\t\t\t<span class=\"caret\"></span>\n");
      out.write("                    </button>\n");
      out.write("                     <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("\t\t\t<li class=\"dropdown-header\">Select the well size</li>\n");
      out.write("\t\t\t<li class=\"divider\"></li>\n");
      out.write("\t\t\t<li><a href=\"#\" onClick=\"sizeSelect100()\">100</a></li>\n");
      out.write("\t\t\t<li><a href=\"#\" onClick=\"sizeSelect50()\">50</a></li>\n");
      out.write("\t\t\t<li><a href=\"#\" onClick=\"sizeSelect20()\">20</a></li>\n");
      out.write("\t\t\t<li><a href=\"#\" onClick=\"sizeSelect10()\">10</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    \n");
      out.write("                    <INPUT id=\"promotebtn\" TYPE=submit name=submit Value=\"Promote\">\t\n");
      out.write("                    <button type=\"button\" class=\"btn-sm\" style=\"background-color:#d8dad9; color:black; font-size:13px\">Demote</button>\n");
      out.write("                    <button type=\"button\" class=\"btn-sm glyphicon glyphicon-refresh\" onClick=\"window.location.reload();\" style=\"background-color:#d8dad9; color:black; font-size:13px\"></button>   \n");
      out.write("                    <button type=\"button\" class=\"btn-sm\" onclick=\"window.location = 'v1.jsp';\" style=\"background-color:#d8dad9; color:black; font-size:13px\">View All</button>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("                 </div>       \n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("      \n");
      out.write("        <div class=\"row\" id=\"table\" style=\"margin-top:0px; padding-top:10px\">\n");
      out.write("    \t\n");
      out.write("        ");

           FindIterable<Document> mydatabaserecords = database.getCollection("well").find();
            MongoCursor<Document> iterator = mydatabaserecords.iterator();
           
       
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"col-sm-12\" style=\"margin-top:0px; padding-top:0px\">\n");
      out.write("        \n");
      out.write("        <div class=\"container-fluid\">    \n");
      out.write("        <table class=\"table table-bordered table-condensed\" style=\"margin-top:0px; font-size:12px; background-color:#3383b8; opacity:0.9\">\n");
      out.write("         \n");
      out.write("            <tr style=\"background-color:#22597d; color:white\">\n");
      out.write("                <th width= \"3%\" style=\"padding-left:14px\"><input type=\"checkbox\" onClick=\"toggle(this)\"></input></th>\n");
      out.write("                <th class=\"col-sm-2\"><a href=\"#\" style=\"color:#e4e4e4\">Well Name</a></th>\n");
      out.write("                <th class=\"col-sm-1\">Country</th>\n");
      out.write("                <th class=\"col-sm-1\">State</th>\n");
      out.write("                <th class=\"col-sm-2\">Operator</th>\n");
      out.write("                <th class=\"col-sm-1\">Region</th>\n");
      out.write("                <th class=\"col-sm-1\">Status</th>\n");
      out.write("                <th class=\"col-sm-3\">Purpose</th>\n");
      out.write("            </tr>\n");
      out.write("          \n");
      out.write("            \n");
      out.write("        ");


        while (iterator.hasNext()) {
             Document docs = iterator.next();
            String country = docs.getString("country");
            String state = docs.getString("state");
            String Operator = docs.getString("operator");
            String name = docs.getString("nameWell");
            String region = docs.getString("region");
            String statusWell = docs.getString("statusWell");
            String purposeWell = docs.getString("purposeWell");
             Integer flag = docs.getInteger("flag");
            if(flag == 0){
        
      out.write("\n");
      out.write("           \n");
      out.write("            <tr class = \"default\" style=\"color:#e4e4e4\">\n");
      out.write("                \n");
      out.write("                <td width=\"3%\" align=\"center\">  \n");
      out.write("               <input type=\"checkbox\" name=\"values\" value=");
      out.print(name);
      out.write(" />\n");
      out.write("                 </td>\n");
      out.write("               <td class=\"col-sm-2\">");
 out.println(name);
      out.write("</td>\n");
      out.write("                <td class=\"col-sm-1\">");
 out.println(country);
      out.write("</td>\n");
      out.write("                <td class=\"col-sm-1\">");
 out.println(state);
      out.write("</td>\n");
      out.write("                <td class=\"col-sm-2\">");
 out.println(Operator);
      out.write("</td>\n");
      out.write("                <td class=\"col-sm-1\">");
 out.println(region);
      out.write("</td>\n");
      out.write("                <td class=\"col-sm-1\">");
 out.println(statusWell);
      out.write("</td>\n");
      out.write("                <td class=\"col-sm-3\">");
 out.println(purposeWell);
      out.write("</td>\n");
      out.write("            </tr> ");

}
    }

      out.write("\n");
      out.write("         \n");
      out.write("    \n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("            ");

}
catch (Exception e1) {
    // TODO Auto-generated catch block
    e1.printStackTrace();
}

      out.write("\n");
      out.write("</form>\t\n");
      out.write("\n");
      out.write("</body>\n");
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