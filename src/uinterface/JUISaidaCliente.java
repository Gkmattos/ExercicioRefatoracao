package uinterface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import business.Bar;
import persistence.Cliente;
import persistence.Socio;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		
		Cliente c1 = new Cliente("Ial Jonas", "01531075029", 20, "M");
		Cliente c2 = new Cliente("Maria Lucia", "4676900545", 20, "f");
		Cliente c3 = new Socio("Ial", "01531075029", 20, "F", 123);
		Cliente c4 = new Socio("Jonas", "01531075029", 20, "F", 1543);
		Cliente c5 = new Cliente("Lucia", "4676900545", 20, "m");
		Cliente c6 = new Cliente("Jonas Ial", "4676900545", 20, "m");
		Cliente c7 = new Socio("Lucia Maria", "01531075029", 20, "F", 989);
		Cliente c8 = new Cliente("Maria", "4676900545", 20, "m");
		Cliente c9 = new Cliente("Jonas Ial", "4676900545", 20, "m");
		Cliente c10 = new Socio("Lucia Maria", "01531075029", 20, "F", 989);
		Cliente c11 = new Cliente("Maria", "4676900545", 20, "m");
		Bar b = new Bar();

		b.entrada(c1);
		b.entrada(c2);
		b.entrada(c3);
		b.entrada(c4);
		b.entrada(c5);
		b.entrada(c6);
		b.entrada(c7);
		b.entrada(c8);
		b.entrada(c9);
		b.entrada(c10);
		b.entrada(c11);
		
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(b.saidaCliente(cpf.getText()));
				
			}
		});
		btnSair.setBounds(112, 104, 89, 23);
		contentPane.add(btnSair);
	}

}
