package corejava;

import java.io.Serializable;

class Emp_ implements Serializable{
	private Integer eid;
	private String ename;
	Emp_(){
		System.out.println("Emp Object:");
	}
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
}
public class DemoBean { 

	public static void main(String[] args) {
		Emp_ e = new Emp_();
		e.setEid(123);
		e.setEname("Raj");
		System.out.println("Emp id: "+e.getEid());
		System.out.println("Emp Name: "+e.getEname());
		
	}

}
