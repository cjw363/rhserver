package cn.com.gzkit.entity.report;
/**
 * 巡视记录
 * @author Neilyo
 */
public class Patrol {
	private String id;
	private String workContent;
	private String planBeginDate;
	private String planEndDate;
	private String workSiteNames;
	private String workTeamOname;
	private String workMasterUname;
	private String workMemberUnames;
	private String workDeptOname;
    private int patrolClassify;
    private int workSmallType;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getWorkContent() {
		return workContent;
	}
	public void setWorkContent(String workContent) {
		this.workContent = workContent;
	}
	public String getPlanBeginDate() {
		return planBeginDate;
	}
	public void setPlanBeginDate(String planBeginDate) {
		this.planBeginDate = planBeginDate;
	}
	public String getPlanEndDate() {
		return planEndDate;
	}
	public void setPlanEndDate(String planEndDate) {
		this.planEndDate = planEndDate;
	}
	public String getWorkSiteNames() {
		return workSiteNames;
	}
	public void setWorkSiteNames(String workSiteNames) {
		this.workSiteNames = workSiteNames;
	}
	public String getWorkTeamOname() {
		return workTeamOname;
	}
	public void setWorkTeamOname(String workTeamOname) {
		this.workTeamOname = workTeamOname;
	}
	public String getWorkMasterUname() {
		return workMasterUname;
	}
	public void setWorkMasterUname(String workMasterUname) {
		this.workMasterUname = workMasterUname;
	}
	public String getWorkMemberUnames() {
		return workMemberUnames;
	}
	public void setWorkMemberUnames(String workMemberUnames) {
		this.workMemberUnames = workMemberUnames;
	}
	public String getWorkDeptOname() {
		return workDeptOname;
	}
	public void setWorkDeptOname(String workDeptOname) {
		this.workDeptOname = workDeptOname;
	}

    public int getPatrolClassify() {
        return patrolClassify;
    }

    public void setPatrolClassify(int patrolClassify) {
        this.patrolClassify = patrolClassify;
    }

    public int getWorkSmallType() {
        return workSmallType;
    }

    public void setWorkSmallType(int workSmallType) {
        this.workSmallType = workSmallType;
    }
}