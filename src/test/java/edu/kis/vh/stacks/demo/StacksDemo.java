package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;
import edu.kis.vh.stacks.factory.StacksFactory;
import edu.kis.vh.stacks.factory.StacksUsingArrayFactory;
import edu.kis.vh.stacks.factory.StacksUsingListFactory;

class StacksDemo {

	public static void main(String[] args) {
		DefaultStacksFactory factory = new DefaultStacksFactory();
		StacksUsingArrayFactory stacksUsingArrayFactory = new StacksUsingArrayFactory();
		StacksUsingListFactory stacksUsingListFactory = new StacksUsingListFactory();

		testStacks(factory);
		testStacks(stacksUsingListFactory);
		testStacks(stacksUsingArrayFactory);
	}

	private static void testStacks(StacksFactory factory) {
		Stack[] stacks = { factory.getStandardStack(), factory.getFalseStack(), factory.getFIFOStack(),
				factory.getHanoiStack() };

		for (int i = 1; i < 15; i++)
			for (int j = 0; j < 3; j++)
				stacks[j].push(i);

		// java.util.Random rn = new java.util.Random(); // błędne wcięcia w
		// kodzie w komentarzu
		// for (int i = 1; i < 15; i++)
		// stacks[3].push(rn.nextInt(20));
		//
		// for (int i = 0; i < stacks.length; i++) {
		// while (!stacks[i].isEmpty())
		// System.out.print(stacks[i].pop() + " ");
		// System.out.println(); // wyjście poza pętle - błędne wcięcie
		// }

		java.util.Random rn = new java.util.Random();
		for (int i = 1; i < 15; i++)
			stacks[3].push(rn.nextInt(20));

		for (int i = 0; i < stacks.length; i++) {
			while (!stacks[i].isEmpty())
				System.out.print(stacks[i].pop() + "  ");
			System.out.println();
		}

		System.out.println("total rejected is " + ((StackHanoi) stacks[3]).reportRejected());
	}

}

// Alt + Strzałka w lewo  oraz Alt + Strzałka w prawo przemieszcza do miejsc zmian w projekcie.