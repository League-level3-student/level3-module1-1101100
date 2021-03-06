package _03_IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class _01_IntroToStack {
	public static void main(String[] args) {
		double randDub = Math.random() * 100;
		_01_IntroToStack its = new _01_IntroToStack();
		System.out.println(randDub);
		//1. Create a Stack of Doubles
		//   Don't forget to import the Stack class
		Stack<Double> stack = new Stack<Double>();
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		for(int i = 0; i < 100; i++) {
			stack.push(randDub);
		}
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		String num2 = JOptionPane.showInputDialog("ENTER a number between 0 and 100");
		String num3 = JOptionPane.showInputDialog("ENTER a second number between 0 and 100");
		int num4 = Integer.parseInt(num2);
		int num5 = Integer.parseInt(num3);
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		for (int i = 0; i < stack.size();) {
			Double num6 = stack.pop();
			if (num6 > num4 && num6 < num5) {
				System.out.println(num6);
			}
		
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
		}
	}
}
