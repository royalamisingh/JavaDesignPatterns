package amy.designpatterns.singleton;

public final class MySingleton {

	private static volatile MySingleton instance = null;

	private MySingleton() {
		if (instance != null) {
			throw new RuntimeException("Cannot Create Instance from here");
		}
	}

	public static MySingleton getInstsance() {
		if (instance == null) {
			synchronized (MySingleton.class) {
				if (instance == null) {
					instance = new MySingleton();
				}
			}

		}
		return instance;
	}

}
