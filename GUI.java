package a;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class GUI extends JFrame implements ActionListener{
	
	Color bgColor = new Color(62,63,64);
	Color lightColor = new Color(228,228,228);
	Color darkColor = new Color(74,74,74);
	JButton button1,button2,button3,exit,bColor,boardDarkColor,boardLightColor,qGambit,london,english,reset;
	CardLayout cl = new CardLayout();
	
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	Reccomend panel3;
	JPanel panel4;
	Learn panel5;
	Container main;
	//JFrame f = new JFrame();
	
	public static void main(String[] args) {

        new GUI();
       
         
        
	}
	public GUI() {
		JFrame gui = new JFrame();
		 gui.setVisible(true);
	     gui.setSize(1000,1000);
	     gui.setDefaultCloseOperation(gui.EXIT_ON_CLOSE);
	     gui.setResizable(false);
	     gui.setTitle("Main Menu");
	     ImageIcon icon = new ImageIcon ("icon.png");
	     gui.setIconImage(icon.getImage());
	     
	     JLabel logo = new JLabel();
	     JLabel text = new JLabel();
	     ImageIcon homeScreenPicture = new ImageIcon("logo.png");
	     logo.setIcon(homeScreenPicture);
	     logo.setBounds(200,163,500,312);
	    
	    
	     text.setForeground(bgColor);
	     text.setBounds(380,20,200,200);
	     text.setText("Welcome!");
	     text.setFont(new Font("MV Boli",Font.PLAIN,50));
	     text.setForeground(Color.white);
	     
	     panel1.add(logo);
	     panel1.add(text);
	     main = gui.getContentPane();
	     main.setLayout(cl);
	     
	     panel1.setBackground(bgColor);
	    
			//main.setLayout(cl);
			main.add(panel1, "1");
			main.add(panel2, "2");
			//main.add(panel3,"3");
			
			panel1.setLayout(null);
			
		
			button1 = new JButton();
		    button1.setBounds(450,500,100,50);
		    
			button1.addActionListener(this);
			button1.setText("Learn");
			button1.setBorder(BorderFactory.createRaisedBevelBorder());
			button1.setBackground(Color.white);
			
			button2 = new JButton();
			button2.setBounds(450,650,100,50);
			button2.addActionListener(this);
			button2.setText("Reccomend");
			button2.setBorder(BorderFactory.createRaisedBevelBorder());
			button2.setBackground(Color.white);
			
			button3 = new JButton();
			button3.setBounds(450,800,100,50);
			button3.addActionListener(this);
			button3.setText("Customize");
			button3.setBorder(BorderFactory.createRaisedBevelBorder());	
			button3.setBackground(Color.white); 
			
			panel1.add(button1);panel1.add(button2);panel1.add(button3);
			cl.show(main,"1");
			panel2.setBackground(bgColor);
			panel2.setLayout(null);
			
			exit = new JButton();
			exit.setBounds(870,20,100,50);
			exit.addActionListener(this);
			exit.setText("Home");
			exit.setBorder(BorderFactory.createRaisedBevelBorder());
			exit.setBackground(Color.white);
			
			bColor = new JButton();
			bColor.setBounds(450,200,200,50);
			bColor.addActionListener(this);
			bColor.setText("Choose Background Color");
			bColor.setBorder(BorderFactory.createRaisedBevelBorder());
			bColor.setBackground(Color.white);
			
			boardDarkColor = new JButton();
			boardDarkColor.setBounds(450,300,200,50);
			boardDarkColor.addActionListener(this);
			boardDarkColor.setText("Choose the Dark Square Color");
			boardDarkColor.setBorder(BorderFactory.createRaisedBevelBorder());
			boardDarkColor.setBackground(Color.white);
			
			boardLightColor = new JButton();
			boardLightColor.setBounds(450,400,200,50);
			boardLightColor.addActionListener(this);
			boardLightColor.setText("Choose the Light Square Color");
			boardLightColor.setBorder(BorderFactory.createRaisedBevelBorder());
			boardLightColor.setBackground(Color.white);
			
			reset = new JButton();
			reset.setBounds(450,700,200,50);
			reset.addActionListener(this);
			reset.setText("Reset to Default");
			reset.setBorder(BorderFactory.createRaisedBevelBorder());
			reset.setBackground(Color.white);
			
			panel2.add(exit);panel2.add(bColor);panel2.add(boardLightColor);panel2.add(boardDarkColor);
			
			
			//panel3.setLayout(null);
			//panel3.setBackground(bgColor);
			

			qGambit = new JButton();
			qGambit.setBounds(450,100,100,50);
			qGambit.addActionListener(this);
			qGambit.setText("Queen's Gambit");
			qGambit.setBorder(BorderFactory.createRaisedBevelBorder());
			qGambit.setBackground(Color.white);
			

			london = new JButton();
			london.setBounds(450,400,100,50);
			london.addActionListener(this);
			london.setText("London");
			london.setBorder(BorderFactory.createRaisedBevelBorder());
			london.setBackground(Color.white);
			

			english = new JButton();
			english.setBounds(450,700,100,50);
			english.addActionListener(this);
			english.setText("English");
			english.setBorder(BorderFactory.createRaisedBevelBorder());
			english.setBackground(Color.white);
			panel2.add(reset);
		
			
			gui.repaint();
			gui.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button1) {
			panel4 = new JPanel();
			panel4.setLayout(null);
			panel4.setBackground(bgColor);
			main.add(panel4,"4");
			panel4.add(english);
			panel4.add(qGambit);
			panel4.add(london);
			panel4.add(exit);
			
			
			cl.show(main, "4");
			
		}
		if(e.getSource()==button2) {
			panel3 = new Reccomend();
			main.add(panel3,"3");
			panel3.add(exit);
			panel3.setLayout(null);
			panel3.setBackground(bgColor);
			cl.show(main,"3"); 
			
		}
		if(e.getSource()==button3) {
			panel2.add(exit);
			cl.show(main, "2");
			 
		      
		       
		}
		if(e.getSource() == exit) {
			cl.show(main, "1");
			
			
			
		}
		if(e.getSource() == bColor) {
			JColorChooser chooser = new JColorChooser();
			 bgColor = JColorChooser.showDialog(null, "Pick one", Color.black); 
			panel1.setBackground(bgColor);
			panel2.setBackground(bgColor);
			panel3.setBackground(bgColor);
			panel4.setBackground(bgColor);
			panel5.setBackground(bgColor);
		
		}
		if(e.getSource() == boardDarkColor) {
			JColorChooser chooser = new JColorChooser();
			 darkColor = JColorChooser.showDialog(null, "Pick one", Color.black); 
			 
		}
		if(e.getSource() == boardLightColor) {
			JColorChooser chooser = new JColorChooser();
			 lightColor = JColorChooser.showDialog(null, "Pick one", Color.black); 
			 
		}
		if(e.getSource() == qGambit) {
			panel5 = new Learn(darkColor,lightColor,1);
			main.add(panel5,"5");
			panel5.add(exit);
			panel5.setLayout(null);
			panel5.setBackground(bgColor);
			cl.show(main, "5");
		}
		if(e.getSource() == london) {
			panel5 = new Learn(darkColor,lightColor,2);
			main.add(panel5,"5");
			panel5.add(exit);
			panel5.setLayout(null);
			panel5.setBackground(bgColor);
			cl.show(main, "5");
		}
		if(e.getSource() == english) {
			panel5 = new Learn(darkColor,lightColor,3);
			panel5.add(exit);
			main.add(panel5,"5");
			panel5.setLayout(null);
			panel5.setBackground(bgColor);
			
			cl.show(main, "5");
		}
		if(e.getSource() == reset) {
			
			 bgColor = new Color(62,63,64); 
				panel1.setBackground(bgColor);
				panel2.setBackground(bgColor);
				panel3.setBackground(bgColor);
				panel4.setBackground(bgColor);
				panel5.setBackground(bgColor);
			lightColor = new Color(228,228,228);
			 darkColor = new Color(74,74,74);
			
		}
	}
	

}
