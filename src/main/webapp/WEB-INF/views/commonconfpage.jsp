<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page import="com.ibm.ivia.config.model.EnvConfig"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Accelerated Deployment Engine</title>
<link rel="icon" type="image/x-icon"
	href="<c:url value="/resources/css/ibm.ico"/>">
<link rel="stylesheet" type="text/css" media="screen"
	href='<c:url value="/resources/css/input.css"/>' />
<script src="<c:url value="/resources/javascript/input.js"/>"></script>

</head>
<body>

	<!--   <p>Here we demonstrate the process of filling out a form and submitting it to web application to be processed.</p> -->
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
						<label style="color: #3F91B6"><b> IVIA Configuration Container </b></label>
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
	<!-- 
<div class="row">
  <div class="column">  <img src="<c:url value="/resources/css/ibm.png"/>" alt="Ibm logo" class="imagesize">  
  <div class="column">
 
  <div class="column">  <img src="<c:url value="/resources/css/ibm.png"/>" alt="Ibm logo" class="imagesize">
</div>
</div>
 -->
	<table id="button_top">
		<tr>
			<td id="tdidl"></td>
		</tr>
	</table>
	<br>

	<form:form method="POST" action="/configwebapp/getform"
		commandName="envConfig">

		<table>
			<tr>
				<!--  	<td>Container Type:</td>
				<td><form:select path="containerType">
						<form:option value="NONE"> --SELECT--</form:option>
						<form:option value="Docker"> Native Docker</form:option>
						<form:option value="DockerCompose"> Docker Compose</form:option>
						<form:option value="Kubernetes"> Kubernetes</form:option>
						<form:option value="Helm"> Helm</form:option>
						<form:option value="OpenShift"> OpenShift</form:option>
					</form:select></td>
				<td><form:errors cssClass="error" path="containerType" /></td>
			</tr> -->
			<tr>
				<td>Persistent Volume label Name for iviaconfig :</td>
				<td><form:input path="iviaconfiglabel" value="iviaconfig" /></td>
				<td><form:errors cssClass="error" path="iviaconfiglabel" /></td>
			</tr>
			<tr>
				<td>Pod label Name for iviaconfig :</td>
				<td><form:input path="iviaconfigpodlabel" value="iviaconfig" /></td>
				<td><form:errors cssClass="error" path="iviaconfigpodlabel" /></td>
			</tr>
			<tr>
				<td>Network label Name :</td>
				<td><form:input path="networkname" value="ivia" /></td>
				<td><form:errors cssClass="error" path="networkname" /></td>
			</tr>
			<tr>
				<td>Container Time Zone</td>
				<td><form:input path="timezone" value="Asia/Kolkata" /></td>
				<td><form:errors cssClass="error" path="timezone" /></td>
			</tr>

			<tr>
				<td>LMI IP Address:</td>
				<td><form:input path="lmiIp" /></td>
				<td><form:errors cssClass="error" path="lmiIp" /></td>
			</tr>
			<tr>
				<td>LMI hostname Name:</td>
				<td><form:input path="lmihostname" value="iviaconfig" /></td>
				<td><form:errors cssClass="error" path="lmihostname" /></td>
			</tr>

			<tr>
				<td>LMI Port Number :</td>
				<td><form:input path="lmiport" value="443:9443" /></td>
				<td><form:errors cssClass="error" path="lmiport" /></td>
			</tr>
			<tr>
				<td>LMI admin password :</td>
				<td><form:password path="lmiadminpwd" value="Passw0rd" /></td>
				<td><form:errors cssClass="error" path="lmiadminpwd" /></td>
			</tr>

			<tr>
				<td>Verify Identity Access ivia-config image repository URL :</td>
				<td><form:input path="iviaconfigRepUrl"
						value="icr.io/ivia/ivia-config" /></td>
				<td><form:errors cssClass="error" path="iviaconfigRepUrl" /></td>
			</tr>
			<tr>
				<td>Verify Identity Access ivia-config image tag version:</td>
				<td><form:input path="iviaconfigV" value="11.0.0.0" /></td>
				<td><form:errors cssClass="error" path="iviaconfigV" /></td>
			</tr>

			<tr>
				<td colspan="3"><hr></td>
			</tr>
			<tr>
			
											<td colspan="3" style="text-align: center;">
								<label style="color: #3F91B6"><b> IVIA Runtime  </b></label>
								</td>
				
				
				
			</tr>
			<tr>
				<td>Runtime Pod label Name:</td>
				<td><form:input path="runtimehostname" value="iviaruntime"
						 /></td>
				<td><form:errors cssClass="error" path="runtimehostname" /></td>
			</tr>

			<tr>
				<td>Runtime hostName:</td>
				<td><form:input path="runtimepodlabel" value="iviaruntime"
						 /></td>
				<td><form:errors cssClass="error" path="runtimepodlabel" /></td>
			</tr>


<tr>
				<td>Runtime image repository URL :</td>
				<td><form:input path="requestConfigDsc/repoUrl"
						value="icr.io/ivia/ivia-runtime" readonly="true" /></td>
				<td><form:errors cssClass="error" path="requestConfigDsc/repoUrl" /></td>
			</tr>
			<tr>
				<td>Runtime image tag Version :</td>
				<td><form:input path="requestConfigDsc/imageVersion"
						value="icr.io/ivia/ivia-runtime" readonly="true" /></td>
				<td><form:errors cssClass="error" path="requestConfigDsc/imageVersion" /></td>
			</tr>
			
			

			<!-- <tr>
				<td colspan="2">
					<div id="container" class="container-fluid">
						
						<table id="rp-table" class="table table-bordered table-striped">
							<tr>
								<th>#</th>
								<th>HostName</th>
								<th>Container Label Name</th>
								<th>RP Ip</th>
								<th>RP Port</th>
								<th>Instance Name</th>
								<th colspan="3">Action</th>
							</tr>
							<tr>
								<td>1</td>
								<td><input type="text" class="form-control"></td>
								<td><input type="text" class="form-control"></td>
								<td><input type="text" class="form-control"></td>
								<td><input type="text" class="form-control"></td>
								<td><input type="text" class="form-control"></td>
								<td><input class="btn btn-danger" type="button"	value="Add" onclick="addNewRow()"></td>
								<td><input class="btn btn-danger" type="button"	value="Delete" onclick="deleteRow(this)"></td>
								<td><input class="btn btn-danger" type="button"	value="Save" onclick="save()"></td>
								
							</tr>
						</table>
					</div>
				</td>
			</tr> -->

			<tr>
				<td colspan="3" align="center"><input type="submit"
					id="submit_button" class="button_submit"
					value="Save ISVA config and Next " /></td>
			</tr>
		</table>

	</form:form>


</body>
</html>