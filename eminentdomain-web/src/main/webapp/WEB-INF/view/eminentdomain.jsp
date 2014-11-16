<#import "/spring.ftl" as spring />
<!DOCTYPE html>
<html>

<head>
<title>Eminent Domain</title>
<link rel="icon" type="image/x-icon" href="<@spring.url '/images/1412091097_48493.ico' />" />
<link rel="stylesheet" href="<@spring.url '/lib/bootstrap-3.2.0/css/bootstrap.min.css' />" />
<link rel="stylesheet" href="<@spring.url '/lib/angular-ngtable/ng-table.min.css' />" />
<link rel="stylesheet" href="<@spring.url '/lib/font-awesome-4.1.0/css/font-awesome.min.css' />" />
<link rel="stylesheet" href="<@spring.url '/lib/angular/toaster.css' />" />
<link rel="stylesheet" href="<@spring.url '/tenant/app.css' />" />
<script src="<@spring.url '/lib/jquery/jquery.min.js' />"></script>
<style>
    .navbar { border-radius:0; }
</style>
<script data-main="<@spring.url '/tenant/main.js' />" src="<@spring.url '/lib/require/require.js' />"></script>
</head>

<body>
  <!-- NAVIGATION -->
  <nav class="navbar navbar-inverse" role="navigation">
    <div class="navbar-header">
      <a class="navbar-brand" href="<@spring.url '/#/' />">Eminent Domain
         <small style="font-size: 0.5em;">Powered by Here Maps</small>
      </a>
    </div>
    <ul class="nav navbar-nav">
      <!-- 
      <li><a href="javascript:;">Hello</a></li>
      -->
    </ul>
  </nav>

  <!-- Main Content -->
  <div class="container">
    <toaster-container toaster-options="{'time-out': 4000, 'limit' : 3}"></toaster-container>
    <fb:login-button scope="public_profile,email" onlogin="checkLoginState();">
    </fb:login-button>
    <div ui-view>Loading resources...</div>
  </div>

  <div style="margin-bottom: 30px;"></div>
</body>

<script>
  window.fbAsyncInit = function() {
    FB.init({
      appId      : '804572306266016',
      xfbml      : true,
      version    : 'v2.2'
    });
  };

  (function(d, s, id){
     var js, fjs = d.getElementsByTagName(s)[0];
     if (d.getElementById(id)) {return;}
     js = d.createElement(s); js.id = id;
     js.src = "//connect.facebook.net/en_US/sdk.js";
     fjs.parentNode.insertBefore(js, fjs);
   }(document, 'script', 'facebook-jssdk'));
</script>

</html>