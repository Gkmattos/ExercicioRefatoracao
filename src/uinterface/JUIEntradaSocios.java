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

import business.Bar;
import persistence.Cliente;
import persistence.Socio;

public class JUIEntradaSocios extends JFrame {

	private JPanel contentPane;
	private JTextField nome;
	private JTextField cpf;
	private JTextField idade;
	private JTextField sexo;
	private JLabel lblCdigoDoScio;
	private JTextField codigo;

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
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 373, 274);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Bar bar = new Bar();
		JButton btnTeste = new JButton("Entrar");
		btnTeste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cliente soc = new Socio(nome.getText(), cpf.getText(), Integer.parseInt(idade.getText()),
						sexo.getText(),Integer.parseInt(codigo.getText()));
				bar.entrada(soc);
			}
		});
		btnTeste.setBounds(151, 197, 89, 23);
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
		nome.setBounds(92, 13, 223, 20);
		contentPane.add(nome);
		nome.setColumns(10);

		cpf = new JTextField();
		cpf.setBounds(92, 49, 223, 20);
		contentPane.add(cpf);
		cpf.setColumns(10);

		idade = new JTextField();
		idade.setBounds(93, 87, 222, 20);
		contentPane.add(idade);
		idade.setColumns(10);

		sexo = new JTextField();
		sexo.setBounds(93, 123, 222, 20);
		contentPane.add(sexo);
		sexo.setColumns(10);

		lblCdigoDoScio = new JLabel("C\u00F3digo:");
		lblCdigoDoScio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCdigoDoScio.setBounds(27, 154, 137, 32);
		contentPane.add(lblCdigoDoScio);

		codigo = new JTextField();
		codigo.setBounds(93, 162, 222, 20);
		contentPane.add(codigo);
		codigo.setColumns(10);
	}
}
