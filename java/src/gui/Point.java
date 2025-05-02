package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Point extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfName;
	private JTextField tfKor;
	private JTextField tfEng;
	private JTextField tfMath;
	private JButton btnCancel;
	private JTextArea ta;
	private String name;
	private int kor, eng, math, tot;
	private double avg;

	public Point() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblName = new JLabel("이름");
		lblName.setBounds(34, 26, 57, 15);
		contentPane.add(lblName);

		tfName = new JTextField();
		tfName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name = tfName.getText();
				if (name.equals("")) {
					check("이름을 입력하세요", tfName);
					return;
				}
				tfKor.requestFocus();
			}
		});
		tfName.setBounds(114, 23, 116, 21);
		contentPane.add(tfName);
		tfName.setColumns(10);

		JLabel lblKor = new JLabel("국어");
		lblKor.setBounds(34, 57, 57, 15);
		contentPane.add(lblKor);

		tfKor = new JTextField();
		tfKor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String strKor = tfKor.getText();
				if (strKor.equals("")) {
					check("국어점수를 입력하세요.", tfKor);
					return;
				}
				tfEng.requestFocus();
			}
		});
		tfKor.setBounds(114, 54, 116, 21);
		contentPane.add(tfKor);
		tfKor.setColumns(10);

		JLabel lblEng = new JLabel("영어");
		lblEng.setBounds(34, 90, 57, 15);
		contentPane.add(lblEng);

		tfEng = new JTextField();
		tfEng.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String strEng = tfEng.getText();
				if (strEng.equals("")) {
					check("영어점수를 입력하세요", tfEng);
					return;
				}
				tfMath.requestFocus();
			}
		});
		tfEng.setBounds(114, 87, 116, 21);
		contentPane.add(tfEng);
		tfEng.setColumns(10);

		JLabel lblMath = new JLabel("수학");
		lblMath.setBounds(34, 120, 57, 15);
		contentPane.add(lblMath);

		tfMath = new JTextField();
		tfMath.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String strMath = tfMath.getText();
				if (strMath.equals("")) {
					check("수학점수를 입력하세요.", tfMath);
					return;
				}
				calc();
			}
		});
		tfMath.setBounds(114, 117, 116, 21);
		contentPane.add(tfMath);
		tfMath.setColumns(10);

		JButton btnEval = new JButton("계산");
		btnEval.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc();
			}
		});
		btnEval.setBounds(30, 163, 97, 23);
		contentPane.add(btnEval);

		getRootPane().setDefaultButton(btnEval); // 프레임의 기본 버튼으로 설정

		btnCancel = new JButton("취소");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfName.setText("");
				tfKor.setText("");
				tfEng.setText("");
				tfMath.setText("");
				ta.setText("");
				tfName.requestFocus();
			}
		});
		btnCancel.setBounds(133, 163, 97, 23);
		contentPane.add(btnCancel);

		ta = new JTextArea();
		ta.setBounds(34, 201, 196, 144);
		contentPane.add(ta);

		setSize(300, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	void check(String message, JTextField tf) {
		JOptionPane.showMessageDialog(Point.this, message);
		tf.requestFocus();
	}

	void calc() {
		name = tfName.getText();
		if (name.equals("")) {
			check("이름을 입력하세요", tfName);
			return;
		}
		String strKor = tfKor.getText();
		if (strKor.equals("")) {
			check("국어점수를 입력하세요.", tfKor);
			return;
		}
		String strEng = tfEng.getText();
		if (strEng.equals("")) {
			check("국어점수를 입력하세요.", tfEng);
			return;
		}
		String strMath = tfMath.getText();
		if (strMath.equals("")) {
			check("국어점수를 입력하세요.", tfMath);
			return;
		}
		kor = Integer.parseInt(strKor);
		eng = Integer.parseInt(strEng);
		math = Integer.parseInt(strMath);
		tot = kor + eng + math;
		avg = tot / 3.0;
		String result = "이름:" + name + "\n총점:" + tot + "\n평균:" + String.format("%.2f", avg);
		ta.setText(result);
	}

	public static void main(String[] args) {
		new Point();
	}
}
