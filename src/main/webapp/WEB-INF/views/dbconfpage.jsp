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
						<label style="color: #0001ff"><b>  IVIA Runtime Database Container </b></label>
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
<table id="button_top">
  <tr >
    <td id="tdidl">
    <i style="text-align: center; padding-left: 10px"> 
    	<b><a class="linnk_button" href='<c:url value="/ldapform"/>'>Back</a>	</b>
    </i>
 	 </td> 
	 <td id="tdidr">
    <i style="text-align: center; padding-left: 10px"> 
    	<b><a class="disable_button" href='<c:url value="#"/>'>Skip</a>	</b>
    </i>
 	 </td> 
 </tr>
 </table>
<br>
<form:form method = "POST" action = "/configwebapp/dbform" commandName="dbConf">
	
		<table>
			
			<tr>
				<td>Persistent Volume label Name for postgresql database:</td>
				<td><form:input path="dblabel" value="pgdata" /></td>
				<td><form:errors cssClass="error" path="dblabel" /></td>
			</tr>
			
			<tr>
				<td>Database hostname Name :</td>
				<td><form:input path="dbhostname" value="postgresql" /></td>
				<td><form:errors cssClass="error" path="dbhostname" /></td>
			</tr>
			
			<tr>
				<td>Pod label Name for Database :</td>
				<td><form:input path="dbpodlabel" value="postgresql" /></td>
				<td><form:errors cssClass="error" path="dbpodlabel" /></td>
			</tr>
			<tr>
				<td>postgresql database Name:</td>
				<td><form:input path="dbname" value="ivia" /></td>
				<td><form:errors cssClass="error" path="dbname" /></td>
			</tr>
			<tr>
				<td>postgresql database User Name:</td>
				<td><form:input path="dbuname" value="postgres" /></td>
				<td><form:errors cssClass="error" path="dbuname" /></td>
			</tr>
			<tr>
				<td>postgresql database password :</td>
				<td><form:password path="dbpwd" value="Passw0rd" /></td>
				<td><form:errors cssClass="error" path="dbpwd" /></td>
			</tr>
				
			<tr>
				<td>Verify Identity Access postgresql image repository
					URL :</td>
				<td><form:input path="postgresqlRepUrl"
						value="icr.io/ivia/ivia-postgresql" /></td>
				<td><form:errors cssClass="error" path="postgresqlRepUrl" /></td>
			</tr>
			<tr>
				<td>Verify Identity Access postgresql image tag version:
				</td>
				<td><form:input path="dbV" value="11.0.0.0" /></td>
				<td><form:errors cssClass="error" path="dbV" /></td>
			</tr>
			

			<tr>
					<td colspan="3" align="center"><input type="submit" id="submit_button"  class="button_submit"  value="Save Database and Next " /></td>
			</tr>
		</table>

	</form:form>
	
</body>
</html>