import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ROSIPA extends JFrame  {
	static final int SICSSOR = 0;
	static final int ROCK = 1;
	static final int PAPER = 2;
	
	JButton ro,si,pa;
	JPanel pan;
	JTextField RSP, output;
	
	ROSIPA (){
		setTitle("가위 바위 보");
		setSize(400, 300);

		RSP = new JTextField();
		RSP.setText("가위 바위 보");
		
		pan = new JPanel();
		pan.setLayout(new GridLayout(0,3));
		
		
		pan.add(ro);
		pan.add(si);
		pan.add(pa);
		
		ro = new JButton("바위");
		ro.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Random r = new Random();
				int com = r.nextInt(3);
				
				if(e.getSource() == ro)
					if(com == SICSSOR)
						output.setText("승리");
					else if(com == PAPER)
						output.setText("패배");
					else
						output.setText("무승부");
						
			}
		});
		
		si = new JButton("가위");
		si.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Random r = new Random();
				int com = r.nextInt(3);
				
				if(e.getSource() == si)
					if(com == SICSSOR)
						output.setText("무승부");
					else if(com == PAPER)
						output.setText("승리");
					else
						output.setText("패배");
			}
		});
		
		pa = new JButton("보");
		pa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Random r = new Random();
				int com = r.nextInt(3);
				
				if(e.getSource() == pa)
					if(com == SICSSOR)
						output.setText("패배");
					else if(com == PAPER)
						output.setText("무승부");
					else
						output.setText("승리");
			}
		});
		
		add(RSP, BorderLayout.NORTH);
		add(output, BorderLayout.SOUTH);
		add(pan, BorderLayout.CENTER);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new ROSIPA();
	}
}
