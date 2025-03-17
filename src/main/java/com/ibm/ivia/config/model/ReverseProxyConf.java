package com.ibm.ivia.config.model;

import java.util.List;

public class ReverseProxyConf {

	private List<RPConf> rpConf;
	private String rpRepUrl;
	private String rpV;
	private String deleteRp;
	
	public String getDeleteRp() {
		return deleteRp;
	}
	public void setDeleteRp(String deleteRp) {
		this.deleteRp = deleteRp;
	}
	public List<RPConf> getRpConf() {
		return rpConf;
	}
	public void setRpConf(List<RPConf> rpConf) {
		this.rpConf = rpConf;
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
	
	
}
