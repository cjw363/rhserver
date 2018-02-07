package cn.com.gzkit.entity.navi;

public class Station {
	private long id;
	private long placeMarkId;
	private double latitude;
	private double longitude;
	private long orderNum;
	private String pointName;
	private String pointId;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getPlaceMarkId() {
		return placeMarkId;
	}
	public void setPlaceMarkId(long placeMarkId) {
		this.placeMarkId = placeMarkId;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public long getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(long orderNum) {
		this.orderNum = orderNum;
	}
	public String getPointName() {
		return pointName;
	}
	public void setPointName(String pointName) {
		this.pointName = pointName;
	}
	public String getPointId() {
		return pointId;
	}
	public void setPointId(String pointId) {
		this.pointId = pointId;
	}
}