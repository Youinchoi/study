package d_calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;

public class CalTest {
	
	// 1. 멤버 변수 선언
		JFrame f;
		
		JTextField tf;
		
		// 5행 3열 
		JButton [] bNum = new JButton[10]; // 0~9까지의 숫자를 표현
		JButton [] bOp= new JButton[4]; // + - * /
		JButton bEqual;
		
		String sign, val1, val2;

		int result = 0;
		
	
	// 2. 객체 생성
	CalTest(){
		
		f = new JFrame("유치원"); // 창 이름
		tf = new JTextField(); // 출력창
		
		bNum = new JButton[10]; // 숫자 버튼
		for(int i = 0; i<bNum.length;i++) {
		bNum[i]	= new JButton(String.valueOf(i));
		}
		
		bOp= new JButton[4]; // 기호 버튼 
		String a[] = {"+","-","*","/"};
		for(int i = 0; i<bOp.length; i++) 
		bOp[i] = new JButton(a[i]);
		
		bEqual = new JButton("=");
		
	} // end of CalTest
	
	
	
	// 3. 화면 구성 및 화면 출력
	void addLayout() {
		f.setLayout(new BorderLayout());
	
		JPanel pSouth = new JPanel();
		pSouth = new JPanel(new GridLayout(5,3));
		
		for(int i = 1; i<bNum.length; i++)
		pSouth.add(bNum[i]);
		
		pSouth.add(bOp[0]);
		pSouth.add(bNum[0]);
		pSouth.add(bEqual);
		pSouth.add(bOp[1]);
		pSouth.add(bOp[2]);
		pSouth.add(bOp[3]);
		
		f.add(tf, BorderLayout.NORTH);
		f.add(pSouth, BorderLayout.CENTER);
		
		
	// 창 크기 및 설정
	f.setBounds(200,200,650,350);
	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	tf.setSize(600,200); //??????
	
	} // end of addLayout
	
	
	//4. 이벤트 처리
	void eventProc() {
		
		// 숫자 버튼이 눌렸을 때
		for(int i = 0; i<bNum.length; i++) {
			bNum[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// 이벤트가 발생한 컴포넌트의 참조를 얻어옴 
					JButton nBtn = (JButton)e.getSource();
					
					String num;
					if(tf.getText().equals("+") || tf.getText().equals("-") 
					|| tf.getText().equals("*") || tf.getText().equals("/")) {
						num = nBtn.getText();
					} else {
						num = tf.getText()+nBtn.getText(); // 숫자가 연속으로 찍히도록
					}
					
					val1 = num; // 숫자를 저장할 값
					
					tf.setText(num);
					
				}
				});
		}
		
		// 연산자 버튼이 눌렸을 때
		for(int i = 0; i<bOp.length; i++) {
			bOp[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					JButton xBtn = (JButton)e.getSource();
					
					String eOp =  xBtn.getText();
					sign = eOp;

					tf.setText(eOp);
					
					if(val1 != null) { // != : 두 값이 다르면 true, 아니면 false, 초기값 지정
						val2 = val1; 
						val1 = null;
					}
				}
				});
		}
		
		
		// "=" 버튼이 눌렸을 때 
		bEqual.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton eBtn = (JButton)e.getSource();
				
				 if(sign.equals("+")) { // 값 출력
		               result = Integer.parseInt(val2) + Integer.parseInt(val1);
		            }else if(sign.equals("-")) {
		            	result = Integer.parseInt(val2) - Integer.parseInt(val1);
		            }else if(sign.equals("*")) {
		            	result = Integer.parseInt(val2) * Integer.parseInt(val1);
		            }else if(sign.equals("/")) {
		            	result = Integer.parseInt(val2) / Integer.parseInt(val1);
		            }
				
				tf.setText(String.valueOf(result));
				JOptionPane.showMessageDialog(null, result);
				tf.setText("");
				
				} 
			});
		
		
	} // end of eventProc
	
	void insert(JButton btn) {
	      String num = btn.getText();
	      String text = tf.getText();
	      tf.setText(text+num);
	   }

	
	
	public static void main(String[] args) {
		CalTest cal = new CalTest();
		cal.addLayout();
		cal.eventProc();
		
	}

}
