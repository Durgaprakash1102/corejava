package corejava;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Course implements Serializable{
	private Integer cid;
	private String cname;
	private List<String> subjects;
	Course(){
		
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
}

public class DemoBeanCourse {

	public static void main(String[] args) {
		Course degree=new Course();
		degree.setCid(12345678);
		degree.setCname("Btech");
		List<String> subs=new ArrayList<String>();
		subs.add("Os");
		subs.add("DSA");
		subs.add("AI");
		subs.add("OOAD");
		degree.setSubjects(subs);
		
		System.out.println("Course ID:"+degree.getCid()+", Course Name:"+degree.getCname() +", Course Subjects: "+degree.getSubjects());;
		
		
		degree.setCid(23552554);
		degree.setCname("BSC");
		List<String> subs1=new ArrayList<String>();
		subs1.add("English");
		subs1.add("Maths");
		subs1.add("Biology");
		subs1.add("Zoology");
		degree.setSubjects(subs1);
		
		System.out.println("Course ID:"+degree.getCid()+", Course Name:"+degree.getCname() +", Course Subjects: "+degree.getSubjects());;
		
		
		degree.setCid(35352266);
		degree.setCname("Mtech");
		List<String> subs2=new ArrayList<String>();
		subs2.add("Computer Design");
		subs2.add("Computer Networks");
		subs2.add("DBMS");
		subs2.add("Cyber Security");
		degree.setSubjects(subs2);
		
		System.out.println("Course ID:"+degree.getCid()+", Course Name:"+degree.getCname() +", Course Subjects: "+degree.getSubjects());;
		
	}

}
