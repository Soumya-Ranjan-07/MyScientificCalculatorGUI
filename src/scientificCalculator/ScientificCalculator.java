package scientificCalculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.Font;

import javax.swing.SwingConstants;

public class ScientificCalculator {

	private JFrame frmStandardCalculator;
	private JTextField txtDisplay;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScientificCalculator window = new ScientificCalculator();
					window.frmStandardCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ScientificCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStandardCalculator = new JFrame();
		frmStandardCalculator.setTitle("Standard Calculator");
		frmStandardCalculator.setBounds(100, 100, 267, 367);
		frmStandardCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmStandardCalculator.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Standard");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmStandardCalculator.setTitle("Standard Calculator");
				frmStandardCalculator.setBounds(100, 100, 267, 367);
				txtDisplay.setBounds(10,11,243,37);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Scientific");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmStandardCalculator.setTitle("Scientific Calculator");
				frmStandardCalculator.setBounds(100, 100, 575, 367);
				txtDisplay.setBounds(10,11,540,37);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Unit Conversion");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmStandardCalculator.setTitle("Unit Conversion");
				frmStandardCalculator.setBounds(100, 100, 884, 367);
				txtDisplay.setBounds(10,11,500,37);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Exit");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		mntmNewMenuItem_3.setBackground(new Color(255, 0, 0));
		mnNewMenu.add(mntmNewMenuItem_3);
		frmStandardCalculator.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtDisplay.setBounds(8, 11, 243, 37);
		frmStandardCalculator.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtDisplay.getText()+btn7.getText();
				txtDisplay.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(8, 100, 46, 47);
		frmStandardCalculator.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtDisplay.getText()+btn8.getText();
				txtDisplay.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(58, 100, 46, 47);
		frmStandardCalculator.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtDisplay.getText()+btn9.getText();
				txtDisplay.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(108, 100, 46, 47);
		frmStandardCalculator.getContentPane().add(btn9);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtDisplay.getText()+btn4.getText();
				txtDisplay.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(8, 150, 46, 47);
		frmStandardCalculator.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtDisplay.getText()+btn5.getText();
				txtDisplay.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(58, 150, 46, 47);
		frmStandardCalculator.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtDisplay.getText()+btn6.getText();
				txtDisplay.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(108, 150, 46, 47);
		frmStandardCalculator.getContentPane().add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtDisplay.getText()+btn1.getText();
				txtDisplay.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(8, 200, 46, 47);
		frmStandardCalculator.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtDisplay.getText()+btn2.getText();
				txtDisplay.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(58, 200, 46, 47);
		frmStandardCalculator.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtDisplay.getText()+btn3.getText();
				txtDisplay.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(108, 200, 46, 47);
		frmStandardCalculator.getContentPane().add(btn3);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtDisplay.getText()+btn0.getText();
				txtDisplay.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(8, 250, 96, 47);
		frmStandardCalculator.getContentPane().add(btn0);
		
