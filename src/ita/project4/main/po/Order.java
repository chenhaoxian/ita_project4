package ita.project4.main.po;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="ita_p4_order")
public class Order {

	@Id
	private Integer oId;
	private String mBrand;
	private Integer oStatus;
	public Integer getoId() {
		return oId;
	}
	public void setoId(Integer oId) {
		this.oId = oId;
	}
	public Integer getoStatus() {
		return oStatus;
	}
	public void setoStatus(Integer oStatus) {
		this.oStatus = oStatus;
	}
	
	public String getmBrand() {
		return mBrand;
	}
	public void setmBrand(String mBrand) {
		this.mBrand = mBrand;
	}
	public Order() {
		super();
	}
	@Override
	public String toString() {
		return "Order [oId=" + oId + ", mBrand=" + mBrand + ", oStatus=" + oStatus + "]";
	}
	public Order(Integer oId, String mBrand, Integer oStatus) {
		super();
		this.oId = oId;
		this.mBrand = mBrand;
		this.oStatus = oStatus;
	}
	
	
	
	
	
}
