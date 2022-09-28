package e_tabbedPane;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class Maintest {
	
	// 멤버변수 설정 
	JFrame f;
	JButton btn;
	JLabel la;
	
	PanelA panA;
	PanelB panB;
	PanelC panC;
	
	
	Maintest(){
		
		f = new JFrame("나의 창");
		btn = new JButton("확인");
		la = new JLabel("데이터");
		
		panA = new PanelA(this);
		panB = new PanelB();
		panC = new PanelC();
		
		
	}
	
	void addLayout() {
		
		// 레이아웃 설정
		f.setLayout(new BorderLayout());
		f.add(btn, BorderLayout.EAST);
		f.add(la, BorderLayout.SOUTH);
		
		// 탭으로 카테고리 분류
		JTabbedPane tab = new JTabbedPane();
		tab.addTab("Main", panA);
		tab.addTab("Sub", panB);
		tab.addTab("ETC", panC);
		
		f.add(tab, BorderLayout.CENTER);
		
		// 창 기본 세팅
		f.setBounds(100,100,500,400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//end of addLayout
	
	//---------------------------------------------------------
	
	void eventProc() {
		btn.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		//panA안에 들어있는 aLa를 찾아가서 문구를 "welcome"으로 바꾼다
		panA.aLa.setText("Welcome");}
		});
	}// end of eventProc
	
	//---------------------------------------------------------
	
	
	
public static void main(String[] args) {
	
	Maintest test = new Maintest();
	test.addLayout();
	test.eventProc();
	
	}

}
