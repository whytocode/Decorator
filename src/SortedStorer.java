import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedStorer extends StorerDecorator {

	public SortedStorer(IStorer<List<String>> istorer) {
		super(istorer);
	}

	@Override
	public List<String> getStoredInformation() {
		List<String> temp = new ArrayList<String>(super.getStoredInformation());
		Collections.sort(temp);
		return temp;
	}

	@Override
	public void print() {
	
		for(int i=0;i<getStoredInformation().size();i++) {
			System.out.println(getStoredInformation().get(i));
		}
	}
	
	
}
