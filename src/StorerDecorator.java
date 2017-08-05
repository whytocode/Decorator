import java.util.List;

public class StorerDecorator implements IStorer<List<String>> {

	protected final IStorer<List<String>> instance;

	
	public StorerDecorator(IStorer<List<String>> istorer) {
		this.instance = istorer;
	}
	
	@Override
	public List<String> getStoredInformation() {
		return instance.getStoredInformation();
	}

	@Override
	public void print() {
		instance.print();
	}

}
