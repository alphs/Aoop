package Oop_a2.lecture5.observer;

import Oop_a2.lecture5.strategy.DefaultSampler;

public class TestSignal1 {

	DefaultSampler sampler = new DefaultSampler();

	public static void main(String[] args) {
		Signal theSignal = new Signal();

		theSignal.addObserver(new SignalObserver() {
			public void updateSignal(double x) {
				printStars((int)x);
			}
		});

	}
	
	private static void printStars(int x) {
		for (int i = 0; i < x; i++) {
			System.out.print("*");
		}
		System.out.println();		
	}

}
