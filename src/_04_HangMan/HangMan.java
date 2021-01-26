package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan{
	String word;
	int length;
	String text = "";
	Stack<String> words = new Stack<String>();
	public static void main(String[] args) {
		HangMan hangman = new HangMan();
		hangman.setup();
		
	}
	
	void setup() {
		String dictionary = Utilities.readRandomLineFromFile("dictionary.txt");
		words.push(dictionary);
		word = words.pop().toString();
		length = word.length();
		JFrame frame = new JFrame();
		JLabel label = new JLabel();
		JPanel panel = new JPanel();
		frame.setSize(500, 500);
		panel.add(label);
		frame.add(panel);
		frame.setVisible(true);
	}
	
	void guessWord() {
		for(int i = 0; i < length ; i++) {
			text += "_ ";
		}
		
	}
	
	
}
