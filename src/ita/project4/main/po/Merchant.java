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
	private String mLogoPath;
	private Integer mStatus;
	private Integer mStart;// 评分等级

	public Merchant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Merchant(String mPersonName, String mTel, String mIdCard, String mCardPath, String mLocation, String mBand,
			String mLogoPath, Integer mStatus, Integer mStart) {
		super();
		this.mPersonName = mPersonName;
		this.mTel = mTel;
		this.mIdCard = mIdCard;
		this.mCardPath = mCardPath;
		this.mLocation = mLocation;
		this.mBand = mBand;
		this.mLogoPath = mLogoPath;
		this.mStatus = mStatus;
		this.mStart = mStart;
	}

	@Override
	public String toString() {
		return "Merchant [mId=" + mId + ", mPersonName=" + mPersonName + ", mTel=" + mTel + ", mIdCard=" + mIdCard
				+ ", mCardPath=" + mCardPath + ", mLocation=" + mLocation + ", mBand=" + mBand + ", mLogoPath="
				+ mLogoPath + ", mStatus=" + mStatus + ", mStart=" + mStart + "]";
	}
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

	public String getmLogoPath() {
		return mLogoPath;
	}

	public void setmLogoPath(String mLogoPath) {
		this.mLogoPath = mLogoPath;
	}

	public Integer getmStatus() {
		return mStatus;
	}

	public void setmStatus(Integer mStatus) {
		this.mStatus = mStatus;
	}

	public Integer getmStart() {
		return mStart;
	}

	public void setmStart(Integer mStart) {
		this.mStart = mStart;
	}

}