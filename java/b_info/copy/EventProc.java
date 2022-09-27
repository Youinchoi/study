package b_info.copy;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.Calendar;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class EventProc {
	
	// 1. 멤버변수선언
	
	JFrame f;
	JTextField tf, tfName, tfId, tfTel, tfGender, tfAge, tfHome;
	JTextArea ta; 
	JButton bAdd , bShow, bSearch, bDelete, bCancle, bExit, One, Two;
	
	
	EventProc() {
		
		
		f = new JFrame("DB Test");
		ta = new JTextArea();
		
		// 텍스트 입력공간 (라벨 + 텍스트 필드)
		tfName = new JTextField(" ", 25); // 칸 공백으로 만들기, 15사이즈 /  15 한 번만 넣어도 적용됨 
		tfId = new JTextField(" ");
		tfTel = new JTextField(" ");
		tfGender = new JTextField(" ");
		tfAge = new JTextField(" ");
		tfHome = new JTextField(" ");
		
		// 아래쪽 버튼
		bAdd = new JButton("Add");
		bAdd.setBackground(Color.magenta);
		
		bShow = new JButton("Show");
		bShow.setBackground(Color.blue);
		
		bSearch = new JButton("Search");
		bSearch.setBackground(Color.green);
		
		bDelete = new JButton("Delete");
		bDelete.setBackground(Color.yellow);
		
		bCancle = new JButton("Cancle");
		bCancle.setBackground(Color.orange);
		
		bExit = new JButton("Exit (alt+x)", new ImageIcon("src//b_info//copy//1.PNG/")); // 이미지 삽입 
		
		//f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		bExit.setHorizontalTextPosition(JButton.RIGHT); // 이미지 위치선정
		bExit.setRolloverIcon(new ImageIcon("src//b_info//copy//2.PNG/")); // 마우스를 올리면 이미지 바뀜
		bExit.setPressedIcon(new ImageIcon("src//b_info//copy//3.PNG/"));
		bExit.setToolTipText("프로그램을 종료합니다");
		bExit.setMnemonic('x');
		bExit.setBackground(Color.red);
		
		bShow.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "보여주기");
				
			}
		});
			
		bSearch.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "검색하기");
			
			}
		});
	
		bDelete.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "삭제하기");
			
			}
		});
	
		bCancle.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "취소하기");
			
			}
		});
		
		bAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "추가하기");
				
				}
			});
		
		bExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "강제종료");
				
			}
		});
		
		
		// ----------------------------------------------------------
		
		// 주민번호 입력창에서 엔터 쳤을때
		tfId.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String personal_n = tfId.getText();
			if(personal_n.length()<14) {
				JOptionPane.showMessageDialog(null, "-를 포함한 15자를 맞춰 주세요");
			}
			JOptionPane.showMessageDialog(null, "인적사항을 저장합니다.");
			
		// 주민번호 입력창에서 포커스 이벤트 발생했을 때
	      tfId.addFocusListener(new FocusListener() {

		@Override
		public void focusGained(FocusEvent e) {
			}

		@Override
		public void focusLost(FocusEvent e) {
			getPersonal_n();	
			}
		
		void getPersonal_n() {
			
			// (1) 주민번호의 7번째 문자로 성별을 구하여 성별창에 출력 
			
			char s = personal_n.charAt(7);
			
			if(s=='1' || s=='3' || s=='9'){
				tfGender.setText("남자");
			 }else if(s=='2'|| s=='4'||s=='0') {
				tfGender.setText("여자");
			 }
			
			// (2) 주민번호의 8번째 문자로 출신지를 구하여 Home창에 출력 
			
			char h = personal_n.charAt(8);
			
			String home = null;
			
			switch(h) {
			 case '0' : home = "서울";
			 break;
			 case '1' : home = "인천";
			 break;
			 case '2' : home = "경기";
			 break;
			 case '3' : home = "부산";
			 break;
			 case '9' : home = "제주도";
			 break; }
			
			tfHome.setText(home + "출신");
			
			// (3) 주민번호에서 년도에 의해 나이를 구해서 나이창에 출력 
			
			String nai = personal_n.substring(0,2);
			
			int sunai = Integer.parseInt(nai);
			int age = 0;
			
			Calendar c = Calendar.getInstance();
			 int year = c.get(Calendar.YEAR);
			
			 if(s=='3' || s=='4'){
				 age = year - (2000 + sunai)+1;
			 }else if(s=='1'|| s=='2') {
				 age = year - (1900 + sunai)+1;
			 }
			 
			 tfAge.setText(age + "세");
			 
			
			} // public void actionPerformed
			
			
			}); //addActionListener
			
			// --------------------------------
			
			// 단축키로 창 닫기 
			JPanel jp = new JPanel();
			JButton btn1 = bExit;
	        
	        btn1.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                System.exit(0);
	            }
	        });
			
			
		}
	        	
	        });
			
		
        
        
        //-----------
        
	
	}
	

	
	
	// 3. 화면 구성 & 출력
	
	public void addLayout() {
		
		
		// 화면 구성 버튼 (West)
		
		f.setLayout(new BorderLayout()); // 동서남북센터 설정가능
		JPanel pWest = new JPanel(new GridLayout(6,2)); // pWest를 그리드 형식 레이아웃으로 설정 (6행 2열)
		
		pWest.add(new JLabel("Name", JLabel.CENTER)); // 라벨에 인적사항(Name)을 붙임 + 글자도 가운데로 정렬
		pWest.add(tfName); // 텍스트 필드가 나타나도록 함
		pWest.add(new JLabel("ID", JLabel.CENTER));
		pWest.add(tfId);
		pWest.add(new JLabel("Tel", JLabel.CENTER));
		pWest.add(tfTel);
		pWest.add(new JLabel("Gender", JLabel.CENTER));
		pWest.add(tfGender);
		pWest.add(new JLabel("Age", JLabel.CENTER));
		pWest.add(tfAge);
		pWest.add(new JLabel("Home", JLabel.CENTER));
		pWest.add(tfHome);
		f.add(pWest, BorderLayout.WEST); // pWest를 서쪽 방향으로 정렬
		
		
		// 화면 구성 버튼 (South)
		JPanel pSouth = new JPanel(new GridLayout(1,6));
		
		pSouth.add(bAdd);
		pSouth.add(bShow);
		pSouth.add(bSearch);
		pSouth.add(bDelete);
		pSouth.add(bCancle);
		pSouth.add(bExit);
		f.add(pSouth,BorderLayout.SOUTH); 
		
		
		// 창 크기 및 설정
		f.setBounds(200,200,1200,650);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) { // 출력
		
		EventProc ep = new EventProc();
		ep.addLayout();
		
		
	}

}
