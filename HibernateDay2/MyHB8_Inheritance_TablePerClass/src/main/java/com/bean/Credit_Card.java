package com.bean;
import javax.persistence.*;

@Entity
@Table(name="CreditCard3")
public class Credit_Card extends Billing_Details{
	private String cardnumber;
	private String exp_Month;
	private String exp_Year;
	public Credit_Card() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	public String getExp_Month() {
		return exp_Month;
	}	
	
	public void setExp_Month(String exp_Month) {
		this.exp_Month = exp_Month;
	}
	
	public String getExp_Year() {
		return exp_Year;
	}
	public void setExp_Year(String exp_Year) {
		this.exp_Year = exp_Year;
	}

	public String getCardnumber() {
		return cardnumber;
	}

	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}

	@Override
	public String toString() {
		return "Credit_Card [cardnumber=" + cardnumber + ", exp_Month=" + exp_Month
				+ ", exp_Year=" + exp_Year + "]"+super.toString();
	}
	
}
