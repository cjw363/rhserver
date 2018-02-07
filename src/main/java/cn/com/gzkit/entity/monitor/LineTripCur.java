package cn.com.gzkit.entity.monitor;

/**
 * @author 老毕
 * @version 1.0
 * @since 2017/5/26 0026
 */
public class LineTripCur {
    private long tripId;
    private String devKey;
    private String dataTime;
    private String stName;
    private String content;
    private String action;
    private long smsStatus;
    private long status;
    private String smsMsg;
    private String history;
    private String thunder;
    private String vol;
    private String lineName;
    private String proinfo;
    private String position;

    public long getTripId() {
        return tripId;
    }

    public void setTripId(long tripId) {
        this.tripId = tripId;
    }

    public String getDevKey() {
        return devKey;
    }

    public void setDevKey(String devKey) {
        this.devKey = devKey;
    }

    public String getDataTime() {
        return dataTime;
    }

    public void setDataTime(String dataTime) {
        this.dataTime = dataTime;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public long getSmsStatus() {
        return smsStatus;
    }

    public void setSmsStatus(long smsStatus) {
        this.smsStatus = smsStatus;
    }

    public long getStatus() {
        return status;
    }

    public void setStatus(long status) {
        this.status = status;
    }

    public String getSmsMsg() {
        return smsMsg;
    }

    public void setSmsMsg(String smsMsg) {
        this.smsMsg = smsMsg;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getThunder() {
        return thunder;
    }

    public void setThunder(String thunder) {
        this.thunder = thunder;
    }

    public String getVol() {
        return vol;
    }

    public void setVol(String vol) {
        this.vol = vol;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public String getProinfo() {
        return proinfo;
    }

    public void setProinfo(String proinfo) {
        this.proinfo = proinfo;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
