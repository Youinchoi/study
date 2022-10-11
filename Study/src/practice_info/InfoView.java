package practice_info;


import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

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

import practice_info.InfoModelImpl;

public class InfoView {
	
	// 1. 멤버변수선언
	
	JFrame f;
	JTextField tf, tfName, tfId, tfTel, tfGender, tfAge, tfHome;
	JTextArea ta; 
	JButton bAdd , bShow, bSearch, bDelete, bCancle, bModify;
	
	infoModel model;
	
	
	// 2. 멤버변수 객체 생성
	
	InfoView(){
		f = new JFrame("DB Test");
		
		ta = new JTextArea();
		
		// 텍스트 입력공간 (라벨 + 텍스트 필드)
		tfName = new JTextField("", 25); // 칸 공백으로 만들기, 15사이즈 /  15 한 번만 넣어도 적용됨 
		tfId = new JTextField("");
		tfTel = new JTextField("");
		tfGender = new JTextField("");
		tfAge = new JTextField("");
		tfHome = new JTextField("");
		
		// 아래쪽 버튼
		bAdd = new JButton("Add");
		bShow = new JButton("Show");
		bSearch = new JButton("Search");
		bDelete = new JButton("Delete");
		bCancle = new JButton("Cancle");
		bModify = new JButton("수정하기");
		
//		try { // 이미지 삽입
//			bAdd.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("add.png"))));
//			bShow.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("show.png"))));
//			bSearch.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("search.png"))));
//			bDelete.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("delete.png"))));
//			bCancle.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("cancle.png"))));
//			bModify.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("exit.png"))));
//			System.out.println();
//		}catch (Exception ex) {
//			System.out.println("no Image");
//		}
		
		try {
			model = new InfoModelImpl();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
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
		pSouth.add(bModify);
		f.add(pSouth,BorderLayout.SOUTH); 
		
		f.add(ta, BorderLayout.CENTER);
		
		
		// 창 크기 및 설정
		f.setBounds(200,200,1200,650);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	void eventProc() {
		// ADD 버튼이 눌렸을 때
		bAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertData();
			}
		});
		
		// SHOW 버튼이 눌렸을 때
		bShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectAll();
			}
		});
		
		// SEARCH 버튼이 눌렸을 때
		bSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectByTel();
			}
		});
				
		tfTel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectByTel();
			}
		});	
		
		// DELETE 버튼이 눌렸을 때
		bDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deletebyTel();
			}
		});	
		
		// MODIFY 버튼이 눌렸을 때
		bModify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modifybyTel();
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
				
		
	} // end of eventProc
	
	// 수정
	void modifybyTel() {
		
		try {
			String tel = tfTel.getText();
			InfoVO vo = new InfoVO();
			
			// tfName.setText(vo.getName());
			
			vo.setName(tfName.getText());
			vo.setId(tfId.getText());
			vo.setTel(tfTel.getText());
			vo.setGender(tfGender.getText());
			vo.setAge(Integer.parseInt(tfAge.getText()));
			vo.setHome(tfHome.getText());
			
			model.modify(vo);
			
		}catch(SQLException e){
			ta.setText("수정 실패 : " + e.getMessage());
		}
	}
	
	// 삭제
	void deletebyTel() {
		
		// (1) 입력한 전화번호 값을 얻어오기
		String tel = tfTel.getText();
		
		try {
			// (2) 모델단에 selectByTel() 호출
			model.delete(tel);
			// (3) 화면을 지우기
			clearText();
			
		}catch(SQLException e){
			ta.setText("삭제 실패 : " + e.getMessage());
		}
					
	}
	
	
	//
	void selectByTel() {
		
		try {
			// (1) 입력한 전화번호 값을 얻어오기
			String tel = tfTel.getText();
			
			// (2) 모델단에 selectByTel() 호출
			InfoVO vo = model.selectByTel(tel);
			
			// (3) 받은 결과를 각각의 텍스트 팔드에 지정(출력)
			tfName.setText(vo.getName());
			tfId.setText(vo.getId());
			tfTel.setText(vo.getTel());
			tfGender.setText(vo.getGender());
			tfAge.setText(String.valueOf(vo.getAge()));
			tfHome.setText(vo.getHome());
			
		}catch(Exception ex) {
			ta.setText("전화번호 검색 실패 : " + ex.getMessage());
		}
		
	}
	
	
	
	void selectAll() {
		try {
			ArrayList<InfoVO> data = model.selectAll();
			ta.setText("-----검색결과----- \n\n");
			for(InfoVO vo : data) {
				ta.append(vo.toString());
			}
			
			
		} catch (SQLException e) {
			ta.setText("검색 실패 : " + e.getMessage());
		}
	}
	
	void insertData() {
		
		// (1) 사용자 입력값 얻어오기
		String name = tfName.getText();
		String id = tfId.getText();
		String tel = tfTel.getText();
		String gender = tfGender.getText();
		int age = Integer.parseInt(tfAge.getText()) ;
		String home = tfHome.getText();
		
		// (2) 1번 값들을 InfoVO 에 지정 - (1) 생성자 (2) setter
		InfoVO vo = new InfoVO();
		
		vo.setName(name);
		vo.setId(id);
		vo.setTel(tel);
		vo.setGender(gender);
		vo.setAge(age);
		vo.setHome(home);
		
		// (3) 모델의 insertInfo() 호출
		try {
			model.insertInfo(vo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// (4) 화면의 입력값들을 지우기 
		clearText();
	}
	
	void clearText(){
		tfName.setText(null);
		tfId.setText(null);
		tfTel.setText(null);
		tfGender.setText(null);
		tfAge.setText(null);
		tfHome.setText(null);
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
	
	
	public static void main(String[] args) { // 출력
		
		InfoView info = new InfoView();
		info.addLayout();
		info.eventProc();
		
	}

}
