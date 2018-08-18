import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

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
		contentPane.setBackground(SystemColor.control);
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

		btn0.setBackground(SystemColor.window);
		btn0.setBounds(70, 274, 50, 50);
		contentPane.add(btn0);

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + btn1.getText());
			}
		});
		btn1.setBackground(SystemColor.window);
		btn1.setBounds(10, 213, 50, 50);
		contentPane.add(btn1);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + btn2.getText());
			}
		});

		btn2.setBackground(SystemColor.window);
		btn2.setBounds(70, 213, 50, 50);
		contentPane.add(btn2);

		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + btn3.getText());
			}
		});

		btn3.setBackground(SystemColor.window);
		btn3.setBounds(130, 213, 50, 50);
		contentPane.add(btn3);

		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + btn4.getText());
			}
		});
		btn4.setBackground(SystemColor.window);
		btn4.setBounds(10, 152, 50, 50);
		contentPane.add(btn4);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + btn5.getText());
			}
		});

		btn5.setBackground(SystemColor.window);
		btn5.setBounds(70, 152, 50, 50);
		contentPane.add(btn5);

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + btn6.getText());
			}
		});

		btn6.setBackground(SystemColor.window);
		btn6.setBounds(130, 152, 50, 50);
		contentPane.add(btn6);

		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + btn7.getText());
			}
		});
		btn7.setBackground(SystemColor.window);
		btn7.setBounds(10, 91, 50, 50);
		contentPane.add(btn7);

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + btn8.getText());
			}
		});

		btn8.setBackground(SystemColor.window);
		btn8.setBounds(70, 91, 50, 50);
		contentPane.add(btn8);

		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + btn9.getText());
			}
		});

		btn9.setBackground(SystemColor.window);
		btn9.setBounds(130, 91, 50, 50);
		contentPane.add(btn9);

		JButton btnDel = new JButton("C");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText("");
			}
		});

		JButton btnClear = new JButton("CE");
		btnClear.setBackground(SystemColor.window);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText("");
				memory.setText("");
				Operations.firstVar = NULL;
				Operations.secondVar = NULL;
				Operations.operation = 0;
				Operations.result = NULL;
			}
		});
		btnClear.setBounds(109, 57, 71, 23);
		contentPane.add(btnClear);
		btnDel.setBackground(SystemColor.window);
		btnDel.setBounds(10, 57, 89, 23);
		contentPane.add(btnDel);

		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (memory.getText().equals("")) {
					Operations.firstVar = Integer.parseInt(display.getText());
					memory.setText(display.getText());
					display.setText("");
				} else if (!memory.getText().equals("") && !display.getText().equals("")) {
					Operations.secondVar = Integer.parseInt(display.getText());
					Operations.switcher(Operations.operation);
					memory.setText(Double.toString(Operations.result));
					display.setText("");
					Operations.firstVar = (int) Operations.result;
				}
				Operations.operation = 1;
			}
		});

		JButton btnBackspace = new JButton("<-");
		btnBackspace.setBackground(SystemColor.window);
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String displayText = display.getText();
				if (displayText.length() > 0) {
					displayText = displayText.substring(0, displayText.length() - 1);
					display.setText(displayText);
				}
			}
		});
		btnBackspace.setBounds(190, 57, 89, 23);
		contentPane.add(btnBackspace);
		btnAdd.setBackground(SystemColor.window);
		btnAdd.setBounds(250, 213, 50, 23);
		contentPane.add(btnAdd);

		JButton btnSubstract = new JButton("-");
		btnSubstract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (memory.getText().equals("")) {
					Operations.firstVar = Integer.parseInt(display.getText());
					memory.setText(display.getText());
					display.setText("");
				} else if (!memory.getText().equals("") && !display.getText().equals("")) {
					Operations.secondVar = Integer.parseInt(display.getText());
					Operations.switcher(Operations.operation);
					memory.setText(Double.toString(Operations.result));
					display.setText("");
					Operations.firstVar = (int) Operations.result;
				}
				Operations.operation = 2;
			}
		});
		btnSubstract.setBackground(SystemColor.window);
		btnSubstract.setBounds(250, 238, 50, 23);
		contentPane.add(btnSubstract);

		JButton btnMultiple = new JButton("*");
		btnMultiple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (memory.getText().equals("")) {
					Operations.firstVar = Integer.parseInt(display.getText());
					memory.setText(display.getText());
					display.setText("");
				} else if (!memory.getText().equals("") && !display.getText().equals("")) {
					Operations.secondVar = Integer.parseInt(display.getText());
					Operations.switcher(Operations.operation);
					memory.setText(Double.toString(Operations.result));
					display.setText("");
					Operations.firstVar = (int) Operations.result;
				}
				Operations.operation = 3;
			}
		});

		btnMultiple.setBackground(SystemColor.window);
		btnMultiple.setBounds(250, 179, 50, 23);
		contentPane.add(btnMultiple);

		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (memory.getText().equals("")) {
					Operations.firstVar = Integer.parseInt(display.getText());
					memory.setText(display.getText());
					display.setText("");
				} else if (!memory.getText().equals("") && !display.getText().equals("")) {
					Operations.secondVar = Integer.parseInt(display.getText());
					Operations.switcher(Operations.operation);
					memory.setText(Double.toString(Operations.result));
					display.setText("");
					Operations.firstVar = (int) Operations.result;
				}
				Operations.operation = 4;
			}
		});

		btnDivide.setBackground(SystemColor.window);
		btnDivide.setBounds(250, 152, 50, 23);
		contentPane.add(btnDivide);

		JButton btnResult = new JButton("=");
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Operations.firstVar != NULL && !display.getText().equals("")) {
					Operations.secondVar = Integer.parseInt(display.getText());
					Operations.switcher(Operations.operation);
					memory.setText(Double.toString(Operations.result));
					display.setText("");
					Operations.firstVar = (int) Operations.result;
					Operations.operation = 0;
				}
			}
		});
		btnResult.setBackground(SystemColor.window);
		btnResult.setBounds(190, 152, 50, 110);
		contentPane.add(btnResult);

		JButton btnNewButton = new JButton("+/-");
		btnNewButton.setBackground(SystemColor.window);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!display.getText().equals("")) {
				int temp = Integer.parseInt(display.getText());
				temp *= -1;
				display.setText(Integer.toString(temp));
				}
			}
		});
		btnNewButton.setBounds(10, 274, 50, 50);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("x²");
		btnNewButton_1.setBackground(SystemColor.window);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!display.getText().equals("")) {
				int power = Integer.parseInt(display.getText());
				power = (int)Math.pow(power, 2);
				display.setText(Integer.toString(power));
				}
			}
		});
		btnNewButton_1.setBounds(190, 91, 50, 50);
		contentPane.add(btnNewButton_1);
		
		JButton btnsqrt = new JButton("√");
		btnsqrt.setBackground(SystemColor.window);
		btnsqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!display.getText().equals("")) {
					int sqrt = Integer.parseInt(display.getText());
					sqrt = (int)Math.sqrt(sqrt);
					display.setText(Integer.toString(sqrt));
					}
				
			}
		});
		btnsqrt.setBounds(250, 91, 50, 50);
		contentPane.add(btnsqrt);

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
