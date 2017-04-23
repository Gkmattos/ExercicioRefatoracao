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

public class JUISaidaCliente extends JFrame {

	private JPanel contentPane;
	private JTextField cpf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JUISaidaCliente frame = new JUISaidaCliente();
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
	public JUISaidaCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 333, 179);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInformeOCpf = new JLabel("Informe o CPF para liberar sa\u00EDda:");
		lblInformeOCpf.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblInformeOCpf.setBounds(37, 33, 277, 20);
		contentPane.add(lblInformeOCpf);
		
		cpf = new JTextField();
		cpf.setBounds(37, 73, 237, 20);
		contentPane.add(cpf);
		cpf.setColumns(10);
		
		JButton btnSair = new JButton("Liberar");
		btnSair.setBounds(63, 104, 89, 23);
		contentPane.add(btnSair);
		
		JButton btnSair_1 = new JButton("Sair");
		btnSair_1.setBounds(164, 104, 89, 23);
		contentPane.add(btnSair_1);
	}

}
