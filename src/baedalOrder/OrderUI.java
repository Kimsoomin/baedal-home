package baedalOrder;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import baedalMenu.MenuVO;

public class OrderUI extends JFrame implements ActionListener, Runnable{

	public static void main(String[] args) {
		OrderUI ui = new OrderUI();
		MenuVO vo = new MenuVO();
		
	}
	private static final long serialVersionUID = 1L;

	OrderDAO dao = new OrderDAO();
	JPanel panelW, panelWT, panelET, panelE, panelEN, panelEC, panelES, jp1, jp2;
	JPanel jp333333333333;
	JButton btnPay, btnPhonePay, btnList, btnMember; // 결제완료 버튼(로그인 페이지로 돌아감)
	JTextArea area;
	public OrderUI() {
		init();
		//assembly();
	}
	
	public void assembly() {
		
	}

	public void init(){
		this.setTitle("주문정보확인");
		//pullMember = new PullMember(); // 주문한 회원 정보를 끌어다오는 객체 *만들어야함
		panelW = new JPanel(new BorderLayout());
		panelWT = new JPanel();
		panelE = new JPanel(new BorderLayout());
		panelET = new JPanel(new BorderLayout());
		panelEN = new JPanel();
		panelES = new JPanel();
		panelEC = new JPanel();
		jp1 = new JPanel();
		jp2 = new JPanel();
		area = new JTextArea("안녕"+"\n"+"뭘봐");
		btnPay = new JButton("결제하기");
		btnPhonePay = new JButton("휴대폰으로 결제하기");
		btnList = new JButton("주문내역");
		btnMember = new JButton("배송정보");
		
		jp333333333333 = new JPanel();
		
		//===============assembly()=====================
		//panelEC.setPreferredSize(new Dimension(200 ,100)); //jpanel크기 조절
		
		
		panelEN.add(btnList);
		panelEC.add(btnPhonePay);
		panelES.add(btnPay);
		
		panelEN.setPreferredSize(new Dimension(200, 400));
		panelEC.setPreferredSize(new Dimension(200, 100));
		panelES.setPreferredSize(new Dimension(200, 100));
		
		panelW.setPreferredSize(new Dimension(200, 600));
		panelW.setLayout(new BorderLayout());
		
		panelET.add(panelEN, "North");
		panelET.add(panelEC, "Center");
		panelET.add(panelES, "South");
		panelWT.add(btnMember);
		panelWT.add(area);
		
		panelE.add(panelET);
		panelW.add(panelWT);
		this.getContentPane().add(panelE, "East");
		this.getContentPane().add(panelW, "West");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 400, 600); // 표시위치, 화면크기.
		
		
		
		/*Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm = this.gi*/
		this.setVisible(true);
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
