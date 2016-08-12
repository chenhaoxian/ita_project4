package ita.project4.main.po;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="ita_p4_order")
public class Order {

	@Id
	private Integer oId;
	private Integer oStatus;
	public Order(Integer oId, Integer oStatus, String uTel, String uName, String mTel, String mBrand, String foodInfo) {
		super();
		this.oId = oId;
		this.oStatus = oStatus;
		this.uTel = uTel;
		this.uName = uName;
		this.mTel = mTel;
		this.mBrand = mBrand;
		this.foodInfo = foodInfo;
	}
	private String uTel;
	private String uName;
	private String mTel;
	private String mBrand;
	private String foodInfo;
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
	public Order(Integer oId, String uTel, String uName, String mTel, String mBrand, String foodInfo) {
		super();
		this.oId = oId;
		this.uTel = uTel;
		this.uName = uName;
		this.mTel = mTel;
		this.mBrand = mBrand;
		this.foodInfo = foodInfo;
	}
	public Order() {
		super();
	}
	@Override
	public String toString() {
		return "Order [oId=" + oId + ", uTel=" + uTel + ", uName=" + uName + ", mTel=" + mTel + ", mBrand=" + mBrand
				+ ", foodInfo=" + foodInfo + "]";
	}
	public Integer getoStatus() {
		return oStatus;
	}
	public void setoStatus(Integer oStatus) {
		this.oStatus = oStatus;
	}
	
	
	
}
