package Gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import classes.Aluno;
import classes.Aulas;
import classes.Curso;
import classes.Professor;
import classes.Sala;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class TelaAulas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTituloCurso;
	private JTextField txtArea;
	private JTextField txtHoraria;
	private JTextField txtPrecoCurso;
	private JTextField txtIdentificacao;
	private JTextField txtDescricao;
	private JTextField txtProfessor;
	private JTextField txtEmailProf;
	private JTextField txtCPFProf;
	private JTextField txtNomeAluno;
	private JTextField txtEmailAluno;
	private JTextField txtCPFAluno;
	private JTextField txtIdade;
	private JTextField txtIdAula;
	private JTextField txtCurso;
	private JTextField txtSelectProf;
	private JTextField txtInicio;
	private JTextField txtTermino;
	
	// Declaração dos itens para criar uma aula.
	// Para criar um curso precisa de um (CURSO) (ALUNO) (SALA) (PROFESSOR)
	
	private Curso curso;
	private Aluno aluno;
	private Sala sala;
	private Professor professor;
	private Aulas aulas;

	private List<Aluno> listaAluno;
	//
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAulas frame = new TelaAulas();
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
	public TelaAulas() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\pedro.hrcoiado\\Downloads\\Daniel-Loxton-Skeptic-Alien-Abduction.16.png"));
		
		// Vamos instaciar as nossas classes para gerar
		// objetos dos itens relacionado a aula.
		// Estes objetos estão vazio e serão preenchidos quando o 
		// usuário clicar nos botões de  incluir
		curso = new Curso(); 
		// Retirada do variante aluno = new Aluno();, pois colocaremos mais que um!
		listaAluno = new ArrayList<Aluno>();
		sala = new Sala();
		professor = new Professor();
		aulas = new Aulas();
		
		setResizable(false);
		setTitle("Cadastro de Aulas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 841, 620);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_curso = new JPanel();
		panel_curso.setBackground(Color.WHITE);
		panel_curso.setBounds(10, 11, 805, 90);
		contentPane.add(panel_curso);
		panel_curso.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Titulo do Curso:");
		lblNewLabel.setBackground(SystemColor.activeCaption);
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 11, 149, 14);
		panel_curso.add(lblNewLabel);
		
		txtTituloCurso = new JTextField();
		txtTituloCurso.setBounds(140, 9, 322, 20);
		panel_curso.add(txtTituloCurso);
		txtTituloCurso.setColumns(10);
		
		JLabel lblrea = new JLabel("Área:");
		lblrea.setForeground(Color.DARK_GRAY);
		lblrea.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblrea.setBackground(SystemColor.activeCaption);
		lblrea.setBounds(472, 12, 66, 14);
		panel_curso.add(lblrea);
		
		txtArea = new JTextField();
		txtArea.setBounds(548, 9, 247, 20);
		panel_curso.add(txtArea);
		txtArea.setColumns(10);
		
		JLabel lblCargaHorria = new JLabel("Carga Horária:");
		lblCargaHorria.setForeground(Color.DARK_GRAY);
		lblCargaHorria.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCargaHorria.setBackground(SystemColor.activeCaption);
		lblCargaHorria.setBounds(10, 44, 120, 14);
		panel_curso.add(lblCargaHorria);
		
		txtHoraria = new JTextField();
		txtHoraria.setBounds(140, 42, 208, 20);
		panel_curso.add(txtHoraria);
		txtHoraria.setColumns(10);
		
		JLabel lblPreco = new JLabel("Preço:");
		lblPreco.setForeground(Color.DARK_GRAY);
		lblPreco.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPreco.setBackground(SystemColor.activeCaption);
		lblPreco.setBounds(371, 44, 93, 14);
		panel_curso.add(lblPreco);
		
		txtPrecoCurso = new JTextField();
		txtPrecoCurso.setColumns(10);
		txtPrecoCurso.setBounds(472, 42, 323, 20);
		panel_curso.add(txtPrecoCurso);
		
		JPanel panel_sala = new JPanel();
		panel_sala.setBackground(new Color(255, 255, 255));
		panel_sala.setBounds(10, 107, 805, 64);
		contentPane.add(panel_sala);
		panel_sala.setLayout(null);
		
		JLabel lblIdentificacao = new JLabel("Identificação:");
		lblIdentificacao.setForeground(Color.DARK_GRAY);
		lblIdentificacao.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblIdentificacao.setBackground(SystemColor.activeCaption);
		lblIdentificacao.setBounds(10, 23, 149, 14);
		panel_sala.add(lblIdentificacao);
		
		txtIdentificacao = new JTextField();
		txtIdentificacao.setBounds(120, 21, 124, 20);
		panel_sala.add(txtIdentificacao);
		txtIdentificacao.setColumns(10);
		
		txtDescricao = new JTextField();
		txtDescricao.setColumns(10);
		txtDescricao.setBounds(328, 23, 467, 20);
		panel_sala.add(txtDescricao);
		
		JLabel lblDescrio = new JLabel("Descrição");
		lblDescrio.setForeground(Color.DARK_GRAY);
		lblDescrio.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDescrio.setBackground(SystemColor.activeCaption);
		lblDescrio.setBounds(254, 23, 149, 14);
		panel_sala.add(lblDescrio);
		
		JPanel panel_professor = new JPanel();
		panel_professor.setBackground(new Color(255, 255, 255));
		panel_professor.setBounds(10, 179, 805, 76);
		contentPane.add(panel_professor);
		panel_professor.setLayout(null);
		
		JLabel lblNomeDoProfessor = new JLabel("Nome do Professor");
		lblNomeDoProfessor.setForeground(Color.DARK_GRAY);
		lblNomeDoProfessor.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNomeDoProfessor.setBackground(SystemColor.activeCaption);
		lblNomeDoProfessor.setBounds(10, 13, 149, 14);
		panel_professor.add(lblNomeDoProfessor);
		
		txtProfessor = new JTextField();
		txtProfessor.setColumns(10);
		txtProfessor.setBounds(10, 32, 260, 20);
		panel_professor.add(txtProfessor);
		
		txtEmailProf = new JTextField();
		txtEmailProf.setColumns(10);
		txtEmailProf.setBounds(280, 32, 260, 20);
		panel_professor.add(txtEmailProf);
		
		JLabel lblEmailDoProfessor = new JLabel("E-Mail do Professor:");
		lblEmailDoProfessor.setForeground(Color.DARK_GRAY);
		lblEmailDoProfessor.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmailDoProfessor.setBackground(SystemColor.activeCaption);
		lblEmailDoProfessor.setBounds(280, 13, 149, 14);
		panel_professor.add(lblEmailDoProfessor);
		
		txtCPFProf = new JTextField();
		txtCPFProf.setColumns(10);
		txtCPFProf.setBounds(550, 32, 245, 20);
		panel_professor.add(txtCPFProf);
		
		JLabel lblNomeDoProfessor_1_1 = new JLabel("CPF do Professor");
		lblNomeDoProfessor_1_1.setForeground(Color.DARK_GRAY);
		lblNomeDoProfessor_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNomeDoProfessor_1_1.setBackground(SystemColor.activeCaption);
		lblNomeDoProfessor_1_1.setBounds(550, 13, 203, 14);
		panel_professor.add(lblNomeDoProfessor_1_1);
		
		JPanel panel_aluno = new JPanel();
		panel_aluno.setBackground(new Color(255, 255, 255));
		panel_aluno.setBounds(10, 266, 805, 116);
		contentPane.add(panel_aluno);
		panel_aluno.setLayout(null);
		
		JLabel lblNomeDoAluno = new JLabel("Nome do Aluno:");
		lblNomeDoAluno.setForeground(Color.DARK_GRAY);
		lblNomeDoAluno.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNomeDoAluno.setBackground(SystemColor.activeCaption);
		lblNomeDoAluno.setBounds(10, 11, 149, 14);
		panel_aluno.add(lblNomeDoAluno);
		
		txtNomeAluno = new JTextField();
		txtNomeAluno.setColumns(10);
		txtNomeAluno.setBounds(10, 30, 396, 20);
		panel_aluno.add(txtNomeAluno);
		
		JLabel lblEmailDoAluno = new JLabel("E-Mail do Aluno:");
		lblEmailDoAluno.setForeground(Color.DARK_GRAY);
		lblEmailDoAluno.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmailDoAluno.setBackground(SystemColor.activeCaption);
		lblEmailDoAluno.setBounds(427, 11, 149, 14);
		panel_aluno.add(lblEmailDoAluno);
		
		txtEmailAluno = new JTextField();
		txtEmailAluno.setColumns(10);
		txtEmailAluno.setBounds(427, 30, 368, 20);
		panel_aluno.add(txtEmailAluno);
		
		JLabel lblCpfDoAluno = new JLabel("CPF do Aluno:");
		lblCpfDoAluno.setForeground(Color.DARK_GRAY);
		lblCpfDoAluno.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCpfDoAluno.setBackground(SystemColor.activeCaption);
		lblCpfDoAluno.setBounds(10, 65, 149, 14);
		panel_aluno.add(lblCpfDoAluno);
		
		txtCPFAluno = new JTextField();
		txtCPFAluno.setColumns(10);
		txtCPFAluno.setBounds(140, 63, 322, 20);
		panel_aluno.add(txtCPFAluno);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setForeground(Color.DARK_GRAY);
		lblIdade.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblIdade.setBackground(SystemColor.activeCaption);
		lblIdade.setBounds(472, 66, 66, 14);
		panel_aluno.add(lblIdade);
		
		txtIdade = new JTextField();
		txtIdade.setColumns(10);
		txtIdade.setBounds(548, 63, 247, 20);
		panel_aluno.add(txtIdade);
		
		JPanel panel_aulas = new JPanel();
		panel_aulas.setBackground(new Color(255, 255, 255));
		panel_aulas.setBounds(10, 393, 805, 106);
		contentPane.add(panel_aulas);
		panel_aulas.setLayout(null);
		
		JLabel lblidAula = new JLabel("Id da Aula:");
		lblidAula.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblidAula.setBounds(10, 11, 87, 14);
		panel_aulas.add(lblidAula);
		
		txtIdAula = new JTextField();
		txtIdAula.setBounds(96, 9, 120, 20);
		panel_aulas.add(txtIdAula);
		txtIdAula.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Curso:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(238, 12, 50, 14);
		panel_aulas.add(lblNewLabel_2);
		
		txtCurso = new JTextField();
		txtCurso.setColumns(10);
		txtCurso.setBounds(292, 9, 206, 20);
		panel_aulas.add(txtCurso);
		
		JLabel lblNewLabel_2_1 = new JLabel("Professor:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_1.setBounds(509, 14, 87, 14);
		panel_aulas.add(lblNewLabel_2_1);
		
		txtSelectProf = new JTextField();
		txtSelectProf.setColumns(10);
		txtSelectProf.setBounds(589, 11, 206, 20);
		panel_aulas.add(txtSelectProf);
		
		JLabel lblNewLabel_1_1 = new JLabel("Início:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(10, 48, 65, 14);
		panel_aulas.add(lblNewLabel_1_1);
		
		txtInicio = new JTextField();
		txtInicio.setColumns(10);
		txtInicio.setBounds(96, 46, 120, 20);
		panel_aulas.add(txtInicio);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Término:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1.setBounds(238, 48, 65, 14);
		panel_aulas.add(lblNewLabel_1_1_1);
		
		txtTermino = new JTextField();
		txtTermino.setColumns(10);
		txtTermino.setBounds(302, 46, 120, 20);
		panel_aulas.add(txtTermino);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Alunos:");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1_1.setBounds(440, 49, 87, 14);
		panel_aulas.add(lblNewLabel_1_1_1_1);
		
		JComboBox cboAluno = new JComboBox();
				cboAluno.setBounds(533, 48, 262, 17);
		panel_aulas.add(cboAluno);
		
		JButton btnIncluirCurso = new JButton("Incluir curso");
		btnIncluirCurso.setIcon(new ImageIcon("C:\\Users\\pedro.hrcoiado\\Downloads\\Daniel-Loxton-Skeptic-Alien-Reaching.32.png"));
		btnIncluirCurso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				obter o texto que que esta na caixa de titulo do curso
//				adicionar a caixa curso que esta na area do criar Aula
				txtTituloCurso.setText(txtTituloCurso.getText());
				
				// Vamos adicionar os elementos do curso ao objeto curso, tais como:
				// titulo, carga horaria, datainicio
				curso.setTitulo(txtTituloCurso.getText());
				curso.setArea(txtNomeAluno.getText());
				curso.setCargaHoraria(txtHoraria.getText());
				curso.setPreco(Double.parseDouble(txtPrecoCurso.getText()));
				
				
				//vamos desativar o painel de cursos. vamos usar
				//o comando anebled(habilitar) com o valor false
			txtTituloCurso.setEnabled(false);
		    txtArea.setEnabled(false);
			txtPrecoCurso.setEnabled(false);
			txtHoraria.setEnabled(false);
		
			btnIncluirCurso.setEnabled(false);
			}
		});
		btnIncluirCurso.setBounds(10, 510, 141, 41);
		contentPane.add(btnIncluirCurso);
		
		JButton btnIncluirSala = new JButton("Incluir sala");
		btnIncluirSala.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Prencher os dados do objeto sala
				sala.setIdentificacao(txtIdentificacao.getText());
				sala.setDescricao(txtDescricao.getText());

				//sala.setText(txtIdentificacao.getText());
				
				btnIncluirSala.setEnabled(false);
				txtIdentificacao.setEnabled(false);
				txtDescricao.setEnabled(false);
			}
		});
		btnIncluirSala.setBounds(161, 510, 141, 23);
		contentPane.add(btnIncluirSala);
		
		JButton btnIncluirProf = new JButton("Incluir professor");
		btnIncluirProf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
			professor.setNome(txtProfessor.getText());
			professor.setEmail(txtEmailProf.getText());
			professor.setCpf(txtCPFProf.getText());
			
