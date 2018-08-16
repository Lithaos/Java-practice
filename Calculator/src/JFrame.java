import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.SystemColor;

public class JFrame extends javax.swing.JFrame {

	protected static final int NULL = 0;
	private JPanel contentPane;
	private JTextField display;
	private JTextField memory;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame frame = new JFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JFrame() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 364);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!display.getText().equals(""))
					display.setText(display.getText() + btn0.getText());
			}
		});

		btn0.setBackground(Color.LIGHT_GRAY);
		btn0.setBounds(70, 274, 50, 50);
		contentPane.add(btn0);

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + btn1.getText());
			}
		});
		btn1.setBackground(Color.LIGHT_GRAY);
		btn1.setBounds(10, 213, 50, 50);
		contentPane.add(btn1);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + btn2.getText());
			}
		});

		btn2.setBackground(Color.LIGHT_GRAY);
		btn2.setBounds(70, 213, 50, 50);
		contentPane.add(btn2);

		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + btn3.getText());
			}
		});

		btn3.setBackground(Color.LIGHT_GRAY);
		btn3.setBounds(130, 213, 50, 50);
		contentPane.add(btn3);

		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + btn4.getText());
			}
		});
		btn4.setBackground(Color.LIGHT_GRAY);
		btn4.setBounds(10, 152, 50, 50);
		contentPane.add(btn4);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + btn5.getText());
			}
		});

		btn5.setBackground(Color.LIGHT_GRAY);
		btn5.setBounds(70, 152, 50, 50);
		contentPane.add(btn5);

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + btn6.getText());
			}
		});

		btn6.setBackground(Color.LIGHT_GRAY);
		btn6.setBounds(130, 152, 50, 50);
		contentPane.add(btn6);

		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + btn7.getText());
			}
		});
		btn7.setBackground(Color.LIGHT_GRAY);
		btn7.setBounds(10, 91, 50, 50);
		contentPane.add(btn7);

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + btn8.getText());
			}
		});

		btn8.setBackground(Color.LIGHT_GRAY);
		btn8.setBounds(70, 91, 50, 50);
		contentPane.add(btn8);

		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + btn9.getText());
			}
		});

		btn9.setBackground(Color.LIGHT_GRAY);
		btn9.setBounds(130, 91, 50, 50);
		contentPane.add(btn9);

		JButton btnDel = new JButton("C");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText("");
			}
		});
		btnDel.setBackground(Color.LIGHT_GRAY);
		btnDel.setBounds(10, 57, 89, 23);
		contentPane.add(btnDel);

		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(memory.getText().equals(""))
				{
					Operations.firstVar=Integer.parseInt(display.getText());
					memory.setText(display.getText());
					display.setText("");
				}
				else if(!memory.getText().equals("") && !display.getText().equals(""))
				{
					Operations.secondVar=Integer.parseInt(display.getText());
					Operations.switcher(Operations.operation);
					memory.setText(Double.toString(Operations.result));
					display.setText("");
					Operations.firstVar = (int)Operations.result;
				}
					Operations.operation = 1;
			}
		});
		btnAdd.setBackground(Color.LIGHT_GRAY);
		btnAdd.setBounds(250, 213, 50, 23);
		contentPane.add(btnAdd);

		JButton btnSubstract = new JButton("-");
		btnSubstract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(memory.getText().equals(""))
				{
					Operations.firstVar=Integer.parseInt(display.getText());
					memory.setText(display.getText());
					display.setText("");
				}
				else if(!memory.getText().equals("") && !display.getText().equals(""))
				{
					Operations.secondVar=Integer.parseInt(display.getText());
					Operations.switcher(Operations.operation);
					memory.setText(Double.toString(Operations.result));
					display.setText("");
					Operations.firstVar = (int)Operations.result;
				}
					Operations.operation = 2;
			}
		});
		btnSubstract.setBackground(Color.LIGHT_GRAY);
		btnSubstract.setBounds(250, 238, 50, 23);
		contentPane.add(btnSubstract);

		JButton btnMultiple = new JButton("*");

		btnMultiple.setBackground(Color.LIGHT_GRAY);
		btnMultiple.setBounds(250, 179, 50, 23);
		contentPane.add(btnMultiple);

		JButton btnDivide = new JButton("/");

		btnDivide.setBackground(Color.LIGHT_GRAY);
		btnDivide.setBounds(250, 152, 50, 23);
		contentPane.add(btnDivide);

		
		JButton btnResult = new JButton("=");
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Operations.firstVar!=NULL && !display.getText().equals(""))
				{
				Operations.secondVar=Integer.parseInt(display.getText());
				Operations.switcher(Operations.operation);
				memory.setText(Double.toString(Operations.result));
				display.setText("");
				Operations.firstVar=(int)Operations.result;
				Operations.operation=0;
				}
			}
		});
		btnResult.setBackground(Color.LIGHT_GRAY);
		btnResult.setBounds(190, 152, 50, 110);
		contentPane.add(btnResult);

		display = new JTextField();
		display.setBackground(Color.WHITE);
		display.setHorizontalAlignment(SwingConstants.RIGHT);
		display.setEditable(false);
		display.setBounds(10, 33, 290, 24);
		contentPane.add(display);
		display.setColumns(10);

		memory = new JTextField();
		memory.setBorder(null);
		memory.setEditable(false);
		memory.setHorizontalAlignment(SwingConstants.RIGHT);
		memory.setFont(new Font("Tahoma", Font.PLAIN, 12));
		memory.setBackground(SystemColor.menu);
		memory.setBounds(190, 11, 110, 20);
		contentPane.add(memory);
		memory.setColumns(10);

	}
}
