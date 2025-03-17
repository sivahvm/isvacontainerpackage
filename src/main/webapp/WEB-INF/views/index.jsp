<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Accelerated Deployment Engine</title>

  <link rel="icon" type="image/x-icon" href="<c:url value="/resources/css/ibm.ico"/>">


<link rel="stylesheet" type="text/css" media="screen"
	href='<c:url value="/resources/css/input.css"/>' />
<script src="<c:url value="/resources/javascript/input.js"/>"></script>

</head>
<body>
<table id="banner_table">
		<tr>
			<td id="bannertd">
				<div class="row">
					<div class=adelog>
						<img src="<c:url value="/resources/css/ADE_logo_resize.jpg"/>"
							alt="Ibm logo" />
					</div>
					<div class="div_backgrndimg">
						<label class="headlabel"><b>Accelerated Deployment Engine</b></label>
					</div>
					<div class="ibmlog">
						<img src="<c:url value="/resources/css/ibm_resize.png"/>"
							alt="Ibm logo">
					</div>

				</div>
				</div>
			</td>
		</tr>
	</table>

<br><br>
<form:form method = "GET" action = "/configwebapp/getform" >
	

<div align="left" style="padding-left:270px; width: 917px">						
	<label><h3>Accelerated Deployment Engine is single source for Creating IVIA Container configurations that include image version, services, secure and testing. <br> <br> This pattern will generate container configuration files based on client inputs and it will do base platform testing </h4></label>
					</div>
<br><br><br><br>
<div align="center">
<input type="submit" id="submit_button"  class="button_submit"  value="Start " />
</div>	


	</form:form>
	
</body>
</html>