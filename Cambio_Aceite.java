package lsms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class Cambio_Aceite implements ActionListener{

	JFrame frm_cambio_aceite;
	JTextField text_precio_aceite;
	JTable table_aceite;
	JComboBox comboBox_nombre,comboBox_vehiculo;
	JRadioButton rbt_sencillo_aceite,rbt_completo_aceite;
	ButtonGroup rbt_servicios ;
	JButton btn_añadir_aceite,btn_modificar_aceite,btn_eliminar_aceite;
	DefaultTableModel cbez_aceite;
	JScrollPane Scrollpane_aceite;
	JTextArea textArea ;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cambio_Aceite window = new Cambio_Aceite();
					window.frm_cambio_aceite.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cambio_Aceite() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frm_cambio_aceite = new JFrame();
		frm_cambio_aceite.setTitle("KW Cambio Aceite");
		frm_cambio_aceite.setBounds(100, 100, 454, 407);
		frm_cambio_aceite.getContentPane().setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("Auto Repuesto Gofasa ");
		lblNewLabel.setFont(new Font("Impact", Font.PLAIN, 18));
		lblNewLabel.setBounds(159, 11, 166, 31);
		frm_cambio_aceite.getContentPane().add(lblNewLabel);
		
		JLabel lb_tecnico_aceite = new JLabel("Tecnico");
		lb_tecnico_aceite.setBounds(10, 57, 49, 14);
		frm_cambio_aceite.getContentPane().add(lb_tecnico_aceite);
		
		
		
		String[] Items_nombre = {"", "Junior"};
		comboBox_nombre = new JComboBox(Items_nombre);
		comboBox_nombre.setBounds(60, 53, 93, 22);
		frm_cambio_aceite.getContentPane().add(comboBox_nombre);
		
		JLabel lb_vehiculo_aceite = new JLabel("Vehiculo");
		lb_vehiculo_aceite.setBounds(159, 57, 57, 14);
		frm_cambio_aceite.getContentPane().add(lb_vehiculo_aceite);
		
		
		String[] Items_vehiculo = {"", "Hilux","Camry","Corolla","N20","K5","Acsen","Dihatsun","Sorento","Sport tage","Mustang","Mercedes","H1","Starex",
				"Audi","Picanto","Y20"};
		comboBox_vehiculo= new JComboBox(Items_vehiculo);
		comboBox_vehiculo.setBounds(226, 53, 93, 22);
		frm_cambio_aceite.getContentPane().add(comboBox_vehiculo);
		
		
		
		rbt_sencillo_aceite = new JRadioButton("Sencillo");
		rbt_sencillo_aceite.setBounds(329, 152, 79, 23);
		frm_cambio_aceite.getContentPane().add(rbt_sencillo_aceite);
		
		rbt_completo_aceite = new JRadioButton("Completo");
		rbt_completo_aceite.setBounds(209, 152, 86, 23);
		frm_cambio_aceite.getContentPane().add(rbt_completo_aceite);
		
		ButtonGroup rbt_servicios = new ButtonGroup();
		rbt_servicios.add(rbt_sencillo_aceite);
		rbt_servicios.add(rbt_completo_aceite);
		
		JLabel lb_precio_aceite = new JLabel("Precio");
		lb_precio_aceite.setBounds(329, 57, 49, 14);
		frm_cambio_aceite.getContentPane().add(lb_precio_aceite);
		
		text_precio_aceite = new JTextField();
		text_precio_aceite.setBounds(378, 54, 57, 20);
		frm_cambio_aceite.getContentPane().add(text_precio_aceite);
		text_precio_aceite.setColumns(10);
		
		textArea = new JTextArea();
		textArea.setBounds(10, 131, 187, 71);
		frm_cambio_aceite.getContentPane().add(textArea);
		
		JLabel lb_nota_aceite = new JLabel("Nota");
		lb_nota_aceite.setBounds(77, 110, 49, 14);
		frm_cambio_aceite.getContentPane().add(lb_nota_aceite);
		
		String [] encabezado_aceite ={"Tecnico", "Vehiculo", "Costo"};
		cbez_aceite = new DefaultTableModel(null, encabezado_aceite);
		Scrollpane_aceite = new JScrollPane();
		Scrollpane_aceite.setBounds(44, 239, 354, 78);

		
		table_aceite = new JTable();
		Scrollpane_aceite.setViewportView(table_aceite);
		frm_cambio_aceite.getContentPane().add(Scrollpane_aceite);
		table_aceite.setModel(cbez_aceite);
		
		cbez_aceite.setColumnIdentifiers(encabezado_aceite);


		
		btn_añadir_aceite = new JButton("Añadir");
		btn_añadir_aceite.setBounds(309, 328, 89, 23);
		btn_añadir_aceite.addActionListener(this);
		frm_cambio_aceite.getContentPane().add(btn_añadir_aceite);
		
		btn_modificar_aceite = new JButton("Modificar");
		btn_modificar_aceite.setBounds(210, 328, 89, 23);
		btn_modificar_aceite.addActionListener(this);
		frm_cambio_aceite.getContentPane().add(btn_modificar_aceite);
		
		btn_eliminar_aceite = new JButton("Eliminar ");
		btn_eliminar_aceite.setBounds(113, 328, 89, 23);
		btn_eliminar_aceite.addActionListener(this);
		frm_cambio_aceite.getContentPane().add(btn_eliminar_aceite);
		
		
	}

	//acciones de los botones guardar,modificar,eliminar
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==btn_añadir_aceite) {
			cbez_aceite.addRow(new Object[]{comboBox_nombre.getSelectedItem(),comboBox_vehiculo.getSelectedItem(),text_precio_aceite.getText()});
			comboBox_nombre.setSelectedItem("");
			comboBox_vehiculo.setSelectedItem("");
			text_precio_aceite.setText("");
			textArea.setText("");
		}
		else if (e.getSource()==btn_modificar_aceite) {
			int fila =table_aceite.getSelectedRow();
			cbez_aceite.setValueAt(comboBox_nombre.getSelectedItem(), fila, 0);
			cbez_aceite.setValueAt(comboBox_vehiculo.getSelectedItem(), fila, 1);
			cbez_aceite.setValueAt(text_precio_aceite.getText(),fila , 2);
		}
		else if (e.getSource()==btn_eliminar_aceite) {
			 int fila = table_aceite.getSelectedRow();
				cbez_aceite.removeRow(fila);
		}
		
		
	}
}
