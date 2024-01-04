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
	    
	      System.out.println("User Info" +
	                         "\nemail: " + steve.email +
	                         "\nnickname: " + steve.nickname +
	                         "\nage: " + steve.age);
	  
	    if(steve.age < 20) {
	    	System.out.println("\n" + steve.nickname + " is under 20");
	    } else {
	    	System.out.println("\n" + steve.nickname + " is over 20");
	    	}
	 
	    System.out.println("\nUser Info" +
	                         "\nemail: " + amy.email +
	                         "\nnickname: " + amy.nickname +
	                         "\nage: " + amy.age);
	  
	    if(amy.age < 20) {
	    	System.out.println("\n" + amy.nickname + " is under 20");
	    } else {
	    	System.out.println("\n" + amy.nickname + " is over 20");
	    	}
	    }
}
