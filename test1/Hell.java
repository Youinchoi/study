package project;

import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.JList;
import java.awt.Scrollbar;

public class Hell extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
//	private JFrame JoinFrame;
	
	// 로그인 멤버변수
//	private JPanel contentPane1;
//	private JTextField tfUsername, tfPassword;
//	private JButton loginBtn, joinBtn;
	
	
	// 윈도우빌더로 만든 키오스크 실행 섹션
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hell frame = new Hell();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	// pc방 제휴 이벤트 중인 사이트 팝업
	try {
	Desktop.getDesktop().browse(new URI("https://www.leagueoflegends.com/ko-kr/news/notices/2022-sg-pc-event-article-kr/"));
		} catch (IOException e) {
	e.printStackTrace();
		} catch (URISyntaxException e) {
	e.printStackTrace();
		}
	
//	// 회원 전용 로그인 창 팝업
//	EventQueue.invokeLater(new Runnable() {
//		public void run() {
//			try {
//				Hell frame = new Hell();
//				
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//	});
	
	
	}
	
	
	public Hell() {
		
//		// 로그인 창 셋업
//		
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setSize(400, 300);
//		setLocationRelativeTo(null);
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setContentPane(contentPane);
//		contentPane.setLayout(null);
//		
//		JLabel lblLogin = new JLabel("username");
//		lblLogin.setBounds(41, 52, 69, 35);
//		contentPane.add(lblLogin);
//		
//		JLabel lblPassword = new JLabel("Password");
//		lblPassword.setBounds(41, 103, 69, 35);
//		contentPane.add(lblPassword);
//		
//		tfUsername = new JTextField();
//		tfUsername.setBounds(157, 52, 176, 35);
//		contentPane.add(tfUsername);
//		tfUsername.setColumns(10);
//		
//		joinBtn = new JButton("회원가입");
//		joinBtn.setBounds(229, 154, 104, 29);
//		contentPane.add(joinBtn);
//		
//		loginBtn = new JButton("로그인");
//		loginBtn.setBounds(108, 154, 106, 29);
//		contentPane.add(loginBtn);
//		
//		tfPassword = new JTextField();
//		tfPassword.setColumns(10);
//		tfPassword.setBounds(157, 103, 176, 35);
//		contentPane.add(tfPassword);
//		
//		setVisible(true);
		
		// -----------
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 914, 575);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("☆★☆☆★☆ KOSMO PC CAFE ☆★☆☆★☆");
		lblNewLabel.setBounds(605, 40, 269, 46);
		contentPane.add(lblNewLabel);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(595, 96, 252, 199);
		contentPane.add(textPane);
		
		JButton btnNewButton = new JButton("취소");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnNewButton.setBounds(596, 430, 121, 64);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("결제");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnNewButton_1.setBounds(729, 430, 118, 64);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("ID 찾기");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog(getParent(),
		                "회원 ID를 입력해주세요", null);
			}
		});
		
		btnNewButton_2.setBounds(595, 368, 251, 52);
		contentPane.add(btnNewButton_2);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(45, 10, 527, 489);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("New tab", null, panel, null);
		panel.setLayout(null);
		
		JButton btnNewButton_3 = new JButton("50분");
		btnNewButton_3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				JFrame jFrame = new JFrame();
		        int result = JOptionPane.showConfirmDialog(jFrame, "[비회원] 50분 충전하시겠습니까?");

		        if (result == 0)
		            System.out.println("You pressed Yes");
		        else if (result == 1)
		            System.out.println("You pressed NO");
		        else
		            System.out.println("You pressed Cancel");
			}
		});
		
		
		btnNewButton_3.setBounds(27, 27, 147, 147);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("2시간");
		btnNewButton_3_1.setBounds(186, 27, 147, 147);
		panel.add(btnNewButton_3_1);
		
		btnNewButton_3_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				JFrame jFrame = new JFrame();
		        int result = JOptionPane.showConfirmDialog(jFrame, "[비회원] 2시간 충전하시겠습니까?");

		        if (result == 0)
		            System.out.println("You pressed Yes");
		        else if (result == 1)
		            System.out.println("You pressed NO");
		        else
		            System.out.println("You pressed Cancel");
			}
		});
		
		JButton btnNewButton_3_2 = new JButton("3시간");
		btnNewButton_3_2.setBounds(345, 27, 147, 147);
		panel.add(btnNewButton_3_2);
		
		btnNewButton_3_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				JFrame jFrame = new JFrame();
		        int result = JOptionPane.showConfirmDialog(jFrame, "[비회원] 3시간 충전하시겠습니까?");

		        if (result == 0)
		            System.out.println("You pressed Yes");
		        else if (result == 1)
		            System.out.println("You pressed NO");
		        else
		            System.out.println("You pressed Cancel");
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("★ 비회원 ★");
		lblNewLabel_1.setBounds(68, 184, 74, 15);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("★ 비회원 ★");
		lblNewLabel_1_1.setBounds(225, 184, 74, 15);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("★ 비회원 ★");
		lblNewLabel_1_2.setBounds(381, 184, 74, 15);
		panel.add(lblNewLabel_1_2);
		
		// --------------------------------------------------------
		
		JButton btnNewButton_3_3 = new JButton("50분");
		
		btnNewButton_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame jFrame = new JFrame();
		        int result = JOptionPane.showConfirmDialog(jFrame, "[회원] 50분 충전하시겠습니까?");

		        if (result == 0)
		            System.out.println("You pressed Yes");
		        else if (result == 1)
		            System.out.println("You pressed NO");
		        else
		            System.out.println("You pressed Cancel");
		        
			}
		});
		
		btnNewButton_3_3.setBounds(27, 228, 147, 147);
		panel.add(btnNewButton_3_3);
		
		JButton btnNewButton_3_4 = new JButton("2시간 10분");
		btnNewButton_3_4.setBounds(186, 228, 147, 147);
		panel.add(btnNewButton_3_4);
		
		btnNewButton_3_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame jFrame = new JFrame();
		        int result = JOptionPane.showConfirmDialog(jFrame, "[회원] 2시간 10분 충전하시겠습니까?");

		        if (result == 0)
		            System.out.println("You pressed Yes");
		        else if (result == 1)
		            System.out.println("You pressed NO");
		        else
		            System.out.println("You pressed Cancel");
			}
		});
		
		JButton btnNewButton_3_5 = new JButton("3시간 10분");
		btnNewButton_3_5.setBounds(345, 228, 147, 147);
		panel.add(btnNewButton_3_5);
		
		btnNewButton_3_5.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				JFrame jFrame = new JFrame();
		        int result = JOptionPane.showConfirmDialog(jFrame, "[회원] 3시간 10분 충전하시겠습니까?");

		        if (result == 0)
		            System.out.println("You pressed Yes");
		        else if (result == 1)
		            System.out.println("You pressed NO");
		        else
		            System.out.println("You pressed Cancel");
				
			}
			
		});
		
		JLabel lblNewLabel_1_3 = new JLabel("♥ 회원 ♥");
		lblNewLabel_1_3.setBounds(79, 385, 50, 15);
		panel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("♥ 회원 ♥");
		lblNewLabel_1_3_1.setBounds(236, 385, 58, 15);
		panel.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("♥ 회원 ♥");
		lblNewLabel_1_3_2.setBounds(397, 385, 58, 15);
		panel.add(lblNewLabel_1_3_2);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_1, null);
		panel_1.setLayout(null);
		
		JButton btnNewButton_4_1 = new JButton("");
		btnNewButton_4_1.setIcon(new ImageIcon("C:\\Users\\kosmo\\eclipse-workspace\\temp\\src\\project\\kakao.PNG"));
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_4_1.setRolloverIcon(new ImageIcon("C:\\Users\\kosmo\\eclipse-workspace\\temp\\src\\project\\qr.PNG"));
				String name = JOptionPane.showInputDialog(getParent(),
		                "모바일 교환권 번호를 입력해주세요", null);
			}
		});
		btnNewButton_4_1.setBounds(396, 24, 93, 130);
		panel_1.add(btnNewButton_4_1);
		
		JButton btnNewButton_4_2 = new JButton();
		btnNewButton_4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			btnNewButton_4_2.setRolloverIcon(new ImageIcon("C:\\Users\\kosmo\\eclipse-workspace\\temp\\src\\project\\culturechange.png"));
			String name = JOptionPane.showInputDialog(getParent(),
	                "상품권 번호를 입력해주세요", null);
			}
		}); 
		
		btnNewButton_4_2.setIcon(new ImageIcon("C:\\Users\\kosmo\\eclipse-workspace\\temp\\src\\project\\culture.PNG"));
		btnNewButton_4_2.setBounds(34, 24, 340, 130);
		panel_1.add(btnNewButton_4_2);
		
		JButton btnNewButton_4_3 = new JButton();
		btnNewButton_4_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_4_3.setRolloverIcon(new ImageIcon("C:\\Users\\kosmo\\eclipse-workspace\\temp\\src\\project\\google_change.png"));
				String name = JOptionPane.showInputDialog(getParent(),
		                "기프트카드 고유번호를 입력해주세요", null);
			}
		});
		btnNewButton_4_3.setIcon(new ImageIcon("C:\\Users\\kosmo\\eclipse-workspace\\temp\\src\\project\\google.PNG"));
		btnNewButton_4_3.setBounds(34, 164, 198, 165);
		panel_1.add(btnNewButton_4_3);
		
		JButton btnNewButton_4_3_1 = new JButton();
		btnNewButton_4_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			btnNewButton_4_3_1.setRolloverIcon(new ImageIcon("C:\\Users\\kosmo\\eclipse-workspace\\temp\\src\\project\\tmoney_change.png"));
			String name = JOptionPane.showInputDialog(getParent(),
	                "모바일 교환권 번호를 입력해주세요", null);
			}
		});
		btnNewButton_4_3_1.setIcon(new ImageIcon("C:\\Users\\kosmo\\eclipse-workspace\\temp\\src\\project\\tmoney.PNG"));
		btnNewButton_4_3_1.setBounds(244, 164, 245, 57);
		panel_1.add(btnNewButton_4_3_1);
		
		JButton btnNewButton_4 = new JButton("★ 코스모 PC방 쿠폰 직접 입력 ★");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog(getParent(),
                        "쿠폰 번호를 입력해주세요", null);
			}
		});
		btnNewButton_4.setBounds(74, 351, 375, 57);
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton();
		btnNewButton_5.setIcon(new ImageIcon("C:\\Users\\kosmo\\eclipse-workspace\\temp\\src\\project\\happy.PNG"));
		
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		btnNewButton_5.setRolloverIcon(new ImageIcon("C:\\Users\\kosmo\\eclipse-workspace\\temp\\src\\project\\happychange.PNG"));
		String name = JOptionPane.showInputDialog(getParent(),
                "상품권 번호를 입력해주세요", null);
			}
		});
		btnNewButton_5.setBounds(244, 231, 245, 98);
		panel_1.add(btnNewButton_5);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_2, null);
		panel_2.setLayout(null);
		
		JButton btnNewButton_2_1 = new JButton("좌석보기");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnNewButton_2_1.setBounds(596, 305, 251, 53);
		contentPane.add(btnNewButton_2_1);
		
		Scrollbar scrollbar = new Scrollbar();
		scrollbar.setBounds(853, 94, 17, 201);
		contentPane.add(scrollbar);
	}
	}



	
	
	
	
	
	
	

