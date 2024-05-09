package casoPractico;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class JinternalPruebas extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JinternalPruebas frame = new JinternalPruebas();
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
	public JinternalPruebas() {
		getContentPane().setBackground(SystemColor.window);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NUEVOS EMPLEADOS");
		lblNewLabel.setBounds(63, 11, 162, 14);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(40, 36, 156, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(40, 67, 156, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"--Seleccione--", "Jaén", "Córdoba", "Sevilla"}));
		comboBox.setBounds(40, 98, 156, 22);
		getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("REGISTRAR");
		btnNewButton.setBounds(107, 131, 89, 23);
		getContentPane().add(btnNewButton);
		setTitle("Nuevos Ingresos");
		setBounds(100, 100, 450, 300);

	}
}
