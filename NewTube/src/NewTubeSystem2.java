//메인클래스 선언

public class NewTubeSystem {
	public static void main(String[] args) {
	
		 User steve = new User();
	     User amy = new User();
	      
	      steve.email = "steve@codepress.kr";
	      steve.password = "asd123";
	      steve.nickname = "steve";
	      steve.age = 22;
	      
	      amy.email = "amy@codepress.kr";
	      amy.password = "asd124";
	      amy.nickname = "amyamy";
	      amy.age = 17;
	    
	   steve.printInfo();
	   steve.isOver20();
	 
	   amy.printInfo();
       amy.isOver20();
    
	  
	 
	    }
}
