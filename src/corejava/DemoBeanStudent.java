package corejava;

import java.io.Serializable;

class Student implements Serializable{
	private Integer sid;
	private String sname;
	private String[] csubjects;
	Student(){
		
	}
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
	public String[] getCsubjects() {
		return csubjects;
	}
	public void setCsubjects(String[] csubjects) {
		this.csubjects = csubjects;
	}
	
	
}

public class DemoBeanStudent {

	public static void main(String[] args) {
		Student s1=new Student();
		String[] subjects= {"C","Java","Python","SQL","Data Science"};
		s1.setSid(14245);
		s1.setSname("Jhon");
		s1.setCsubjects(subjects);
		System.out.println("Student id: "+s1.getSid()+" Name: "+s1.getSname());
		System.out.println("Courses Selected:");
		String[] sub=s1.getCsubjects();
		for(int i=0;i<sub.length;i++) {
			System.out.println("Course:"+(i+1)+":"+sub[i]);
		}
	}

}
