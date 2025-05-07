import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.Color;

public class Calculator implements ActionListener {
	double num1, num2, result;
	char opr;
	
	private JFrame frame;
	public JTextField screen;
	public JButton one, two, three, four, five, six, seven, eight, nine, zero, dot, mod, clear, power, delete, plus, minus, divide, mul, equals;

	
	// Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Calculator");
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		screen = new JTextField("");
		screen.setFont(new Font("Tahoma", Font.PLAIN, 20));
		screen.setEditable(false);
		screen.setHorizontalAlignment(JTextField.RIGHT);
		screen.setBackground(new Color(255, 255, 255));
		screen.setForeground(Color.BLACK);
		screen.setOpaque(true);
		screen.setBounds(22, 21, 346, 50);
		screen.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
		frame.getContentPane().add(screen);
		
		mod = new JButton("MOD");
		mod.setFont(new Font("Tahoma", Font.PLAIN, 20));
		mod.setBackground(new Color(128, 128, 255));
		mod.setBounds(22, 95, 79, 50);
		frame.getContentPane().add(mod);
		
		power = new JButton("^");
		power.setFont(new Font("Tahoma", Font.PLAIN, 20));
		power.setBackground(new Color(128, 128, 255));
		power.setBounds(111, 95, 79, 50);
		frame.getContentPane().add(power);
		
		delete = new JButton("DEL");
		delete.setFont(new Font("Tahoma", Font.PLAIN, 20));
		delete.setBackground(new Color(0, 255, 128));
		delete.setBounds(200, 95, 79, 50);
		frame.getContentPane().add(delete);
		
		clear = new JButton("CLR");
		clear.setFont(new Font("Tahoma", Font.PLAIN, 20));
		clear.setBackground(new Color(0, 255, 128));
		clear.setBounds(289, 95, 79, 50);
		frame.getContentPane().add(clear);
		
		seven = new JButton("7");
		seven.setFont(new Font("Tahoma", Font.PLAIN, 20));
		seven.setBackground(Color.LIGHT_GRAY);
		seven.setBounds(22, 155, 79, 50);
		frame.getContentPane().add(seven);
		
		eight = new JButton("8");
		eight.setFont(new Font("Tahoma", Font.PLAIN, 20));
		eight.setBackground(Color.LIGHT_GRAY);
		eight.setBounds(111, 155, 79, 50);
		frame.getContentPane().add(eight);
		
		nine = new JButton("9");
		nine.setFont(new Font("Tahoma", Font.PLAIN, 20));
		nine.setBackground(Color.LIGHT_GRAY);
		nine.setBounds(200, 155, 79, 50);
		frame.getContentPane().add(nine);
		
		plus = new JButton("+");
		plus.setFont(new Font("Tahoma", Font.PLAIN, 20));
		plus.setBackground(new Color(128, 128, 255));
		plus.setBounds(289, 155, 79, 50);
		frame.getContentPane().add(plus);
		
		four = new JButton("4");
		four.setFont(new Font("Tahoma", Font.PLAIN, 20));
		four.setBackground(Color.LIGHT_GRAY);
		four.setBounds(22, 217, 79, 50);
		frame.getContentPane().add(four);
		
		five = new JButton("5");
		five.setFont(new Font("Tahoma", Font.PLAIN, 20));
		five.setBackground(Color.LIGHT_GRAY);
		five.setBounds(111, 217, 79, 50);
		frame.getContentPane().add(five);
		
		six = new JButton("6");
		six.setFont(new Font("Tahoma", Font.PLAIN, 20));
		six.setBackground(Color.LIGHT_GRAY);
		six.setBounds(200, 215, 79, 50);
		frame.getContentPane().add(six);
		
		minus = new JButton("-");
		minus.setFont(new Font("Tahoma", Font.PLAIN, 20));
		minus.setBackground(new Color(128, 128, 255));
		minus.setBounds(289, 217, 79, 50);
		frame.getContentPane().add(minus);
		
		one = new JButton("1");
		one.setFont(new Font("Tahoma", Font.PLAIN, 20));
		one.setBackground(Color.LIGHT_GRAY);
		one.setBounds(22, 277, 79, 50);
		frame.getContentPane().add(one);
		
		two = new JButton("2");
		two.setFont(new Font("Tahoma", Font.PLAIN, 20));
		two.setBackground(Color.LIGHT_GRAY);
		two.setBounds(111, 277, 79, 50);
		frame.getContentPane().add(two);
		
		three = new JButton("3");
		three.setFont(new Font("Tahoma", Font.PLAIN, 20));
		three.setBackground(Color.LIGHT_GRAY);
		three.setBounds(200, 275, 79, 50);
		frame.getContentPane().add(three);
		
		mul = new JButton("x");
		mul.setFont(new Font("Tahoma", Font.PLAIN, 20));
		mul.setBackground(new Color(128, 128, 255));
		mul.setBounds(289, 277, 79, 50);
		frame.getContentPane().add(mul);
		
		zero = new JButton("0");
		zero.setFont(new Font("Tahoma", Font.PLAIN, 20));
		zero.setBackground(Color.LIGHT_GRAY);
		zero.setBounds(22, 337, 79, 50);
		frame.getContentPane().add(zero);
		
