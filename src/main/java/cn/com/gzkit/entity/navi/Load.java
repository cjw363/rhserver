package cn.com.gzkit.entity.navi;

public class Load {

    private String id;
    private String placeMarkId;
    private String altitude;
    private String longitude;
    private String latitude;
    private String orderNum;
    private String pointName;
    private String stationName;
    private String pName;
    private String mTime;
    private String loadAvg;
    private String objectName;//设备名称
    private String max;//日最大有功功率
    private String min;//日最小有功功率P
    private String avg;//日平均有功功率P
    private String loadMax;//日最大负载率%
    private String loadMin;//日最小负载率%
    private String featureValue;//额定容量
    private String loadSurplus;//日剩余负载率%
    private String loadLeast;//日峰谷负载率%
    private String tAvg;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlaceMarkId() {
        return placeMarkId;
    }

    public void setPlaceMarkId(String placeMarkId) {
        this.placeMarkId = placeMarkId;
    }

    public String getAltitude() {
        return altitude;
    }

    public void setAltitude(String altitude) {
        this.altitude = altitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getPointName() {
        return pointName;
    }

    public void setPointName(String pointName) {
        this.pointName = pointName;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getmTime() {
        return mTime;
    }

    public void setmTime(String mTime) {
        this.mTime = mTime;
    }

    public String getLoadAvg() {
        return loadAvg;
    }

    public void setLoadAvg(String loadAvg) {
        this.loadAvg = loadAvg;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public String getAvg() {
        return avg;
    }

    public void setAvg(String avg) {
        this.avg = avg;
    }

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

    public String getFeatureValue() {
        return featureValue;
    }

    public void setFeatureValue(String featureValue) {
        this.featureValue = featureValue;
    }

    public String getLoadSurplus() {
        return loadSurplus;
    }

    public void setLoadSurplus(String loadSurplus) {
        this.loadSurplus = loadSurplus;
    }

    public String getLoadLeast() {
        return loadLeast;
    }

    public void setLoadLeast(String loadLeast) {
        this.loadLeast = loadLeast;
    }

    public String gettAvg() {
        return tAvg;
    }

    public void settAvg(String tAvg) {
        this.tAvg = tAvg;
    }
}
