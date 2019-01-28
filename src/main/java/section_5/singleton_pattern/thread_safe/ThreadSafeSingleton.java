package section_5.singleton_pattern.thread_safe;

/**
 * @author ctschubel
 *
 */
public class ThreadSafeSingleton {
	private static ThreadSafeSingleton instance;

	private ThreadSafeSingleton() {
		System.out.println("Singleton created!");
	}

	/**
	 * <code>Synchonize</code> nur im kritischen part verwenden um performance zu
	 * verbessern.
	 *
	 * @return instance
	 */
	public static ThreadSafeSingleton getInstance() {
		if (instance == null) {
			synchronized (ThreadSafeSingleton.class) {
				if (instance == null) {
					instance = new ThreadSafeSingleton();
				}
			}
		}
		return instance;

	}

}
