package io.javabrains.reactiveworkshop;

import java.io.IOException;

public class Exercise2 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux() and ReactiveSources.userFlux()
    	   	
        // Print all numbers in the ReactiveSources.intNumbersFlux stream
    //	ReactiveSources.intNumbersFlux().subscribe(e->System.out.println(e));
    	
    	ReactiveSources.intNumbersFlux().subscribe(number -> System.out.println(number),
				err -> System.out.println(err.getMessage()), () -> System.out.println("Complete"));

        // Print all users in the ReactiveSources.userFlux stream
//    	ReactiveSources.userFlux().subscribe(user->System.out.println(user));

        System.out.println("Press a key to end");
        System.in.read();
    }

}
