package cn.com.gzkit.entity.report;

/**
 * 试验记录
 * @author Neilyo
 */
public class Test {
	private long id;
	private String stName;
	private String dataTitle;
	private String dataTime;
	private String dataTypeCode;
	private String dataRid;
	private String dataUrl;
    private int typeStatus;
    private String typeShortName;
    private String dataTypeName;
    private String mobjectTypeName;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public String getDataTitle() {
		return dataTitle;
	}
	public void setDataTitle(String dataTitle) {
		this.dataTitle = dataTitle;
	}
	public String getDataTime() {
		return dataTime;
	}
	public void setDataTime(String dataTime) {
		this.dataTime = dataTime;
	}
	public String getDataTypeCode() {
		return dataTypeCode;
	}
	public void setDataTypeCode(String dataTypeCode) {
		this.dataTypeCode = dataTypeCode;
	}
	public String getDataRid() {
		return dataRid;
	}
	public void setDataRid(String dataRid) {
		this.dataRid = dataRid;
	}
	public String getDataUrl() {
		return dataUrl;
	}
	public void setDataUrl(String dataUrl) {
		this.dataUrl = dataUrl;
	}

    public int getTypeStatus() {
        return typeStatus;
    }

    public void setTypeStatus(int typeStatus) {
        this.typeStatus = typeStatus;
    }

    public String getTypeShortName() {
        return typeShortName;
    }

    public void setTypeShortName(String typeShortName) {
        this.typeShortName = typeShortName;
    }

    public String getDataTypeName() {
        return dataTypeName;
    }

    public void setDataTypeName(String dataTypeName) {
        this.dataTypeName = dataTypeName;
    }

    public String getMobjectTypeName() {
        return mobjectTypeName;
    }

    public void setMobjectTypeName(String mobjectTypeName) {
        this.mobjectTypeName = mobjectTypeName;
    }
}