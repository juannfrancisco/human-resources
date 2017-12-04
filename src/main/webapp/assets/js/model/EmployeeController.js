angular.module('EmployeeApp', [ ])
.controller('EmployeeController', function($http, $scope) 
{
	var ctr = this;
	ctr.employees = [];
	
	
	/**
	 * 
	 */
	ctr.getAllEmployees = function()
	{		
		$http.get('/human-resources-web/api/services/employee').
		  success(function(data, status, headers, config) 
		  {
			  ctr.employees = data;
		  }).
		  error(function(data, status, headers, config) 
		  {
			  console.log("error");
			  alert( data );
		  });
	};
	
	
	ctr.getAllEmployees();
	
});