import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DSriver {
	
	private List<String> names;
	
	public DSriver() {
		names = new ArrayList<>();
	}
	
	List<String> createArrayList() {
		String[] stringNames = asArray("Vishal","Ratna","works","at","Trimble","in","Tidel","Park","Alpha","Beta");
		return Arrays.asList(stringNames);
	}
	
	public String[] asArray(String...strings ) {
		return strings;
	}
	
	
	public static void main(String[] args) {
		
		DSriver driver = new DSriver();
		BasicStorer storer = new BasicStorer(driver.createArrayList());
		storer.print();
		System.out.println("******************************\n\n");
		SortedStorer sortedStorer = new SortedStorer(storer);
		sortedStorer.print();
		
	
		

		
	}
	
	
}
