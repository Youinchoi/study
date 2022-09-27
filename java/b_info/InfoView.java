package b_info;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class InfoView {
	
	// 1. 멤버변수선언
	
	JFrame f;
	JTextField tf, tfName, tfId, tfTel, tfGender, tfAge, tfHome;
	JTextArea ta; 
	JButton bAdd , bShow, bSearch, bDelete, bCancle, bExit;
	
	
	// 2. 멤버변수 객체 생성
	
	InfoView(){
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
		bShow = new JButton("Show");
		bSearch = new JButton("Search");
		bDelete = new JButton("Delete");
		bCancle = new JButton("Cancle");
		bExit = new JButton("Exit");
		
		try { // 이미지 삽입
			bAdd.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("add.png"))));
			bShow.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("show.png"))));
			bSearch.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("search.png"))));
			bDelete.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("delete.png"))));
			bCancle.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("cancle.png"))));
			bExit.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("exit.png"))));
			System.out.println();
		}catch (Exception ex) {
			System.out.println("no Image");
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
		
		
		// 창 크기 및 설정
		f.setBounds(200,200,1200,650);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) { // 출력
		
		InfoView info = new InfoView();
		info.addLayout();
		
	}

}
