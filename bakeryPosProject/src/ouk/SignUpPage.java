package ouk;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;


public class SignUpPage extends JFrame implements ActionListener {
	
	JLabel lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7;
	JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8;
	EmptyBorder b1 = new EmptyBorder(5,3,5,3);
	JButton jb1, jb2;
	ImageIcon icon;
	public SignUpPage() {
	//StartPage
			setTitle("Manager SingUp");
			setSize(416, 539);
			setLocationRelativeTo(this);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLayout(new BorderLayout());
			
			icon = new ImageIcon("images/signUp.jpg");
			
			JPanel jp = new JPanel() {
				public void paintComponent(Graphics g) {
					g.drawImage(icon.getImage(), 0, 0,null);
					setOpaque(false);
					super.paintComponent(g);
				}
			};
			jp.setLayout(null);
			add(jp);
			
			tf1= new JTextField();
			tf1.setBounds(176, 153, 130, 25);
			jp.add(tf1);
			
			tf2= new JTextField();
			tf2.setBounds(176, 183, 130, 25);
			jp.add(tf2);
			
			tf3= new JTextField();
			tf3.setBounds(176, 218, 130, 25);
			jp.add(tf3);
			
			tf4= new JTextField();
			tf4.setBounds(176, 248, 130, 25);
			jp.add(tf4);
			
			tf5= new JTextField();
			tf5.setBounds(176, 280, 130, 25);
			jp.add(tf5);
			
			tf6= new JTextField();
			tf6.setBounds(176, 310, 130, 25);
			jp.add(tf6);
			
			tf7= new JTextField();
			tf7.setBounds(176, 340, 130, 25);
			jp.add(tf7);
			
			jb1 = new JButton();
			jb1.addActionListener(this);
			jb1.setBounds(164, 377, 74, 27);
			jp.add(jb1);
			jb1.setBorder(b1);
			jb1.setOpaque(false);
			jb1.setBackground( new Color(0, 0, 0, 200));
			jb1.setBounds(219, 270, 74, 28);
			
			setVisible(true);
			}

	public static void main(String[] args) {
		new SignUpPage();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == jb1) {
			
		}
		
	}
}
