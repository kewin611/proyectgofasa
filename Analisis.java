package lsms;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Analisis implements ActionListener{

	JFrame frm_analisis;
    JTable table;
	JComboBox comboBox_servicio_analisis, comboBox_empleado;
	JButton Btn_buscar_analisis;
	DefaultTableModel cbz_analisis;
	JScrollPane scrollPane_fmranalisis;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Analisis window = new Analisis();
					window.frm_analisis.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Analisis() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frm_analisis = new JFrame();
		frm_analisis.setTitle("KW Analisis ");
		frm_analisis.setBounds(100, 100, 471, 334);
		frm_analisis.getContentPane().setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Auto Repuesto Gofasa ");
		lblNewLabel.setFont(new Font("Impact", Font.PLAIN, 18));
		lblNewLabel.setBounds(143, 11, 174, 36);
		frm_analisis.getContentPane().add(lblNewLabel);
		
		JLabel lb_nombre_analisis = new JLabel("Empleado ");
		lb_nombre_analisis.setBounds(10, 72, 65, 14);
		frm_analisis.getContentPane().add(lb_nombre_analisis);
		
		
		
		String [] Items_empleado = {"","Alfredo","Jose luis","Junior Adames", "junior A"};
		comboBox_empleado = new JComboBox(Items_empleado);
		comboBox_empleado.setBounds(73, 68, 89, 22);
		frm_analisis.getContentPane().add(comboBox_empleado);
		
		JLabel lb_servicio = new JLabel("Servico");
		lb_servicio.setBounds(172, 72, 49, 14);
		frm_analisis.getContentPane().add(lb_servicio);
		
		
		String [] Items_servicio = {"","Aliniacion","RPC Tren","RPC Goma","Cambio Aceite"};
		comboBox_servicio_analisis = new JComboBox(Items_servicio);
		comboBox_servicio_analisis.setBounds(226, 68, 94, 22);
		frm_analisis.getContentPane().add(comboBox_servicio_analisis);
		
		
		Btn_buscar_analisis = new JButton("Buscar ");
		Btn_buscar_analisis.setBounds(347, 68, 89, 23);
		frm_analisis.getContentPane().add(Btn_buscar_analisis);
		
		String[] encabezado_analisis= {"Tecnico","Generado"};
		cbz_analisis=new DefaultTableModel(null, encabezado_analisis);
		scrollPane_fmranalisis=new JScrollPane();
		scrollPane_fmranalisis.setBounds(10, 125, 437, 161);
		table = new JTable();
		scrollPane_fmranalisis.setViewportView(table);
		frm_analisis.getContentPane().add(scrollPane_fmranalisis);
		table.setModel(cbz_analisis);
		cbz_analisis.setColumnIdentifiers(encabezado_analisis);

		
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
