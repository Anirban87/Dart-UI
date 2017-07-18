<%@page import="com.mongodb.client.DistinctIterable"%>
<%@page import="com.mongodb.BasicDBObject"%>
<%@page import="com.mongodb.DBCollection"%>
<%@page import="com.mongodb.client.FindIterable"%>
<%@page import="com.mongodb.MongoClient"%>
<%@page import="com.mongodb.MongoClientURI"%>
<%@page import="com.mongodb.ServerAddress"%>
<%@page import="com.mongodb.client.MongoDatabase"%>
<%@page import="com.mongodb.client.MongoCollection"%>
<%@page import="org.bson.Document"%>
<%@page import="com.mongodb.client.MongoCursor"%>
<%@page import="static com.mongodb.client.model.Filters.*"%>
<%@page import="com.mongodb.client.result.DeleteResult"%>
<%@page import="static com.mongodb.client.model.Updates.*"%>
<%@page import="com.mongodb.client.result.UpdateResult"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>index</title>

<meta charset="utf-8">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">


<style>
	
    #font{font-family:Verdana; border-bottom:solid 2px #f0f3f4}
    #font:hover {color:#1794bf; border-bottom:solid 2px #1794bf}
    #fontDropdown:hover{font-family:Verdana; color:#ecf0f1; background-color:#707b7c; -webkit-transition-duration:0.4s}
    body{overflow-y:scroll; overflow-x:hidden; background-color:#d0d3d4;}

    .scrollbar{ 
        max-height: 200px;
        overflow-x:hidden;
        overflow-y:scroll; 
        min-width: 135px;
                }
    
    #ex4::-webkit-scrollbar { width:8px;background-color:white; } 
    #ex4::-webkit-scrollbar-thumb { background-color:#abb2b9; border-radius:10px; }
    #ex4::-webkit-scrollbar-thumb:hover { background-color:#aeb6bf; border:1px solid #808b96; }
    #ex4::-webkit-scrollbar-thumb:active { background-color:#aeb6bf; border:1px solid #808b96; }

</style>

      <script type="text/javascript">
          function func1()
          {
            var a;
            if (window.XMLHttpRequest)
                {
                    a=new XMLHttpRequest();
                }
            else
                {
                    a=new ActiveXObject("Microsoft.XMLHTTP");
                }
                
            a.onreadystatechange=function()
                {
                    if (this.readyState==4 && this.status==200)
                    {
                      document.getElementById("myDiv").innerHTML=this.responseText;
                    }
                }
              
                a.open("GET","data.html",true);
                a.send();
          }     
                            
      </script>      
      
</head>

<body class="scrollbar" id="ex4">
  
    <div class="row">
    	<div class="col-md-12">
            <nav class="navbar navbar-default" style="background-color:#ececec; box-shadow:0 0 30px 0 #727272; height:75px">
                <div class="container" style="margin-top:-5px;">
                    <div class="navbar-header">
                        <a class="navbar-brand" href="#" style="font-size:25px; font-family:Verdana; color:#1794bf"><span class="glyphicon glyphicon-home" style="font-size:20px; margin-right:20px"></span>Drilling Analytics</a>
                    </div>
                </div>
                <div>
                    <ul class="nav navbar-nav" style="font-size:15px; margin-left:132px; margin-top:-15px">
                        <li id="font">
                            <a href="#" style="height:42px">
                                <i class="fa fa-bar-chart"></i>
                                <span> Dashboard</span>
                            </a>
                        </li>
                        <li id="font" class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown" href="#" style="height:42px; background-color:transparent"><i class="fa fa-line-chart"></i>
                                <span> Patterns</span>
                                <span class="caret"></span>
                            </a>
                            <ul class="dropdown-menu" style="font-size:13px">
                                <li><a id="fontDropdown" href="#">Container</a></li>
                                <li><a id="fontDropdown" href="#">Result</a></li>
                            </ul>
                        </li> 
                        <li><a href="#"></a></li>
                    </ul>
                </div>
            </nav>
        </div>            
    </div>
		
            <form method="post">
	<% 
            
            MongoClient mongoClient = new MongoClient();
            MongoDatabase database = mongoClient.getDatabase("rig_witsml");
            MongoCollection collection = database.getCollection("well");
            DistinctIterable<String> documents = collection.distinct("field", String.class );
                    
        %>
		
        <div class="container-fluid">
        <div class="row">
            <div class="col-md-4" style="width:418px">
                <div class="panel panel-default" >
                    <div class="panel-heading" style="background-color:#1794bf">
                        <h4 class="panel-title">
                            <a data-toggle="collapse" href="#collapse1" style="text-decoration:none; color:#f8f9f9; font-size:13px; font-family:Verdana;">Fields<span class="glyphicon glyphicon-chevron-down pull-right"></span></a>
                        </h4>
                    </div>
                    <div id="collapse1" class="panel-collapse collapse in">
                        <div class="panel-body scrollable-menu scrollbar" id="ex4" style="min-height:150px">
                            <ul style="list-style-type:none; color:#74bcd4">
                                               <%
                                                    for (String document : documents) {
                                                %>
                                                        <li style="font-size:13px"><input type="checkbox" name="field" value="<%=document%>"> <% out.println(document); %></li>
                                                        <%} %>
                            </ul>
                        </div>
                    </div>
                

                
                    <div class="panel-heading" style="background-color:#1794bf">
                        <h4 class="panel-title">
                            <a data-toggle="collapse" href="#collapse2" style="text-decoration:none; color:#f8f9f9; font-size:13px; font-family:Verdana;">Wells<span class="glyphicon glyphicon-chevron-down pull-right"></span></a>
                        </h4>
                    </div>
                    <div id="collapse2" class="panel-collapse collapse in">
                        <div class="panel-body scrollable-menu scrollbar" id="ex4" style="min-height:150px; overflow-y:scroll">
                            <ul id="myDiv" style="list-style-type:none; color:#74bcd4">
                                
                            </ul>
                        </div>
                    </div>
               

               
                    <div class="panel-heading" style="background-color:#1794bf">
                        <h4 class="panel-title">
                            <a data-toggle="collapse" href="#collapse3" style="text-decoration:none; color:#f8f9f9; font-size:13px; font-family:Verdana;">Hole Size<span class="glyphicon glyphicon-chevron-down pull-right"></span></a>
                        </h4>
                    </div>
                    <div id="collapse3" class="panel-collapse collapse in">
                        <div class="panel-body scrollable-menu scrollbar" id="ex4" style="max-height:120px; overflow-y:scroll">
                            <ul style="list-style-type:none; color:#74bcd4">
                                
                            </ul>
                        </div>
                    </div>
                </div>

            </div>
            
            <div class="col-md-3" style="width:40px">
                 <ul style="list-style-type:none; margin-top:140px; padding-left:1px; padding-right:5px">
                    <li><button class="btn btn-md btn-primary" style="margin-left:-13px"><span class="fa fa-angle-double-right"></span></button></li><br>
                    <li><button class="btn btn-md btn-primary" style="margin-left:-13px"><span class="fa fa-angle-double-left"></span></button></li>    
                </ul>                   
            </div>
                            
            <div class="col-md-3" style="width:422px">
                <div class="panel panel-default">
                    <div class="panel-heading" style="background-color:#1794bf">
                        <h4 class="panel-title">
                            <a data-toggle="collapse" href="#collapseinter" style="text-decoration:none; color:#f8f9f9; font-size:13px; font-family:Verdana;">Intermediate<span class="glyphicon glyphicon-plus-sign pull-right"></span></a>
                        </h4>
                    </div>
                    <div id="collapseinter" class="panel-collapse collapse">
                        <div class="panel-body scrollable-menu scrollbar" id="ex4" style="height:580px; overflow-y:scroll">
                            <ul style="list-style-type:none; color:#74bcd4">
                                
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
            
            <div class="col-md-1" style=" width:30px">
                <ul style="list-style-type:none; margin-top:160px; padding-left:1px; padding-right:5px">
                    <li><button class="btn btn-md btn-primary" formaction="mnemonicsupdate.jsp" style="margin-left:-19px"><span class="fa fa-angle-double-right"></span></button></li>
                </ul>    
            </div>

            <div class="col-md-3">
                <div class="panel panel-default" style="width:422px">
                    <div class="panel-heading" style="background-color:#1794bf">
                        <h4 class="panel-title">
                            <a data-toggle="collapse" href="#mnemonicsCollapse" style="text-decoration:none; color:#f8f9f9; font-size:13px; font-family:Verdana;">Mnemonics<span class="glyphicon glyphicon-plus-sign pull-right"></span></a>
                        </h4>
                    </div>
                    <div id="mnemonicsCollapse" class="panel-collapse collapse">
                        <div class="panel-body scrollable-menu scrollbar" id="ex4" style="max-height:200px; overflow-y:scroll">
                            <ul style="list-style-type:none; color:#74bcd4">
                                
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
                     
        <div class="row">
            <div class="col-md-4">
                <div class="btn center-block"> 
                    <button type="submit" class="btn btn-sm btn-primary" onclick="func1()">Next</button>
                    <button type="submit" class="btn btn-sm btn-primary glyphicon glyphicon-refresh" formaction="refresh.jsp"></button>                    
                </div>
            </div>
            
            <div class="col-md-4">
                <div class="col-sm-12">
                    <center><button class="btn btn-sm btn-primary" disabled="disabled" style="margin-top:8px">Generate</button></center>
                </div>
            </div>
            
            <div class="col-md-4"></div>
        </div> 
    </div>    

    <div class="footer navbar-fixed-bottom" style="background-color:#ececec; box-shadow:0 0 30px 0 #7e7e7e; margin-bottom:1px; height:40px">
            <a style="font-size:15px; font-family:Verdana; color:#595959"><center style="padding-top:10px">Copyright &copy 2017</center></a>
    </div>                         
</div> 
        
</form>
        
</body>
</html>
