package test;

public class PeopleKilled {
	private int pass=1;
    private int current=1;
    private int fibonacci;
    private int result = 2; 
 
    public Integer getPeopleKilled(int limit){
        
    	if (limit > 1) {
	        for(int i=0;i<limit-2;i++){
	            fibonacci=current+pass;
	            pass=current;
	            current=fibonacci;
	            result = result+current;
	           }
    	} else {
    		result = 1;
    	}
        
        return result;
    }
}
