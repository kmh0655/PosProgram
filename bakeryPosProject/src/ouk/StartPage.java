package ouk;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
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

public class StartPage extends JFrame implements ActionListener {

	JTextField tfId, tfPw;
	JButton signUp, logIn, cancle;

	public StartPage() {

		// StartPage 창 생성
		setTitle("bakery pos");
		setSize(830, 500);
		setLocationRelativeTo(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new BorderLayout());

		// west 구현
		JPanel west = new JPanel();
		west.setLayout(new FlowLayout());

		ImageIcon image = new ImageIcon("images/StartPageImage.jpg");
		JLabel bakeryImage = new JLabel(image);
		west.add(bakeryImage, BorderLayout.CENTER);

		// east 구현
		JPanel east = new JPanel();
		east.setLayout(new BorderLayout());

		JPanel east1 = new JPanel();
		east1.setLayout(new FlowLayout());
		JLabel jl1 = new JLabel("관리자 로그인");
		east1.add(jl1);

		JPanel east2 = new JPanel();
		east2.setLayout(new BorderLayout());

		JPanel east2_1 = new JPanel();
		east2_1.setLayout(new FlowLayout());
		JLabel id = new JLabel(" I D : ");
		tfId = new JTextField(10);
		east2_1.add(id);
		east2_1.add(tfId);
		east2.add(east2_1);
		
		JLabel pw = new JLabel("PW : ");
		tfPw = new JTextField(10);

		east2_1.add(pw);
		east2_1.add(tfPw);
		
		logIn = new JButton("로그인");
		logIn.addActionListener(this);
		cancle = new JButton("취소");
		east2_1.add(logIn);
		east2_1.add(cancle);

		/*JPanel east2_2 = new JPanel();
		east2_2.setLayout(new FlowLayout());
		JLabel pw = new JLabel("PW : ");
		tfPw = new JTextField(10);

		east2_2.add(pw);
		east2_2.add(tfPw);*/
		
	

		/*JPanel east2_3 = new JPanel();
		east2_3.setLayout(new FlowLayout());
		logIn = new JButton("로그인");
		cancle = new JButton("취소");
		east2_3.add(logIn);
		east2_3.add(cancle);*/

		east2.add(east2_1, BorderLayout.CENTER);
		
		//east2.add(east2_2, BorderLayout.CENTER);
		//east2.add(east2_3, BorderLayout.SOUTH);
		

		JPanel east3 = new JPanel();
		east3.setLayout(new FlowLayout());
		signUp = new JButton("관리자 등록");
		signUp.addActionListener(this);
		east3.add(signUp);
		east2.add(east3, BorderLayout.SOUTH);
		

		east.add(east1, BorderLayout.NORTH);
		east.add(east2, BorderLayout.CENTER);
		//east.add(east3,BorderLayout.SOUTH);

		// 전체 구현
		add(west, BorderLayout.WEST);
		add(east, BorderLayout.CENTER);

		setVisible(true);
	}

	public static void main(String[] args) {
		new StartPage();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object obj = e.getSource();
		if (obj == signUp) {
			new SignUpPage();
		} else if(obj == logIn) {
			new MainPage();
		}

	}

}
