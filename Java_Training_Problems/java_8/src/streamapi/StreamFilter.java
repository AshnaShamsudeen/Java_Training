package streamapi;
import java.util.List;
import java.util.stream.Stream;
public class StreamFilter {

	public static void main(String[] args) {
		//Stream<Integer> nums =Stream.of(10,2030,40,50);
		List<Integer> nums=List.of(10,20,30,40,50);
		//nums.forEach(i-> System.out.println(i));
		nums.forEach(i-> System.out.println(i));
		Stream<Integer> numStream = nums.stream();
		//filter(Predicate)
		//boolean test(arg)
		//i->i%20==0
		numStream.filter(i->i%20==0)
		.forEach(i->System.out.println(i));
		List<String>names=List.of("Rahul","Suraj","Rohit","Manish","Ram");
		
		//print all the names starting with R
		//names.stream().filter(s->s.startsWith("R")).forEach(s->System.out.println(s));
		//print all the name having more than 5 character
		//names.stream().filter(s->s.length()>=5).forEach(s->System.out.println(s));
		//together
		
		names.stream().filter(s->s.startsWith("R")).filter(s->s.length()>=5).
		forEach(s->System.out.println(s));

	}

}
