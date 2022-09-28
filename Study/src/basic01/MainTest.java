package gui_project;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class MainTest extends JFrame{
	
	Panel_Main panel_main; 
	Panel_Noodle panel_noodle;
	Panel_Food panel_food;
	Panel_Snack panel_snack;
	Panel_Drink panel_drink;
	JTabbedPane tab = new JTabbedPane();

	MainTest(){
		setTitle("PC��");
		panel_main = new Panel_Main(this);
		panel_noodle = new Panel_Noodle();
		panel_food = new Panel_Food(this);
		panel_snack = new Panel_Snack(this);
		panel_drink = new Panel_Drink();
		
	}
	
	void addLayout() {

		tab.addTab("main", panel_main);
		tab.addTab("���", panel_noodle);
		tab.addTab("�н�", panel_food);
		tab.addTab("����", panel_snack);
//		tab.addTab("����", panel_drink);
		add(tab,BorderLayout.CENTER);
		
		setBounds(100, 100, 900, 700);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	void eventProc() {
		
	}
	
	
	
	public static void main(String[] args) {
		MainTest m = new MainTest();
		m.addLayout();
		m.eventProc();
		
		
	}

}
