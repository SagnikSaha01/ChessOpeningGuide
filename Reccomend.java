package a;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Reccomend extends JPanel implements ActionListener{
	JButton submit;
	JComboBox optionsElo,optionsColor,optionsPlay;
	JLabel reccomend;
	JLabel titles;
	public Reccomend() {
		String[] eloRatings = {"<800","801-1000","1001-1200","1201-1400","1401+"};
		String[] playStyle = {"defensive","neutral","attacking"};
		String[] color = {"black","white"};
		reccomend = new JLabel();
		titles = new JLabel();
		optionsElo = new JComboBox(eloRatings);
		
		reccomend.setText("Select your elo range ");
		reccomend.setBounds(320,100,800,200);
		this.add(reccomend);
		reccomend.setFont(new Font("MV Boli",Font.PLAIN,20));
	    reccomend.setForeground(Color.white);
		optionsPlay = new JComboBox(playStyle);
		optionsColor = new JComboBox(color);
		submit = new JButton();
		submit.setText("submit");
		submit.setBounds(400,300,100,40);
		submit.addActionListener(this);
		this.add(optionsElo);
		this.add(optionsColor);
		this.add(optionsPlay);
		this.add(submit);
		this.add(titles);
		optionsElo.setBounds(150,100,100,40);
		optionsColor.setBounds(450,100,100,40);
		
		optionsPlay.setBounds(750,100,100,40);
		//checkBox.setText("test");
		//checkBox.setFocusable(false);
		//this.repaint();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == submit) {
			String color = (String) optionsColor.getSelectedItem();
			String elo = (String)optionsElo.getSelectedItem();
			String style = (String)optionsPlay.getSelectedItem();
			String rec = "";
			
			if(elo.equals("<800") ||elo.equals("801-1000")){
				if(style.equals("attacking")) {
					if(color.equals("white")) {
						rec = "fried liver";
					}else {
						rec = "scandanavian def";
					}
				}else if(style.equals("neutral") || style.equals("defensive")) {
					if(color.equals("white")) {
						rec = "london";
					}else {
						rec = "kings indian";
					}
				}
			}else if(elo.equals("1001-1200") || elo.equals("1201-1400")) {
				if(color.equals("white")) {
					rec = "vienna gambit";
				}else if(style.equals("aggressive")) {
					rec = "caro kahn";
				}else {
					rec = "modern defense";
				}
			}else if(elo.equals("1401+")) {
				if(color.equals("white")) {
					if(style.equals("aggressive")) {
					rec = "trompowsky";
					}else {
					rec = "english";
					}
				}else {
					rec = "dutch def";
				}
			}
			reccomend.setText("I believe the best opening for you is: " + rec);
			reccomend.setBounds(320,500,800,200);
			this.add(reccomend);
			reccomend.setFont(new Font("MV Boli",Font.PLAIN,30));
		     reccomend.setForeground(Color.white);
		}
		
	}
	
	
	

}
