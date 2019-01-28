package section_5.singleton_pattern.basic;

/**
 * @author ctschubel
 *
 */
public class BasicSingleton {
	private static final BasicSingleton instance = new BasicSingleton();

	private BasicSingleton() {
		System.out.println("Singleton created!");
	}

	public static BasicSingleton getInstance() {
		return instance;

	}

}
