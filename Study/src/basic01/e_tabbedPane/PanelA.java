package e_tabbedPane;

import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelA extends JPanel{
	
		JLabel aLa = new JLabel("패널 A");
		JButton aBtn = new JButton("A 버튼");
		
		Maintest parents; // 멤버변수 생성
		
	
	public PanelA (Maintest mainTest) {
		
		parents = mainTest;
		
		// parents = new Maintest(); << 이러면 메인테스트를 또 생성해서 무한루프됨 
		
		setBackground(new Color(225,214,246)); // RGB
		addLayout();
		eventProc();
	}
	
	void addLayout() {
		add(aLa);
		add(aBtn);
	}
	
	void eventProc() {
		
		aBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				parents.la.setText("Hello");}
				});
		
	}
	
	
	
	
	
	
	

}
