package uinterface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JUIPublico extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JButton btnFechar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JUIPublico frame = new JUIPublico();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JUIPublico() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 290, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPblicoTotal = new JLabel("P\u00FAblico Total:");
		lblPblicoTotal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPblicoTotal.setBounds(7, 26, 104, 27);
		contentPane.add(lblPblicoTotal);
		
		textField = new JTextField();
		textField.setBounds(166, 31, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPblicoFeminino = new JLabel("P\u00FAblico Feminino:");
		lblPblicoFeminino.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPblicoFeminino.setBounds(7, 70, 135, 14);
		contentPane.add(lblPblicoFeminino);
		
		textField_1 = new JTextField();
		textField_1.setBounds(166, 64, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("P\u00FAblico Masculino:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(7, 103, 135, 14);
		contentPane.add(lblNewLabel);
		
		textField_2 = new JTextField();
		textField_2.setBounds(166, 97, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblPercentualFeminino = new JLabel("Percentual Feminino:");
		lblPercentualFeminino.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPercentualFeminino.setBounds(7, 134, 149, 14);
		contentPane.add(lblPercentualFeminino);
		
		textField_3 = new JTextField();
		textField_3.setBounds(166, 128, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Percentual Masculino:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(7, 161, 162, 20);
		contentPane.add(lblNewLabel_1);
		
		textField_4 = new JTextField();
		textField_4.setBounds(166, 161, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Percentual De S\u00F3cios:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(7, 192, 159, 20);
		contentPane.add(lblNewLabel_2);
		
		textField_5 = new JTextField();
		textField_5.setBounds(166, 192, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnFechar.setBounds(166, 223, 89, 23);
		contentPane.add(btnFechar);
	}
}
