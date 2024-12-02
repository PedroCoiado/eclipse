package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Telasaulas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Telasaulas frame = new Telasaulas();
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
	public Telasaulas() {
		setTitle("Cadastro de Aulas");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 547, 411);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 255));
		contentPane.setForeground(new Color(128, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_curso = new JPanel();
		panel_curso.setBounds(10, 11, 511, 77);
		contentPane.add(panel_curso);
		panel_curso.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Título do Curso:");
		lblNewLabel.setBounds(10, 11, 76, 14);
		panel_curso.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Carga Horária:");
		lblNewLabel_1.setBounds(10, 47, 76, 14);
		panel_curso.add(lblNewLabel_1);
		
		JFormattedTextField frmtdtxtfldSuaAlma = new JFormattedTextField();
		frmtdtxtfldSuaAlma.setText("Sua Alma");
		frmtdtxtfldSuaAlma.setBounds(295, 8, 117, 20);
		panel_curso.add(frmtdtxtfldSuaAlma);
		
		JLabel lblNewLabel_2 = new JLabel("Preço:");
		lblNewLabel_2.setBounds(252, 11, 46, 14);
		panel_curso.add(lblNewLabel_2);
		
		JFormattedTextField formattedTextField_2 = new JFormattedTextField();
		formattedTextField_2.setText("3000");
		formattedTextField_2.setBounds(96, 44, 117, 20);
		panel_curso.add(formattedTextField_2);
		
		JLabel lblNewLabel_3 = new JLabel("Area:");
		lblNewLabel_3.setBounds(252, 47, 46, 14);
		panel_curso.add(lblNewLabel_3);
		
		JFormattedTextField frmtdtxtfldMagia = new JFormattedTextField();
		frmtdtxtfldMagia.setText("Medicina");
		frmtdtxtfldMagia.setBounds(295, 44, 117, 20);
		panel_curso.add(frmtdtxtfldMagia);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setBounds(206, 122, 101, 23);
		panel_curso.add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Nutricionista", "Dermatologista", "Dentista", "Ambientalista"}));
		comboBox.setEditable(true);
		comboBox.setToolTipText("");
		comboBox.setBounds(96, 7, 117, 22);
		panel_curso.add(comboBox);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 99, 511, 37);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(95, 11, 120, 20);
		panel.add(formattedTextField);
		
		JLabel lblNewLabel_4 = new JLabel("Identificação:");
		lblNewLabel_4.setBounds(10, 14, 75, 14);
		panel.add(lblNewLabel_4);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setBounds(254, 11, 7, 20);
		panel.add(formattedTextField_1);
	}
}
