package Oop_a2.lecture5.observer;

public class TestSignal2 {
	public static void main(String[] args) {
		Signal theSignal = new Signal();
		theSignal.addObserver(new StarObserver());
		theSignal.addObserver(new SignalWindow());
	}
}