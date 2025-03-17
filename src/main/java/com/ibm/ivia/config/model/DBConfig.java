package com.ibm.ivia.config.model;

public class DBConfig {

	private String dblabel;
	private String dbhostname;
	private String dbpodlabel;
	private String dbname;
	private String dbuname;
	private String dbpwd;
	private String postgresqlRepUrl;
	private String dbV;
	
	public String getDblabel() {
		return dblabel;
	}
	public void setDblabel(String dblabel) {
		this.dblabel = dblabel;
	}
	public String getDbhostname() {
		return dbhostname;
	}
	public void setDbhostname(String dbhostname) {
		this.dbhostname = dbhostname;
	}
	public String getDbpodlabel() {
		return dbpodlabel;
	}
	public void setDbpodlabel(String dbpodlabel) {
		this.dbpodlabel = dbpodlabel;
	}
	public String getDbname() {
		return dbname;
	}
	public void setDbname(String dbname) {
		this.dbname = dbname;
	}
	public String getDbpwd() {
		return dbpwd;
	}
	public void setDbpwd(String dbpwd) {
		this.dbpwd = dbpwd;
	}
	public String getPostgresqlRepUrl() {
		return postgresqlRepUrl;
	}
	public void setPostgresqlRepUrl(String postgresqlRepUrl) {
		this.postgresqlRepUrl = postgresqlRepUrl;
	}
	public String getDbV() {
		return dbV;
	}
	public void setDbV(String dbV) {
		this.dbV = dbV;
	}
	public String getDbuname() {
		return dbuname;
	}
	public void setDbuname(String dbuname) {
		this.dbuname = dbuname;
	}
	@Override
	public String toString() {
		return "DBConfig [dblabel=" + dblabel + ", dbhostname=" + dbhostname + ", dbpodlabel=" + dbpodlabel
				+ ", dbname=" + dbname + ", dbuname=" + dbuname + ", dbpwd=" + dbpwd + ", postgresqlRepUrl="
				+ postgresqlRepUrl + ", dbV=" + dbV + "]";
	}

	
}