		dot = new JButton(".");
		dot.setFont(new Font("Tahoma", Font.PLAIN, 20));
		dot.setBackground(Color.LIGHT_GRAY);
		dot.setBounds(111, 337, 79, 50);
		frame.getContentPane().add(dot);
		
		equals = new JButton("=");
		equals.setFont(new Font("Tahoma", Font.PLAIN, 20));
		equals.setBackground(new Color(0, 255, 128));
		equals.setBounds(200, 335, 79, 50);
		frame.getContentPane().add(equals);
		
		divide = new JButton("/");
		divide.setFont(new Font("Tahoma", Font.PLAIN, 20));
		divide.setBackground(new Color(128, 128, 255));
		divide.setBounds(289, 337, 79, 50);
		frame.getContentPane().add(divide);
		
		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		four.addActionListener(this);
		five.addActionListener(this);
		six.addActionListener(this);
		seven.addActionListener(this);
		eight.addActionListener(this);
		nine.addActionListener(this);
		zero.addActionListener(this);
		equals.addActionListener(this);
		mod.addActionListener(this);
		power.addActionListener(this);
		delete.addActionListener(this);
		clear.addActionListener(this);
		dot.addActionListener(this);
		plus.addActionListener(this);
		minus.addActionListener(this);
		mul.addActionListener(this);
		divide.addActionListener(this);
		
	}
	
//	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == one) {
			screen.setText(screen.getText().concat("1"));
		}
		if(e.getSource() == two) {
			screen.setText(screen.getText().concat("2"));
		}
		if(e.getSource() == three) {
			screen.setText(screen.getText().concat("3"));
		}
		if(e.getSource() == four) {
			screen.setText(screen.getText().concat("4"));
		}
		if(e.getSource() == five) {
			screen.setText(screen.getText().concat("5"));
		}
		if(e.getSource() == six) {
			screen.setText(screen.getText().concat("6"));
		}
		if(e.getSource() == seven) {
			screen.setText(screen.getText().concat("7"));
		}
		if(e.getSource() == eight) {
			screen.setText(screen.getText().concat("8"));
		}
		if(e.getSource() == nine) {
			screen.setText(screen.getText().concat("9"));
		}
		if(e.getSource() == zero) {
			screen.setText(screen.getText().concat("0"));
		}
		if(e.getSource() == delete) {
			String number = screen.getText();
			if(number.length()!= 0) {
				number = number.substring(0, number.length()-1);
				number.trim();
				screen.setText(number);
			}
		}
		if(e.getSource() == clear) {
			screen.setText("");
		}
		if(e.getSource() == dot) {
			String number = screen.getText();
			if(number.length() == 0) {
				screen.setText(number.concat("0."));
			}else {
				screen.setText(number.concat("."));
			}
		}
		
		// operators
		if(e.getSource() == mod) {
			String number = screen.getText();
			if(number == "0.") {
				num1 = Double.parseDouble(number.concat("0"));
			}else {
				num1 = Double.parseDouble(number);
			}
			opr = '%';
			screen.setText("");
		}
		
		if(e.getSource() == power) {
			String number = screen.getText();
			if(number == "0.") {
				num1 = Double.parseDouble(number.concat("0"));
			}else {
				num1 = Double.parseDouble(number);
			}
			opr = '^';
			screen.setText("");
		}
		
		if(e.getSource() == plus) {
			String number = screen.getText();
			if(number == "0.") {
				num1 = Double.parseDouble(number.concat("0"));
			}else {
				num1 = Double.parseDouble(number);
			}
			opr = '+';
			screen.setText("");
		}
		
		if(e.getSource() == minus) {
			String number = screen.getText();
			if(number == "0.") {
				num1 = Double.parseDouble(number.concat("0"));
			}else {
				num1 = Double.parseDouble(number);
			}
			opr = '-';
			screen.setText("");
		}
		if(e.getSource() == mul) {
			String number = screen.getText();
			if(number == "0.") {
				num1 = Double.parseDouble(number.concat("0"));
			}else {
				num1 = Double.parseDouble(number);
			}
			opr = '*';
			screen.setText("");
		}
		if(e.getSource() == divide) {
			String number = screen.getText();
			if(number == "0.") {
				num1 = Double.parseDouble(number.concat("0"));
			}else {
				num1 = Double.parseDouble(number);
			}
			opr = '/';
			screen.setText("");
		}
		
		if(e.getSource() == equals) {
			num2 = Double.parseDouble(screen.getText());
			try {
				switch(opr) {
				case '+' : result = num1 + num2;
							display(result);
							break;
				case '-' : result = num1 - num2;
							display(result);
							break;
				
				case '*' : result = num1 * num2;
							display(result);
							break;
				
				case '/' : 	
							result = num1 / num2;
							display(result);
							break;
				
				case '%' : result = num1 % num2;
							display(result);
							break;
				
				case '^' : result = Math.pow(num2, num1);
							display(result);
							break;
				}
			}
			catch(Exception excp) {
				JOptionPane.showMessageDialog(null, "SYNTAX ERROR !!");
                screen.setText("");
			}
			
			
		}
		
	}
	
	// Removes the decimal if the number is an exact integer
	public void display(double result) {
		if(result - (int)result == 0) {
			screen.setText(String.valueOf((int)result));
		}else {
			screen.setText(String.valueOf(result));
		}
	}
}