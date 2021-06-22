package org.example.automatic;

import org.example.split.One;
import org.example.split.Two;

public class OneTwo {

	private final One one = new One();
	private final Two two = new Two();

	public void foobar() {
		System.out.println("one: " + one + " two: " + two);
	}

}
