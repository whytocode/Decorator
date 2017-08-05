import java.util.List;

public final class BasicStorer implements IStorer<List<String>> {

	private List<String> listOfNames;
	
	public BasicStorer(List<String> list) {
		this.listOfNames = list;
	}
	
	@Override
	public List<String> getStoredInformation() {
		// TODO Auto-generated method stub
		return listOfNames;
	}

	@Override
	public void print() {
	   for(int i=0;i<getStoredInformation().size();i++) {
		  System.out.println(listOfNames.get(i));
	   }
	}
		
	}


