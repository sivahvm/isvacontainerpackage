/*
    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Lesser General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Lesser General Public License for more details.

    You should have received a copy of the GNU Lesser General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.

    Copyright 2013 eewiki.net
 */
package com.ibm.ivia.config.model;


public class EnvConfig {
	private String containerType;
	private String iviaconfiglabel;
	private String iviaconfigpodlabel;
	private String networkname;
	private String timezone;
	private String lmiIp;
	private String lmihostname;
	private String lmiport;
	private String lmiadminpwd;
	private String iviaconfigRepUrl;
	private String iviaconfigV;
	
	private String runtimehostname;
	private String runtimepodlabel;
	private String runtimeRepUrl;
	private String runtimeV;
	public String getContainerType() {
		return containerType;
	}
	public void setContainerType(String containerType) {
		this.containerType = containerType;
	}
	public String getIviaconfiglabel() {
		return iviaconfiglabel;
	}
	public void setIviaconfiglabel(String iviaconfiglabel) {
		this.iviaconfiglabel = iviaconfiglabel;
	}
	public String getIviaconfigpodlabel() {
		return iviaconfigpodlabel;
	}
	public void setIviaconfigpodlabel(String iviaconfigpodlabel) {
		this.iviaconfigpodlabel = iviaconfigpodlabel;
	}
	public String getNetworkname() {
		return networkname;
	}
	public void setNetworkname(String networkname) {
		this.networkname = networkname;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public String getLmiIp() {
		return lmiIp;
	}
	public void setLmiIp(String lmiIp) {
		this.lmiIp = lmiIp;
	}
	public String getLmihostname() {
		return lmihostname;
	}
	public void setLmihostname(String lmihostname) {
		this.lmihostname = lmihostname;
	}
	public String getLmiport() {
		return lmiport;
	}
	public void setLmiport(String lmiport) {
		this.lmiport = lmiport;
	}
	public String getLmiadminpwd() {
		return lmiadminpwd;
	}
	public void setLmiadminpwd(String lmiadminpwd) {
		this.lmiadminpwd = lmiadminpwd;
	}
	public String getIviaconfigRepUrl() {
		return iviaconfigRepUrl;
	}
	public void setIviaconfigRepUrl(String iviaconfigRepUrl) {
		this.iviaconfigRepUrl = iviaconfigRepUrl;
	}
	public String getIviaconfigV() {
		return iviaconfigV;
	}
	public void setIviaconfigV(String iviaconfigV) {
		this.iviaconfigV = iviaconfigV;
	}
	public String getRuntimehostname() {
		return runtimehostname;
	}
	public void setRuntimehostname(String runtimehostname) {
		this.runtimehostname = runtimehostname;
	}
	public String getRuntimepodlabel() {
		return runtimepodlabel;
	}
	public void setRuntimepodlabel(String runtimepodlabel) {
		this.runtimepodlabel = runtimepodlabel;
	}
	public String getRuntimeRepUrl() {
		return runtimeRepUrl;
	}
	public void setRuntimeRepUrl(String runtimeRepUrl) {
		this.runtimeRepUrl = runtimeRepUrl;
	}
	public String getRuntimeV() {
		return runtimeV;
	}
	public void setRuntimeV(String runtimeV) {
		this.runtimeV = runtimeV;
	}
	@Override
	public String toString() {
		return "EnvConfig [containerType=" + containerType + ", iviaconfiglabel=" + iviaconfiglabel
				+ ", iviaconfigpodlabel=" + iviaconfigpodlabel + ", networkname=" + networkname + ", timezone="
				+ timezone + ", lmiIp=" + lmiIp + ", lmihostname=" + lmihostname + ", lmiport=" + lmiport
				+ ", lmiadminpwd=" + lmiadminpwd + ", iviaconfigRepUrl=" + iviaconfigRepUrl + ", iviaconfigV="
				+ iviaconfigV + ", runtimehostname=" + runtimehostname + ", runtimepodlabel=" + runtimepodlabel
				+ ", runtimeRepUrl=" + runtimeRepUrl + ", runtimeV=" + runtimeV + "]";
	}
	
	
}
