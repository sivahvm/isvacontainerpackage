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
						<label style="color: #b0841e"><b>  ISVD Configuration Container </b></label>
						

						
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
    	<b><a class="linnk_button" href='<c:url value="/getform"/>'>Back</a>	</b>
    </i>
 	 </td> 
	<!--  <td id="tdidr">
    <i style="text-align: center; padding-left: 10px"> 
    	<b><a class="disable_button" href='<c:url value="#"/>'>Skip</a>	</b>
    </i>
 	 </td>  -->
 </tr>
 </table>
<br>

<form:form method = "POST" action = "/configwebapp/ldapform" commandName="ldapConf">
	
		<table>
			
			<tr>
				<td>Persistent Volume label Name for ldap :</td>
				<td><form:input path="ldaplabel" value="openldap" /></td>
				<td><form:errors cssClass="error" path="ldaplabel" /></td>
			</tr>
			
			<tr>
				<td>Ldap Host Name:</td>
				<td><form:input path="ldaphost" value="openldap" /></td>
				<td><form:errors cssClass="error" path="ldaphost" /></td>
			</tr>
			<tr>
				<td>Ldap Pod Name:</td>
				<td><form:input path="ldappodlabel" value="openldap" /></td>
				<td><form:errors cssClass="error" path="ldappodlabel" /></td>
			</tr>
			<tr>
				<td>Ldap Domain Name :</td>
				<td><form:input path="ldapDomain" /></td>
				<td><form:errors cssClass="error" path="ldapDomain" /></td>
			</tr>
			<tr>
				<td>LDAP conf password :</td>
				<td><form:password path="ldapconfpwd" value="Passw0rd" /></td>
				<td><form:errors cssClass="error" path="ldapconfpwd" /></td>
			</tr>
			<tr>
				<td>LDAP admin password :</td>
				<td><form:password path="ldapadminpwd" value="Passw0rd" /></td>
				<td><form:errors cssClass="error" path="ldapadminpwd" /></td>
			</tr>
			<tr>
				<td>LDAP Port Number :</td>
				<td><form:input path="ldapport" value="636:1636" /></td>
				<td><form:errors cssClass="error" path="ldapport" /></td>
			</tr>
			<tr>
				<td>Persistent Volume label Name for libldap :</td>
				<td><form:input path="libldaplabel" value="libldap" /></td>
				<td><form:errors cssClass="error" path="libldaplabel" /></td>
			</tr>
			
			<tr>
				<td>Persistent Volume label Name for libsecauthority :</td>
				<td><form:input path="libsecauthoritylabel" value="libsecauthority" /></td>
				<td><form:errors cssClass="error" path="libsecauthoritylabel" /></td>
			</tr>
			<tr>
				<td>Persistent Volume label Name for ldapslapd :</td>
				<td><form:input path="ldapslapdlabel" value="ldapslapd" /></td>
				<td><form:errors cssClass="error" path="ldapslapdlabel" /></td>
			</tr>
			<tr>
				<td>Verify Identity Access OpenLdap image repository
					URL :</td>
				<td><form:input path="iviaLdapRepUrl"
						value="icr.io/isva/verify-access-openldap" /></td>
				<td><form:errors cssClass="error" path="iviaLdapRepUrl" /></td>
			</tr>
			<tr>
				<td>Verify Identity Access OpenLdap image tag version:
				</td>
				<td><form:input path="ldapV" value="10.0.6.0_IF1" /></td>
				<td><form:errors cssClass="error" path="ldapV" /></td>
			</tr>

			<tr>
				<td>Password Policy Max length:</td>
				<td><form:input path="maxlen" value="12"
						readonly="true" /></td>
				<td><form:errors cssClass="error" path="maxlen" /></td>
			</tr>
			<tr>
				<td>Password Policy Min length:</td>
				<td><form:input path="minlen" value="6"
						readonly="true" /></td>
				<td><form:errors cssClass="error" path="minlen" /></td>
			</tr>
			<tr>
				<td>Password Policy Lock-duration :</td>
				<td><form:input path="lockduration" value="1800"
						readonly="true" /></td>
				<td><form:errors cssClass="error" path="lockduration" /></td>
			</tr>

			<tr>
					<td colspan="3" align="center"><input type="submit" id="submit_button"  class="button_submit" value="Save ISVD and Next " /></td>
			</tr>
		</table>

	</form:form>

</body>
</html>