package Oop_a2.lecture5.observer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

public class Signal {
	private double amplitude;
	private final int SAMPLING = 1000;
	private ArrayList<SignalObserver> myObservers1;

	public void addObserver(SignalObserver s) {
		myObservers1.add(s);
	}

	public Signal() {
		myObservers1 = new ArrayList<SignalObserver>();

		Timer t = new Timer(SAMPLING, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nextValue(Math.random() * 10);
			}
		});
		t.start();
	}

	private void nextValue(double x) {
		amplitude = x;
		for (SignalObserver so : myObservers1) {
		    so.updateSignal(amplitude);}
	}
}