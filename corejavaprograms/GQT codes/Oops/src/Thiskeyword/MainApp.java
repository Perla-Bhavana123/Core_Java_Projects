package Thiskeyword;


class Cricket{
	private String name;
	private int age;
	private int score;
	private int matches;
	
	
	
	Cricket(){
		super();
		System.out.println(name);
		System.out.println(age);
		System.out.println(score);
		System.out.println(matches);
		this.name="virat";
		this.age=28;
		this.score=800;
		this.matches=12;
		System.out.println(name);
		System.out.println(age);
		System.out.println(score);
		System.out.println(matches);
	
	}
	Cricket(String name){
		this();
		this.name=name;
		System.out.println(name);
		System.out.println(age);
		System.out.println(score);
		System.out.println(matches);
	}
	Cricket(String name,int age){
		this("Rohith");
		this.name=name;
		this.age=age;
		System.out.println(name);
		System.out.println(age);
		System.out.println(score);
		System.out.println(matches);
	}
	
	Cricket(String name,int age,int score){
		this("ishan",28);
		this.name=name;
		this.age=age;
		this.score=score;
		System.out.println(name);
		System.out.println(age);
		System.out.println(score);
		System.out.println(matches);
	}
		Cricket(String name,int age,int score,int matches){
			this("Dhoni",28,800);
			this.name=name;
			this.age=age;
			this.score=score;
			this.matches=matches;
			System.out.println(name);
			System.out.println(age);
			System.out.println(score);
			System.out.println(matches);
		
		
	}
		
		String getName() {
			return name;
		}

		int getAge() {
			return age;
			
		}
		int getScore(){
			return score;
			
		}
		int getMatches(){
			return matches;
			
		}
		
}

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cricket c=new Cricket("gill",29,1900,15);
		System.out.println(c.getName());
		
		System.out.println(c.getAge());
		
		System.out.println(c.getScore());
		
		System.out.println(c.getMatches());
		

	}

}
