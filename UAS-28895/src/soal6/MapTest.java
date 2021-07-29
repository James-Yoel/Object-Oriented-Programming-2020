package soal6;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) { 
		Map arrMap = new HashMap();      
		arrMap.put(0, "1");  
		arrMap.put(1, "2");  
		arrMap.put(2, "1");      
		for(int i = 0; i < arrMap.size(); ++i){  
		  System.out.println(arrMap.get(i));  
		}  
	}  
}
