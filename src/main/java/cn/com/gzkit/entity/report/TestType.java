package cn.com.gzkit.entity.report;

/**
 * @author 老毕
 * @version 1.0
 * @since 2017/6/12 0012
 */
public class TestType {
    private long id;
    private long parentid;
    private String typeName;
    private String typeCode;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getParentid() {
        return parentid;
    }

    public void setParentid(long parentid) {
        this.parentid = parentid;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }
}