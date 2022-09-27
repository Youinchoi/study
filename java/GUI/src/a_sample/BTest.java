package a_sample;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BTest extends JFrame{
	
	JButton btn;
	
	BTest(){
		super("나의 두번쨰 창");
		btn = new JButton("확인");
	}
	void addLayout() { // 창 만들기 기능 
		add(btn); // 부모한테 상속받아서 그냥 써도 됨 
		
		
		// 부모거는 그냥 갖다쓰기 가능 
		setBounds(100,100,500,350);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		BTest b = new BTest();
		b.addLayout();
	}

}

