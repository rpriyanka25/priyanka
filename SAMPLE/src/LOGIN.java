import java.awt.EventQueue;
//567876bv
//kjfghjfhifgh
//jkfghgj
import javax.swing.JFrame;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import javax.swing.JScrollBar;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JRadioButtonMenuItem;

public class LOGIN {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LOGIN window = new LOGIN();
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
	public LOGIN() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 11));
		frame.getContentPane().setBackground(new Color(0, 128, 128));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PASWORD");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBackground(new Color(192, 192, 192));
		lblNewLabel.setBounds(39, 88, 74, 17);
		frame.getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		
		textField = new JTextField();
		textField.setBackground(new Color(192, 192, 192));
		textField.setBounds(119, 46, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("DS");
		rdbtnNewRadioButton.setBackground(new Color(128, 255, 255));
		rdbtnNewRadioButton.setBounds(39, 126, 70, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(407, 11, 17, 239);
		frame.getContentPane().add(scrollBar);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("YES");
		chckbxNewCheckBox.setBackground(new Color(0, 255, 255));
		chckbxNewCheckBox.setBounds(39, 152, 70, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(0, 64, 128));
		btnNewButton.setBounds(116, 199, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("NAME");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBackground(new Color(255, 128, 255));
		lblNewLabel_2.setBounds(39, 49, 46, 14);
		frame.getContentPane().add(lblNewLabel_2v);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("NO");
		chckbxNewCheckBox_1.setBackground(new Color(0, 255, 255));
		chckbxNewCheckBox_1.setBounds(131, 152, 74, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("CSE");
		rdbtnNewRadioButton_1.setBackground(new Color(128, 255, 255));
		rdbtnNewRadioButton_1.setBounds(131, 126, 74, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(192, 192, 192));
		passwordField.setBounds(118, 86, 87, 20);
		frame.getContentPane().add(passwordField);
	}
}
