package ita.project4.main.vo;

import java.util.Date;
import java.util.List;

public class VoOrder {
	
	private Integer oId;
	private Integer cId;
	private Integer mId;
	private String foodInfo;
	private Integer oStatus;// 状态
	private Date startTime;// 下单时间
	private Date confirmTime;// 接单时间
	private Date finishTime;// 确认时间
	private Double oStark;// 订单评分
	private String complaint;// 投诉
	private List<VoFood> foodList;
	public List<VoFood> getFoodList() {
		return foodList;
	}
	public void setFoodList(List<VoFood> foodList) {
		this.foodList = foodList;
	}
	public Integer getoId() {
		return oId;
	}
	public void setoId(Integer oId) {
		this.oId = oId;
	}
	public Integer getcId() {
		return cId;
	}
	public void setcId(Integer cId) {
		this.cId = cId;
	}
	public Integer getmId() {
		return mId;
	}
	public void setmId(Integer mId) {
		this.mId = mId;
	}
	public Integer getoStatus() {
		return oStatus;
	}
	public void setoStatus(Integer oStatus) {
		this.oStatus = oStatus;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getConfirmTime() {
		return confirmTime;
	}
	public void setConfirmTime(Date confirmTime) {
		this.confirmTime = confirmTime;
	}
	public Date getFinishTime() {
		return finishTime;
	}
	public void setFinishTime(Date finishTime) {
		this.finishTime = finishTime;
	}
	public Double getoStark() {
		return oStark;
	}
	public void setoStark(Double oStark) {
		this.oStark = oStark;
	}
	public String getComplaint() {
		return complaint;
	}
	public void setComplaint(String complaint) {
		this.complaint = complaint;
	}
	
	
	public VoOrder() {
		super();
	}
	public String getFoodInfo() {
		return foodInfo;
	}
	public void setFoodInfo(String foodInfo) {
		this.foodInfo = foodInfo;
	}
	@Override
	public String toString() {
		return "VoOrder [oId=" + oId + ", cId=" + cId + ", mId=" + mId + ", foodInfo=" + foodInfo + ", oStatus="
				+ oStatus + ", startTime=" + startTime + ", confirmTime=" + confirmTime + ", finishTime=" + finishTime
				+ ", oStark=" + oStark + ", complaint=" + complaint + ", foodList=" + foodList + "]";
	}
	public VoOrder(Integer oId, Integer cId, Integer mId, String foodInfo, Integer oStatus, Date startTime,
			Date confirmTime, Date finishTime, Double oStark, String complaint) {
		super();
		this.oId = oId;
		this.cId = cId;
		this.mId = mId;
		this.foodInfo = foodInfo;
		this.oStatus = oStatus;
		this.startTime = startTime;
		this.confirmTime = confirmTime;
		this.finishTime = finishTime;
		this.oStark = oStark;
		this.complaint = complaint;
	}
	
	
	
	
	
	

}
