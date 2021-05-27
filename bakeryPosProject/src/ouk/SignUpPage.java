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
	//StartPage 창 생성
			setTitle("Manager SingUp");
			setSize(300, 350);
			setLocationRelativeTo(this);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLayout(new BorderLayout());
			
			//north 구현
			JPanel north = new JPanel();
			north.setLayout(new FlowLayout());
			lbl1 = new JLabel("관리자 등록");
			north.add(lbl1);
			
			//center 구현
			JPanel center = new JPanel();
			center.setLayout(new GridLayout(6,2,0,10));
			lbl2 = new JLabel("ID");
			lbl3 = new JLabel("PW");
			lbl4 = new JLabel("이름");
			lbl5 = new JLabel("전화번호");
			lbl6 = new JLabel("생년월일");
			lbl7 = new JLabel("사업자 등록 번호");
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
			
			//south 구현
			JPanel south = new JPanel();
			south.setLayout(new FlowLayout());
			jb1 = new JButton("입력 완료");
			jb2 = new JButton("취소");
			south.add(jb1);
			south.add(jb2);
			
			
			
			//전체 구현
			add(north, BorderLayout.NORTH);
			add(center, BorderLayout.CENTER);
			add(south, BorderLayout.SOUTH);
			
			setVisible(true);
			}
}
