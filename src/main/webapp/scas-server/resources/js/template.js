angular.module('myApp', []).controller('myCtrl', ['$scope','$templateCache', function($scope,$templateCache){
       var tmp = "<nav class='navbar navbar-inverse navbar-fixed-top'>"+
    "<div class='container-fluid'>\n"+
        "<div class='navbar-header'>\n"+
            "<button type='button' class='navbar-toggle collapsed' data-toggle='collapse' data-target='#navbar' aria-expanded='false' aria-controls='navbar'>\n"+
                "<span class='sr-only'>Toggle navigation</span>\n"+
                "<span class='icon-bar'></span>\n"+
                "<span class='icon-bar'></span>\n"+
                "<span class='icon-bar'></span>\n"+
            "</button>\n"+
            "<a class='navbar-brand' href='./home.html'>智慧社区应用服务门户</a>\n"+
        "</div>\n"+
        "<div id='navbar' class='collapse navbar-collapse navbar-right'>\n"+
            "<ul class='nav navbar-nav'>\n"+
                "<li><a href='./home.html' >首页</a></li>\n"+
                "<li><a href='#'>设置</a></li>\n"+
                "<li><a href='#'>信息</a></li>\n"+
                "<li><a href='#'>帮助</a></li>\n"+
            "</ul>\n"+
        "</div><!--/.nav-collapse -->\n"+
    "</div>"+
"</nav>";
       $templateCache.put('topmenu.html',tmp);     
       var temp = "<ul class='nav nav-sidebar'>"+
    "<li><h4 class='sub-header'>社区管理</h4></li>"+
    "<li><a href='./community_info_fillout.html' >社区基本信息<span class='sr-only'>(current)</span></a></li>"+
    "<li><a href='./people_info_fillout.html' >人员基本信息</a></li>"+
    "<li><a href='./service_info_fillout.html' >微服务配置</a></li>"+
    
"</ul>"+
"<ul class='nav nav-sidebar'>"+
    "<li><h4 class='sub-header'>状态监控</h4></li>"+
    "<li><a href='mobile_user_monitor.html'>移动端在线状态</a></li>"+
"</ul>" ;   
		$templateCache.put('sidemenu.html',temp);       
   }])