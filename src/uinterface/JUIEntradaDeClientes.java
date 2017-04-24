package uinterface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import business.Bar;
import persistence.Cliente;

import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.Closeable;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class JUIEntradaDeClientes extends JFrame {

	private JPanel contentPane;
	private JTextField nome;
	private JTextField cpf;
	private JTextField idade;
	private JTextField sexo;
	private Bar bar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JUIEntradaDeClientes frame = new JUIEntradaDeClientes();
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @throws IOException
	 */
	public JUIEntradaDeClientes() {

		bar = new Bar();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 373, 248);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnTeste = new JButton("Entrar");
		btnTeste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cliente cl = new Cliente(nome.getText(), cpf.getText(), Integer.parseInt(idade.getText()),
						sexo.getText());
				bar.entrada(cl);

			}
		});
		btnTeste.setBounds(156, 154, 89, 23);
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

		nome = new JTextField();
		nome.setBounds(82, 13, 233, 20);
		contentPane.add(nome);
		nome.setColumns(10);

		cpf = new JTextField();
		cpf.setBounds(83, 49, 232, 20);
		contentPane.add(cpf);
		cpf.setColumns(10);

		idade = new JTextField();
		idade.setBounds(83, 87, 232, 20);
		contentPane.add(idade);
		idade.setColumns(10);

		sexo = new JTextField();
		sexo.setBounds(83, 123, 232, 20);
		contentPane.add(sexo);
		sexo.setColumns(10);
	}

}
