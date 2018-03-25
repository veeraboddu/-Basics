
//@ Authot : Murthy
// object sorting my using comparator interface
package ObjSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmpSort {
	
	public static void main(String arg[]){
		
		List<EmpDetails> l1 = new ArrayList<>();
		
		l1.add(new EmpDetails(10, "Murthy", 2000));
		l1.add(new EmpDetails(1, "sunitha", 2300));
		l1.add(new EmpDetails(2, "sravani", 2500));
		l1.add(new EmpDetails(5, "asha", 2060));
		l1.add(new EmpDetails(6, "ananth", 2700));
		l1.add(new EmpDetails(13, "kanaka", 2030));
		l1.add(new EmpDetails(15, "anil", 2001));
		l1.add(new EmpDetails(19, "aneesh", 2080));
		
		Comparator<EmpDetails> com = new Comparator<EmpDetails>() {
			
			@Override
			public int compare(EmpDetails o1, EmpDetails o2) {

				// Ascending order min to max
				//if(o1.getSalary()>o2.getSalary())
					
				// Decending order max to min
				if(o1.getSalary()<o2.getSalary())	
					return 1;
				else
					return -1;
			}
		};
		
		Collections.sort(l1,com);
		
		for(EmpDetails ed : l1){
			
			System.out.println(ed.getName());
		}
		
	}

}

class EmpDetails{
	
	int empid;
	String name;
	int salary;
	
	
	public EmpDetails(int empid, String name, int salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
