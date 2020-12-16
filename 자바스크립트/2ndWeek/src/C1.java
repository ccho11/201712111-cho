import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class C1 extends JFrame {

	JTextField fin;
	JButton[] bt;
	JPanel pan;
	String[] lab= {
			"","","","","",
			"","","","","",
			"","","","","",
			"","","","","",
			"","","","","",
			
	};
	
	C1(){
		fin=new JTextField(35);
		pan=new JPanel();
		fin.setText("0.");
		fin.setEnabled(false);
		pan.setLayout(new GridLayout(0, 5, 3, 3));
		
		bt=new JButton[25];
		int i=0;
		for(int r=0; r<5; r++) {
			for(int c=0; c<5; c++) {
				bt[i]=new JButton(lab[i]);
				if(c>=3)
					bt[i].setForeground(Color.red);
				else
					bt[i].setForeground(Color.blue);
				
				pan.add(bt[i]);
				i++;
			}
		}
		add(fin,BorderLayout.NORTH);
		add(pan,BorderLayout.CENTER);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1 c=new C1();
	}

}
