package com.bean;
import java.io.Serializable;
import javax.persistence.*;

@Embeddable
public class EmpIdClass implements Serializable{
	private int ssn;
	private int eid;
	public EmpIdClass() {
		// TODO Auto-generated constructor stub
	}
	public EmpIdClass(int ssn, int eid) {
		super();
		this.ssn = ssn;
		this.eid = eid;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + eid;
		result = prime * result + ssn;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmpIdClass other = (EmpIdClass) obj;
		if (eid != other.eid)
			return false;
		if (ssn != other.ssn)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "EmpIdClass [ssn=" + ssn + ", eid=" + eid + "]";
	}
	
}
