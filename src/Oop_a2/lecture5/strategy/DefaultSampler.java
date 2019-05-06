package Oop_a2.lecture5.strategy;

public class DefaultSampler implements Sampler{

	public double read() {
		return Math.random() * 100;
	}
}