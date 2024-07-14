package assessment;

public class OnlyOnce {	  
	    private static OnlyOnce instance = null;

	   
	    private OnlyOnce() {
	        
	    }

	    public static OnlyOnce getInstance() {
	        if (instance == null) {
	            instance = new OnlyOnce();
	        }
	        return instance;
	    }

	   
	    public void doSomething() {
	        System.out.println("Once running");
	    }

	    public static void main(String[] args) {
	      
	        OnlyOnce obj1 = OnlyOnce.getInstance();
	        obj1.doSomething();

	        OnlyOnce obj2 = OnlyOnce.getInstance();
	        obj2.doSomething();

	       
	        System.out.println(obj1 == obj2); 
	    }
	}


