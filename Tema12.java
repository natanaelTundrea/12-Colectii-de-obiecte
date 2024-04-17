import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
public class Tema12 {
	public static ArrayList<String> swapFirstLast(ArrayList<String> list)
	{
	    // Implement this method
	    if(!(list.size()>0)) return new ArrayList();
	    String aux = list.get(list.size()-1);
	    list.set(list.size()-1, list.get(0));
	    list.set(0, aux);
	    return list;
	}
	public static void JavaHashSet()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce the number of pairs: ");
		int length = scan.nextInt(); scan.nextLine();
		
		System.out.println("Introduce the pairs: ");
		HashSet<String> set = new HashSet<String>();
		for(int i=0; i<length; i++) {
			System.out.print(">>> ");
			String pair = scan.nextLine();
			set.add(pair);
			System.out.println(set.size());
		}
		scan.close();
	}
}
