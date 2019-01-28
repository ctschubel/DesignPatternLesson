package section_5.singleton_pattern.thread_safe;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Main {

	public static void main(final String[] args) throws InterruptedException, ExecutionException {

		CompletableFuture
				.allOf(CompletableFuture.runAsync(() -> ThreadSafeSingleton.getInstance()),
						CompletableFuture.runAsync(() -> ThreadSafeSingleton.getInstance()))//
				.get();

	}

}
