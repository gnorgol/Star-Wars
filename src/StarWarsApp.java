import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTable;

public class StarWarsApp extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StarWarsApp frame = new StarWarsApp();
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
	public StarWarsApp() {
		
		setTitle("STARWARS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 688, 388);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(createToolBar(),BorderLayout.NORTH);
		JLabel lblNewLabel = new JLabel("IDENTIFIANT");
		lblNewLabel.setBounds(100, 107, 95, 16);
		contentPane.add(lblNewLabel,BorderLayout.CENTER);
		
		JLabel lblMotDePasse = new JLabel("MOT DE PASSE");
		lblMotDePasse.setBounds(100, 159, 95, 16);
		contentPane.add(lblMotDePasse);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(207, 101, 122, 28);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("SE CONNECTER");
		btnNewButton.setBounds(288, 193, 132, 28);
		contentPane.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(207, 153, 122, 28);
		contentPane.add(passwordField);
	}
	private JToolBar createToolBar() {
		
		JToolBar toolbar = new JToolBar();
		
		
		return toolbar;
		
	}
	
	private JToolBar Menu() {
		
		JToolBar toolbar = new JToolBar();
		
		
		return toolbar;
		
	}
}