		JButton btndot = new JButton(".");
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txtDisplay.getText()+btndot.getText();
				txtDisplay.setText(number);
			}
		});
		btndot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btndot.setBounds(108, 250, 46, 47);
		frmStandardCalculator.getContentPane().add(btndot);
		
		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operation = "/";
			}
		});
		btndiv.setFont(new Font("Tahoma", Font.BOLD, 18));
		btndiv.setBounds(158, 100, 46, 47);
		frmStandardCalculator.getContentPane().add(btndiv);
		
		JButton btnperc = new JButton("%");
		btnperc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operation = "%";
			}
		});
		btnperc.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnperc.setBounds(208, 100, 46, 47);
		frmStandardCalculator.getContentPane().add(btnperc);
		
		JButton btnmul = new JButton("*");
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operation = "*";
			}
		});
		btnmul.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnmul.setBounds(158, 150, 46, 47);
		frmStandardCalculator.getContentPane().add(btnmul);
		
		JButton btnreciprocal = new JButton("1/x");
		btnreciprocal.setFont(new Font("Tahoma", Font.BOLD, 6));
		btnreciprocal.setBounds(208, 150, 46, 47);
		frmStandardCalculator.getContentPane().add(btnreciprocal);
		
		JButton btnminus = new JButton("-");
		btnminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operation = "-";
			}
		});
		btnminus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnminus.setBounds(158, 200, 46, 47);
		frmStandardCalculator.getContentPane().add(btnminus);
		
		JButton btnequal = new JButton("=");
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				second = Double.parseDouble(txtDisplay.getText());
				if (operation=="+")
				{
					result = first+second;
					answer = String.format("%.2f",result);
					txtDisplay.setText(answer);
				}
				
				else if (operation=="-")
				{
					result = first-second;
					answer = String.format("%.2f",result);
					txtDisplay.setText(answer);
				}
				
				else if (operation=="*")
				{
					result = first*second;
					answer = String.format("%.2f",result);
					txtDisplay.setText(answer);
				}
				
				else if (operation=="/")
				{
					result = first/second;
					answer = String.format("%.2f",result);
					txtDisplay.setText(answer);
				}
				
				else if (operation=="%")
				{
					result = first/second*100;
					answer = String.format("%.2f",result);
					txtDisplay.setText(answer);
				}
				
				else if (operation=="Exp")
				{
					result = Math.pow(first, second);
					answer = String.format("%.2f",result);
					txtDisplay.setText(answer);
				}
				
				else if (operation=="Mod")
				{
					result = first%second;
					answer = String.format("%.2f",result);
					txtDisplay.setText(answer);
				}
				
			}
		});
		btnequal.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnequal.setBounds(208, 200, 46, 97);
		frmStandardCalculator.getContentPane().add(btnequal);
		
		JButton btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operation = "+";
			}
		});
		btnplus.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnplus.setBounds(157, 250, 46, 47);
		frmStandardCalculator.getContentPane().add(btnplus);
		
		JButton btnbackspace = new JButton("\uF0E7");
		btnbackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backSpace = null;
				
				if (txtDisplay.getText().length()>0)
				{
					StringBuilder strB = new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length()-1);
					backSpace = strB.toString();
					txtDisplay.setText(backSpace);
				}
			}
		});
		btnbackspace.setFont(new Font("Wingdings", Font.BOLD, 11));
		btnbackspace.setBounds(8, 50, 96, 47);
		frmStandardCalculator.getContentPane().add(btnbackspace);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnC.setBounds(108, 50, 46, 47);
		frmStandardCalculator.getContentPane().add(btnC);
		
		JButton btnPlusMinus = new JButton("±");
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = ops * (-1);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnPlusMinus.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPlusMinus.setBounds(158, 50, 46, 47);
		frmStandardCalculator.getContentPane().add(btnPlusMinus);
		
		JButton btnSqrt = new JButton("√");
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.sqrt(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnSqrt.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSqrt.setBounds(208, 50, 46, 47);
		frmStandardCalculator.getContentPane().add(btnSqrt);
		
		JButton btnLog = new JButton("Log");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.log(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnLog.setFont(new Font("Tahoma", Font.BOLD, 6));
		btnLog.setBounds(258, 50, 46, 47);
		frmStandardCalculator.getContentPane().add(btnLog);
		
		JButton btnSin = new JButton("Sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.sin(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnSin.setHorizontalAlignment(SwingConstants.LEFT);
		btnSin.setFont(new Font("Tahoma", Font.BOLD, 6));
		btnSin.setBounds(308, 50, 46, 47);
		frmStandardCalculator.getContentPane().add(btnSin);
		
		JButton btnSinh = new JButton("Sinh");
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.sinh(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnSinh.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSinh.setBounds(358, 50, 66, 47);
		frmStandardCalculator.getContentPane().add(btnSinh);
		
		JButton btnPi = new JButton("π");
		btnPi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops;
				ops = Math.PI;
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnPi.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnPi.setBounds(258, 100, 46, 47);
		frmStandardCalculator.getContentPane().add(btnPi);
		
		JButton btnCos = new JButton("Cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.cos(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnCos.setFont(new Font("Tahoma", Font.BOLD, 6));
		btnCos.setBounds(308, 100, 46, 47);
		frmStandardCalculator.getContentPane().add(btnCos);
		
		JButton btnlnx = new JButton("lnx");
		btnlnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.log10(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnlnx.setFont(new Font("Tahoma", Font.BOLD, 6));
		btnlnx.setBounds(428, 100, 46, 47);
		frmStandardCalculator.getContentPane().add(btnlnx);
		
		JButton btnCosh = new JButton("Cosh");
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.cosh(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnCosh.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCosh.setBounds(358, 100, 66, 47);
		frmStandardCalculator.getContentPane().add(btnCosh);
		
		JButton btnMod = new JButton("Mod");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operation = "Mod";
			}
		});
		btnMod.setFont(new Font("Tahoma", Font.BOLD, 5));
		btnMod.setBounds(428, 50, 46, 47);
		frmStandardCalculator.getContentPane().add(btnMod);
		
		JButton btnpower = new JButton("a^a");
		btnpower.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.pow(ops, ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnpower.setHorizontalAlignment(SwingConstants.LEFT);
		btnpower.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btnpower.setBounds(258, 150, 46, 47);
		frmStandardCalculator.getContentPane().add(btnpower);
		
		JButton btntan = new JButton("Tan");
		btntan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.tan(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btntan.setHorizontalAlignment(SwingConstants.LEFT);
		btntan.setFont(new Font("Tahoma", Font.BOLD, 6));
		btntan.setBounds(308, 150, 46, 47);
		frmStandardCalculator.getContentPane().add(btntan);
		
		JButton btnC_1 = new JButton("Exp");
		btnC_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operation = "Exp";
			}
		});
		btnC_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnC_1.setFont(new Font("Tahoma", Font.BOLD, 6));
		btnC_1.setBounds(428, 150, 46, 47);
		frmStandardCalculator.getContentPane().add(btnC_1);
		
		JButton btnsquare = new JButton("a^2");
		btnsquare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = ops * ops;
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnsquare.setHorizontalAlignment(SwingConstants.LEFT);
		btnsquare.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btnsquare.setBounds(258, 200, 46, 47);
		frmStandardCalculator.getContentPane().add(btnsquare);
		
		JButton btnCube = new JButton("a^3");
		btnCube.setHorizontalAlignment(SwingConstants.LEFT);
		btnCube.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btnCube.setBounds(258, 250, 46, 47);
		frmStandardCalculator.getContentPane().add(btnCube);
		
		JButton btnCbr = new JButton("Cbr");
		btnCbr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.cbrt(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnCbr.setHorizontalAlignment(SwingConstants.LEFT);
		btnCbr.setFont(new Font("Tahoma", Font.BOLD, 6));
		btnCbr.setBounds(308, 200, 46, 47);
		frmStandardCalculator.getContentPane().add(btnCbr);
		
		JButton btnBinary = new JButton("Bin");
		btnBinary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(txtDisplay.getText());
				txtDisplay.setText(Integer.toString(a,2));
			}
		});
		btnBinary.setHorizontalAlignment(SwingConstants.LEFT);
		btnBinary.setFont(new Font("Tahoma", Font.BOLD, 6));
		btnBinary.setBounds(308, 250, 46, 47);
		frmStandardCalculator.getContentPane().add(btnBinary);
		
		JButton btnPi2 = new JButton("2*\u03C0");
		btnPi2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops;
				ops = 2 * Math.PI;
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnPi2.setHorizontalAlignment(SwingConstants.LEFT);
		btnPi2.setFont(new Font("SansSerif", Font.BOLD, 6));
		btnPi2.setBounds(428, 200, 46, 47);
		frmStandardCalculator.getContentPane().add(btnPi2);
		
		JButton btnOctal = new JButton("Oct");
		btnOctal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(txtDisplay.getText());
				txtDisplay.setText(Integer.toString(a,8));
			}
		});
		btnOctal.setHorizontalAlignment(SwingConstants.LEFT);
		btnOctal.setFont(new Font("Tahoma", Font.BOLD, 6));
		btnOctal.setBounds(428, 250, 46, 47);
		frmStandardCalculator.getContentPane().add(btnOctal);
		
		JButton btnTanh = new JButton("Tanh");
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.tanh(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnTanh.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnTanh.setBounds(358, 150, 66, 47);
		frmStandardCalculator.getContentPane().add(btnTanh);
		
		JButton btnRund = new JButton("Rund");
		btnRund.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.round(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnRund.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnRund.setBounds(358, 200, 66, 47);
		frmStandardCalculator.getContentPane().add(btnRund);
		
		JButton btnHex = new JButton("Hex");
		btnHex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(txtDisplay.getText());
				txtDisplay.setText(Integer.toString(a,16));
			}
		});
		btnHex.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnHex.setBounds(358, 250, 66, 47);
		frmStandardCalculator.getContentPane().add(btnHex);
	}
}
