import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RockPaperScissor_201712111 extends JFrame implements ActionListener{

	static final int SI=0;
	static final int RO=0;
	static final int PA=0;
	
	JTextField st,fin;
	JButton si,ro,pa;
	JPanel pan;
	
	RockPaperScissor_201712111(){
		fin=new JTextField();
		st=new JTextField("�Ʒ��� ��ư �߿��� �ϳ��� Ŭ���Ͻÿ�!");
		pan=new JPanel();
		pan.setLayout(new GridLayout(0, 3));
		
		si=new JButton("����");
		si.addActionListener(this);
		ro=new JButton("����");
		ro.addActionListener(this);
		pa=new JButton("��");
		pa.addActionListener(this);
		
		pan.add(si);
		pan.add(ro);
		pan.add(pa);
		
		add(fin, BorderLayout.SOUTH);
		add(pan, BorderLayout.CENTER);
		add(st, BorderLayout.NORTH);
		
		setTitle("����, ����,��");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Random r=new Random();
		int com=r.nextInt(3);
		
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
		new RockPaperScissor_201712111();
	}


}
