package com.ibm.ivia.config.model;

public class RPConf {

	private String rpIp;
	private String rphostname;
	private String  rppodlabel;
	private String rpport;
	private String rpInstanceName;
	private String rpRepUrl;
	private String rpV;
	public String getRpIp() {
		return rpIp;
	}
	public void setRpIp(String rpIp) {
		this.rpIp = rpIp;
	}
	public String getRphostname() {
		return rphostname;
	}
	public void setRphostname(String rphostname) {
		this.rphostname = rphostname;
	}
	public String getRppodlabel() {
		return rppodlabel;
	}
	public void setRppodlabel(String rppodlabel) {
		this.rppodlabel = rppodlabel;
	}
	public String getRpport() {
		return rpport;
	}
	public void setRpport(String rpport) {
		this.rpport = rpport;
	}
	public String getRpInstanceName() {
		return rpInstanceName;
	}
	public void setRpInstanceName(String rpInstanceName) {
		this.rpInstanceName = rpInstanceName;
	}
	public String getRpRepUrl() {
		return rpRepUrl;
	}
	public void setRpRepUrl(String rpRepUrl) {
		this.rpRepUrl = rpRepUrl;
	}
	public String getRpV() {
		return rpV;
	}
	public void setRpV(String rpV) {
		this.rpV = rpV;
	}
	@Override
	public String toString() {
		return "RPConf [rpIp=" + rpIp + ", rphostname=" + rphostname + ", rppodlabel=" + rppodlabel + ", rpport="
				+ rpport + ", rpInstanceName=" + rpInstanceName + ", rpRepUrl=" + rpRepUrl + ", rpV=" + rpV + "]";
	}
	
	
}
