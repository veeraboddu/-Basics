// @Author : Murthy
// Object sorting by using comparator and comparable interface
package ObjSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentObjSort {
	
	public static void main(String arg[]){
		
	List<StudentFields> s1 = new ArrayList<StudentFields>();
	
	s1.add(new StudentFields("Meghana","F",3,100));
	s1.add(new StudentFields("Poshi","F",1,90));
	s1.add(new StudentFields("Tarshit","M",7,80));
	s1.add(new StudentFields("Rohit","M",5,85));
	
	Comparator<StudentFields> com = new Comparator<StudentFields>() {

		@Override
		public int compare(StudentFields o1, StudentFields o2) {
			// TODO Auto-generated method stub
			if(o1.getAge() > o2.getAge())
			  return 1;
			else
				return -1;
		}
		
	};
	
	Collections.sort(s1,com);
	
	for(StudentFields stf:s1){
		System.out.println("Name: "+stf.getName()+" Sex: "+stf.sex+" Age: "+stf.age+" Marks: "+stf.getMarks());
	}
	
	
	}
}

class StudentFields implements Comparable<StudentFields>{
	
	String name;
	String sex;
	int age;
	int marks;
	
	public StudentFields(String name, String sex, int age, int marks) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.marks = marks;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	@Override
	public int compareTo(StudentFields o) {
		// TODO Auto-generated method stub
		// sort int
		//return this.age - o.getAge();
		// sort string
		return this.name.compareTo(o.getName());
	}
	
}
