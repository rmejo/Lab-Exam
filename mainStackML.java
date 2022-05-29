import java.util.ArrayList;

class stackML{
	ArrayList MovieList;
	stackML(){MovieList = new ArrayList<>();}
	public void push(Object obj) {
		MovieList.add(obj); // TODO 1
	}
	public Object pop() {
		if(MovieList.size() > 0) return (MovieList.remove(MovieList.size()-1));
		else return null;
	}
	public void printStack() {
		System.out.println(" " + MovieList.toString());
	}
}

public class mainStackML {
	public static void main(String[] args) {
		stackML mStack = new stackML(); // TODO 2
		mStack.push("The Legend"); // TODO 3
		mStack.push("Rush Hour"); // TODO 4
		mStack.pop(); // TODO 5
		mStack.printStack(); // TODO 6
	}
}

# OUTPUT: 
# [The Legend]
