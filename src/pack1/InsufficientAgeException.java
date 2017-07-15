package pack1;

public class InsufficientAgeException extends Exception  {
   
	int age;
	public InsufficientAgeException(int number){
		age=number;
	}
}
