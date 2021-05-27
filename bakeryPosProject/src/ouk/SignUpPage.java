package ouk;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;


public class SignUpPage extends JFrame {
	
	JLabel lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7;
	JTextField tf1, tf2, tf3, tf4, tf5, tf6;
	JButton jb1, jb2;
	
	public SignUpPage() {
	//StartPage â ����
			setTitle("Manager SingUp");
			setSize(300, 350);
			setLocationRelativeTo(this);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLayout(new BorderLayout());
			
			//north ����
			JPanel north = new JPanel();
			north.setLayout(new FlowLayout());
			lbl1 = new JLabel("������ ���");
			north.add(lbl1);
			
			//center ����
			JPanel center = new JPanel();
			center.setLayout(new GridLayout(6,2,0,10));
			lbl2 = new JLabel("ID");
			lbl3 = new JLabel("PW");
			lbl4 = new JLabel("�̸�");
			lbl5 = new JLabel("��ȭ��ȣ");
			lbl6 = new JLabel("�������");
			lbl7 = new JLabel("����� ��� ��ȣ");
			tf1 = new JTextField(10);
			tf2 = new JTextField(10);
			tf3 = new JTextField(10);
			tf4 = new JTextField(10);
			tf5 = new JTextField(10);
			tf6 = new JTextField(10);
			
			center.add(lbl2);
			center.add(tf1);
			center.add(lbl3);
			center.add(tf2);
			center.add(lbl4);
			center.add(tf3);
			center.add(lbl5);
			center.add(tf4);
			center.add(lbl6);
			center.add(tf5);
			center.add(lbl7);
			center.add(tf6);
			
			//south ����
			JPanel south = new JPanel();
			south.setLayout(new FlowLayout());
			jb1 = new JButton("�Է� �Ϸ�");
			jb2 = new JButton("���");
			south.add(jb1);
			south.add(jb2);
			
			
			
			//��ü ����
			add(north, BorderLayout.NORTH);
			add(center, BorderLayout.CENTER);
			add(south, BorderLayout.SOUTH);
			
			setVisible(true);
			}
}
