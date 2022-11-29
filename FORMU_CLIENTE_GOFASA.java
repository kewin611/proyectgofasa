package lsms;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JMenuItem;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class FORMU_CLIENTE_GOFASA implements ActionListener {
 
	JFrame frmKw,frmEmpleados;
	JTextField texnombre, textapellido, texttelefono;
	JTable table;
	JButton btneliminar,btnmodificar,btnañadir;
	JTextArea textreferencia;
	JMenu MNregistro,MNreportes,MNservicios;
	JMenuItem Empleados,analisis,Menu_aliniacion,Menu_tren,Menu_goma,Menu_aceite,mn_vehiculo;
	JComboBox comboBox;
	DefaultTableModel cabeza_fmkw ;
	JScrollPane scrollPane_fmkw;
	
	
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FORMU_CLIENTE_GOFASA window = new FORMU_CLIENTE_GOFASA();
					window.frmKw.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public FORMU_CLIENTE_GOFASA() {
		initialize();
		
	}

	
	private void initialize() {
		frmKw = new JFrame();
		frmKw.setTitle("KW");
		frmKw.setBounds(100, 100, 694, 571);
		frmKw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmKw.getContentPane().setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Auto Repuesto Gofasa");
		lblNewLabel.setFont(new Font("Impact", Font.PLAIN, 18));
		lblNewLabel.setBounds(223, 0, 190, 60);
		frmKw.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre ");
		lblNewLabel_1.setBounds(10, 74, 54, 14);
		frmKw.getContentPane().add(lblNewLabel_1);
		
		texnombre = new JTextField();
		texnombre.setBounds(66, 71, 89, 20);
		frmKw.getContentPane().add(texnombre);
		texnombre.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Apellido");
		lblNewLabel_2.setBounds(165, 74, 49, 14);
		frmKw.getContentPane().add(lblNewLabel_2);
		
		textapellido = new JTextField();
		textapellido.setBounds(224, 71, 96, 20);
		frmKw.getContentPane().add(textapellido);
		textapellido.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Marca ");
		lblNewLabel_3.setBounds(330, 74, 49, 14);
		frmKw.getContentPane().add(lblNewLabel_3);
		
		
		String [] Items = {"","Rav4","Hilux","Camry","Dihatsun","K5","N20","Focus","Thoe","Mustan","Hiace",
				"Mercedes benz","Chevrolet","Santa fe","Corolla","Prado", "K2700", "Changan","Motor"};
		comboBox = new JComboBox(Items);
		comboBox.setBounds(380, 71, 112, 23);
		frmKw.getContentPane().add(comboBox);
		
		
		JLabel lblNewLabel_4 = new JLabel("Referencia ");
		lblNewLabel_4.setBounds(296, 129, 71, 14);
		frmKw.getContentPane().add(lblNewLabel_4);
		
		textreferencia = new JTextArea();
		textreferencia.setBounds(28, 154, 602, 112);
		frmKw.getContentPane().add(textreferencia);
		
		JLabel lblNewLabel_5 = new JLabel("Tel.");
		lblNewLabel_5.setBounds(502, 74, 34, 14);
		frmKw.getContentPane().add(lblNewLabel_5);
		
		texttelefono = new JTextField();
		texttelefono.setBounds(529, 71, 112, 20);
		frmKw.getContentPane().add(texttelefono);
		texttelefono.setColumns(10);
		
		btneliminar = new JButton("ELIMINAR");
		btneliminar.setBounds(296, 277, 99, 23);
		btneliminar.addActionListener(this);
		frmKw.getContentPane().add(btneliminar);
		
		btnmodificar = new JButton("MODIFICAR");
		btnmodificar.setBounds(413, 277, 102, 23);
		btnmodificar.addActionListener(this);
		frmKw.getContentPane().add(btnmodificar);
		
		btnañadir = new JButton("AÑADIR");
		btnañadir.setBounds(529, 277, 101, 23);
		btnañadir.addActionListener(this);
		frmKw.getContentPane().add(btnañadir);
		
		
		String [] encabezado_fmkw ={"Nombre","Apellido","Referencia","Marca","Telefono"};
		cabeza_fmkw = new DefaultTableModel(null,encabezado_fmkw);
		scrollPane_fmkw = new JScrollPane();
		scrollPane_fmkw.setBounds(10, 330, 660, 171);
		
		table = new JTable();
		scrollPane_fmkw.setViewportView(table);
		frmKw.getContentPane().add(scrollPane_fmkw);
		table.setModel(cabeza_fmkw);
		
		cabeza_fmkw.setColumnIdentifiers(encabezado_fmkw);
		
		
		
		//menus de la barra 
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(128, 128, 128));
		frmKw.setJMenuBar(menuBar);
		
		MNregistro = new JMenu("Registro");
		menuBar.add(MNregistro);
		
		Empleados = new JMenuItem("Empleados ");
		Empleados.addActionListener(this);
		MNregistro.add(Empleados);
		
		mn_vehiculo = new JMenuItem("Vehiculos");
		mn_vehiculo.addActionListener(this);
		MNregistro.add(mn_vehiculo);
		
		MNreportes = new JMenu("Reporte");
		menuBar.add(MNreportes);
		
		analisis = new JMenuItem("Analisis");
		analisis.addActionListener(this);
		MNreportes.add(analisis);
		
		MNservicios = new JMenu("Servicios ");
		menuBar.add(MNservicios);
		
		Menu_aliniacion = new JMenuItem("Aliniacion");
		Menu_aliniacion.addActionListener(this);
		MNservicios.add(Menu_aliniacion);
		
		Menu_tren = new JMenuItem("RPC Tren ");
		Menu_tren.addActionListener(this);
		MNservicios.add(Menu_tren);
		
		Menu_goma = new JMenuItem("RPC Goma");
		Menu_goma.addActionListener(this);
		MNservicios.add(Menu_goma);
		
	    Menu_aceite = new JMenuItem("Cambio Aceite");
	    Menu_aceite.addActionListener(this);
		MNservicios.add(Menu_aceite);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		actionbotones(e);
		
	    if(e.getSource()==Empleados) {
	    	Empleados E= new Empleados();
		    E.frmEmpleados.setVisible(true);
	    }
	    else if (e.getSource()==Menu_aliniacion) {
	    	Aliniacion A = new Aliniacion();
	    	A.frm_Aliniacion.setVisible(true);
	    }
	    else if (e.getSource()==Menu_tren) {
	    	RPC_Tren R= new RPC_Tren();
	    	R.frm_RCP_Tren.setVisible(true);
	    }
	    else if (e.getSource()==Menu_aceite) {
	    	Cambio_Aceite C = new Cambio_Aceite();
	    	C.frm_cambio_aceite.setVisible(true);
	    }
	    else if (e.getSource()==Menu_goma) {
	    	RPC_gomas G= new RPC_gomas();
	    	G.frm_rpc_goma.setVisible(true);
	    }
	    else if (e.getSource()==analisis) {
	    	Analisis N = new Analisis();
	    	N.frm_analisis.setVisible(true);
	    }
	    else if (e.getSource()==mn_vehiculo) {
	    	Vehiculo M = new Vehiculo();
	    	M.frmKwRegistroVehiculo.setVisible(true);
	    }
	    
	}
	
	//acciones de los botones guardar,modificar,eliminar
	public void actionbotones(ActionEvent e) {
		if (e.getSource()==btnañadir) {
		cabeza_fmkw.addRow(new Object[] {texnombre.getText(),textapellido.getText(),textreferencia.getText(),comboBox.getSelectedItem(),texttelefono.getText()});
		texnombre.setText("");
		textapellido.setText("");
		comboBox.setSelectedItem("");
		texttelefono.setText("");
		textreferencia.setText("");
	}
		else if (e.getSource()==btnmodificar) {
			int fila = table.getSelectedRow();
			cabeza_fmkw.setValueAt(texnombre.getText(),fila , 0);
			cabeza_fmkw.setValueAt(textapellido.getText(),fila , 1);
			cabeza_fmkw.setValueAt(textreferencia.getText(),fila , 2);
			cabeza_fmkw.setValueAt(comboBox.getSelectedItem(),fila , 3);
			cabeza_fmkw.setValueAt(texttelefono.getText(),fila , 4);
		}
		else if (e.getSource()==btneliminar) {
			int fila = table.getSelectedRow();
			cabeza_fmkw.removeRow(fila);
			
		}
}
}