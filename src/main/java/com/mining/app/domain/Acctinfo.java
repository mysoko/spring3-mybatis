package com.mining.app.domain;

import java.io.Serializable;
/**
 * 接受充值的账号
 * @author of546
 *
 */
public class Acctinfo implements Serializable {
	private static final long serialVersionUID = 1283588128602669140L;
	
	private int id;
	private String acctNo;
	private String operators;
	private int totalAmount;
	
	public int getId() {
		return id;
	}
	public String getAcctNo() {
		return acctNo;
	}
	public String getOperators() {
		return operators;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}
	public void setOperators(String operators) {
		this.operators = operators;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Acctinfo [id=").append(id).append(", acctNo=")
				.append(acctNo).append(", operators=").append(operators)
				.append(", totalAmount=").append(totalAmount).append("]");
		return builder.toString();
	}

}
