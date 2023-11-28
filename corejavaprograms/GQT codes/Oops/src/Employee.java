
public class Employee {
	private String name;
	private String em_id;
	private int age;
	private String Gender;
	private int salary;
	
	
	void setData(String a,String b,int c,String d,int e) {
		name=a;
		em_id=b;
		age=c;
		Gender=d;
		salary=e;
	}
	
	void getData() {
		System.out.println(name);
		System.out.println(em_id);
		System.out.println(age);
		System.out.println(Gender);
		System.out.println(salary);
	}
}
	

	


