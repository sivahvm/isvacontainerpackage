package com.ibm.ivia.config.model;

public class IviaopConf {

	private String iviaoppodlabel;
	private String iviaophostname;
	private String  iviaopinstance;
	private String iviaopRepUrl;
	private String iviaopV;
	
	
	private String dschostname;
	private String dsclabel;
	private String  dscinstance;
	private String dscRepUrl;
	private String dscV;
	public String getIviaoppodlabel() {
		return iviaoppodlabel;
	}
	public void setIviaoppodlabel(String iviaoppodlabel) {
		this.iviaoppodlabel = iviaoppodlabel;
	}
	public String getIviaophostname() {
		return iviaophostname;
	}
	public void setIviaophostname(String iviaophostname) {
		this.iviaophostname = iviaophostname;
	}
	public String getIviaopinstance() {
		return iviaopinstance;
	}
	public void setIviaopinstance(String iviaopinstance) {
		this.iviaopinstance = iviaopinstance;
	}
	public String getIviaopRepUrl() {
		return iviaopRepUrl;
	}
	public void setIviaopRepUrl(String iviaopRepUrl) {
		this.iviaopRepUrl = iviaopRepUrl;
	}
	public String getIviaopV() {
		return iviaopV;
	}
	public void setIviaopV(String iviaopV) {
		this.iviaopV = iviaopV;
	}
	public String getDschostname() {
		return dschostname;
	}
	public void setDschostname(String dschostname) {
		this.dschostname = dschostname;
	}
	public String getDsclabel() {
		return dsclabel;
	}
	public void setDsclabel(String dsclabel) {
		this.dsclabel = dsclabel;
	}
	public String getDscinstance() {
		return dscinstance;
	}
	public void setDscinstance(String dscinstance) {
		this.dscinstance = dscinstance;
	}
	public String getDscRepUrl() {
		return dscRepUrl;
	}
	public void setDscRepUrl(String dscRepUrl) {
		this.dscRepUrl = dscRepUrl;
	}
	public String getDscV() {
		return dscV;
	}
	public void setDscV(String dscV) {
		this.dscV = dscV;
	}
	@Override
	public String toString() {
		return "IviaopConf [iviaoppodlabel=" + iviaoppodlabel + ", iviaophostname=" + iviaophostname
				+ ", iviaopinstance=" + iviaopinstance + ", iviaopRepUrl=" + iviaopRepUrl + ", iviaopV=" + iviaopV
				+ ", dschostname=" + dschostname + ", dsclabel=" + dsclabel + ", dscinstance=" + dscinstance
				+ ", dscRepUrl=" + dscRepUrl + ", dscV=" + dscV + "]";
	}
	
}
