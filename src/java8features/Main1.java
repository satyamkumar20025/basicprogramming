package java8features;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engineer engineer = ()->"Satyam";
		System.out.println("Software Engineer is "+engineer.getName());
		Engineer Editer = ()->"Satyam";
		System.out.println("Software Engineer Editer is "+Editer.getName());
		Engineer CEO = ()->"Satyam";
		System.out.println("Software Engineer CEO is "+CEO.getName());
		Engineer BOSS = ()->"Satyam";
		System.out.println("Software Engineer BOSS is "+BOSS.getName());
	}
}
