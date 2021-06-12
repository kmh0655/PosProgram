package ouk;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;


public class StartPage extends JFrame implements ActionListener  {

	JTextField tfId, tfPw;
	JButton signUpbtn, logInBtn, exitBtn;
	ImageIcon managerLoginIcon, logInNomalIcon, logInClickedIcon, exitIcon, exitClickedIcon;
	EmptyBorder b1 = new EmptyBorder(5,3,5,3);

	public StartPage() {
		
		// StartPage
		setTitle("bakery pos");
		setSize(616, 489);
		setLocationRelativeTo(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new BorderLayout());
		
		
		
		managerLoginIcon = new ImageIcon("images/managerLoginPage.jpg");
		logInNomalIcon = new ImageIcon("images/logInbtnNomal.jpg");
		logInClickedIcon = new ImageIcon("images/logInbtnClicked.jpg");
		exitIcon = new ImageIcon("images/exitbtn.jpg");
		exitClickedIcon = new ImageIcon("images/exitClicked.jpg");
		
		
		
		JPanel jp = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(managerLoginIcon.getImage(), 0, 0,null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		add(jp);
		
		jp.setLayout(null);
		
		tfId = new JTextField(10);
	
		tfId.setBounds(285, 192, 130, 30);
		
		tfPw = new JTextField(10);
		tfPw.setBounds(285, 222, 130, 30);
		
		
		
		logInBtn = new JButton();
		logInBtn.setIcon(logInNomalIcon);
		logInBtn.setPressedIcon(logInClickedIcon);
		logInBtn.addActionListener(this);
		logInBtn.setBorder(b1);
		logInBtn.setOpaque(false);
		logInBtn.setBounds(267, 262, 74, 28);
		
		exitBtn = new JButton();
		exitBtn.setIcon(exitIcon);
		exitBtn.setPressedIcon(exitClickedIcon);
		exitBtn.addActionListener(this);
		exitBtn.setBorder(b1);
		exitBtn.setOpaque(false);
		exitBtn.setBackground( new Color(0, 0, 0, 200));
		exitBtn.setBounds(284, 362, 32, 32);
		
		//프레임 구성;
		
		
		jp.add(logInBtn);
		jp.add(exitBtn);
		jp.add(tfId);
		jp.add(tfPw);
		
		
		setVisible(true);
	}
	

	public static void main(String[] args) {
		new StartPage();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == logInBtn) {
			new MainPage();
		}else if(obj == exitBtn) {
			System.exit(0);
		}
	}

	

}
