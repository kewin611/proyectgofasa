package lsms;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.Font;

public class Empleados implements ActionListener {

    JFrame frmEmpleados;
    JTextField text_nombre_empleados,text_apellido_empleado,text_telefono_empleados;
    JTable tabla_empleados;
    JButton boton_añadir_empleados, boton_eliminar_empleados,boton_modificar_empleados;
    DefaultTableModel cb_empleados;
    JScrollPane scrollPane_empelados;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Empleados window = new Empleados();
					window.frmEmpleados.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Empleados() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEmpleados = new JFrame();
		frmEmpleados.setBackground(new Color(128, 128, 128));
		frmEmpleados.setTitle("KW Empleados");
		frmEmpleados.setBounds(100, 100, 636, 263);
		frmEmpleados.getContentPane().setLayout(null);
		
		JLabel lb_nombre_empleados = new JLabel("Nombre");
		lb_nombre_empleados.setBounds(10, 35, 49, 14);
		frmEmpleados.getContentPane().add(lb_nombre_empleados);
		
		text_nombre_empleados = new JTextField();
		text_nombre_empleados.setBounds(10, 53, 96, 20);
		frmEmpleados.getContentPane().add(text_nombre_empleados);
		text_nombre_empleados.setColumns(10);
		
		JLabel lb_apellido_empleado = new JLabel("Apellido");
		lb_apellido_empleado.setBounds(10, 84, 49, 14);
		frmEmpleados.getContentPane().add(lb_apellido_empleado);
		
		text_apellido_empleado = new JTextField();
		text_apellido_empleado.setBounds(10, 103, 96, 20);
		frmEmpleados.getContentPane().add(text_apellido_empleado);
		text_apellido_empleado.setColumns(10);
		
		JLabel lb_telefono_empleados = new JLabel("Telefono");
		lb_telefono_empleados.setBounds(10, 134, 61, 14);
		frmEmpleados.getContentPane().add(lb_telefono_empleados);
		
		text_telefono_empleados = new JTextField();
		text_telefono_empleados.setBounds(10, 150, 96, 20);
		frmEmpleados.getContentPane().add(text_telefono_empleados);
		text_telefono_empleados.setColumns(10);
		
		//dt de la tabla empleados
		String []cbz_empleados = {"Nombre","Apellido","Telefono"};
		cb_empleados = new DefaultTableModel(null,cbz_empleados);
		scrollPane_empelados = new JScrollPane();
		scrollPane_empelados.setBounds(155, 56, 442, 112);
		
		tabla_empleados = new JTable();
		scrollPane_empelados.setViewportView(tabla_empleados);
		frmEmpleados.getContentPane().add(scrollPane_empelados);
		tabla_empleados.setModel(cb_empleados);
		cb_empleados.setColumnIdentifiers(cbz_empleados);

		
		
		boton_añadir_empleados = new JButton("Añadir");
		boton_añadir_empleados.setBounds(142, 192, 89, 23);
		boton_añadir_empleados.addActionListener(this);
		frmEmpleados.getContentPane().add(boton_añadir_empleados);
		
		boton_eliminar_empleados = new JButton("Eliminar");
		boton_eliminar_empleados.setBounds(264, 192, 89, 23);
		boton_eliminar_empleados.addActionListener(this);
		frmEmpleados.getContentPane().add(boton_eliminar_empleados);
		
		boton_modificar_empleados = new JButton("Modificar");
		boton_modificar_empleados.setBounds(394, 192, 89, 23);
		boton_modificar_empleados.addActionListener(this);
		frmEmpleados.getContentPane().add(boton_modificar_empleados);
		
		JLabel lblNewLabel = new JLabel("Auto Repuesto Gofasa");
		lblNewLabel.setFont(new Font("Impact", Font.PLAIN, 18));
		lblNewLabel.setBounds(225, 11, 196, 34);
		frmEmpleados.getContentPane().add(lblNewLabel);
	}
	//acciones de los botones guardar,modificar,eliminar

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==boton_añadir_empleados) {
			cb_empleados.addRow(new Object[] {text_nombre_empleados.getText(),text_apellido_empleado.getText(),text_telefono_empleados.getText()} );
			text_nombre_empleados.setText("");
			text_apellido_empleado.setText("");
			text_telefono_empleados.setText("");
			
			String añd= "El usuario se añadio correctamente";
			JOptionPane.showMessageDialog(boton_añadir_empleados,añd,"Muestra de resultados", JOptionPane.INFORMATION_MESSAGE);


		}
		else if (e.getSource()==boton_eliminar_empleados) {
			int fila = tabla_empleados.getSelectedRow();
			cb_empleados.removeRow(fila);
			
			String elm= "El usuario se elimino correctamente";
			JOptionPane.showMessageDialog(boton_eliminar_empleados,elm,"Muestra de resultados", JOptionPane.INFORMATION_MESSAGE);
			
		}
		else if (e.getSource()==boton_modificar_empleados) {
			int fila = tabla_empleados.getSelectedRow();
			cb_empleados.setValueAt(text_nombre_empleados.getText(),fila , 0);
			cb_empleados.setValueAt(text_apellido_empleado.getText(),fila , 1);
			cb_empleados.setValueAt(text_telefono_empleados.getText(),fila , 2);
			
			String mdfc= "El usuario se modifico correctamente";
			JOptionPane.showMessageDialog(boton_modificar_empleados,mdfc,"Muestra de resultados", JOptionPane.INFORMATION_MESSAGE);
			
		}
		
	}
}
