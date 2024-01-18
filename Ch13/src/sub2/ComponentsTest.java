package sub2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class ComponentsTest {

	private JFrame frame;
	private JTextField txtUid;
	private JTextField txtName;
	private JTextField txtHp;
	private JTextField txtNum1;
	private JTextField txtNum2;
	private JTextField txtMinNum1;
	private JTextField txtMinNum2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentsTest window = new ComponentsTest();
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
	public ComponentsTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 509);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("컴포넌트 실습");
		lblNewLabel.setBounds(12, 10, 98, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btn1 = new JButton("확인1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//버튼을 클릭했을 때 실행되는 리스너(핸들러)
				System.out.println("확인1 클릭");
				
			}
		});
		btn1.setBounds(12, 35, 97, 23);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("확인2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "버튼2클릭!!");
				
			}
		});
		btn2.setBounds(121, 35, 97, 23);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("확인3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int answer = JOptionPane.showConfirmDialog(null, "버튼3 클릭!!", "확인대화상자", JOptionPane.YES_NO_OPTION);
				
				if(answer == 0) {
					System.out.println("Yes 클릭...");
				}else {
					System.out.println("No 클릭...");
				}
				
			}
		});
		btn3.setBounds(230, 35, 97, 23);
		frame.getContentPane().add(btn3);
		
		/////////////////////////////////////////////////////////////////
		
		JLabel lblNewLabel_1 = new JLabel("텍스트 필드실습");
		lblNewLabel_1.setBounds(12, 68, 98, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("아이디");
		lblNewLabel_2.setBounds(12, 93, 57, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		txtUid = new JTextField();
		txtUid.setBounds(52, 90, 116, 21);
		frame.getContentPane().add(txtUid);
		txtUid.setColumns(10);
		
		JButton btnUid = new JButton("확인");

		btnUid.setBounds(180, 89, 97, 23);
		frame.getContentPane().add(btnUid);
		
		JLabel lbResultUid = new JLabel("결과 : ");
		lbResultUid.setBounds(289, 93, 133, 15);
		frame.getContentPane().add(lbResultUid);
		
		JLabel lblNewLabel_2_1 = new JLabel("이름");
		lblNewLabel_2_1.setBounds(12, 122, 57, 15);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(52, 119, 116, 21);
		frame.getContentPane().add(txtName);
		
		
		JLabel lbResultName = new JLabel("결과 : ");
		lbResultName.setBounds(289, 122, 133, 15);
		frame.getContentPane().add(lbResultName);
		
		JLabel lblNewLabel_2_2 = new JLabel("휴대폰");
		lblNewLabel_2_2.setBounds(12, 151, 57, 15);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		txtHp = new JTextField();
		txtHp.setColumns(10);
		txtHp.setBounds(52, 148, 116, 21);
		frame.getContentPane().add(txtHp);
		
		JButton btnHp = new JButton("확인");
		btnHp.setBounds(180, 147, 97, 23);
		frame.getContentPane().add(btnHp);
		
		JLabel lbResultHp = new JLabel("결과 : ");
		lbResultHp.setBounds(289, 151, 133, 15);
		frame.getContentPane().add(lbResultHp);
		
		JButton btnName = new JButton("확인");
		btnName.setBounds(180, 118, 97, 23);
		frame.getContentPane().add(btnName);
		
		JLabel lbPlsu = new JLabel("덧셈");
		lbPlsu.setBounds(12, 184, 57, 15);
		frame.getContentPane().add(lbPlsu);
		

		JLabel lbResultPlus = new JLabel("결과 : ");
		lbResultPlus.setBounds(289, 184, 133, 15);
		frame.getContentPane().add(lbResultPlus);
		
		txtNum1 = new JTextField();
		txtNum1.setColumns(10);
		txtNum1.setBounds(52, 181, 44, 21);
		frame.getContentPane().add(txtNum1);
		
		txtNum2 = new JTextField();
		txtNum2.setColumns(10);
		txtNum2.setBounds(124, 181, 44, 21);
		frame.getContentPane().add(txtNum2);
		
		JLabel lbResultHp_1_1 = new JLabel("+");
		lbResultHp_1_1.setBounds(108, 184, 26, 15);
		frame.getContentPane().add(lbResultHp_1_1);
		
		JLabel lbMin = new JLabel("뺄셈");
		lbMin.setBounds(12, 213, 57, 15);
		frame.getContentPane().add(lbMin);
		
		txtMinNum1 = new JTextField();
		txtMinNum1.setColumns(10);
		txtMinNum1.setBounds(52, 210, 44, 21);
		frame.getContentPane().add(txtMinNum1);
		
		JLabel lbResultHp_1_1_1 = new JLabel("-");
		lbResultHp_1_1_1.setBounds(108, 213, 26, 15);
		frame.getContentPane().add(lbResultHp_1_1_1);
		
		txtMinNum2 = new JTextField();
		txtMinNum2.setColumns(10);
		txtMinNum2.setBounds(124, 210, 44, 21);
		frame.getContentPane().add(txtMinNum2);
		
		JButton btnHp_1_1 = new JButton("확인");
		btnHp_1_1.setBounds(180, 209, 97, 23);
		frame.getContentPane().add(btnHp_1_1);
		
		JLabel lbResultHp_1_2 = new JLabel("결과 : ");
		lbResultHp_1_2.setBounds(289, 213, 133, 15);
		frame.getContentPane().add(lbResultHp_1_2);
		
		JLabel lbMul = new JLabel("곱셈");
		lbMul.setBounds(12, 242, 57, 15);
		frame.getContentPane().add(lbMul);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(52, 239, 44, 21);
		frame.getContentPane().add(textField_4);
		
		JLabel lbResultHp_1_1_2 = new JLabel("*");
		lbResultHp_1_1_2.setBounds(108, 242, 26, 15);
		frame.getContentPane().add(lbResultHp_1_1_2);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(124, 239, 44, 21);
		frame.getContentPane().add(textField_5);
		
		JButton btnHp_1_2 = new JButton("확인");
		btnHp_1_2.setBounds(180, 238, 97, 23);
		frame.getContentPane().add(btnHp_1_2);
		
		JLabel lbResultHp_1_3 = new JLabel("결과 : ");
		lbResultHp_1_3.setBounds(289, 242, 133, 15);
		frame.getContentPane().add(lbResultHp_1_3);
		
		JLabel lbDiv = new JLabel("나눗셈");
		lbDiv.setBounds(12, 271, 57, 15);
		frame.getContentPane().add(lbDiv);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(52, 268, 44, 21);
		frame.getContentPane().add(textField_6);
		
		JLabel lbResultHp_1_1_3 = new JLabel("+");
		lbResultHp_1_1_3.setBounds(108, 271, 26, 15);
		frame.getContentPane().add(lbResultHp_1_1_3);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(124, 268, 44, 21);
		frame.getContentPane().add(textField_7);
		
		JButton btnHp_1_3 = new JButton("확인");
		btnHp_1_3.setBounds(180, 267, 97, 23);
		frame.getContentPane().add(btnHp_1_3);
		
		JLabel lbResultHp_1_4 = new JLabel("결과 : ");
		lbResultHp_1_4.setBounds(289, 271, 133, 15);
		frame.getContentPane().add(lbResultHp_1_4);
		
		JButton btnPlus = new JButton("확인");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPlus.setBounds(180, 180, 97, 23);
		frame.getContentPane().add(btnPlus);
		
		JLabel lblNewLabel_3 = new JLabel("체크박스 실습");
		lblNewLabel_3.setBounds(12, 295, 98, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		JCheckBox chk1 = new JCheckBox("서울");
		chk1.setBounds(12, 314, 57, 23);
		frame.getContentPane().add(chk1);
		
		JCheckBox chk2 = new JCheckBox("대전");
		chk2.setBounds(77, 314, 57, 23);
		frame.getContentPane().add(chk2);
		
		JCheckBox chk3 = new JCheckBox("대구");
		chk3.setBounds(138, 314, 57, 23);
		frame.getContentPane().add(chk3);
		
		JCheckBox chk4 = new JCheckBox("부산");
		chk4.setBounds(199, 314, 57, 23);
		frame.getContentPane().add(chk4);
		
		JCheckBox chk5 = new JCheckBox("광주");
		chk5.setBounds(260, 314, 57, 23);
		frame.getContentPane().add(chk5);
		
		JButton btnCheck = new JButton("확인");
		btnCheck.setBounds(325, 314, 97, 23);
		frame.getContentPane().add(btnCheck);
		
		JLabel lbCheckResult = new JLabel("결과 : ");
		lbCheckResult.setBounds(22, 343, 146, 15);
		frame.getContentPane().add(lbCheckResult);
		
		
		//userid 이벤트 리스너
		btnUid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//텍스트 필드에 입력된 문자열 가져오기
				String uid = txtUid.getText();
			
				//결과 라벨에 가쟈온 문자열 입력하기
				lbResultUid.setText("결과 : " +uid);
				
			}
		});
		
		//Name 이벤트 리스너
		btnName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//텍스트 필드에 입력된 문자열 가져오기
				String name = txtName.getText();
			
				//결과 라벨에 가쟈온 문자열 입력하기
				lbResultName.setText("결과 : " +name);
			}
		});
		
		//Hp 이벤트 리스너
		btnHp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//텍스트 필드에 입력된 문자열 가져오기
				String hp = txtHp.getText();
			
				//결과 라벨에 가쟈온 문자열 입력하기
				lbResultHp.setText("결과 : " +hp);
				
			}
		});
		
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			int num1 = Integer.parseInt(txtNum1.getText()); 
			int num2 = Integer.parseInt(txtNum2.getText());
			
			int result = num1 + num2;
			lbResultPlus.setText( "결과 : " +result);
			
			}
		});
		
		
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<String> cities = new ArrayList<>();
				
				if(chk1.isSelected()) {
					cities.add(chk1.getText());
				}if(chk2.isSelected()) {
					cities.add(chk2.getText());
				}if(chk3.isSelected()) {
					cities.add(chk3.getText());
				}if(chk4.isSelected()) {
					cities.add(chk4.getText());
				}if(chk5.isSelected()) {
					cities.add(chk5.getText());
				}
				lbCheckResult.setText("결과" + cities);
				
				
			}
		});
		
	}
}
