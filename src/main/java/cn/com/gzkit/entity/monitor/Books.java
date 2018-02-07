package cn.com.gzkit.entity.monitor;

/**
 * @author 老毕
 * @version 1.0
 * @since 2017/6/8 0008
 */
public class Books {
    private long id;
    private String name;
    private String mobilePhoneNo;
    private String deptName;
    private String post;
    private String profession;
    private boolean defaultSmser;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobilePhoneNo() {
        return mobilePhoneNo;
    }

    public void setMobilePhoneNo(String mobilePhoneNo) {
        this.mobilePhoneNo = mobilePhoneNo;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public boolean isDefaultSmser() {
        return defaultSmser;
    }

    public void setDefaultSmser(boolean defaultSmser) {
        this.defaultSmser = defaultSmser;
    }
}