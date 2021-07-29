package soal6;

import java.util.HashSet;
import java.util.Set;
public class SetTest {
	public static void main(String[] args) {   
	    Set arrSet = new HashSet();          
	    arrSet.add("1");
	    //Value Duplikat
	    arrSet.add("1");  
	    arrSet.add("2");          
	    Object [] arrFromSet = arrSet.toArray();  
	    for(int i = 0; i < arrFromSet.length; ++i){  
	      System.out.println(arrFromSet[i]);  
	    }  
	  }
}
