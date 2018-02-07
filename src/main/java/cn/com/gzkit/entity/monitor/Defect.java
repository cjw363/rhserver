package cn.com.gzkit.entity.monitor;

/**
 * @author 老毕
 * @version 1.0
 * @since 2017/6/6 0006
 */
public class Defect {
    private long defectId;
    private long mobjectId;
    private String mobjectName;
    private String defectDescr;
    private String findTime;
    private String finder;
    private String defectDamageLevel;
    private String defectType;
    private String legacy;
    private String preventiveMeasures;
    private String dealTime;
    private int isDealedInTime;
    private String state;
    private String resultState;
    private String processingOpinion;
    private String remark;
    private String sourceSystem;

    public long getDefectId() {
        return defectId;
    }

    public void setDefectId(long defectId) {
        this.defectId = defectId;
    }

    public long getMobjectId() {
        return mobjectId;
    }

    public void setMobjectId(long mobjectId) {
        this.mobjectId = mobjectId;
    }

    public String getMobjectName() {
        return mobjectName;
    }

    public void setMobjectName(String mobjectName) {
        this.mobjectName = mobjectName;
    }

    public String getDefectDescr() {
        return defectDescr;
    }

    public void setDefectDescr(String defectDescr) {
        this.defectDescr = defectDescr;
    }

    public String getFindTime() {
        return findTime;
    }

    public void setFindTime(String findTime) {
        this.findTime = findTime;
    }

    public String getFinder() {
        return finder;
    }

    public void setFinder(String finder) {
        this.finder = finder;
    }

    public String getDefectDamageLevel() {
        return defectDamageLevel;
    }

    public void setDefectDamageLevel(String defectDamageLevel) {
        this.defectDamageLevel = defectDamageLevel;
    }

    public String getDefectType() {
        return defectType;
    }

    public void setDefectType(String defectType) {
        this.defectType = defectType;
    }

    public String getLegacy() {
        return legacy;
    }

    public void setLegacy(String legacy) {
        this.legacy = legacy;
    }

    public String getPreventiveMeasures() {
        return preventiveMeasures;
    }

    public void setPreventiveMeasures(String preventiveMeasures) {
        this.preventiveMeasures = preventiveMeasures;
    }

    public String getDealTime() {
        return dealTime;
    }

    public void setDealTime(String dealTime) {
        this.dealTime = dealTime;
    }

    public int getIsDealedInTime() {
        return isDealedInTime;
    }

    public void setIsDealedInTime(int isDealedInTime) {
        this.isDealedInTime = isDealedInTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getResultState() {
		return resultState;
	}

	public void setResultState(String resultState) {
		this.resultState = resultState;
	}

	public String getProcessingOpinion() {
        return processingOpinion;
    }

    public void setProcessingOpinion(String processingOpinion) {
        this.processingOpinion = processingOpinion;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSourceSystem() {
        return sourceSystem;
    }

    public void setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
    }
}