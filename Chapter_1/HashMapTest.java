import java.util.*;
public class HashMapTest extends Student{
    
    public static HashMap<Integer, Integer> buildMap(Integer i){
	HashMap<Integer, Integer> x = new HashMap<Integer, Integer>();
	x.put(i, i);
	return x;
    }

    public static void main(String args[]){

        HashMap hm = new HashMap();
        // Put elements to the map              
        hm.put("John Doe", new Double(3434.34));
	double d = (Double)hm.get("John Doe");
	System.out.println(d);

	HashMap y = buildMap(1);
	int i = (Integer)y.get(1);
	System.out.println(i);
    }

}