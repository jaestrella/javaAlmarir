package casoPractico;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import java.awt.SystemColor;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuPrint extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JDesktopPane desktopPane;
	private JMenuBar menuBar;
	private JMenu btnEmpleados;
	private JMenu btnClientes;
	private JMenu btnProveedores;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrint frame = new MenuPrint();
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
	public MenuPrint() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 709, 390);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		btnEmpleados = new JMenu("Empleados");
		menuBar.add(btnEmpleados);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Nuevo");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Codigo para mostrar una ventana nueva
				JinternalPruebas nuevo=new JinternalPruebas();
				desktopPane.add(nuevo);
				nuevo.setVisible(true);
				
			}
		});
		btnEmpleados.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Buscar");
		btnEmpleados.add(mntmNewMenuItem_1);
		
		btnClientes = new JMenu("Clientes");
		menuBar.add(btnClientes);
		
		JMenuItem btnNuevoCliente = new JMenuItem("Lista Clientes");
		btnClientes.add(btnNuevoCliente);
		
		btnProveedores = new JMenu("Proveedores");
		menuBar.add(btnProveedores);
		
		JMenuItem mntmListaProveedores = new JMenuItem("Lista Proveedores");
		btnProveedores.add(mntmListaProveedores);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		desktopPane = new JDesktopPane();
		desktopPane.setBackground(SystemColor.text);
		desktopPane.setBounds(0, 0, 693, 329);
		contentPane.add(desktopPane);
	}
}
