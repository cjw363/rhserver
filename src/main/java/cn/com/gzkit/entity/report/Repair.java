package cn.com.gzkit.entity.report;
/**
 * 检修记录
 * @author Neilyo
 */
public class Repair {
	private String examId;
    private String stationName;
    private String deviceName;
    private String pwLevel;
    private String examType;
    private String examContent;
    private String testDate;

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getPwLevel() {
        return pwLevel;
    }

    public void setPwLevel(String pwLevel) {
        this.pwLevel = pwLevel;
    }

    public String getExamType() {
        return examType;
    }

    public void setExamType(String examType) {
        this.examType = examType;
    }

    public String getTestDate() {
        return testDate;
    }

    public void setTestDate(String testDate) {
        this.testDate = testDate;
    }

    public String getExamContent() {
        return examContent;
    }

    public void setExamContent(String examContent) {
        this.examContent = examContent;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }
}