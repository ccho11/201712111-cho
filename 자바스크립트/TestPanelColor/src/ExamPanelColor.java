import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ExamPanelColor extends JFrame {
	
	ExamPanelColor(){
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		add(panel);
		
		setSize(300,200);
		setTitle("색상테스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new ExamPanelColor();
			

	}

}
