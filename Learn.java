package a;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.*;
public class Learn extends JPanel implements ActionListener{
	JButton next = new JButton();
	JButton previous = new JButton();
	Color d,l;
	JLabel title = new JLabel();
	private BufferedImage bK = null;
	private BufferedImage bQ = null;
	private BufferedImage bB = null;
	private BufferedImage bN = null;
	private BufferedImage bR = null;
	private BufferedImage bP = null;
	
	
	private BufferedImage wK = null;
	private BufferedImage wQ = null;
	private BufferedImage wB = null;
	private BufferedImage wN = null;
	private BufferedImage wR = null;
	private BufferedImage wP = null;
	
	int option;
	int yposDW = 740;
	int yposCW = 740;
	int yposEW = 740;
	int yposRightWN = 830;
	int xposRightWN = 680;
	int yposLeftWN = 830;
	int xposLeftWN = 230;
	//int xposRightWB = 590;
	//int yposRightWB = 830;
	int yposDB = 290;
	int yposCB = 290;
	int xposRightBN = 680;
	int yposRightBN = 200;
	int xposLeftBN = 230;
	int yposLeftBN = 200;
	int yposEB = 290;
	
	int moveNum = 0;
	
	//BufferedImage a = ImageIO.read(new File("icon.png"));
	public Learn(Color d,Color l,int option) {
	this.d = d;
	this.l = l;
	this.option = option;
	next = new JButton();
	next.setBounds(850,100,100,50);
	next.addActionListener(this);
	next.setText("Next");
	next.setBorder(BorderFactory.createRaisedBevelBorder());
	next.setBackground(Color.white);
	
	
	previous = new JButton();
	previous.setBounds(50,100,100,50);
	previous.addActionListener(this);
	previous.setText("Previous");
	previous.setBorder(BorderFactory.createRaisedBevelBorder());
	previous.setBackground(Color.white);
	this.add(previous);
	this.add(next);
	

	try {
		bK = ImageIO.read(new File("blackKing.png"));
		bQ = ImageIO.read(new File("blackQueen.png"));
		bB = ImageIO.read(new File("blackBishop.png"));
		bN = ImageIO.read(new File("blackKnight.png"));
		bR = ImageIO.read(new File("blackRook.png"));
		bP = ImageIO.read(new File("blackPawn.png"));
		
		wK = ImageIO.read(new File("whiteKing.png"));
		wQ = ImageIO.read(new File("whiteQueen.png"));
		wB = ImageIO.read(new File("whiteBishop.png"));
		wN = ImageIO.read(new File("whiteKnight.png"));
		wR = ImageIO.read(new File("whiteRook.png"));
		wP = ImageIO.read(new File("whitePawn.png"));
		
	}catch(IOException exc) {
		
		System.out.println("image not found");
		
	}
	
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		boolean white = true;
			for(int y = 0; y < 8; y++) {
				for(int x = 0; x < 8; x++) {
					if(white) {
						g.setColor(l);
					}else {
						g.setColor(d);
					}
					g.fillRect((x*90)+140, (y*90)+200, 90, 90);
					white = !white;
				}
				white = !white;
			}
			
		g.drawImage(bK, 500, 200,90,90, this);
		g.drawImage(bQ, 410, 200,90,90, this);
		g.drawImage(bB, 320, 200,90,90, this);
		g.drawImage(bB, 590, 200,90,90, this);
		g.drawImage(bN, xposLeftBN,yposLeftBN,90,90, this);
		g.drawImage(bN, xposRightBN, yposRightBN,90,90, this);
		g.drawImage(bR, 140, 200,90,90, this);
		g.drawImage(bR, 770, 200,90,90, this);
		g.drawImage(bP, 140, 290,90,90, this);
		g.drawImage(bP, 230, 290,90,90, this);
		g.drawImage(bP, 320, yposCB,90,90, this);
		g.drawImage(bP, 410, yposDB,90,90, this);
		g.drawImage(bP, 500, yposEB,90,90, this);
		g.drawImage(bP, 590, 290,90,90, this);
		g.drawImage(bP, 680, 290,90,90, this);
		g.drawImage(bP, 770, 290,90,90, this);
		
		g.drawImage(wK, 500, 830,90,90, this);
		g.drawImage(wQ, 410, 830,90,90, this);
		g.drawImage(wB, 320, 830,90,90, this);
		g.drawImage(wB, 590,830,90,90, this);
		g.drawImage(wN, xposLeftWN, yposLeftWN,90,90, this);
		g.drawImage(wN, xposRightWN, yposRightWN,90,90, this);
		g.drawImage(wR, 140, 830,90,90, this);
		g.drawImage(wR, 770, 830,90,90, this);
		g.drawImage(wP, 140, 740,90,90, this);
		g.drawImage(wP, 230, 740,90,90, this);
		g.drawImage(wP, 320, yposCW,90,90, this);
		g.drawImage(wP, 410, yposDW,90,90, this);
		g.drawImage(wP, 500, yposEW,90,90, this);
		g.drawImage(wP, 590, 740,90,90, this);
		g.drawImage(wP, 680, 740,90,90, this);
		g.drawImage(wP, 770, 740,90,90, this);
		Font myFont = new Font("TimesRoman",Font.PLAIN,30);
		g.setFont(myFont);
		g.drawString("test LOLOLOL",100,100);
		
		
        }
	//option1: queens gambit declined: semi slav main line normal variation
	@Override
	public void actionPerformed(ActionEvent e) {
	if(option == 1) {	
		if(e.getSource() == next) {
			if(moveNum == 0) {
				yposDW = yposDW-180;
				repaint();
				moveNum++;
			}else if(moveNum == 1) {
				yposDB = yposDB +180;
				repaint();
				moveNum++;
			}else if(moveNum == 2) {
				yposCW = yposCW-180;
				repaint();
				moveNum++;
			}else if(moveNum == 3){
				yposCB = yposCB +90;
				repaint();
				moveNum++;
			}else if(moveNum == 4){
				yposRightWN = yposRightWN -180;
				xposRightWN = xposRightWN -90;
				repaint();
				moveNum++;
			}else if(moveNum == 5){
				yposRightBN = yposRightBN +180;
				xposRightBN = xposRightBN -90;
				repaint();
				moveNum++;
			}else if(moveNum == 6){
				yposLeftWN = yposLeftWN -180;
				xposLeftWN = xposLeftWN +90;
				repaint();
				moveNum++;
			}else if(moveNum == 7){
				yposEB = yposEB+90;
				repaint();
				moveNum++;
			}else if(moveNum == 8){
				yposEW = yposEW -90;
				repaint();
				moveNum++;
			}else if(moveNum == 9){
				xposLeftBN = xposLeftBN + 180;
				yposLeftBN = yposLeftBN + 90;
				repaint();
				moveNum++;
			}
			
		}
		if(e.getSource() == previous) {
			if(moveNum == 1) {
			yposDW = yposDW+180;
			repaint();
			moveNum--;
			}else if(moveNum == 2) {
				yposDB = yposDB - 180;
				repaint();
				moveNum--;
			}else if(moveNum == 3) {
				yposCW = yposCW+180;
				repaint();
				moveNum--;
			}else if(moveNum == 4) {
				yposCB = yposCB -90;
				repaint();
				moveNum--;
			}else if(moveNum == 5){
				yposRightWN = yposRightWN +180;
				xposRightWN = xposRightWN +90;
				repaint();
				moveNum--;
			}else if(moveNum == 6){
				yposRightBN = yposRightBN -180;
				xposRightBN = xposRightBN +90;
				repaint();
				moveNum--;
			}else if(moveNum == 7){
				yposLeftWN = yposLeftWN +180;
				xposLeftWN = xposLeftWN -90;
				repaint();
				moveNum--;
			}else if(moveNum == 8){
				yposEB = yposEB-90;
				repaint();
				moveNum--;
			}else if(moveNum == 9){
				yposEW = yposEW +90;
				repaint();
				moveNum--;
			}else if(moveNum == 10){
				xposLeftBN = xposLeftBN - 180;
				yposLeftBN = yposLeftBN - 90;
				repaint();
				moveNum--;
			}
		}
	}else if(option == 2) {
		if(e.getSource() == next){
			if(moveNum == 0) {
				yposDW = yposDW-180;
				repaint();
				moveNum++;
			}else if(moveNum == 1) {
				yposDB = yposDB +180;
				repaint();
				moveNum++;
			}
		}
		if(e.getSource() == previous) {
			if(moveNum == 1) {
			yposDW = yposDW+180;
			repaint();
			moveNum--;
			}else if(moveNum == 2) {
				yposDB = yposDB - 180;
				repaint();
				moveNum--;
			}else if(moveNum == 3) {
				yposCW = yposCW+180;
				repaint();
				moveNum--;
			}
		}
		
	}
		
	}
}


	
	

