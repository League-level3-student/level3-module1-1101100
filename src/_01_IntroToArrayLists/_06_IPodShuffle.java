package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.
		b1.setText("song1");
		b2.setText("song2");
		b3.setText("song3");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		frame.setTitle("IPod Shuffler");
		frame.add(panel);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		frame.setVisible(true);
		frame.pack();	
				
		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you' re really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */
		
	}
	
	public static void main(String[] args) {
		new _06_IPodShuffle();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Song night = new Song("For the Night.mp3");
		Song onMe = new Song("Got it on Me.mp3");
		Song move = new Song("You Better Move.mp3");
		JButton buttonPressed =(JButton) e.getSource();
		if (buttonPressed.equals(b1)) {
			night.play();
		
		} else if (buttonPressed.equals(b2)) {
			onMe.play();
	
		}else if (buttonPressed.equals(b3)) {
			move.play();
		}
	}
}