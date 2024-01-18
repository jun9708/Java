package sub3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalcTest {

	private JFrame frame;
	private JTextField txtResult;
	private JButton btn8;
	private JButton btn9;
	private JButton btn6;
	private JButton btn4;
	private JButton btn5;
	private JButton btn3;
	private JButton btn1;
	private JButton btn2;
	private JButton btnDiv;
	private JButton btnMul;
	private JButton btnMin;
	private JButton btnPlus;
	private JButton btnCancle;
	private JButton btn0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcTest window = new CalcTest();
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
	public CalcTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private int operator = 0; //1:더하기, 2:빼기, 3:곱하기, 4:나누기
	private int num1 = 0;
	private int num2 = 0;
	
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 332, 419);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtResult = new JTextField();
		txtResult.setBackground(new Color(255, 255, 255));
		txtResult.setHorizontalAlignment(SwingConstants.RIGHT);
		txtResult.setFont(new Font("굴림", Font.PLAIN, 15));
		txtResult.setEditable(false);
		txtResult.setText("0");
		txtResult.setBounds(12, 10, 284, 56);
		frame.getContentPane().add(txtResult);
		txtResult.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(12, 76, 62, 62);
		frame.getContentPane().add(btn7);
		
		btn8 = new JButton("8");
		btn8.setBounds(86, 76, 62, 62);
		frame.getContentPane().add(btn8);
		
		btn9 = new JButton("9");
		btn9.setBounds(160, 76, 62, 62);
		frame.getContentPane().add(btn9);
		
		btn6 = new JButton("6");
		btn6.setBounds(160, 148, 62, 62);
		frame.getContentPane().add(btn6);
		
		btn4 = new JButton("4");
		btn4.setBounds(12, 148, 62, 62);
		frame.getContentPane().add(btn4);
		
		btn5 = new JButton("5");
		btn5.setBounds(86, 148, 62, 62);
		frame.getContentPane().add(btn5);
		
		btn3 = new JButton("3");
		btn3.setBounds(160, 221, 62, 62);
		frame.getContentPane().add(btn3);
		
		btn1 = new JButton("1");
		btn1.setBounds(12, 221, 62, 62);
		frame.getContentPane().add(btn1);
		
		btn2 = new JButton("2");
		btn2.setBounds(86, 221, 62, 62);
		frame.getContentPane().add(btn2);
		
		btnDiv = new JButton("/");
		btnDiv.setBounds(234, 76, 62, 62);
		frame.getContentPane().add(btnDiv);
		
		btnMul = new JButton("*");
		btnMul.setBounds(234, 148, 62, 62);
		frame.getContentPane().add(btnMul);
		
		btnMin = new JButton("-");
		btnMin.setBounds(234, 221, 62, 62);
		frame.getContentPane().add(btnMin);
		
		btnPlus = new JButton("+");
		btnPlus.setBounds(234, 293, 62, 62);
		frame.getContentPane().add(btnPlus);
		
		btnCancle = new JButton("C");
		btnCancle.setBounds(12, 293, 62, 62);
		frame.getContentPane().add(btnCancle);
		
		btn0 = new JButton("0");
		btn0.setBounds(86, 293, 62, 62);
		frame.getContentPane().add(btn0);
		
		JButton btnEq = new JButton("=");
		btnEq.setBounds(160, 293, 62, 62);
		frame.getContentPane().add(btnEq);

		
		
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = 1;
			}
		});
		
		btnMin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = 2;
			}
		});
		
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = 3;
				
			}
		});
		
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = 4;
			}
		});
		
		btnEq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int result = 0;
				
				if(operator ==1 ) {
					
					if(operator == 1) {
						result = num1 + num2;
					}else if(operator == 2 ) {
						result = num1 - num2;
						
					}else if(operator == 3 ) {
						result = num1 * num2;
						
					}else if(operator == 4) {
						result = num1 / num2;
					}
					txtResult.setText(""+result);
				}
				
			}
		});
		
		//버튼 리스너
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				txtResult.setText("1");
				num1 = 1;
				
				
			}
		});
		
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtResult.setText("2");
				num1 = 1;
				
			}
		});
		
		
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				txtResult.setText("4");
				num1 = 1;
				
			}
		});
		
		
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				txtResult.setText("3");
			}
		});
		
		
		
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtResult.setText("5");
				num1 = 1;
				
			}
		});
		
		
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtResult.setText("6");
				num1 = 1;
				
			}
		});
		
		
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtResult.setText("7");
				num1 = 1;
				
			}
		});
		
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtResult.setText("8");
				num1 = 1;
				
			}
		});
		
		
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtResult.setText("9");
				num1 = 1;
				
			}
		});
		
	}

}
