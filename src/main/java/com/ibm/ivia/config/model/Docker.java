package com.ibm.ivia.config.model;

public class Docker {
 private EnvConfig envconfig;
 private RPConf rpConf;
 private LdapConf ldapConf;
 private DBConfig DBConf;
 
public EnvConfig getEnvconfig() {
	return envconfig;
}
public void setEnvconfig(EnvConfig envconfig) {
	this.envconfig = envconfig;
}
public RPConf getRpConf() {
	return rpConf;
}
public void setRpConf(RPConf rpConf) {
	this.rpConf = rpConf;
}
public LdapConf getLdapConf() {
	return ldapConf;
}
public void setLdapConf(LdapConf ldapConf) {
	this.ldapConf = ldapConf;
}
public DBConfig getDBConf() {
	return DBConf;
}
public void setDBConf(DBConfig dBConf) {
	DBConf = dBConf;
} 
}
