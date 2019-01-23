
public class SingletonPattern {

	private static SingletonPattern instance;

	// by making constructor private , we can prevent object being created from some
	// other class.
	private SingletonPattern() {

	}

	public static synchronized SingletonPattern getInstance() {
		if (instance == null) {
			instance = new SingletonPattern();

		}
		return instance;
	}

}
