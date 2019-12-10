import java.util.HashMap;

public class JavaMap {

	public static void main(String[] args) {

		HashMap<Integer,String> map = new HashMap<Integer,String>(){
		{	
		put(1, "a");
		put(2, "b");
		put(3, "c");
		
		}
		
		};
		System.out.println(map);
		
		map.replace(2, "B");
		map.put(4, "D");
		System.out.println(map);
	}
}
