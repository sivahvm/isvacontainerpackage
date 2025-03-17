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
						<label style="color: #e28743"><b> IVIA Reverse Proxy Container </b></label>
						
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
	

<body>

<table id="button_top">
  <tr >
    <td id="tdidl">
    <i style="text-align: center; padding-left: 10px"> 
    	<b><a class="linnk_button" href='<c:url value="/dbform"/>'>Back</a>	</b>
    </i>
 	 </td> 

 </tr>
 </table>
<br>

<form:form method = "POST" action = "/configwebapp/addRP" commandName="rpConf">

		<table>

			<tr>
				<td>Web Reverse Proxy runtime IP Address:</td>
				<td><form:input path="rpIp" /></td>
				<td><form:errors cssClass="error" path="rpIp" /></td>
			</tr>
			<tr>
				<td>Web Reverse Proxy Pod label Name:</td>
				<td><form:input path="rppodlabel" value="iviawrprp1"/></td>
				<td><form:errors cssClass="error" path="rppodlabel" /></td>
			</tr>
			
			<tr>
				<td>Web Reverse Proxy hostName:</td>
				<td><form:input path="rphostname" value="iviawrprp1"/></td>
				<td><form:errors cssClass="error" path="rphostname" /></td>
			</tr>
			
			
			<tr>
				<td>Web Reverse Proxy Port Number :</td>
				<td><form:input path="rpport" value="443:9443" /></td>
				<td><form:errors cssClass="error" path="rpport" /></td>
			</tr>
			
			
			<tr>
				<td>Web Reverse Proxy Instance Name :</td>
				<td><form:input path="rpInstanceName" value="rp1" /></td>
				<td><form:errors cssClass="error" path="rpInstanceName" /></td>
			</tr>
			
			<tr><td colspan="3"><hr></td></tr>
			<tr>
				<td colspan="3" align="center">
					<input type="submit"  class="button_submit" id="add_button" value="Save and Add" />
				</td>
			</tr>
			<tr><td colspan="3"><hr></td></tr>
			</table>
	</form:form>
	
	<form:form method = "POST" action = "/configwebapp/rpform" commandName="rplconf">

		<table>
			<tr>
				<td>Verify Identity Access ivia-config image repository
					URL :</td>
				<td><form:input path="rpRepUrl"  value="icr.io/ivia/ivia-wrp" /></td>
				<td><form:errors cssClass="error" path="rpRepUrl" /></td>
			</tr>
			<tr>
				<td>Verify Identity Access Web Reverse Proxy image tag version:
				</td>
				<td><form:input path="rpV" value="11.0.0.0" /></td>
				<td><form:errors cssClass="error" path="rpV" /></td>
			</tr>
		</table>
<br>
<table>
 <tr>
<th>Web RP IP</th>
<th>Pod Label</th>
<th>HostName</th>
<th>Port Num</th>
<th>Instance Name</th>
<th>Action</th>

	</tr>
  
  <c:forEach var="item" items="${sessionScope.listObj}" varStatus="status" >   
   <tr>  
	    <td><c:out value="${item.rpIp }" /> </td>
	    <td><c:out value="${item.rphostname }" /> </td>
	    <td><c:out value="${item.rppodlabel }" /> </td>
	    <td><c:out value="${item.rpport }" /> </td>
	    <td><c:out value="${item.rpInstanceName }" /> </td>
		<td align="center">
					<input type="submit" id="deleteRp" name="deleteRp" value="Delete" />
				</td>
    </tr>
    <c:if test="${status.last}">  
    		<tr>
				<td colspan="6" align="center"><input type="submit" id="submit_button"  class="button_submit" value="Save Reverse Proxy and Next" /></td>
			</tr>
    </c:if>
</c:forEach>

</table>
	</form:form>
</body>
</html>