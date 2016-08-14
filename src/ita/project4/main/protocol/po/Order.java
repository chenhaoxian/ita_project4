package ita.project4.main.protocol.po;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


public class Order {

	private Integer oId;
	private String uTel;
	private String uName;
	private String mTel;
	private String mBrand;
	private String foodInfo;
	private String complaintMsg;
	public Integer getoId() {
		return oId;
	}
	public void setoId(Integer oId) {
		this.oId = oId;
	}
	public String getuTel() {
		return uTel;
	}
	public void setuTel(String uTel) {
		this.uTel = uTel;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getmTel() {
		return mTel;
	}
	public void setmTel(String mTel) {
		this.mTel = mTel;
	}
	public String getmBrand() {
		return mBrand;
	}
	public void setmBrand(String mBrand) {
		this.mBrand = mBrand;
	}
	public String getFoodInfo() {
		return foodInfo;
	}
	public void setFoodInfo(String foodInfo) {
		this.foodInfo = foodInfo;
	}
	public String getComplaintMsg() {
		return complaintMsg;
	}
	public void setComplaintMsg(String complaintMsg) {
		this.complaintMsg = complaintMsg;
	}
	@Override
	public String toString() {
		return "Order [oId=" + oId + ", uTel=" + uTel + ", uName=" + uName + ", mTel=" + mTel + ", mBrand=" + mBrand
				+ ", foodInfo=" + foodInfo + ", complaintMsg=" + complaintMsg + "]";
	}
	public Order(Integer oId, String uTel, String uName, String mTel, String mBrand, String foodInfo,
			String complaintMsg) {
		super();
		this.oId = oId;
		this.uTel = uTel;
		this.uName = uName;
		this.mTel = mTel;
		this.mBrand = mBrand;
		this.foodInfo = foodInfo;
		this.complaintMsg = complaintMsg;
	}
	public Order() {
		super();
	}
	
}
