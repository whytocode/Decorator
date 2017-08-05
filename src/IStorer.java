import java.util.Collection;

public interface IStorer<Type extends Collection<?>> {
		
	Type getStoredInformation();
	
	void print();

}
