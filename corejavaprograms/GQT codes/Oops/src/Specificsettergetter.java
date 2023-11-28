
public class Specificsettergetter {
    private String name;
    private String emp_id;
    private int age;
    private String Gender;
    private int salary;
    
    void setname(String a) {
     name= a;
    }
    void setemp(String b) {
        emp_id= b;
       }
    void setage(int c) {
        age= c;
       }
    void setgender(String d) {
        Gender= d;
       }
    void setsalary(int e) {
        salary= e;
       }
    String getname()
    {
    	return name;
    }
    String getemp()
    {
    	return emp_id;
    }
    int getage()
    {
    	return age;
    }
    String getgender()
    {
    	return Gender;
    }
    String getemp_id()
    {
    	return emp_id;
    }
    
	
	
}
