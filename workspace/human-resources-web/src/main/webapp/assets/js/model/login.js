/**
 * 
 */
$( document ).ready(function() 
{
	$("#form-login").submit( function( event )
	{
		authentication();
		return false;
	});
});


/**
 * 
 */
function authentication()
{
	var email =  $( "#input-email" ).val();
	var password = $( "#input-password" ).val();
	
	var user = 
	{
		userName : email, 
		password : password
	};
	
	$.ajax({
	  type: "POST",
	  url: "/human-resources-web/api/authentication",
	  data: JSON.stringify(user),
	  success: function( data )
	  {
		  window.location =  "blank.html";
	  },
	  error : function(xhr, ajaxOptions, thrownError)
	  {
		  if( xhr.status == "200" )
		  {
			  window.location =  "blank.html";
	      }
		  else
		  {
			  alert(xhr.status);
		      alert(thrownError);
			  alert("Inicio de sesion no valido");
		  }
		 
	  },
	  dataType: "application/json",
	  contentType : "application/json"
	});
}