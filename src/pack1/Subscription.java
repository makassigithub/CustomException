package pack1;

public class Subscription {
  int studentAge;
  
  public Subscription( int number){
	  this.studentAge = number;
  }
  
  public void subscribe() throws InsufficientAgeException{
	  if (this.studentAge < 7){
		  throw new InsufficientAgeException(studentAge);
	  }
  }
}
