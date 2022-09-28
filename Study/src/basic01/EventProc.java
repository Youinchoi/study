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
import java.util.ArrayList;
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

	ArrayList <PersonVO> list = new ArrayList <PersonVO>(); // 배열을 사용하여 개인 정보 저장
	
	
	EventProc() {

		// 커스터마이징

		f = new JFrame("DB Test");
		ta = new JTextArea();

		// 텍스트 입력공간 (라벨 + 텍스트 필드)
		tfName = new JTextField("", 25); // 칸 공백으로 만들기, 25사이즈 /  사이즈는 한 번만 넣어도 다른 칸에 적용됨 
		tfId = new JTextField(""); // 따옴표 안에 공백 넣지 말기 (입력 시 자동으로 한 칸 띄워짐)
		tfTel = new JTextField("");
		tfGender = new JTextField("");
		tfAge = new JTextField("");
		tfHome = new JTextField("");

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


		// --------------------------------------------------

		// show 버튼 (보여주기)
		bShow.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				selectAll();
				clearTextField();
			}
		});
		
		// Search 버튼 (번호로 인적사항 불러오기)
		bSearch.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				selectByTel();
			}
		});
		
		// Tel 버튼 (전화번호)
		tfTel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				selectByTel();
				deleteByTel();
			}
		});
		
		// Delete 버튼 (삭제)
		bDelete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "삭제하기");
				deleteByTel();
				selectAll();
			}
		});

		// Cancle 버튼 (입력 취소 후 초기화)
		bCancle.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "입력값을 초기화 합니다");
				clearTextField();
			}
		});
		
		// Add 버튼 (인적사항 추가)
		bAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "인적사항을 추가합니다");
				inputData();
				clearTextField();
				selectAll();
			}
		});

		// Exit 버튼 (나가기)
		bExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "강제종료");

			}
		});
		

		// ----------------------------------------------------------
		
		// ★ 버튼에 효과 추가하기 ★

		// '주민번호 입력창'에서 '엔터' 쳤을때
		tfId.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				getPersonal_n();
			}
		});


		// '주민번호 입력창'에서 '포커스 이벤트 발생'했을 때
		tfId.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
			}

			@Override
			public void focusLost(FocusEvent e) {
				getPersonal_n();	
			}

		});

		// '단축키'로 창 닫기 
		JPanel jp = new JPanel();
		JButton btn1 = bExit;
		
		btn1.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		System.exit(0);
			}
		});
	}


	// ----------------------------------------------------------

	
	void getPersonal_n() {
		String personal_n = tfId.getText(); // 주민번호 칸에 값 입력 (특수기호가 있어 String 사용)
		if(personal_n.length()<14) {
			JOptionPane.showMessageDialog(null, "-를 포함한 15자를 맞춰 주세요");
		}
		JOptionPane.showMessageDialog(null, "인적사항을 저장합니다.");

		// (1) 주민번호의 '7번째 문자'로 '성별'을 구하여 '성별창에 출력'

		char s = personal_n.charAt(7);
		
		if(s=='1' || s=='3' || s=='9'){
			tfGender.setText("남자");
		}else if(s=='2'|| s=='4'||s=='0') {
			tfGender.setText("여자");
		}
		
		// (2) 주민번호의 '8번째 문자'로 '출신지'를 구하여 'Home창에 출력' 

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

		// (3) 주민번호에서 '년도'에 의해 '나이'를 구해서 '나이창에 출력' 

		String nai = personal_n.substring(0,2);

		int sunai = Integer.parseInt(nai);
		int age = 0;

		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);

		if(s=='3' || s=='4'){
			age = year - (2000 + sunai)+1; // 한국식 나이 계산
		}else if(s=='1'|| s=='2') {
			age = year - (1900 + sunai)+1;
		}

		tfAge.setText(String.valueOf(age));


	}

	// Cancle 버튼 눌렀을 때, 입력값 모두 지우기

	void clearTextField() {

		ta.setText(null);
		tfName.setText(null);
		tfId.setText(null);
		tfTel.setText(null);
		tfGender.setText(null);
		tfAge.setText(null);
		tfHome.setText(null);

	}

	// Add 버튼 눌렀을 때, Textfield에 입력한 사용자의 값들을 PersonVo에 값 저장하기

	void inputData() {

		// 1. 각각의 텍스트 필드의 입력값을 얻어오고,
		// 1번의 값들을 PersonVo 멤버변수에 저장 (setter 혹은 constructor 이용)
		PersonVO pvO = new PersonVO();
		pvO.setName(tfName.getText());  
		pvO.setEd(tfId.getText());  
		pvO.setTel(tfTel.getText());  
		pvO.setGender(tfGender.getText());  
		pvO.setAge(Integer.valueOf(tfAge.getText()));
		pvO.setHome(tfHome.getText());  

		list.add(pvO);
		
	}

	void selectAll() { //텍스트 에어리어에 보여지는 것 (show)
		ta.setText("---전체 목록---\n\n"); 
		// 리스트에 저장된 정보를 모두 텍스트 에어리어에 출력 
		for(PersonVO pvO : list) {
			ta.append(pvO.toString());

		}
	}
	
	void deleteByTel() {
		// 입력된 전화번호 값을 얻어오세요
		String tel = tfTel.getText();
		// 입력받은 전화번호가 공백이라면 "전화번호를 입력하세요"라는 메세지 창을 출력
		
		// 리스트에 저장된 PersonVO의 전화번호와 비교하여, 해당 전화번호가 있으면 그 해당하는 PersonVO를 리스트에서 삭제
		// (참고) 삭제하고나서 break로 반복문 끝내기 
		for(PersonVO pvO : list) {if(tel.equals(pvO.getTel())) {
			list.remove(pvO);
			break;
			}
		}
		
	}
	
	void selectByTel() {
		// 입력한 전화번호 값을 얻어오세요
		String tel = tfTel.getText();
		// 입력받은 전화번호가 공백이라면 "전화번호를 입력하세요"라는 메세지 창을 출력 
		if(tel.equals("")) { // 문자열 비교는 equals
			JOptionPane.showMessageDialog(null, "전화번호를 입력하세요");
		return; // 바로 메세지 창을 띄우고 나가기 위함 
		}
		
		// 리스트에 저장된 PersonVO의 전화번호와 비교하여
		// 해당 전화번호가 있으면 그 내용을 각각의 텍스트 필드에 출력 
		for(PersonVO pvO : list) {
			if(tel.equals(pvO.getTel())) {
				tfName.setText(pvO.getName());
				tfId.setText(pvO.getEd());
				tfTel.setText(pvO.getTel());
				tfGender.setText(pvO.getGender());
				tfAge.setText(String.valueOf(pvO.getAge()));
				tfHome.setText(pvO.getHome());
				
				ta.append(pvO.toString());
			}
		}
		
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

		f.add(ta, BorderLayout.CENTER);
		
		// 창 크기 및 설정
		f.setBounds(200,200,900,650);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) { // 출력

		EventProc ep = new EventProc();
		ep.addLayout();



	}

}
