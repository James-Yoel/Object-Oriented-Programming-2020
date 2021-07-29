package soal6;
import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {   
	    List arrList = new ArrayList();  
	    arrList.add("1");
	    //Value duplikat
	    arrList.add("1");  
	    arrList.add("2");    ;      
	    for(int i = 0; i < arrList.size(); ++i){  
	      System.out.println(arrList.get(i));  
	    }
	}
}
