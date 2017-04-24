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
import javax.swing.SwingConstants;

public class JUIPublico extends JFrame {

	private JPanel contentPane;
	private JTextField publicoTotal;
	private JTextField publicoFeminino;
	private JTextField PublicoMasculino;
	private JTextField PercentualFeminino;
	private JTextField percentualMasculino;
	private JTextField percentualSocios;

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
		setBounds(100, 100, 290, 259);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblPblicoTotal = new JLabel("P\u00FAblico Total:");
		lblPblicoTotal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPblicoTotal.setBounds(7, 26, 104, 27);
		contentPane.add(lblPblicoTotal);

		publicoTotal = new JTextField();
		publicoTotal.setHorizontalAlignment(SwingConstants.CENTER);
		publicoTotal.setEditable(false);
		publicoTotal.setBounds(166, 31, 86, 20);
		contentPane.add(publicoTotal);
		publicoTotal.setColumns(10);
		publicoTotal.setText(Integer.toString(b.publico()));

		JLabel lblPblicoFeminino = new JLabel("P\u00FAblico Feminino:");
		lblPblicoFeminino.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPblicoFeminino.setBounds(7, 70, 135, 14);
		contentPane.add(lblPblicoFeminino);

		publicoFeminino = new JTextField();
		publicoFeminino.setHorizontalAlignment(SwingConstants.CENTER);
		publicoFeminino.setEditable(false);
		publicoFeminino.setBounds(166, 64, 86, 20);
		contentPane.add(publicoFeminino);
		publicoFeminino.setColumns(10);
		publicoFeminino.setText(Integer.toString(b.publicoFeminino())+"%");

		JLabel lblNewLabel = new JLabel("P\u00FAblico Masculino:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(7, 103, 135, 14);
		contentPane.add(lblNewLabel);

		PublicoMasculino = new JTextField();
		PublicoMasculino.setHorizontalAlignment(SwingConstants.CENTER);
		PublicoMasculino.setEditable(false);
		PublicoMasculino.setBounds(166, 97, 86, 20);
		contentPane.add(PublicoMasculino);
		PublicoMasculino.setColumns(10);
		PublicoMasculino.setText(Integer.toString(b.publicoMasculino())+"%");

		JLabel lblPercentualFeminino = new JLabel("Percentual Feminino:");
		lblPercentualFeminino.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPercentualFeminino.setBounds(7, 134, 149, 14);
		contentPane.add(lblPercentualFeminino);

		PercentualFeminino = new JTextField();
		PercentualFeminino.setHorizontalAlignment(SwingConstants.CENTER);
		PercentualFeminino.setEditable(false);
		PercentualFeminino.setBounds(166, 128, 86, 20);
		contentPane.add(PercentualFeminino);
		PercentualFeminino.setColumns(10);
		PercentualFeminino.setText(Integer.toString(b.percentMulheres())+"%");

		JLabel lblNewLabel_1 = new JLabel("Percentual Masculino:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(7, 161, 162, 20);
		contentPane.add(lblNewLabel_1);

		percentualMasculino = new JTextField();
		percentualMasculino.setHorizontalAlignment(SwingConstants.CENTER);
		percentualMasculino.setEditable(false);
		percentualMasculino.setBounds(166, 161, 86, 20);
		contentPane.add(percentualMasculino);
		percentualMasculino.setColumns(10);
		percentualMasculino.setText(Integer.toString(b.percentHomens())+"%");

		JLabel lblNewLabel_2 = new JLabel("Percentual De S\u00F3cios:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(7, 192, 159, 20);
		contentPane.add(lblNewLabel_2);

		percentualSocios = new JTextField();
		percentualSocios.setHorizontalAlignment(SwingConstants.CENTER);
		percentualSocios.setEditable(false);
		percentualSocios.setBounds(166, 192, 86, 20);
		contentPane.add(percentualSocios);
		percentualSocios.setColumns(10);
		percentualSocios.setText(Integer.toString(b.percentSocios())+"%");
	}
}
