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
						<label style="color: #6b476b"><b> IVIA-OP Container </b></label>
						
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
    	<b><a class="linnk_button" href='<c:url value="/rpform"/>'>Back</a>	</b>
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

<form:form method = "POST" action = "/configwebapp/iviaop" commandName="iviaconf">

		<table>

			<tr>
				<td>IVIAOP Pod label Name:</td>
				<td><form:input path="iviaoppodlabel" value="iviaop"/></td>
				<td><form:errors cssClass="error" path="iviaoppodlabel" /></td>
			</tr>
			
			<tr>
				<td>IVIAOP hostName:</td>
				<td><form:input path="iviaophostname" value="iviaop"/></td>
				<td><form:errors cssClass="error" path="iviaophostname" /></td>
			</tr>
			
			
			<tr>
				<td>IVIAOP instance Instance  :</td>
				<td><form:input path="iviaopinstance" value="1" /></td>
				<td><form:errors cssClass="error" path="iviaopinstance" /></td>
			</tr>
			
			<tr>
				<td>Verify Identity Access iviaop image repository
					URL :</td>
				<td><form:input path="iviaopRepUrl"  value="icr.io/ivia/ivia-oidc-provider" /></td>
				<td><form:errors cssClass="error" path="iviaopRepUrl" /></td>
			</tr>
			<tr>
				<td>Verify Identity Access iviaop  image tag version:
				</td>
				<td><form:input path="iviaopV" value="24.12" /></td>
				<td><form:errors cssClass="error" path="iviaopV" /></td>
			</tr>
			
			<tr>
				<td colspan="3" ><hr></td>				
			</tr>
			<tr>
								<td colspan="3" style="text-align: center;">
								<label style="color: #6b476b"><b> IVIA DSC Container </b></label>
								</td>
				
			</tr>
			<tr>
				<td>DSC Pod label Name:</td>
				<td><form:input path="dsclabel" value="iviadsc" readonly="true" /></td>
				<td><form:errors cssClass="error" path="dsclabel" /></td>
			</tr>
			
			<tr>
				<td>DSC hostName:</td>
				<td><form:input path="dschostname" value="iviadsc" readonly="true" /></td>
				<td><form:errors cssClass="error" path="dschostname" /></td>
			</tr>
			<tr>
				<td>DSC instance Instance  :</td>
				<td><form:input path="dscinstance" value="1" /></td>
				<td><form:errors cssClass="error" path="dscinstance" /></td>
			</tr>
			
			<tr>
				<td>DSC image repository
					URL :</td>
				<td><form:input path="dscRepUrl"  value="icr.io/ivia/ivia-dsc" readonly="true"  /></td>
				<td><form:errors cssClass="error" path="dscRepUrl" /></td>
			</tr>
			<tr>
				<td>DSC image tag version:
				</td>
				<td><form:input path="dscV" value="11.0.0.0" readonly="true"  /></td>
				<td><form:errors cssClass="error" path="dscV" /></td>
			</tr>

			<!--  <tr>
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
			</tr>  -->

			<tr>
				<td colspan="3" align="center"><input type="submit" id="submit_button"  class="button_submit" value="Save IVIAOP config and Next " /></td>
			</tr>
		</table>

	</form:form>

</body>
</html>