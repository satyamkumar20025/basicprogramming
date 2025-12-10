package java8features;

public class main2 {
	public static void main(String[] args) {
		Runnable runnable = () -> {
			for (int i = 0; i <= 10; i++) {
				System.out.println("Hello " + 1);
			}
		};
		Thread ChiledThread = new Thread(runnable);
		ChiledThread.run();
	}

}
