package uinterface;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class JUIEntradaSocios extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblCdigoDoScio;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JUIEntradaSocios frame = new JUIEntradaSocios();
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
	public JUIEntradaSocios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 373, 303);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnTeste = new JButton("Entrar");
		btnTeste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTeste.setBounds(142, 206, 89, 23);
		contentPane.add(btnTeste);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNome.setBounds(27, 11, 61, 20);
		contentPane.add(lblNome);

		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblIdade.setBounds(27, 88, 46, 14);
		contentPane.add(lblIdade);

		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCpf.setBounds(27, 50, 46, 14);
		contentPane.add(lblCpf);

		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSexo.setBounds(27, 124, 46, 14);
		contentPane.add(lblSexo);

		textField = new JTextField();
		textField.setBounds(92, 13, 223, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(92, 49, 223, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(93, 87, 222, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(93, 123, 222, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		lblCdigoDoScio = new JLabel("C\u00F3digo:");
		lblCdigoDoScio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCdigoDoScio.setBounds(27, 154, 137, 32);
		contentPane.add(lblCdigoDoScio);
		
		textField_4 = new JTextField();
		textField_4.setBounds(93, 162, 222, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
	}

}
