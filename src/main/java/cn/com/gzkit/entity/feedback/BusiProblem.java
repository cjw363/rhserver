package cn.com.gzkit.entity.feedback;

public class BusiProblem {

	public String id;
	
	public String userId;
	
	public String userName;
	
	public String submitDate;
	
	public String busiProblemDesc;
	
	public String dateStamp;//时间戳
	
	public String filePath;//文件完整路径
	
	public String station;
	
	public String fileSize;
	
	public String uploadType;//上传的类型
	
	public String pointId;
	
	public String avatar;//用户的头像地址
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getPointId() {
		return pointId;
	}

	public void setPointId(String pointId) {
		this.pointId = pointId;
	}


	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getSubmitDate() {
		return submitDate;
	}

	public void setSubmitDate(String submitDate) {
		this.submitDate = submitDate;
	}

	public String getDateStamp() {
		return dateStamp;
	}

	public void setDateStamp(String dateStamp) {
		this.dateStamp = dateStamp;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getStation() {
		return station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	public String getFileSize() {
		return fileSize;
	}

	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}

	public String getBusiProblemDesc() {
		return busiProblemDesc;
	}

	public void setBusiProblemDesc(String busiProblemDesc) {
		this.busiProblemDesc = busiProblemDesc;
	}

	public String getUploadType() {
		return uploadType;
	}

	public void setUploadType(String uploadType) {
		this.uploadType = uploadType;
	}
	
	
}
