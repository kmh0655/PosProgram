package ouk;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPage extends JFrame implements ActionListener {
	
	JButton btnMenu, btnSales, btnMember;
	
	public MainPage() {
		setTitle("Main");
		setSize(830, 500);
		setLocationRelativeTo(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		//north
		JPanel north = new JPanel();
		north.setLayout(new FlowLayout());
		btnMenu = new JButton("포스");
		btnMenu.addActionListener(this);
		btnSales = new JButton("매출액 확인");
		btnSales.addActionListener(this);
		btnMember = new JButton("회원 관리");
		btnMember.addActionListener(this);
		
		north.add(btnMenu);
		north.add(btnSales);
		north.add(btnMember);
		
		//center
		JPanel south = new JPanel();
		south.setLayout(new FlowLayout());
		ImageIcon image = new ImageIcon("images/mainPageImage3.jpg");
		JLabel lblImage = new JLabel(image);
		south.add(lblImage);
		
		
		//전체
		add(north,BorderLayout.NORTH);
		add(south,BorderLayout.CENTER);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == btnMenu) {
			new PosPage();
		}else if(obj == btnSales) {
			new SalesPage();
		}else if(obj == btnMember) {
			new MemberPage();
		}
		
	}
}
