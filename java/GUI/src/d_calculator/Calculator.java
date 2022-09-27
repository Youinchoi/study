package d_calculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

// https://code-review.tistory.com/84



public class Calculator extends JFrame{
	
	private JTextField inputSpace;
	
	// 계산식의 숫자를 담을 변수 num
	private String num = "";
	
	// 계산 기능을 구현하기 위해 ArrayList에 숫자와 연산 기호를 하나씩 구분해 담음
	private ArrayList<String> equation = new ArrayList<String>();
	
	public Calculator () {
		
		//계산기의 화면과 버튼을 붙임 - 기본 레이아웃 사용
		setLayout(null);
		
		//빈공간의 JTextField 생성
		inputSpace = new JTextField();
		
		//편집가능여부 : 불가능 (버튼만 사용)
		inputSpace.setEditable(false);
		
		// 배경색 설정
		inputSpace.setBackground(Color.white);
		
		// 정렬 위치 설정
		inputSpace.setHorizontalAlignment(JTextField.RIGHT);
		
		// 글씨체 설정
		inputSpace.setFont(new Font("Arial", Font.BOLD, 50));
		
		// 위치와 크기 (x:8,y:10의 위치에 270x70의 크기)
		inputSpace.setBounds(8,10,270,70);
		
		// ---------------------------------------------------
		
		// 버튼을 만들 패널
		JPanel buttonPanel = new JPanel();
		
		// 레이아웃 지정 - 격자 형태로 배치해주는 GridLayout 사용
		//GridLayout(4, 4, 10, 10) -> 가로 칸수, 세로 칸수, 좌우 간격, 상하 간격
		buttonPanel.setLayout(new GridLayout(4,4,10,10));
		
		// 위치와 크기 설정
		buttonPanel.setBounds(8,90,270,235);
		
		// ---------------------------------------------------
		
		//계산기 버튼의 글자를 차례대로 배열에 저장
		String button_names[] = {"C", "/", "X", "=", 
								 "7", "8", "9", "+", 
								 "4", "5", "6", "-", 
								 "1", "2", "3", "0"}; // 총 16개
		JButton buttons[] = new JButton[button_names.length];
		
		// ---------------------------------------------------
		
		// 배열을 이용하여 버튼 생성
		for (int i = 0; i<button_names.length; i++) {
			buttons[i] = new JButton(button_names[i]);
			
			// 글씨체
			buttons[i].setFont(new Font("Arial", Font.BOLD, 20));
			
			//버튼의 색 지정
			if(button_names[i]=="C") buttons[i].setBackground(Color.red);
			else if((i>=4 && i <= 6) || (i>=8 && i <= 10) || (i>=12 && i <= 14)) buttons[i].setBackground(Color.black);;
//			else buttons[i].setBackground(Color.gray);
			
			//글자색 지정
			buttons[i].setForeground(Color.WHITE);
			
			//테두리 없앱
			buttons[i].setBorderPainted(false);
			
			//밑에서 만든 액션리스너를 버튼에 추가
			buttons[i].addActionListener(new PadActionListener());
			
			//버튼들을 버튼패널에 추가
			buttonPanel.add(buttons[i]);
			
		}
		
		// ---------------------------------------------------
		
		add(inputSpace);	
		add(buttonPanel); //버튼 패널 추가
		
		// 창의 제목, 사이즈, 보이기 여부 등을 지정해줌
		setTitle("계산기");
		setVisible(true);
		setSize(300,370);
		
		// 화면의 가운데에 띄움
		setLocationRelativeTo(null);
		
		// 사이즈 조절 불가능
		setResizable(false);
		
		// 창을 닫을 때, 실행중인 프로그램도 같이 종료 되도록 함
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	//만들어놓은 버튼에 액션 리스너 기능 추가
	//액션리스너를 상속시켜주고 actionPerformed(ActionEvent e)메소드로 이벤트 처리
	class PadActionListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			//어떤 버튼이 눌렸는지를 알아냄
			String operation = e.getActionCommand();
			
			//C가 눌렸을 경우 위의 계산식 내용을 지워줌
			if (operation.equals("C")) {
				inputSpace.setText("");
				
			//=이 눌렸을 경우 위에 입력된 식을 계산, 계산값이 나오도록 함
			}else if (operation.equals("=")) {
				//밑의 메소드들을 이용하여 계산, 계산식 화면에 값을 띄워줌
//				String result = Double.toString(calculate(inputSpace.getText()));
//				inputSpace.setText("" + result);
				num = "";
			//나버지 버튼은 눌렀을 때 계산식에 추가됨
			}else {
				inputSpace.setText(inputSpace.getText() + e.getActionCommand());
			}
			
		}
		
	}
	
	// ---------------------------------------------------
	
	private void fullTextParsing(String inputText) {
		equation.clear();
		
		
		
		
		
	}
	
	
	

	public static void main(String[] args) {
		
		new Calculator();
		
	}

}
