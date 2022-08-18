
public class SwitchC {
	
	public static final boolean isSuperPrivilegeOf(int p1, int p2)
	  {
	    switch (p1)
	    {
	      case 1:
	        if (p2==1)            { return true; }
	      case 5:
	    	  System.out.println("111");
	        if (p2==5)           { 
	        	
	        	System.out.println("ddd");
	        	return true; }
	        
	        
	      case 6:
		        if (p2==2)           { 
		        	
		        	System.out.println("User");
		        	return true; }
		         
	        
			/*
			 * case PROVISIONING_LEVEL: if (p2==PROVISIONING_LEVEL) { return true; } case
			 * RESELLER_LEVEL: if (p2==RESELLER_LEVEL) { return true; } case
			 * SERVICE_PROVIDER_LEVEL: if (p2==SERVICE_PROVIDER_LEVEL) { return true; } case
			 * GROUP_LEVEL: if (p2==GROUP_LEVEL) { return true; } case DEPARTMENT_LEVEL: if
			 * (p2==DEPARTMENT_LEVEL) { return true; } case USER_LEVEL: if (p2==USER_LEVEL)
			 * { return true; } case BASIC_LEVEL: if (p2==BASIC_LEVEL) { return true; } case
			 * NOT_AUTHORIZED: if (p2==NOT_AUTHORIZED) { return true; }
			 */
	      default:
	    	  System.out.println("TETSS");
	        return false;
	      case 9:
	      {
	        return p2==3 || p2==0 || p2==9;
	      }
	    }
	  }
	
	
	public static void main(String arg[]) {
		
		System.out.println(isSuperPrivilegeOf(5,1));
	}

}
