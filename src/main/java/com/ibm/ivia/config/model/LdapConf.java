package com.ibm.ivia.config.model;

public class LdapConf {
	private String ldaplabel;
	private String ldappodlabel;
	private String ldaphost;	
	private String ldapDomain;
	private String ldapconfpwd;
	private String ldapadminpwd;
	private String ldapport;
	private String libldaplabel;
	private String libsecauthoritylabel;
	private String ldapslapdlabel;
	private String iviaLdapRepUrl;
	private String ldapV;
	
	private String minlen;
	private String maxlen;
	private String lockduration;
	
	public String getLdaplabel() {
		return ldaplabel;
	}
	public void setLdaplabel(String ldaplabel) {
		this.ldaplabel = ldaplabel;
	}
	public String getLdapDomain() {
		return ldapDomain;
	}
	public void setLdapDomain(String ldapDomain) {
		this.ldapDomain = ldapDomain;
	}
	public String getLdapconfpwd() {
		return ldapconfpwd;
	}
	public void setLdapconfpwd(String ldapconfpwd) {
		this.ldapconfpwd = ldapconfpwd;
	}
	public String getLdapadminpwd() {
		return ldapadminpwd;
	}
	public void setLdapadminpwd(String ldapadminpwd) {
		this.ldapadminpwd = ldapadminpwd;
	}
	public String getLdapport() {
		return ldapport;
	}
	public void setLdapport(String ldapport) {
		this.ldapport = ldapport;
	}
	public String getLibldaplabel() {
		return libldaplabel;
	}
	public void setLibldaplabel(String libldaplabel) {
		this.libldaplabel = libldaplabel;
	}
	public String getLibsecauthoritylabel() {
		return libsecauthoritylabel;
	}
	public void setLibsecauthoritylabel(String libsecauthoritylabel) {
		this.libsecauthoritylabel = libsecauthoritylabel;
	}
	public String getLdapslapdlabel() {
		return ldapslapdlabel;
	}
	public void setLdapslapdlabel(String ldapslapdlabel) {
		this.ldapslapdlabel = ldapslapdlabel;
	}
	public String getIviaLdapRepUrl() {
		return iviaLdapRepUrl;
	}
	public void setIviaLdapRepUrl(String iviaLdapRepUrl) {
		this.iviaLdapRepUrl = iviaLdapRepUrl;
	}
	public String getLdapV() {
		return ldapV;
	}
	public void setLdapV(String ldapV) {
		this.ldapV = ldapV;
	}
	public String getLdaphost() {
		return ldaphost;
	}
	public void setLdaphost(String ldaphost) {
		this.ldaphost = ldaphost;
	}
	
	
	public String getLdappodlabel() {
		return ldappodlabel;
	}
	public void setLdappodlabel(String ldappodlabel) {
		this.ldappodlabel = ldappodlabel;
	}
	
	
	public String getMinlen() {
		return minlen;
	}
	public void setMinlen(String minlen) {
		this.minlen = minlen;
	}
	public String getMaxlen() {
		return maxlen;
	}
	public void setMaxlen(String maxlen) {
		this.maxlen = maxlen;
	}
	public String getLockduration() {
		return lockduration;
	}
	public void setLockduration(String lockduration) {
		this.lockduration = lockduration;
	}
	@Override
	public String toString() {
		return "LdapConf [ldaplabel=" + ldaplabel + ", ldappodlabel=" + ldappodlabel + ", ldaphost=" + ldaphost
				+ ", ldapDomain=" + ldapDomain + ", ldapconfpwd=" + ldapconfpwd + ", ldapadminpwd=" + ldapadminpwd
				+ ", ldapport=" + ldapport + ", libldaplabel=" + libldaplabel + ", libsecauthoritylabel="
				+ libsecauthoritylabel + ", ldapslapdlabel=" + ldapslapdlabel + ", iviaLdapRepUrl=" + iviaLdapRepUrl
				+ ", ldapV=" + ldapV + "]";
	}
	
	
	
}
