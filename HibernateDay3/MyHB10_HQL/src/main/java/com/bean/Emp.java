package com.bean;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="TESTEMP")
//@NamedQuery(
//	    name = "Emp.findByNamePattern",
//	    query = "from Emp e where e.e_name like :namePattern"
//	)

@NamedQueries({
    @NamedQuery(
        name = "Emp.findByNamePattern",
        query = "from Emp e where e.e_name like :namePattern"
    ),
    @NamedQuery(
        name = "Emp.findByNameAndMinSalary",
        query = "from Emp e where e.e_name like :namePattern and e.salary > :minSalary"
    )
})
public class Emp {
	@Id
	private int e_code;
	private String e_name;
	private double salary;
	private Date join_date;

	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="d_code")
	private Dept d_code;
	
	
	public Dept getD_code() {
		return d_code;
	}

	public void setD_code(Dept d_code) {
		this.d_code = d_code;
	}


	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(int e_code, String e_name, double salary, Date join_date) {
		super();
		this.e_code = e_code;
		this.e_name = e_name;
		this.salary = salary;
		this.join_date = join_date;
	}

	public int getE_code() {
		return e_code;
	}

	public void setE_code(int e_code) {
		this.e_code = e_code;
	}

	public String getE_name() {
		return e_name;
	}

	public void setE_name(String e_name) {
		this.e_name = e_name;
	}

	public Date getJoin_date() {
		return join_date;
	}

	public void setJoin_date(Date join_date) {
		this.join_date = join_date;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String toString(){
		return(e_code +"    "+e_name+"      "+join_date+"     "+salary);
	}
	
}
