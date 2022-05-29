import java.util.Hashtable;
public class javaHashtable {
	public static void main(String[] args) {
		Hashtable<String, Integer> myHT = new Hashtable<>(); // TODO 1
		myHT.put("Khalid", 5); // TODO 2
		myHT.put("Usman", 6); // TODO 3
		myHT.put("Jones", 7); // TODO 4
		myHT.remove("Usman"); // TODO 5
		myHT.put("Saleem", 7); // TODO 6
		System.out.println(myHT); // TODO 7
	}
}
# OUTPUT: 
# {Khalid=5, Saleem=7, Jones=7}
