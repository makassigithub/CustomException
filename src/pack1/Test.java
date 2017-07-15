package pack1;

public class Test {

	public static void main(String ...agrs){
		Subscription sbs = new Subscription(5);
		try{
			 sbs.subscribe();
		}catch(InsufficientAgeException ex) {
			  System.out.println("The student is old enough to subscribe: He only has "+ ex.age + " years old");   
		}
                
	}
}
