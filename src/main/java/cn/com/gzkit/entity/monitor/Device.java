package cn.com.gzkit.entity.monitor;

public class Device {
	private long mobjectid;
	private long mobjectTypeId;
	private String mobjectTypeName;
	private long pwLevel;
	private long stId;
	private String stName;
	private String statusLevel;
	private String riskLevel;
	private String operationLevel;
	private String simpleName;
	private long reportid;
	public long getMobjectid() {
		return mobjectid;
	}
	public void setMobjectid(long mobjectid) {
		this.mobjectid = mobjectid;
	}
	public long getMobjectTypeId() {
		return mobjectTypeId;
	}
	public void setMobjectTypeId(long mobjectTypeId) {
		this.mobjectTypeId = mobjectTypeId;
	}
	public String getMobjectTypeName() {
		return mobjectTypeName;
	}
	public void setMobjectTypeName(String mobjectTypeName) {
		this.mobjectTypeName = mobjectTypeName;
	}
	public long getPwLevel() {
		return pwLevel;
	}
	public void setPwLevel(long pwLevel) {
		this.pwLevel = pwLevel;
	}
	public long getStId() {
		return stId;
	}
	public void setStId(long stId) {
		this.stId = stId;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public String getStatusLevel() {
		return statusLevel;
	}
	public void setStatusLevel(String statusLevel) {
		this.statusLevel = statusLevel;
	}
	public String getRiskLevel() {
		return riskLevel;
	}
	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}
	public String getOperationLevel() {
		return operationLevel;
	}
	public void setOperationLevel(String operationLevel) {
		this.operationLevel = operationLevel;
	}
	public String getSimpleName() {
		return simpleName;
	}
	public void setSimpleName(String simpleName) {
		this.simpleName = simpleName;
	}
	public long getReportid() {
		return reportid;
	}
	public void setReportid(long reportid) {
		this.reportid = reportid;
	}
}