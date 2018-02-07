package cn.com.gzkit.entity.navi;

/**
 * Created by Administrator on 2017/7/7.
 */
public class LoadTemp {
    private String station;
    private String objectName;
    private String load;//负载率
    private String oilTemp;//顶层油温
    private String windinTemp;//绕组温度
    private String vAvgT;//环境温度
    private String overcountDay;//日油温越限次数
    private String overcountAll;//历史油温越限次数
    private String objectId;
    private String dataTime;
    private String pwLevel;
    private String featureValue;//额定容量

    private String loadMax;//日最大负载率%
    private String loadMin;//日最小负载率%
    private String load95pct;

    public String getLoadMax() {
        return loadMax;
    }

    public void setLoadMax(String loadMax) {
        this.loadMax = loadMax;
    }

    public String getLoadMin() {
        return loadMin;
    }

    public void setLoadMin(String loadMin) {
        this.loadMin = loadMin;
    }

    public String getLoad95pct() {
        return load95pct;
    }

    public void setLoad95pct(String load95pct) {
        this.load95pct = load95pct;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public String getLoad() {
        return load;
    }

    public void setLoad(String load) {
        this.load = load;
    }

    public String getOilTemp() {
        return oilTemp;
    }

    public void setOilTemp(String oilTemp) {
        this.oilTemp = oilTemp;
    }

    public String getWindinTemp() {
        return windinTemp;
    }

    public void setWindinTemp(String windinTemp) {
        this.windinTemp = windinTemp;
    }

    public String getvAvgT() {
        return vAvgT;
    }

    public void setvAvgT(String vAvgT) {
        this.vAvgT = vAvgT;
    }

    public String getOvercountDay() {
        return overcountDay;
    }

    public void setOvercountDay(String overcountDay) {
        this.overcountDay = overcountDay;
    }

    public String getOvercountAll() {
        return overcountAll;
    }

    public void setOvercountAll(String overcountAll) {
        this.overcountAll = overcountAll;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getDataTime() {
        return dataTime;
    }

    public void setDataTime(String dataTime) {
        this.dataTime = dataTime;
    }

    public String getPwLevel() {
        return pwLevel;
    }

    public void setPwLevel(String pwLevel) {
        this.pwLevel = pwLevel;
    }

    public String getFeatureValue() {
        return featureValue;
    }

    public void setFeatureValue(String featureValue) {
        this.featureValue = featureValue;
    }
}
