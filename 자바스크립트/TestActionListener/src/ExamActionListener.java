import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.AreaAveragingScaleFilter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ExamActionListener extends JFrame {
	
	JButton btnClick, btnClear;
	JLabel label;
	JPanel panel;
	
	ExamActionListener(){
		setSize(300, 200);
		btnClick = new JButton("���� �ּ���!");
		btnClear = new JButton("������");
		label = new JLabel("��ư�� ������ ���̿���");
		
		btnClick.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				label.setText("��ư�� ���������ϴ�.");
			}
		});
		
		panel = new JPanel();
		panel.add(label);
		panel.add(btnClick);
		panel.add(btnClear);
		
		btnClear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				label.setText("����!");
			}
		});
		
		add(panel, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ExamActionListener();
		
	}

}
