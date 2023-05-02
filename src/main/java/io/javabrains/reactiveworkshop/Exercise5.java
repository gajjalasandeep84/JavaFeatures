package io.javabrains.reactiveworkshop;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

import org.reactivestreams.Subscription;

import reactor.core.publisher.BaseSubscriber;
import reactor.util.function.Tuple2;

public class Exercise5 {

	public static void main(String[] args) throws IOException {

		// Use ReactiveSources.intNumbersFlux() and ReactiveSources.userMono()

		// Subscribe to a flux using the error and completion hooks
	//	ReactiveSources.intNumbersFlux().subscribe(number -> System.out.println(number),
	//			err -> System.out.println(err.getMessage()), () -> System.out.println("Flux Complete"));

/*		Disposable subscribe = ReactiveSources.intNumbersFlux().subscribe(number -> System.out.println(number),
				err -> System.out.println(err.getMessage()), () -> System.out.println("Flux Complete"));*/

		// Subscribe to a flux using an implementation of BaseSubscriber
		ReactiveSources.intNumbersFlux().subscribe(new MySubscriber<>());
		
		
		
		System.out.println("Press a key to end");
		System.in.read();
	}

}

class MySubscriber<T> extends BaseSubscriber<T> {

	public void hookOnSubscribe(Subscription subscription) {

		System.out.println("Subscribe happened");
	}

	public void hookOnNext(T value) {

		System.out.println(value.toString() + " received");
	}
}