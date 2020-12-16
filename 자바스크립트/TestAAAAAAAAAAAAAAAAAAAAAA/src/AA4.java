import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AA4 extends JFrame implements ActionListener{

	static final int SI=0;
	static final int RO=1;
	static final int PA=2;
	
	JTextField fin;
	JButton si,ro,pa;
	JPanel pan;
	
	AA4(){
		fin=new JTextField();
		pan=new JPanel();
		pan.setLayout(new GridLayout(0, 3));
		
		si=new JButton("가위");
		si.addActionListener(this);
		ro=new JButton("바위");
		ro.addActionListener(this);
		pa=new JButton("보");
		pa.addActionListener(this);
		
		pan.add(si);
		pan.add(ro);
		pan.add(pa);
		
		add(fin, BorderLayout.SOUTH);
		add(pan, BorderLayout.CENTER);
		
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int com = r.nextInt(3);
		
		if(e.getSource()==si)
			if(com==SI)
				fin.setText("draw");
			else if(com==RO)
				fin.setText("lose");
			else
				fin.setText("win");
		else if(e.getSource()==ro)
			if(com==SI)
				fin.setText("win");
			else if(com==RO)
				fin.setText("draw");
			else
				fin.setText("lose");
		else if(e.getSource()==pa)
			if(com==SI)
				fin.setText("lose");
			else if(com==RO)
				fin.setText("win");
			else
				fin.setText("draw");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AA4();
	}



}
