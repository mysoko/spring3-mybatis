package com.mining.app.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 值卡充值信息
 * @author of546
 *
 */
public class Cardinfo implements Serializable {
	private static final long serialVersionUID = 4935188789367583590L;
	
	public long id;
	public String cardNo;
	public String cardPass;
	public String cardParvalue;
	public String operators;
	public String acctNo;
	public String acctNoHis;
	public int state;
	public int stateHis;
	public String statemsg;
	public String statemsgHis;
	public Date usetime;
	public Date usetimeHis;
	public String supnameInner;
	public String supnameOuter;
	public String supcodeOute;
	
	public long getId() {
		return id;
	}
	public String getCardNo() {
		return cardNo;
	}
	public String getCardPass() {
		return cardPass;
	}
	public String getCardParvalue() {
		return cardParvalue;
	}
	public String getOperators() {
		return operators;
	}
	public String getAcctNo() {
		return acctNo;
	}
	public String getAcctNoHis() {
		return acctNoHis;
	}
	public int getState() {
		return state;
	}
	public int getStateHis() {
		return stateHis;
	}
	public String getStatemsg() {
		return statemsg;
	}
	public String getStatemsgHis() {
		return statemsgHis;
	}
	public Date getUsetime() {
		return usetime;
	}
	public Date getUsetimeHis() {
		return usetimeHis;
	}
	public String getSupnameInner() {
		return supnameInner;
	}
	public String getSupnameOuter() {
		return supnameOuter;
	}
	public String getSupcodeOute() {
		return supcodeOute;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public void setCardPass(String cardPass) {
		this.cardPass = cardPass;
	}
	public void setCardParvalue(String cardParvalue) {
		this.cardParvalue = cardParvalue;
	}
	public void setOperators(String operators) {
		this.operators = operators;
	}
	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}
	public void setAcctNoHis(String acctNoHis) {
		this.acctNoHis = acctNoHis;
	}
	public void setState(int state) {
		this.state = state;
	}
	public void setStateHis(int stateHis) {
		this.stateHis = stateHis;
	}
	public void setStatemsg(String statemsg) {
		this.statemsg = statemsg;
	}
	public void setStatemsgHis(String statemsgHis) {
		this.statemsgHis = statemsgHis;
	}
	public void setUsetime(Date usetime) {
		this.usetime = usetime;
	}
	public void setUsetimeHis(Date usetimeHis) {
		this.usetimeHis = usetimeHis;
	}
	public void setSupnameInner(String supnameInner) {
		this.supnameInner = supnameInner;
	}
	public void setSupnameOuter(String supnameOuter) {
		this.supnameOuter = supnameOuter;
	}
	public void setSupcodeOute(String supcodeOute) {
		this.supcodeOute = supcodeOute;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Carfinfo [id=").append(id).append(", cardNo=")
				.append(cardNo).append(", cardPass=").append(cardPass)
				.append(", cardParvalue=").append(cardParvalue)
				.append(", operators=").append(operators).append(", acctNo=")
				.append(acctNo).append(", acctNoHis=").append(acctNoHis)
				.append(", state=").append(state).append(", stateHis=")
				.append(stateHis).append(", statemsg=").append(statemsg)
				.append(", statemsgHis=").append(statemsgHis)
				.append(", usetime=").append(usetime).append(", usetimeHis=")
				.append(usetimeHis).append(", supnameInner=")
				.append(supnameInner).append(", supnameOuter=")
				.append(supnameOuter).append(", supcodeOute=")
				.append(supcodeOute).append("]");
		return builder.toString();
	}
	
}
