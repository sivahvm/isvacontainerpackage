<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
						<label style="color: #49be25"><b> Summary </b></label>
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
	
<br>
	<table id="button_top">
		<tr>
			<td id="tdidl"><i style="text-align: center; padding-left: 10px">
					<b><a class="linnk_button" href='<c:url value="/iviaop"/>'>Back</a>
				</b>
			</i></td>

			<td id="tdidl"><i style="text-align: center; padding-left: 10px">
					<b><a class="linnk_button" href='<c:url value="/getform"/>'>Home</a>
				</b>
			</i></td>

			<td id="tdidr"><i style="text-align: center; padding-left: 10px">
					<b><a class="linnk_button"
						href='<c:url value="/createConfig"/>'>Download</a> </b>
			</i></td>

			<td id="tdidr"><i style="text-align: center; padding-left: 10px">
					<b><a class="disable_button" href='<c:url value="#"/>'>Deploy&nbsp;Test</a>
				</b>
			</i></td>
		</tr>
	</table>
	<br>


	<table>
		<tr style="text-align: center">
			<td colspan="4"><b>IVIA Repo Configuration</b></td>
		</tr>

		<tr>
			<th>Pod Name</th>
			<th>host name</th>
			<th>Repo URL</th>
			<th>Tag Version</th>
		</tr>

		<tr>
			<td><c:out value="${sessionScope.genConf.iviaconfigpodlabel }" />
			</td>
			<td><c:out value="${sessionScope.genConf.lmihostname }" /></td>
			<td><c:out value="${sessionScope.genConf.iviaconfigRepUrl }" />
			</td>
			<td><c:out value="${sessionScope.genConf.iviaconfigV }" /></td>
		</tr>
		<tr>
			<td><c:out value="${sessionScope.ldapConf.ldappodlabel }" /></td>
			<td><c:out value="${sessionScope.ldapConf.ldaphost }" /></td>
			<td><c:out value="${sessionScope.ldapConf.iviaLdapRepUrl }" />
			</td>
			<td><c:out value="${sessionScope.ldapConf.ldapV }" /></td>
		</tr>
		<tr>
			<td><c:out value="${sessionScope.dbconf.dbpodlabel }" /></td>
			<td><c:out value="${sessionScope.dbconf.dbhostname }" /></td>
			<td><c:out value="${sessionScope.dbconf.postgresqlRepUrl }" />
			</td>
			<td><c:out value="${sessionScope.dbconf.dbV }" /></td>
		</tr>
		<tr>
			<td>Reverse Proxy</td>
			<td>Reverse Proxy</td>
			<td><c:out value="${sessionScope.rplconf.rpRepUrl }" /></td>
			<td><c:out value="${sessionScope.rplconf.rpV }" /></td>
		</tr>

		<tr>
			<td><c:out value="${sessionScope.iviaconf.iviaoppodlabel }" />
			</td>
			<td><c:out value="${sessionScope.iviaconf.iviaophostname }" />
			</td>
			<td><c:out value="${sessionScope.iviaconf.iviaopRepUrl }" /></td>
			<td><c:out value="${sessionScope.iviaconf.iviaopV }" /></td>
		</tr>

		<tr>
			<td><c:out value="${sessionScope.genConf.runtimehostname }" />
			</td>
			<td><c:out value="${sessionScope.genConf.runtimepodlabel }" />
			</td>
			<td><c:out value="${sessionScope.genConf.runtimeRepUrl }" /></td>
			<td><c:out value="${sessionScope.genConf.runtimeV }" /></td>
		</tr>

		<tr>
			<td><c:out value="${sessionScope.iviaconf.dschostname }" /></td>
			<td><c:out value="${sessionScope.iviaconf.dsclabel }" /></td>
			<td><c:out value="${sessionScope.iviaconf.dscRepUrl }" /></td>
			<td><c:out value="${sessionScope.iviaconf.dscV }" /></td>
		</tr>
	</table>

	<br>

	<table>
		<tr style="text-align: center">
			<td colspan="8" align="center"><b><c:out
						value="Persistent Volume and network Details" /></b></td>
		</tr>

		<tr>
			<th>Name :</th>
			<th>network</th>
			<th>Time Zone</th>
			<th>iviaconfig</th>
			<th>libldap</th>
			<th>libsecauthority</th>
			<th>ldapslapd</th>
			<th>pgdata</th>

		</tr>

		<tr>
			<td><c:out value="Value: " /></td>
			<td><c:out value="${sessionScope.genConf.networkname }" /></td>
			<td><c:out value="${sessionScope.genConf.timezone }" /></td>
			<td><c:out value="${sessionScope.genConf.iviaconfiglabel }" />
			</td>
			<td><c:out value="${sessionScope.ldapConf.libldaplabel }" /></td>
			<td><c:out
					value="${sessionScope.ldapConf.libsecauthoritylabel }" /></td>
			<td><c:out value="${sessionScope.ldapConf.ldapslapdlabel }" />
			</td>
			<td><c:out value="${sessionScope.dbconf.dblabel }" /></td>
		</tr>

	</table>
	<br>
	<table>
		<tr style="text-align: center">
			<td colspan="4" align="center"><b><c:out
						value="  LMI Configuration: ${sessionScope.genConf.lmihostname } " /></b></td>
		</tr>

		<tr>
			<th>IP Address</th>
			<th>Port Number</th>
			<th>User Name</th>
			<th>Password</th>
		</tr>

		<tr>
			<td><c:out value="${sessionScope.genConf.lmiIp }" /></td>
			<td><c:out value="${sessionScope.genConf.lmiport }" /></td>
			<td><c:out value="admin" /></td>
			<td><c:out value="${sessionScope.genConf.lmiadminpwd }" /></td>
		</tr>

	</table>
	<br>
	<table>
		<tr style="text-align: center">
			<td colspan="6" align="center"><b><c:out
						value=" LDAP Configuration :  ${sessionScope.ldapConf.ldappodlabel } " /></b></td>
		</tr>

		<tr>
			<th>Hostname</th>
			<th>port</th>
			<th>Domain Name</th>
			<th>Config User Password</th>
			<th>Admin User Password</th>


		</tr>

		<tr>
			<td><c:out value="${sessionScope.ldapConf.ldaphost }" /></td>
			<td><c:out value="${sessionScope.ldapConf.ldapport }" /></td>
			<td><c:out value="${sessionScope.ldapConf.ldapDomain }" /></td>
			<td><c:out value="******" /></td>
			<td><c:out value="******" /></td>

		</tr>

	</table>
	<br>
	<table>
		<tr style="text-align: center">
			<td colspan="4" align="center"><b><c:out
						value=" DB Configuration :  ${sessionScope.dbconf.dbhostname } " /></b></td>

		</tr>

		<tr>
			<th>Hostname</th>
			<th>DB Name</th>
			<th>Instance</th>
			<th>Port</th>

		</tr>

		<tr>
			<td><c:out value="${sessionScope.dbconf.dbhostname }" /></td>
			<td><c:out value="${sessionScope.dbconf.dbname }" /></td>
			<td><c:out value="${sessionScope.dbconf.dbuname }" /></td>
			<td><c:out value="******" /></td>

		</tr>

	</table>
	<br>
	<table>
		<tr style="text-align: center">
			<td colspan="5" align="center"><b><c:out
						value=" RP Configuration  :" /></b></td>

		</tr>

		<tr>
			<th>Web RP IP</th>
			<th>Pod Label</th>
			<th>HostName</th>
			<th>Port Num</th>
			<th>Instance Name</th>
		</tr>

		<c:forEach var="item" items="${sessionScope.rplconf.rpConf}"
			varStatus="status">
			<tr>
				<td><c:out value="${item.rpIp }" /></td>
				<td><c:out value="${item.rphostname }" /></td>
				<td><c:out value="${item.rppodlabel }" /></td>
				<td><c:out value="${item.rpport }" /></td>
				<td><c:out value="${item.rpInstanceName }" /></td>
			</tr>

		</c:forEach>
	</table>

	<table id="button_top">
		<tr style="text-align: center">
			<td id="tdidcenter" >
				<h2 text-align="center">
					<a href='<c:url value="/createConfig"/>' class="download-btn">
						<i class="fas fa-download download-icon"></i> Download
					</a>
				</h2>

			</td>
			<td id="tdidcenter">
					<a class="disable_button" href='<c:url value="#"/>'> <b> Deploy&nbsp;Test </b></a>
			</td>
		</tr>

	</table>


</body>
</html>

