package com.myshop.dto;

public class CustomerDTO {
	private String custId;
	private String custName;
	private String custHp;
	private String custAddr;
	private String custRdate;
	
	
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustHp() {
		return custHp;
	}
	public void setCustHp(String custHp) {
		this.custHp = custHp;
	}
	public String getCustAddr() {
		return custAddr;
	}
	public void setCustAddr(String custAddr) {
		this.custAddr = custAddr;
	}
	public String getCustRdate() {
		return custRdate;
	}
	public void setCustRdate(String custRdate) {
		this.custRdate = custRdate;
	}
	
	@Override
	public String toString() {
		return "CustomerDTO [custId=" + custId + ", custName=" + custName + ", custHp=" + custHp + ", custAddr="
				+ custAddr + ", custRdate=" + custRdate + "]";
	}
	
}
