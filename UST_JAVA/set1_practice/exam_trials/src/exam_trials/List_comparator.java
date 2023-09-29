package exam_trials;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class List_comparator {
	static List<String> descendingOrder(List<String>list) {
		Comparator<String> descSort=(s1,s2)->s2.compareTo(s1);
		Collections.sort(list,descSort);
		Comparator<String> sortByLength=(s1,s2)->
		{if(s1.length()==s2.length())
			return s1.compareTo(s2);
		else 
			return (s1.length()-s2.length());};
		
		
		Collections.sort(list,sortByLength);
		
		return list;
		
	}
 
	public static void main(String[] args) {
//	List<String> list=new ArrayList<>();
//		list.add(0, "a");
//		list.add(0, "abhi");
//		list.add(0, "abhirami");
//		list.add(0, "abhiraman");
//		list.add(0, "shymapauljustin");
		List<String> list=Arrays.asList("yx","xyz","abc","xygghdg","fytdtrsrts");
		//List<String> list=new ArrayList(List.of(("yx","xyz","abc","xygghdg","fytdtrsrts"));

		
		System.out.println(descendingOrder(list));

	}

}
