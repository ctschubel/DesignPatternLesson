package section_5.singleton_pattern.lazy;

/**
 * @author ctschubel
 *
 */
public class LazySingleton {
	private static LazySingleton instance;

	private LazySingleton() {
		System.out.println("Singleton created!");
	}

	public static LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;

	}

}
