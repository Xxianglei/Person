package com.xianglei.crm.pojo;

public class QueryVo {
	private String cust_name;
	private String cust_source;
	private String cust_industry;
	private String cust_level;

	// 当前页码数
	private Integer page = 1;
	public String getCustName() {
		return cust_name;
	}
	public void setCustName(String custName) {
		this.cust_name = custName;
	}
	public String getCustSource() {
		return cust_source;
	}
	public void setCustSource(String custSource) {
		this.cust_source = custSource;
	}
	public String getCustIndustry() {
		return cust_industry;
	}
	public void setCustIndustry(String custIndustry) {
		this.cust_industry = custIndustry;
	}
	public String getCustLevel() {
		return cust_level;
	}
	public void setCustLevel(String custLevel) {
		this.cust_level = custLevel;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getStart() {
		return start;
	}
	public void setStart(Integer start) {
		this.start = start;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	// 数据库从哪一条数据开始查
	private Integer start;
	// 每页显示数据条数
	private Integer rows = 10;
}
