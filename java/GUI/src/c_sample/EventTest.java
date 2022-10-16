package c_sample;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class EventTest {
	
	JFrame f;
	JButton jbt;
	
	EventTest(){
		
		// 1. 이벤트 핸들러 만들기
		//	핸들러 - 이벤트 처리 클래스
		
		f = new JFrame("Java Class");
		jbt = new JButton("확인");
		
		// 2. 핸들러 객체 생성
		MyHandler hdlr = new MyHandler();
		// 3. 이벤트 발생할 컴포넌트와 연결
		jbt.addActionListener(hdlr);
	}
	
	
	class MyHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			JOptionPane.showMessageDialog(null, "이벤트 발생");
			
		}
	}
	
	public void addLayout() {
		
		// 화면 구성 버튼
		
		f.setLayout(new BorderLayout());
		JPanel pCenter = new JPanel();
		
		pCenter.add(jbt);
		f.add(pCenter,BorderLayout.CENTER);
		
		f.setBounds(100,200,400,150);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		
		EventTest et = new EventTest();
		et.addLayout();
		
	}

}
