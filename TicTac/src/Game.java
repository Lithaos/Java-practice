import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Game extends JPanel {

		JButton buttons[] = new JButton[9];
		int player = 0;
		
		public Game() {
			setLayout(new GridLayout(3,3));
			initializeButtons();
		}
		void initializeButtons() {
			for(int i=0;i<9;i++)
			{
				buttons[i] = new JButton();
				buttons[i].setText(""+i);
				buttons[i].addActionListener(new buttonListener());
				
				add(buttons[i]);
			}
		}
		void buttonReset()
		{
			for(int i=0;i<9;i++)
			{
				buttons[i].setText("");
			}
		}
		class buttonListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
            	JButton buttonClicked = (JButton)e.getSource();
            	if(player%2==0)
            	{
            		buttonClicked.setText("X");
            	}
            	else
            	{
            		buttonClicked.setText("O");
            	}
            	if(winCheck())
            	{
            		JOptionPane.showConfirmDialog(null, "Game Over.");
                    buttonReset();
            	}
            	player++;
            }
            /*
             *  |0|1|2|
             *  |3|4|5|
             *  |6|7|8|
             */
            Boolean winCheck() {
            	//Horizontal tests
            	if(checkPair(0,1) && checkPair(1,2))
            		return true;
            	else if(checkPair(3,4) && checkPair(4,5))
            		return true;
            	else if(checkPair(6,7) && checkPair(7,8))
            		return true;
            	
            	// Vertical tests
            	
            	else if(checkPair(0,3) && checkPair(3,6))
            		return true;
            	else if(checkPair(1,4) && checkPair(4,7))
            		return true;
            	else if(checkPair(2,5) && checkPair(5,8))
            		return true;
            	
            	//diagonal tests
            	
            	else if(checkPair(0,4) && checkPair(4,8))
            		return true;
            	else if(checkPair(2,4) && checkPair(4,6))
            		return true;
            	else
            		return false;
            }
            Boolean checkPair(int a,int b)
            {
            	if(buttons[a].getText().equals(buttons[b].getText()) && !buttons[b].getText().equals(""))
            	{
            		return true;
            	}
            	else
            		return false;
            }
        }
	    public static void main(String[] args) 
	    {    	
	        JFrame window = new JFrame();
	        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        window.getContentPane().add(new Game());
	        window.setBounds(300,200,300,300);
	        window.setVisible(true);
	    }
}
