package in.ineuron.dto;

import java.io.Serializable;
//only using for the resultset means for select operation only because resultset can't implement the 
//serialable interface so we need to create the object Student class which provide the result to service
// layer afterthat controller layer ..........
public class Student implements Serializable {
	
	private static final long serialVersionUID= 1L;
	
	private Integer sid;
	private String sname;
	private Integer sage;
	private String saddress;
	
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Integer getSage() {
		return sage;
	}
	public void setSage(Integer sage) {
		this.sage = sage;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", saddress=" + saddress + "]";
	}
	
	
	
}
