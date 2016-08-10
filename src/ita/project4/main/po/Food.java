package ita.project4.main.po;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ita_p4_food")
public class Food {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer fId;
	private String fName;
	private Integer mId;
	private String fViewPath;
	private Integer fStatus;
	public Integer getfId() {
		return fId;
	}
	public void setfId(Integer fId) {
		this.fId = fId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public Integer getmId() {
		return mId;
	}
	public void setmId(Integer mId) {
		this.mId = mId;
	}
	public String getfViewPath() {
		return fViewPath;
	}
	public void setfViewPath(String fViewPath) {
		this.fViewPath = fViewPath;
	}
	public Integer getfStatus() {
		return fStatus;
	}
	public void setfStatus(Integer fStatus) {
		this.fStatus = fStatus;
	}
	public Food(Integer fId, String fName, Integer mId, String fViewPath, Integer fStatus) {
		super();
		this.fId = fId;
		this.fName = fName;
		this.mId = mId;
		this.fViewPath = fViewPath;
		this.fStatus = fStatus;
	}
	public Food() {
		super();
	}
	@Override
	public String toString() {
		return "Food [fId=" + fId + ", fName=" + fName + ", mId=" + mId + ", fViewPath=" + fViewPath + ", fStatus="
				+ fStatus + "]";
	}
	
}
