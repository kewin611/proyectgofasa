package lsms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

public class RPC_gomas  implements ActionListener {

	JFrame frm_rpc_goma;
	JTextField text_rpcgoma_precio;
	JTable table_rpc_goma;
	JSpinner spinner;
	JButton btn_añadir_rpcgoma,btn_modificar_rpcgoma,btn_eliminar_rpcgoma;
	JComboBox comboBox,comboBox_1,comboBox_2;
	DefaultTableModel cabeza_rpcgoma;
	JScrollPane scrollPane_rpcgoma;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RPC_gomas window = new RPC_gomas();
					window.frm_rpc_goma.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RPC_gomas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frm_rpc_goma = new JFrame();
		frm_rpc_goma.setTitle("KW Reparacion Goma");
		frm_rpc_goma.setBounds(100, 100, 740, 440);
		
		/*JPanel panel = new JPanel();
		frm_rpc_goma.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);*/
		frm_rpc_goma.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Auto Repuesto Gofasa");
		lblNewLabel.setFont(new Font("Impact", Font.PLAIN, 18));
		lblNewLabel.setBounds(275, 11, 163, 30);
		frm_rpc_goma.getContentPane().add(lblNewLabel);
		
		
		
		//nombre_del_tecnico
		JLabel lb_rpcgoma_nombre = new JLabel("Tecnico ");
		lb_rpcgoma_nombre.setBounds(10, 49, 49, 14);
		frm_rpc_goma.getContentPane().add(lb_rpcgoma_nombre);
		
		String [] Items_tecnico = {"","Alfredo"};
	    comboBox = new JComboBox(Items_tecnico);
		comboBox.setBounds(61, 47, 88, 18);
		frm_rpc_goma.getContentPane().add(comboBox);
		
		
		//tipo_de_goma
		JLabel lb_rpcgoma_tipogoma = new JLabel("TP Goma");
		lb_rpcgoma_tipogoma.setBounds(159, 49, 59, 14);
		frm_rpc_goma.getContentPane().add(lb_rpcgoma_tipogoma);
		
		String [] Items_tipogoma = {"","G15","G16","G17","G12","G13","G700/16","G14","Gbocat","G18","G22","G20","G21"};
		comboBox_1 = new JComboBox(Items_tipogoma);
		comboBox_1.setBounds(227, 47, 82, 18);
		frm_rpc_goma.getContentPane().add(comboBox_1);
		
		//Cantidad_de_goma 
		JLabel lb_rpcgoma_cantidad = new JLabel("CT Goma");
		lb_rpcgoma_cantidad.setBounds(319, 49, 61, 14);
		frm_rpc_goma.getContentPane().add(lb_rpcgoma_cantidad);
		
	    spinner = new JSpinner();
		spinner.setBounds(389, 46, 49, 20);
		frm_rpc_goma.getContentPane().add(spinner);
		
		
		//Servicio_de_goma
		JLabel lb_rpcgoma_servicio = new JLabel("Servicio");
		lb_rpcgoma_servicio.setBounds(448, 49, 49, 14);
		frm_rpc_goma.getContentPane().add(lb_rpcgoma_servicio);
		
		
		String []Items_servicio= {"","Rotacion","Reparacion","Montura"};
		comboBox_2 = new JComboBox(Items_servicio);
		comboBox_2.setBounds(504, 45, 88, 18);
		frm_rpc_goma.getContentPane().add(comboBox_2);
		
		JLabel lb_rpcgoma_precio = new JLabel("Precio");
		lb_rpcgoma_precio.setBounds(602, 49, 49, 14);
		frm_rpc_goma.getContentPane().add(lb_rpcgoma_precio);
		
		text_rpcgoma_precio = new JTextField();
		text_rpcgoma_precio.setBounds(655, 46, 61, 20);
		frm_rpc_goma.getContentPane().add(text_rpcgoma_precio);
		text_rpcgoma_precio.setColumns(10);
		
		
		
		String [] encabezado_goma = {"Tecnico", "TP Goma","CT Goma","Servicio","Precio"};
		cabeza_rpcgoma = new DefaultTableModel(null,encabezado_goma);
		scrollPane_rpcgoma = new JScrollPane();
		scrollPane_rpcgoma.setBounds(10, 110, 706, 179);
		
		table_rpc_goma = new JTable();
		scrollPane_rpcgoma.setViewportView(table_rpc_goma);
		frm_rpc_goma.getContentPane().add(scrollPane_rpcgoma);
		table_rpc_goma.setModel(cabeza_rpcgoma);
		cabeza_rpcgoma.setColumnIdentifiers(encabezado_goma);
		
		btn_añadir_rpcgoma = new JButton("Añadir");
		btn_añadir_rpcgoma.setBounds(627, 299, 89, 23);
		btn_añadir_rpcgoma.addActionListener(this);
		frm_rpc_goma.getContentPane().add(btn_añadir_rpcgoma);
		
		btn_modificar_rpcgoma = new JButton("Modificar");
		btn_modificar_rpcgoma.setBounds(528, 299, 89, 23);
		btn_modificar_rpcgoma.addActionListener(this);
		frm_rpc_goma.getContentPane().add(btn_modificar_rpcgoma);
		
		btn_eliminar_rpcgoma = new JButton("Eliminar ");
		btn_eliminar_rpcgoma.setBounds(429, 300, 89, 23);
		btn_eliminar_rpcgoma.addActionListener(this);
		frm_rpc_goma.getContentPane().add(btn_eliminar_rpcgoma);
		
			
	}
	//acciones de los botones guardar,modificar,eliminar
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==btn_añadir_rpcgoma) {
			cabeza_rpcgoma.addRow(new Object[] {comboBox.getSelectedItem(),comboBox_1.getSelectedItem(),spinner.getValue(),comboBox_2.getSelectedItem(),text_rpcgoma_precio.getText() });
			comboBox.setSelectedItem("");
			comboBox_1.setSelectedItem("");
			spinner.setValue(0);
			comboBox_2.setSelectedItem("");
			text_rpcgoma_precio.setText("");
		}
		else if (e.getSource()==btn_modificar_rpcgoma) {
			int fila = table_rpc_goma.getSelectedRow();
			cabeza_rpcgoma.setValueAt(comboBox.getSelectedItem(),fila , 0);
			cabeza_rpcgoma.setValueAt(comboBox_1.getSelectedItem(),fila , 1);
			cabeza_rpcgoma.setValueAt(spinner.getValue(),fila , 2);
			cabeza_rpcgoma.setValueAt(comboBox_2.getSelectedItem(),fila , 3);
			cabeza_rpcgoma.setValueAt(text_rpcgoma_precio.getText(),fila , 4);
		}
		else if (e.getSource()==btn_eliminar_rpcgoma) {
			int fila = table_rpc_goma.getSelectedRow();
			cabeza_rpcgoma.removeRow(fila);
			
		}
	}
}
