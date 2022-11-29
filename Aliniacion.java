package lsms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.RootPaneContainer;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

public class Aliniacion implements ActionListener {

	JFrame frm_Aliniacion;
    JTextField text_precio;
    JLabel lb_Tecnico,lb_servicio,lb_precio,lb_cantidad;
	JComboBox comboBox_nombre,comboBox_servicios;
	JTable table_aliniacion;
	DefaultTableModel cb_aliniacion ;
	JScrollPane scrollPane_aliniacion;
	JSpinner spinner;
	JButton btn_añadir;
	JButton btn_modificar;
    JButton btn_Eliminar;  
	JButton btn_guardar;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aliniacion window = new Aliniacion();
					window.frm_Aliniacion.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Aliniacion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		/*frm_Aliniacion = new JFrame();
		frm_Aliniacion.setTitle("KW Aliniacion");
		frm_Aliniacion.setBounds(100, 100, 622, 389);
		frm_Aliniacion.getContentPane().setLayout(null);*/
		
		frm_Aliniacion = new JFrame();
		frm_Aliniacion.setBackground(new Color(128, 128, 128));
		frm_Aliniacion.setTitle("KW Aliniacion");
		frm_Aliniacion.setBounds(100, 100, 628, 425);
		frm_Aliniacion.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Auto Repuesto Gofasa");
		lblNewLabel.setFont(new Font("Impact", Font.PLAIN, 18));
		lblNewLabel.setBounds(225, 11, 173, 24);
		frm_Aliniacion.getContentPane().add(lblNewLabel);
		
		JLabel lb_Tecnico = new JLabel("Tecnico ");
		lb_Tecnico.setBounds(10, 54, 49, 14);
		frm_Aliniacion.getContentPane().add(lb_Tecnico);
		
		//tecnicos
		String [] Items_1 = {"", "Jose luis", "Alfredo"};
		comboBox_nombre = new JComboBox(Items_1);
		comboBox_nombre.setBounds(59, 50, 90, 22);
		frm_Aliniacion.getContentPane().add(comboBox_nombre);
		
		JLabel lb_servicio = new JLabel("Servicio");
		lb_servicio.setBounds(155, 54, 49, 14);
		frm_Aliniacion.getContentPane().add(lb_servicio);
		
		//servicios 
		String [] Items ={"","Aliniacion","Balanceo", "Camber"};
		comboBox_servicios = new JComboBox(Items);
		comboBox_servicios.setBounds(208, 50, 98, 22);
		frm_Aliniacion.getContentPane().add(comboBox_servicios);
		
		JLabel lb_precio = new JLabel("Precio");
		lb_precio.setBounds(433, 54, 49, 14);
		frm_Aliniacion.getContentPane().add(lb_precio);
		
		text_precio = new JTextField();
		text_precio.setBounds(476, 52, 67, 20);
		frm_Aliniacion.getContentPane().add(text_precio);
		text_precio.setColumns(10);
		
		JLabel lb_cantidad = new JLabel("Cantidad ");
		lb_cantidad.setBounds(316, 54, 55, 14);
		frm_Aliniacion.getContentPane().add(lb_cantidad);
		
		spinner = new JSpinner();
		spinner.setBounds(374, 52, 49, 20);
		frm_Aliniacion.getContentPane().add(spinner);
		
		
		
		String [] encabezado_aliniacion= {"Tecnico","Servicio","Cantidad","Costo"};
		cb_aliniacion = new DefaultTableModel(null,encabezado_aliniacion);
		scrollPane_aliniacion = new JScrollPane();
		scrollPane_aliniacion.setBounds(10, 99, 588, 146);
		
		table_aliniacion = new JTable();
		scrollPane_aliniacion.setViewportView(table_aliniacion);
		frm_Aliniacion.getContentPane().add(scrollPane_aliniacion);
		table_aliniacion.setModel(cb_aliniacion);
		cb_aliniacion.setColumnIdentifiers(encabezado_aliniacion);

		
		
		btn_añadir = new JButton("Añadir ");
		btn_añadir.setBounds(509, 256, 89, 23);
		btn_añadir.addActionListener(this);
		frm_Aliniacion.getContentPane().add(btn_añadir);
		
		btn_modificar = new JButton("Modificar");
		btn_modificar.setBounds(410, 256, 89, 23);
		btn_modificar.addActionListener(this);
		frm_Aliniacion.getContentPane().add(btn_modificar);
		
		btn_Eliminar = new JButton("Eliminar");
		btn_Eliminar.setBounds(310, 256, 89, 23);
		btn_Eliminar.addActionListener(this);
		frm_Aliniacion.getContentPane().add(btn_Eliminar);
		
		
	}

	//acciones de los botones guardar,modificar,eliminar
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==btn_añadir) {
			cb_aliniacion.addRow(new Object[] {comboBox_nombre.getSelectedItem(),comboBox_servicios.getSelectedItem(),spinner.getValue(),text_precio.getText()});
			comboBox_nombre.setSelectedItem("");
			comboBox_servicios.setSelectedItem("");
			spinner.setValue(0);
			text_precio.setText("");	
	}
		else if (e.getSource()==btn_modificar) {
			int fila = table_aliniacion.getSelectedRow();
			cb_aliniacion.setValueAt(comboBox_nombre.getSelectedItem(), fila, 0);
			cb_aliniacion.setValueAt(comboBox_servicios.getSelectedItem(), fila, 1);
			cb_aliniacion.setValueAt(spinner.getValue(),fila,2);
			cb_aliniacion.setValueAt(text_precio.getText(),fila,3);
		}
		else if (e.getSource()==btn_Eliminar) {
			int fila = table_aliniacion.getSelectedRow();
			cb_aliniacion.removeRow(fila);
		}
}
}