//			txtProfessor.setText(txtIdentificacao.getText());
			
			txtProfessor.setEnabled(false);
			txtEmailProf.setEnabled(false);
			txtCPFProf.setEnabled(false);
			
			}
		});
		btnIncluirProf.setBounds(312, 510, 141, 23);
		contentPane.add(btnIncluirProf);
		
		JButton btnIncluirAluno = new JButton("Incluir aluno");
		btnIncluirAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cboAluno.addItem(txtNomeAluno.getText());
				
				aluno = new Aluno();
				
				aluno.setNome(txtNomeAluno.getText());
				aluno.setEmail(txtEmailAluno.getText());
				aluno.setCpf(txtCPFAluno.getText());
				aluno.setIdade(Integer.parseInt(txtIdade.getText()));
				listaAluno.add(aluno);
				
				
				
			}
		});
		btnIncluirAluno.setBounds(463, 510, 141, 23);
		contentPane.add(btnIncluirAluno);
		
		

		
		JButton btnNewButton_1_1_1_1 = new JButton("Criar a Aula");
		btnNewButton_1_1_1_1.setIcon(new ImageIcon("C:\\Users\\pedro.hrcoiado\\Downloads\\Iconfactory-Space-The-Sun.32.png"));
		btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aulas.setId(Integer.parseInt(txtIdAula.getText()));
				aulas.setCurso(curso);
				aulas.setProfessor(professor);
				
				
				
				//aulas.setInicio(Date.parse(txtInicio.getText()));
				aulas.setInicio(new Date(Long.parseLong(txtInicio.getText())));
				aulas.setTermino(new Date(Long.parseLong(txtTermino.getText())));
				
				aulas.setAlunos((Aluno[])listaAluno.toArray());
				aulas.setSala(sala);
//				txtsala.setEnabled(false);
				
				System.out.print(cboAluno.getItemAt(0));
			}
		});
		btnNewButton_1_1_1_1.setBounds(625, 510, 141, 41);
		contentPane.add(btnNewButton_1_1_1_1);
		
	}
}
