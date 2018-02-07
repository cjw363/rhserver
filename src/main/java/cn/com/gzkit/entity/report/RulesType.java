package cn.com.gzkit.entity.report;

import java.util.ArrayList;
import java.util.List;

/**
 * 规则类型
 * @author yangzijia
 */
public class RulesType {
	private Integer rulesId;
	private Integer parentId;
	private String typeName;
	private Integer orderNo;
	private List<RulesType> children = new ArrayList<RulesType>();
	public Integer getRulesId() {				
		return rulesId;
	}
	public void setRulesId(Integer rulesId) {
		this.rulesId = rulesId;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public Integer getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}
	public List<RulesType> getChildren() {
		return children;
	}
	public void setChildren(List<RulesType> children) {
		this.children = children;
	}
	
}
