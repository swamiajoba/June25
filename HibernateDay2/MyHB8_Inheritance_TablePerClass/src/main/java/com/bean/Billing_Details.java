package com.bean;
import javax.persistence.*;

@Entity
//@Table(name="BillingTable3")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Billing_Details {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="BILLING_DETAILS_ID")
	protected long id;
	protected String owner;

	public Billing_Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getOwner(){
		return owner;
	}
	public void setOwner(String owner){
		this.owner=owner;
	}
	@Override
	public String toString() {
		return "Billing_Details [owner=" + owner + ", id=" + id + "]";
	}
	
}
