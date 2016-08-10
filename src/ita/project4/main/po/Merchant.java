package ita.project4.main.po;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Merchant")
public class Merchant {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer mId;
	private String mPersonName;
	private String mTel;
	private String mIdCard;
	private String mCardPath;
	private String mLocation;
	private String mBand;
	public Integer getmId() {
		return mId;
	}
	public void setmId(Integer mId) {
		this.mId = mId;
	}
	public String getmPersonName() {
		return mPersonName;
	}
	public void setmPersonName(String mPersonName) {
		this.mPersonName = mPersonName;
	}
	public String getmTel() {
		return mTel;
	}
	public void setmTel(String mTel) {
		this.mTel = mTel;
	}
	public String getmIdCard() {
		return mIdCard;
	}
	public void setmIdCard(String mIdCard) {
		this.mIdCard = mIdCard;
	}
	public String getmCardPath() {
		return mCardPath;
	}
	public void setmCardPath(String mCardPath) {
		this.mCardPath = mCardPath;
	}
	public String getmLocation() {
		return mLocation;
	}
	public void setmLocation(String mLocation) {
		this.mLocation = mLocation;
	}
	public String getmBand() {
		return mBand;
	}
	public void setmBand(String mBand) {
		this.mBand = mBand;
	}
	public Merchant(Integer mId, String mPersonName, String mTel, String mIdCard, String mCardPath, String mLocation,
			String mBand) {
		super();
		this.mId = mId;
		this.mPersonName = mPersonName;
		this.mTel = mTel;
		this.mIdCard = mIdCard;
		this.mCardPath = mCardPath;
		this.mLocation = mLocation;
		this.mBand = mBand;
	}
	public Merchant() {
		super();
	}
	@Override
	public String toString() {
		return "Merchant [mId=" + mId + ", mPersonName=" + mPersonName + ", mTel=" + mTel + ", mIdCard=" + mIdCard
				+ ", mCardPath=" + mCardPath + ", mLocation=" + mLocation + ", mBand=" + mBand + "]";
	}
	
	

	

}