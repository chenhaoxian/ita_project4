package ita.project4.main.vo;

public class VoFood {
	
	private int fId;
	private String fName;
	private int mId;
	private Double fPrice;
	private String fViewPath;
	private int fStatus;
	private int num;
	public int getfId() {
		return fId;
	}
	public void setfId(int fId) {
		this.fId = fId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public int getmId() {
		return mId;
	}
	public void setmId(int mId) {
		this.mId = mId;
	}
	public Double getfPrice() {
		return fPrice;
	}
	public void setfPrice(Double fPrice) {
		this.fPrice = fPrice;
	}
	public String getfViewPath() {
		return fViewPath;
	}
	public void setfViewPath(String fViewPath) {
		this.fViewPath = fViewPath;
	}
	public int getfStatus() {
		return fStatus;
	}
	public void setfStatus(int fStatus) {
		this.fStatus = fStatus;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "VoFood [fId=" + fId + ", fName=" + fName + ", mId=" + mId + ", fPrice=" + fPrice + ", fViewPath="
				+ fViewPath + ", fStatus=" + fStatus + ", num=" + num + "]";
	}
	public VoFood(int fId, String fName, int mId, Double fPrice, String fViewPath, int fStatus, int num) {
		super();
		this.fId = fId;
		this.fName = fName;
		this.mId = mId;
		this.fPrice = fPrice;
		this.fViewPath = fViewPath;
		this.fStatus = fStatus;
		this.num = num;
	}
	public VoFood() {
		super();
	}
	
	

}
