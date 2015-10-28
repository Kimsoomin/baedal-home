package baedalMenu;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

public class MenuUI2 extends JFrame implements ActionListener {
	public static void main(String[] args) {
		MenuUI2 ui = new MenuUI2();

	}

	private static final long serialVersionUID = 1L;
	Canvas Canvas;
	JPanel panelNorthImg, panelSouthImg,panelNorthBtn,panelSouthBtn,bigNorth,bigSouth;
	JLabel lblBN , lblImg, lblImg2;
	JButton btnget1,btnget2, btnget3, btnget4, btnget5, btnget6, btnget7, btnget8;
	JMenu menu;
	JMenuBar bar;
	BufferedReader in;
	List<JButton> btns;

	public MenuUI2() {
		init();
	}

	private void init() {
		// 부품준비!
		this.setTitle("배달의 기수");
		btns = new ArrayList<JButton>();
		panelNorthImg = new JPanel();
		ImageIcon icon1 = new ImageIcon("src/baedalMenu/hansic/1.png");
		ImageIcon icon2 = new ImageIcon("src/baedalMenu/hansic/2.png");
		ImageIcon icon3 = new ImageIcon("src/baedalMenu/hansic/3.png");
		ImageIcon icon4 = new ImageIcon("src/baedalMenu/hansic/4.png");
		panelNorthBtn = new JPanel();
		panelSouthImg = new JPanel();
		ImageIcon icon5 = new ImageIcon("src/baedalMenu/hansic/5.png");
		ImageIcon icon6 = new ImageIcon("src/baedalMenu/hansic/6.png");
		ImageIcon icon7 = new ImageIcon("src/baedalMenu/hansic/7.png");
		ImageIcon icon8 = new ImageIcon("src/baedalMenu/hansic/8.png");
		panelSouthBtn = new JPanel();
		bigNorth = new JPanel();
		bigSouth = new JPanel();
		lblImg = new JLabel(icon1);
		lblImg = new JLabel(icon2);
		lblImg = new JLabel(icon3);
		lblImg = new JLabel(icon4);
		lblImg2 = new JLabel(icon5);
		lblImg2 = new JLabel(icon6);
		lblImg2 = new JLabel(icon7);
		lblImg2 = new JLabel(icon8);
		
		btnget1 = new JButton("담기");
		btnget2 = new JButton("담기");
		btnget3 = new JButton("담기");
		btnget4 = new JButton("담기");
		btnget5 = new JButton("담기");
		btnget6 = new JButton("담기");
		btnget7 = new JButton("담기");
		btnget8 = new JButton("담기");
		// 조합!
		
		panelNorthImg.add(lblImg);
		panelSouthImg.add(lblImg2);
		
		panelNorthBtn.add(btnget1);
		panelNorthBtn.add(btnget2);
		panelNorthBtn.add(btnget3);
		panelNorthBtn.add(btnget4);
		panelSouthBtn.add(btnget5);
		panelSouthBtn.add(btnget6);
		
		btnget1.addActionListener(this);
		btnget2.addActionListener(this);
		btnget3.addActionListener(this);
		btnget4.addActionListener(this);
		btnget5.addActionListener(this);
		btnget6.addActionListener(this);
		btnget7.addActionListener(this);
		btnget8.addActionListener(this);
		//패널 넣.
		bigNorth.add(panelNorthImg);
		bigNorth.add(panelNorthBtn);
		bigSouth.add(panelSouthImg);
		bigSouth.add(panelSouthBtn);
		this.add(panelNorthBtn, BorderLayout.NORTH);
		this.add(panelSouthBtn, BorderLayout.SOUTH);
		

		this.setBounds(100, 50, 1400, 800);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

/**	@Override
	public void actionPerformed(ActionEvent e) {
		JButton temp = (JButton) e.getSource();
		if (temp.equals(btnget1)) {
			this.getContentPane().removeAll();
			this.repaint();
			// StoreUI ui = new StoreUI();
		} else if (temp.equals(btnget2)) {
			this.getContentPane().removeAll();
			this.repaint();
			// StoreUI ui = new StoreUI();
		} else if (temp.equals(btnget3)) {
			this.getContentPane().removeAll();
			this.repaint();
			// StoreUI ui = new StoreUI();
		} else if (temp.equals(btnget4)) {
			this.getContentPane().removeAll();
			this.repaint();
			// StoreUI ui = new StoreUI();
		} else if (temp.equals(btnget5)) {
			this.getContentPane().removeAll();
			this.repaint();
			// StoreUI ui = new StoreUI();
		} else if (temp.equals(btnget6)) {
			this.getContentPane().removeAll();
			this.repaint();
			// StoreUI ui = new StoreUI();
		} else if (temp.equals(btnget7)) {
			this.getContentPane().removeAll();
			this.repaint();
			// StoreUI ui = new StoreUI();
		} else if (temp.equals(btnget8)) {
			this.getContentPane().removeAll();
			this.repaint();
			// StoreUI ui = new StoreUI();
		}
	} */
}