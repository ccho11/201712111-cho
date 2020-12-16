import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KK extends JFrame implements ActionListener {

	JTextField txt;
	JPanel pan;
	
	
	KK(){
		txt = new JTextField(20);
		add(txt, BorderLayout.NORTH);
		pan = new JPanel();
		pan.setLayout(new GridLayout(3, 3));
		add(pan, BorderLayout.CENTER);
		for(int i=1; i<=9; i++) {
			JButton bt = new JButton(""+i);
			bt.addActionListener(this);
			bt.setPreferredSize(new Dimension(100, 100));
			pan.add(bt);
		}
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String LL = e.getActionCommand();
		txt.setText(txt.getText()+LL);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KK();
	}


}
