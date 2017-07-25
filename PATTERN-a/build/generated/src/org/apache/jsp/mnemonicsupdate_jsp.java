package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.mongodb.Block;
import com.mongodb.client.DistinctIterable;
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

public final class mnemonicsupdate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>index</title>\n");
      out.write("\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"/resources/demos/style.css\">\n");
      out.write("\n");
      out.write("      \n");
      out.write("<style>\n");
      out.write("\n");
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
      out.write("  \n");
      out.write("  \n");
      out.write("  #mlist{\n");
      out.write("                    border-color: #2c546d;\n");
      out.write("                    background-color:#2c546d;\n");
      out.write("                    width: 385px;\n");
      out.write("                    color:white;\n");
      out.write("                }\n");
      out.write("                #mlist:focus{\n");
      out.write("                    outline: none;\n");
      out.write("                }\n");
      out.write("                #mlist option:hover,option:checked,option:active{\n");
      out.write("                    outline:none;\n");
      out.write("                    color:white;\n");
      out.write("                    width: 360px;\n");
      out.write("                    box-shadow: 0 0 10px 100px #1794bf inset;\n");
      out.write("                    \n");
      out.write("                }\n");
      out.write("                \n");
      out.write("    #mlist::-webkit-scrollbar { width:8px;background-color:#2c546d; } \n");
      out.write("    #mlist::-webkit-scrollbar-thumb { background-color:#abb2b9; border-radius:10px; }\n");
      out.write("    #mlist::-webkit-scrollbar-thumb:hover { background-color:#aeb6bf; border:1px solid #808b96; }\n");
      out.write("    #mlist::-webkit-scrollbar-thumb:active { background-color:#aeb6bf; border:1            \n");
      out.write("  \n");
      out.write("  \n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"scrollbar\" id=\"ex4\">\n");
      out.write("\n");
      out.write("<div class=\"wrapper\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-md-12\">\n");
      out.write("            <nav class=\"navbar\" style=\"background-color:#2e5167\">\n");
      out.write("                <div class=\"container\" style=\"margin-top:-1px;\">\n");
      out.write("                    <div class=\"navbar-header\" style=\"margin-left:-60px;\">\n");
      out.write("                        <a class=\"navbar-brand\" href=\"#\" style=\"font-size:25px; font-family:Verdana; color:white\"><span class=\"fa fa-home\" style=\"font-size:20px; margin-right:10px\"></span>DRILLING ANALYTICS</a>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                        <ul class=\"nav navbar-nav\" style=\"font-size:15px; margin:-10px 0 -8px 65px; height:59px\">\n");
      out.write("                            <li>\n");
      out.write("                                <a  id=\"font\" href=\"test.jsp\" style=\"height:50px; background-color:#2e5167\">\n");
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
      out.write("                                    <li><a id=\"fontDropdown\" href=\"Dashboard.html\">GENERATION</a></li>\n");
      out.write("                                    <li><a id=\"fontDropdown\" href=\"#\">DETECTION</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li> \n");
      out.write("                            \n");
      out.write("                       </ul>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("      </div>\n");
      out.write("</div>  \n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("    <form method=\"post\">\n");
      out.write("\t");
 
                              
            MongoClient mongoClient = new MongoClient();
            MongoDatabase database = mongoClient.getDatabase("rig_witsml");
            MongoCollection collection = database.getCollection("well");
            DistinctIterable<String> documents = collection.distinct("field", String.class).filter(eq("fieldchecked", "no"));
        
      out.write("\n");
      out.write("\t\t\n");
      out.write("    <div class=\"container-fluid\" style=\"margin:0px 0 0 4px\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-md-3\">\n");
      out.write("              <div class=\"panel\" style=\"background-color:#2c546d; opacity:0.9; width:400px\">\n");
      out.write("                    <div class=\"panel-heading\" style=\"background-color:#0b1829; height:30px\">\n");
      out.write("                        <h4 class=\"panel-title\" style=\"margin-top:-3px\">\n");
      out.write("                            <a data-toggle=\"collapse\" href=\"#collapse1\" style=\"text-decoration:none; color:#f8f9f9; font-size:13px; font-family:Verdana;\">FIELDS<span class=\"fa fa-angle-down pull-right\" style=\"font-size:13px\"></span></a>\n");
      out.write("                        </h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"collapse1\" class=\"panel-collapse collapse in\">\n");
      out.write("                        <div class=\"panel-body scrollable-menu scrollbar\" id=\"ex4\" style=\"height:125px; background-color:#2c546d; overflow-y:scroll; opacity:0.7\">\n");
      out.write("                            <ul style=\"list-style-type:none; color:white; padding-left:0px\">\n");
      out.write("\t\t\t\t");

                                    for (String document : documents) {
                                
      out.write("\n");
      out.write("                                    <li style=\"font-size:13px\"><input type=\"checkbox\"> ");
 out.println(document); 
      out.write("</li>\n");
      out.write("                                ");
} 
      out.write("\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("                    </div>\n");
      out.write("                                               \n");
      out.write("                    <div class=\"panel-heading\" style=\"background-color:#0b1829; height:30px\">\n");
      out.write("                        <h4 class=\"panel-title\" style=\"margin-top:-3px\">\n");
      out.write("                            <a data-toggle=\"collapse\" href=\"#collapse2\" style=\"text-decoration:none; color:#f8f9f9; font-size:13px; font-family:Verdana;\">WELLS<span class=\"fa fa-angle-down pull-right\"></span></a>\n");
      out.write("                        </h4>\n");
      out.write("                    </div>\n");
      out.write("                               \n");
      out.write("\t\t\t<div id=\"collapse2\" class=\"panel-collapse collapse in\">\n");
      out.write("                        <div class=\"panel-body scrollable-menu scrollbar\" id=\"ex4\" style=\"height:127px; overflow-y:scroll; background-color:#2c546d; opacity:0.7\">\n");
      out.write("                                ");

                                             try{
                                     FindIterable<Document> thedatabaserecords = database.getCollection("well").find();
                                     MongoCursor<Document> welliterator = thedatabaserecords.iterator();
                                      while (welliterator.hasNext()) {
                                           Document doc = welliterator.next();
                                           String wells = doc.getString("nameWell");
                                           String checked = doc.getString("wellischecked");
                                           if(checked.equals("no") && wells !=null ){    
                                
      out.write("\t\n");
      out.write("                                        \n");
      out.write("                                            <ul style=\"list-style-type:none; color:white; padding-left:0px\">\n");
      out.write("                                                <li style=\"font-size:13px\"><input type=\"checkbox\" name=\"welllist\" value=\"");
      out.print(wells);
      out.write("\"> ");
 out.println(wells); 
      out.write("</li>\n");
      out.write("                                            </ul>\n");
      out.write("                                            \n");
      out.write("                                                ");

                                                    }  
                                                }
                    }
                        catch(Exception e){

}
                                                    
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\t    <div class=\"panel-heading\" style=\"background-color:#0b1829; height:30px\">\n");
      out.write("                        <h4 class=\"panel-title\" style=\"margin-top:-3px\">\n");
      out.write("                            <a data-toggle=\"collapse\" href=\"#collapse3\" style=\"text-decoration:none; color:#f8f9f9; font-size:13px; font-family:Verdana;\">HOLE SIZE<span class=\"fa fa-angle-down pull-right\"></span></a>\n");
      out.write("                        </h4>\n");
      out.write("                    </div>\n");
      out.write("\t\t\t\t\n");
      out.write("                                <div id=\"collapse3\" class=\"panel-collapse collapse in\">\n");
      out.write("                        <div class=\"panel-body scrollable-menu scrollbar\" id=\"ex4\" style=\"height:127px; overflow-y:scroll; background-color:#2c546d; opacity:0.7\">\n");
      out.write("                                            ");

                                                try{
                                     FindIterable<Document> databaserecords = database.getCollection("data").find();
                                     MongoCursor<Document> dataiterator = databaserecords.iterator();
                                      while (dataiterator.hasNext()) {
                                           Document newdoc = dataiterator.next();
                                           String hole = newdoc.getString("holeSize");
                                           String wchecked = newdoc.getString("holeSelected");
                                           if(wchecked.equals("no") && hole != null){ 
      out.write("   \n");
      out.write("                                \t\n");
      out.write("                                            <ul style=\"list-style-type:none; color:white; padding-left:0px\">\n");
      out.write("                                                <li style=\"font-size:13px\"><input type=\"checkbox\" name=\"holes\" value=\"");
      out.print(hole);
      out.write("\"> ");
 out.println(hole); 
      out.write("</li>\n");
      out.write("                                            </ul>\n");
      out.write("                                             ");
 
                                                    }  
                                                }
}
catch(Exception e){

}
                                                    
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                </div> \n");
      out.write("                                                \n");
      out.write("                       \n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("<!--Double arrow left / right-->\n");
      out.write("\n");
      out.write("        <div class=\"col-md-1\">\n");
      out.write("          <ul style=\"list-style-type: none; margin:170px 0 0 38px\">\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#\" style=\"list-style-type: none; color:white;\"><div class=\"fa fa-angle-double-right\" style=\"font-size:30px\"></div></a>\n");
      out.write("            </li>\n");
      out.write("            <br><br>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#\" style=\"list-style-type: none; color:white;\"><div class=\"fa fa-angle-double-left\" style=\"font-size:30px\"></div></a>\n");
      out.write("            </li>\n");
      out.write("          </ul>  \n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("            <div class=\"col-md-3\">\n");
      out.write("              <div class=\"panel\" style=\"background-color:#2c546d; opacity:0.9; width:410px\">\n");
      out.write("                    <div class=\"panel-heading\" style=\"background-color:#0b1829; height:30px\">\n");
      out.write("                        <h4 class=\"panel-title\" style=\"margin-top:-3px\">\n");
      out.write("                            <a data-toggle=\"collapse\" href=\"#collapse4\" style=\"text-decoration:none; color:#f8f9f9; font-size:13px; font-family:Verdana;\">INTERMEDIATE   <span class=\"fa fa-angle-down pull-right\" style=\"font-size:13px\"></span></a>\n");
      out.write("                        </h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"collapse4\" class=\"panel-collapse collapse in\">\n");
      out.write("                        <div class=\"panel-body scrollable-menu scrollbar\" id=\"ex4\" style=\"min-height:440px; background-color:#2c546d;; opacity:0.7; overflow-y:scroll\">\n");
      out.write("                            <ul style=\"list-style-type:none; color:white; padding-left:0px; font-size:15px\">\n");
      out.write("                                    \n");
      out.write("                                    <div class=\"panel-body\" style=\"border-bottom:solid 1px #bababa\">    \n");
      out.write("                                        <p><b>Field Name :</b></p>\n");
      out.write("                                         ");

                                     DistinctIterable<String> fdocuments = collection.distinct("field", String.class).filter(eq("fieldchecked", "yes"));
                                    for (String document : fdocuments) {
                                
      out.write("\n");
      out.write("                                    <li style=\"font-size:13px\">");
 out.println(document); 
      out.write("</li>\n");
      out.write("                                ");
} 
      out.write("           \n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"panel-body\" style=\"border-bottom:solid 1px #bababa\">\n");
      out.write("                                        <p><b>Well Name :</b></p>\n");
      out.write("                                            ");

                                             try{
                                                 FindIterable<Document> Thedatabaserecords = database.getCollection("well").find();
                                     MongoCursor<Document> Welliterator = Thedatabaserecords.iterator();
                                      while (Welliterator.hasNext()) {
                                           Document doc = Welliterator.next();
                                           String wells = doc.getString("uidWell");
                                           String checked = doc.getString("wellischecked");
                                           if(checked.equals("yes") && wells !=null ){    
                                
      out.write("\t\n");
      out.write("                                        \n");
      out.write("                                           \n");
      out.write("                                <p style=\"font-size:13px\">");
 out.println(wells); 
      out.write("</p></<br>\n");
      out.write("                                           \n");
      out.write("                                             ");
 
                                                    }  
                                                }
}
catch(Exception e){

}
                                                    
      out.write("\n");
      out.write("                                    </div>    \n");
      out.write("                                    <div class=\"panel-body\">    \n");
      out.write("                                        <p style=\"font-size:16px; font-weight:bold\">Hole Size :</p>\n");
      out.write("                                          ");

                                             try{
                                                 FindIterable<Document> Ddatabaserecords = database.getCollection("data").find();
                                     MongoCursor<Document> Dataiterator = Ddatabaserecords.iterator();
                                      while (Dataiterator.hasNext()) {
                                           Document doc = Dataiterator.next();
                                           String holes = doc.getString("holeSize");
                                           String checked = doc.getString("holeSelected");
                                           if(checked.equals("yes") && holes !=null ){    
                                
      out.write("\t\n");
      out.write("                                        \n");
      out.write("                                           \n");
      out.write("                                <p style=\"font-size:13px\">");
 out.println(holes); 
      out.write("</p></<br>\n");
      out.write("                                           \n");
      out.write("                                             ");
 
                                                    }  
                                                }
}
catch(Exception e){

}
                                                    
      out.write("\n");
      out.write("                                        \n");
      out.write("                                    </div>    \n");
      out.write("                                        \n");
      out.write("                                   \n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("    \n");
      out.write("                </div>\n");
      out.write("     \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("<!--Double right arrow-->\n");
      out.write("\n");
      out.write("        <div class=\"col-md-1\" style=\"margin-right:0px\">\n");
      out.write("          <ul style=\"list-style-type: none; margin:200px 0 0 45px\">\n");
      out.write("            <li>\n");
      out.write("              <a href=\"#\" style=\"list-style-type: none; color:white;\"  formaction=\"mnemonicsupdate.jsp\"><div class=\"fa fa-angle-double-right\" style=\"font-size:30px\"></div></a>\n");
      out.write("            </li>\n");
      out.write("        </div>\n");
      out.write("                                                    \n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("                <div class=\"panel\" style=\"background-color:#2c546d; opacity:0.9; width:410px\">\n");
      out.write("                    <div class=\"panel-heading\" style=\"background-color:#0b1829; height:30px\">\n");
      out.write("                        <h4 class=\"panel-title\" style=\"margin-top:-3px\">\n");
      out.write("                            <a data-toggle=\"collapse\" href=\"#collapse5\" style=\"text-decoration:none; color:#f8f9f9; font-size:13px; font-family:Verdana;\">MNEMONICS  <span class=\"fa fa-angle-down pull-right\" style=\"font-size:13px\"></span></a>\n");
      out.write("                        </h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"collapse5\" class=\"panel-collapse collapse in\">\n");
      out.write("                        <div class=\"panel-body\" id=\"ex4\" style=\"min-height:440px; background-color:#2c546d; opacity:0.7; overflow-y:scroll\">\n");
      out.write("                        <select id=\"mlist\" size=\"19\" multiple class=\"scrollable-menu scrollbar\">");

                             MongoCollection collection2 = database.getCollection("groupLog");
                             DistinctIterable<String> mdocuments = collection2.distinct("curvInfoList.mnemonic", String.class ).filter(eq("fieldischecked", "yes"));
            
                                    for (String document : mdocuments) {
                                
      out.write("\n");
      out.write("                            <ul>    \n");
      out.write("                                <li style=\"font-size:13px\"><option value=\"");
      out.print(document);
      out.write('"');
      out.write('>');
 out.println(document);
      out.write("</option> </li>\n");
      out.write("                            </ul>    \n");
      out.write("                                ");

                                } 
                                
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-md-4\" style=\"text-align:center\">\n");
      out.write("          <button class=\"btn btn-sm\" style=\"background-color:#d8dad9; color:black; font-size:13px\" formaction=\"Panelupdate.jsp\">Next</button>&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("          <button type=\"submit\" style=\"color:white; font-size:19px; background-color:transparent; outline:none; border:none\" class=\"fa fa-refresh\" formaction=\"refresh.jsp\" style=\"font-size:20px\"></button>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-md-4\" style=\"text-align:center\">\n");
      out.write("          <button class=\"btn btn-sm\" style=\"background-color:#d8dad9; color:black; font-size:13px\">Generate</button>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-md-4\"></div>\n");
      out.write("    </div>  \n");
      out.write("                                                                                                   \n");
      out.write("          \n");
      out.write(" </div>    \n");
      out.write("   \n");
      out.write("                                              \n");
      out.write("</form>\n");
      out.write("        \n");
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
