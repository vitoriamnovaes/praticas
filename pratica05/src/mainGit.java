import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mainGit extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCpf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainGit frame = new mainGit();
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
	public mainGit() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNome = new JTextField();
		txtNome.setBounds(84, 54, 172, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtCpf = new JTextField();
		txtCpf.setBounds(84, 83, 86, 20);
		contentPane.add(txtCpf);
		txtCpf.setColumns(10);
		
		JComboBox<String> boxSelect = new JComboBox();
		boxSelect.setBounds(84, 11, 94, 22);
		
		boxSelect.addItem("Senhor");
		boxSelect.addItem("Senhora");
		boxSelect.addItem("Você");
		
		
		
		contentPane.add(boxSelect);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(20, 127, 388, 124);
		contentPane.add(textArea);
		
		JLabel lblNewLabel = new JLabel("Pronome");
		lblNewLabel.setBounds(28, 15, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setBounds(40, 55, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("CPF");
		lblNewLabel_2.setBounds(40, 86, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		
		JButton btnAdd = new JButton("ADICIONAR");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String n = txtNome.getText();
				String c = txtCpf.getText();
				
				if(!n.isEmpty() && !c.isEmpty()) {
					
					String select=(String) boxSelect.getSelectedItem();
					textArea.setText(textArea.getText()+select+"."+n+"    Portador do CPF:"+c+"\n");
					
					
					txtCpf.setText("");
					txtNome.setText("");
					
					
					
				}
				
				
			}
		});
		btnAdd.setBounds(287, 53, 103, 23);
		contentPane.add(btnAdd);
		
	}
}
