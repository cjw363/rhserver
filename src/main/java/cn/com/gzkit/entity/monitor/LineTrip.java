package cn.com.gzkit.entity.monitor;

/**
 * @author 老毕
 * @version 1.0
 * @since 2017/5/25 0025
 */
public class LineTrip {
    private long id;
    private String accidentTitle;
    private String tripTime;
    private String pwLevel;
    private String faultLevel;
    private String lineName;
    private String towerName;
    private String relayAction;
    private String checkLine;
    private String treatment;
    private String reclosing;
    private String compulsoryPowerSupply;
    private String faultSpecificReasons;
    private String faultCategory;
    private String relayLocation;
    private String precisePositioning;
    private String lightningLocationSystem;
    private String practicalFaultLocation;
    private String faultPhase;
    private String remark;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAccidentTitle() {
        return accidentTitle;
    }

    public void setAccidentTitle(String accidentTitle) {
        this.accidentTitle = accidentTitle;
    }

    public String getTripTime() {
        return tripTime;
    }

    public void setTripTime(String tripTime) {
        this.tripTime = tripTime;
    }

    public String getPwLevel() {
        return pwLevel;
    }

    public void setPwLevel(String pwLevel) {
        this.pwLevel = pwLevel;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public String getFaultCategory() {
        return faultCategory;
    }

    public void setFaultCategory(String faultCategory) {
        this.faultCategory = faultCategory;
    }

    public String getFaultLevel() {
        return faultLevel;
    }

    public void setFaultLevel(String faultLevel) {
        this.faultLevel = faultLevel;
    }

    public String getTowerName() {
        return towerName;
    }

    public void setTowerName(String towerName) {
        this.towerName = towerName;
    }

    public String getRelayAction() {
        return relayAction;
    }

    public void setRelayAction(String relayAction) {
        this.relayAction = relayAction;
    }

    public String getCheckLine() {
        return checkLine;
    }

    public void setCheckLine(String checkLine) {
        this.checkLine = checkLine;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getReclosing() {
		return reclosing;
	}

	public void setReclosing(String reclosing) {
		this.reclosing = reclosing;
	}

	public String getCompulsoryPowerSupply() {
        return compulsoryPowerSupply;
    }

    public void setCompulsoryPowerSupply(String compulsoryPowerSupply) {
        this.compulsoryPowerSupply = compulsoryPowerSupply;
    }

    public String getFaultSpecificReasons() {
        return faultSpecificReasons;
    }

    public void setFaultSpecificReasons(String faultSpecificReasons) {
        this.faultSpecificReasons = faultSpecificReasons;
    }

    public String getRelayLocation() {
        return relayLocation;
    }

    public void setRelayLocation(String relayLocation) {
        this.relayLocation = relayLocation;
    }

    public String getPrecisePositioning() {
        return precisePositioning;
    }

    public void setPrecisePositioning(String precisePositioning) {
        this.precisePositioning = precisePositioning;
    }

    public String getLightningLocationSystem() {
        return lightningLocationSystem;
    }

    public void setLightningLocationSystem(String lightningLocationSystem) {
        this.lightningLocationSystem = lightningLocationSystem;
    }

    public String getPracticalFaultLocation() {
        return practicalFaultLocation;
    }

    public void setPracticalFaultLocation(String practicalFaultLocation) {
        this.practicalFaultLocation = practicalFaultLocation;
    }

    public String getFaultPhase() {
		return faultPhase;
	}

	public void setFaultPhase(String faultPhase) {
		this.faultPhase = faultPhase;
	}

	public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}