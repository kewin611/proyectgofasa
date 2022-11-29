package lsms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RPC_Tren implements ActionListener{

	JFrame frm_RCP_Tren;
	JTextField Text_precio;
	JTable table_rpcgoma;
	JComboBox comboBox_tecnico_tren, comboBox_servicio_tren;
	JSpinner spinner;
	JButton btn_tren_añadir,btn_tren_modificar,btn_tren_eliminar,btn_tren_guardar;
	DefaultTableModel cbz_rpctren ;
	JScrollPane scrollPane_fmrpctren;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RPC_Tren window = new RPC_Tren();
					window.frm_RCP_Tren.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RPC_Tren() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frm_RCP_Tren = new JFrame();
		frm_RCP_Tren.setTitle("KW RPC Tren ");
		frm_RCP_Tren.setBounds(100, 100, 606, 333);
		frm_RCP_Tren.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 0, 0);
		frm_RCP_Tren.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Auto Repuesto Gofasa");
		lblNewLabel.setFont(new Font("Impact", Font.PLAIN, 18));
		lblNewLabel.setBounds(207, 11, 173, 31);
		frm_RCP_Tren.getContentPane().add(lblNewLabel);
		
		JLabel lb_tecnico_tren = new JLabel("Tecnico ");
		lb_tecnico_tren.setBounds(10, 52, 49, 14);
		frm_RCP_Tren.getContentPane().add(lb_tecnico_tren);
		
		
		String[] Items_tecnico = {"","Juniro Adames","Junior","Jose Luis"};
		comboBox_tecnico_tren = new JComboBox(Items_tecnico);
		comboBox_tecnico_tren.setBounds(58, 48, 100, 22);
		frm_RCP_Tren.getContentPane().add(comboBox_tecnico_tren);
		
		JLabel lb_servicio_rpctren = new JLabel("Servicio");
		lb_servicio_rpctren.setBounds(163, 52, 49, 14);
		frm_RCP_Tren.getContentPane().add(lb_servicio_rpctren);
		
		
		String[] Items_servicios = {"","Cambio banda","Cambio bieleta","Cambio amortiguador","Cambio soporte de motor", "Retificacion de discos",
				"Cambio bola esferica","Graduacion cilindro","Montura correa","Cambio polea","Chequeo"};
		comboBox_servicio_tren = new JComboBox(Items_servicios);
		comboBox_servicio_tren.setBounds(218, 48, 135, 22);
		frm_RCP_Tren.getContentPane().add(comboBox_servicio_tren);
		
		JLabel lb_RPCTREN_cantidad = new JLabel("Cantidad ");
		lb_RPCTREN_cantidad.setBounds(363, 52, 58, 14);
		frm_RCP_Tren.getContentPane().add(lb_RPCTREN_cantidad);
		
		spinner = new JSpinner();
		spinner.setBounds(423, 48, 58, 22);
		frm_RCP_Tren.getContentPane().add(spinner);
		
		JLabel lb_rpctren_precio = new JLabel("Precio");
		lb_rpctren_precio.setBounds(491, 52, 39, 14);
		frm_RCP_Tren.getContentPane().add(lb_rpctren_precio);
		
		Text_precio = new JTextField();
		Text_precio.setBounds(532, 48, 49, 22);
		frm_RCP_Tren.getContentPane().add(Text_precio);
		Text_precio.setColumns(10);
		
		String [] encabezado_rpctren= {"Tecnico","Servicio","Cantidad","Costo"};
		cbz_rpctren = new DefaultTableModel(null,encabezado_rpctren); 
		scrollPane_fmrpctren = new JScrollPane();
		scrollPane_fmrpctren.setBounds(10, 92, 572, 148);
		table_rpcgoma = new JTable();
		scrollPane_fmrpctren.setViewportView(table_rpcgoma);
		frm_RCP_Tren.getContentPane().add(scrollPane_fmrpctren);
		table_rpcgoma.setModel(cbz_rpctren);
		
		cbz_rpctren.setColumnIdentifiers(encabezado_rpctren);
		
		
	    btn_tren_añadir = new JButton("Añadir");
		btn_tren_añadir.setBounds(491, 251, 89, 23);
		btn_tren_añadir.addActionListener(this);
		frm_RCP_Tren.getContentPane().add(btn_tren_añadir);
		
		btn_tren_modificar = new JButton("Modificar");
		btn_tren_modificar.setBounds(384, 251, 89, 23);
		btn_tren_modificar.addActionListener(this);
		frm_RCP_Tren.getContentPane().add(btn_tren_modificar);
		
		btn_tren_eliminar = new JButton("Eliminar");
		btn_tren_eliminar.setBounds(285, 251, 89, 23);
		btn_tren_eliminar.addActionListener(this);
		frm_RCP_Tren.getContentPane().add(btn_tren_eliminar);
		
		btn_tren_guardar = new JButton("Guardar ");
		btn_tren_guardar.setBounds(10, 251, 89, 23);
		frm_RCP_Tren.getContentPane().add(btn_tren_guardar);
	}

	//acciones de los botones guardar,modificar,eliminar
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==btn_tren_añadir) {
			cbz_rpctren.addRow(new Object[] {comboBox_tecnico_tren.getSelectedItem(),comboBox_servicio_tren.getSelectedItem(),spinner.getValue(),Text_precio.getText()});
			comboBox_tecnico_tren.setSelectedItem("");
			comboBox_servicio_tren.setSelectedItem("");
			spinner.setValue(0);
			Text_precio.setText("");
		}
		else if (e.getSource()==btn_tren_modificar) {
			int fila =table_rpcgoma.getSelectedRow();
			cbz_rpctren.setValueAt(comboBox_tecnico_tren.getSelectedItem(), fila, 0);
			cbz_rpctren.setValueAt(comboBox_servicio_tren.getSelectedItem(), fila, 1);
			cbz_rpctren.setValueAt(spinner.getValue(), fila, 2);
			cbz_rpctren.setValueAt(Text_precio.getText(), fila, 3);
		}
		else if (e.getSource()==btn_tren_eliminar) {
			int fila = table_rpcgoma.getSelectedRow();
			cbz_rpctren.removeRow(fila);
		}
		}
	}
	

