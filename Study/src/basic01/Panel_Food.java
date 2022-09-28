package gui_project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Panel_Food extends JPanel{

	MainTest parent;
	
	Frame f = new Frame();
	
	JButton b1 = new JButton("������", new ImageIcon(""));
	JButton b2 = new JButton("����", new ImageIcon(""));
	JButton b3 = new JButton("����", new ImageIcon(""));
	JButton b4 = new JButton("������", new ImageIcon(""));
	JButton b5 = new JButton("���", new ImageIcon(""));
	JButton b6 = new JButton("Ƣ��", new ImageIcon(""));
	JButton addbt = new JButton("��ٱ��� ���");
	JButton sosbt = new JButton("����ȣ��");
	JButton delbt= new JButton("         ��� (alt+x)        ");
	JButton calbt = new JButton("              ����              ");
	
	JLabel banner1 = new JLabel();
	JLabel banner2 = new JLabel();
	JLabel banner3 = new JLabel();
	JLabel banner4 = new JLabel();
	JLabel banner5 = new JLabel();
	
	
	JTextArea ta1 = new JTextArea();
	JTextField tf1 = new JTextField();
	
	public Panel_Food(MainTest i) {
		
		parent = i;
		
		addLayout();
		addProc();
		
		
		setBackground(new Color(225,214,246));
		

	}
	
	void addLayout() {
		
		setLayout(new BorderLayout());
		
		
		JPanel pWest = new JPanel();
		
		pWest.setLayout(new GridLayout(3,2,10,10));
		pWest.setPreferredSize(new java.awt.Dimension(550, 500));
		pWest.add(b1);
		pWest.add(b2);
		pWest.add(b3);
		pWest.add(b4);
		pWest.add(b5);
		pWest.add(b6);
		
		add(pWest, BorderLayout.WEST);
		
		// ----------------------------------
		
		JPanel pEast = new JPanel();
		
		pEast.setLayout(new GridLayout(8, 1));
		pEast.setPreferredSize(new java.awt.Dimension(300,450));
		
		pEast.add(sosbt); // ���� ȣ��
		pEast.add(tf1); // ��û ���� �Է� ��, ���� ȣ���� �����ּ���
		pEast.add(banner1); // �̺�Ʈ ��� ����
		pEast.add(banner2); // �̺�Ʈ ��� ����
		pEast.add(banner3); // �̺�Ʈ ��� ����
		pEast.add(banner4); // �̺�Ʈ ��� ����
		pEast.add(ta1); // �ֹ����� ���
		pEast.add(addbt); // ��ٱ��� ���
		
		add(pEast, BorderLayout.EAST);
		
		// ---------------------------------- 
		
		JPanel pSouth = new JPanel();
		pSouth.add(calbt);
		pSouth.add(delbt); 
		
		add(pSouth, BorderLayout.SOUTH);
		
		b1.setHorizontalAlignment(JButton.CENTER);
		b1.setVerticalTextPosition(JButton.BOTTOM);
		b2.setHorizontalAlignment(JButton.CENTER);
		b2.setVerticalTextPosition(JButton.BOTTOM);
		b3.setHorizontalAlignment(JButton.CENTER);
		b3.setVerticalTextPosition(JButton.BOTTOM);
		b4.setHorizontalAlignment(JButton.CENTER);
		b4.setVerticalTextPosition(JButton.BOTTOM);
		b5.setHorizontalAlignment(JButton.CENTER);
		b5.setVerticalTextPosition(JButton.BOTTOM);
		b6.setHorizontalAlignment(JButton.CENTER);
		b6.setVerticalTextPosition(JButton.BOTTOM);
		
	}
	
	
	
	void addProc() {
		
		// ����Ű�� â �ݱ� : ��� (alt+x)
		
		delbt.setMnemonic('x');
		
		JPanel jp = new JPanel();
		JButton btn1 = delbt;
		
		btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
		
	}
	
	
	
}
