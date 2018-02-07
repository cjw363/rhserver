package cn.com.gzkit.entity.monitor;

public class Warning {
	private long id;
	private String sendTime;
	private String messageContent;
    private int evenType;
	private int status;
	private String sendUser;
	private String receiver;
    private int count;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSendTime() {
		return sendTime;
	}
	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}
	public String getMessageContent() {
		return messageContent;
	}
	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}
    public int getEvenType() {
        return evenType;
    }
    public void setEvenType(int evenType) {
        this.evenType = evenType;
    }
    public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getSendUser() {
		return sendUser;
	}
	public void setSendUser(String sendUser) {
		this.sendUser = sendUser;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}