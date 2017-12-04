angular.module('HumanResourcesApp', [ ])
.controller('LoginController', function($http, $scope) 
{
	var login = this;
	
	login.email = "default";
	login.password = "default";
	
	
	login.authentication = function()
	{		
		$http.post('/human-resources-web/api/authentication' , {
			userName : login.email, 
			password : login.password
		}).
		  success(function(data, status, headers, config) {
			  window.location =  "blank.html";			  
		  }).
		  error(function(data, status, headers, config) {
			  alert( "Inicio de sesion no valido" );
		  });
		
		
	};
	
	
});