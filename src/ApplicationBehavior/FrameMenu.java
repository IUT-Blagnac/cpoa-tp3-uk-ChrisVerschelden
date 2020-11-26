package ApplicationBehavior;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrameMenu extends JFrame implements ActionListener{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
		private	JButton fight = new JButton("Fight !");
		private JButton validate = new JButton("Select Character");
		private JComboBox comboCharacters, comboWeapons;
		private Character character;


		private JLabel labelFight;
		
		
		
		FrameMenu() {
			// create and set up the window 
			this.setName("Main Menu");
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			// settings the layout of the contentpane

			JPanel contentPane = new JPanel( new GridLayout(5,5,0,0));
			//title and size 
			this.setTitle("Character making");
			//should i use variable ?
			this.setSize(600,400);
			// make the menu frame appear 
			this.setVisible(true);
			contentPane.setVisible(true);
			this.setContentPane(contentPane);

			String[] characters = {"king","queen","troll","knight"};
			String[] weapons = {"sword","bow","knife"};
			comboCharacters = new JComboBox<String>(characters);
			comboWeapons = new JComboBox<String>(weapons);
			labelFight = new JLabel("ready to fight !");
			contentPane.add(comboCharacters);
			contentPane.add(validate);
			validate.addActionListener(this);
			contentPane.add(comboWeapons);
			contentPane.add(fight);
			fight.addActionListener(this);
			contentPane.add(labelFight);
			comboWeapons.setVisible(false);
			fight.setVisible(false);
			labelFight.setVisible(false);

			
		}

		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("bouton "+e +" appuyé ");
			if (e.getSource() == validate ) {
				switch ( (String) comboCharacters.getSelectedItem() ){
					case "king" : character = new King(new BehaviorSword());
					  break;
					case "queen" : character = new Queen(new BehaviorSword());
					  break;
					case "knight" : character = new Knight(new BehaviorSword());
					  break;
					case "troll" : character = new Troll(new BehaviorSword());
					  break;
					default:
					  System.out.println("erreur");
						
				}
				comboCharacters.setEnabled(false);
				validate.setEnabled(false);
				comboWeapons.setVisible(true);
				fight.setVisible(true);
				labelFight.setVisible(true);
			}
			
			if (e.getSource() == fight ) {
				switch ( (String) comboWeapons.getSelectedItem() ){
					case "sword" : character = new King(new BehaviorSword());
					  break;
					case "knife" : character = new Queen(new BehaviorKnife());
					  break;
					case "bow" : character = new Knight(new BehaviorBow());
					  break;
					default:
					  System.out.println("erreur");
					
				}
				labelFight.setText(character.fight());
				
			}

		}

		

	}


