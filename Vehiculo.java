package lsms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class Vehiculo implements ActionListener{

	JFrame frmKwRegistroVehiculo;
	JTextField textField;
	JCheckBox chck_radio,chck_antena,chck_bocina,chck_airecondition,chck_jgalfombre,chck_llaverueda,
	chck_gato,chck_gmrepuesto,chck_taponvervula;
	JRadioButton rbt_no,rbt_si;
	JButton btn_listo ;
	JComboBox comboBox_vehiculo,comboBox_color;
	ButtonGroup rbt_desicion ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vehiculo window = new Vehiculo();
					window.frmKwRegistroVehiculo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Vehiculo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmKwRegistroVehiculo = new JFrame();
		frmKwRegistroVehiculo.setTitle("KW Registro vehiculo ");
		frmKwRegistroVehiculo.setBounds(100, 100, 437, 375);
		frmKwRegistroVehiculo.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Auto Repuesto Gafasa");
		lblNewLabel.setFont(new Font("Impact", Font.PLAIN, 18));
		lblNewLabel.setBounds(138, 0, 163, 28);
		frmKwRegistroVehiculo.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Vehiculo");
		lblNewLabel_1.setBounds(10, 52, 52, 14);
		frmKwRegistroVehiculo.getContentPane().add(lblNewLabel_1);
		
		
		String [] Items_vehiculo ={"","Camry","Crorolla","Mercedez","Explorer","Ranger","Cherokee","Hilux","Tacoma","Rav4","Hilander"
				,"N20","K5","H1","Starex","Sorrento","Tucson","Audi","Prado","Porche","Ferrari","Mustang","Changan","Tesla","Tahoe",
				"Civic","AcCord"};
		comboBox_vehiculo = new JComboBox(Items_vehiculo);
		comboBox_vehiculo.setBounds(72, 48, 97, 22);
		frmKwRegistroVehiculo.getContentPane().add(comboBox_vehiculo);
		
		JLabel lblNewLabel_2 = new JLabel("Año");
		lblNewLabel_2.setBounds(179, 52, 49, 14);
		frmKwRegistroVehiculo.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(209, 50, 52, 20);
		frmKwRegistroVehiculo.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Color ");
		lblNewLabel_3.setBounds(271, 52, 42, 14);
		frmKwRegistroVehiculo.getContentPane().add(lblNewLabel_3);
		
		
		String[] Items_color = {"","Rojo","Azul","Gris rt","Plata","Dorado","RJ vino","Naranja","Verde","Negro","Blanco"};
		comboBox_color = new JComboBox(Items_color);
		comboBox_color.setBounds(323, 50, 91, 22);
		frmKwRegistroVehiculo.getContentPane().add(comboBox_color);
		
		JLabel lblNewLabel_4 = new JLabel("Componetes del vehiculo");
		lblNewLabel_4.setFont(new Font("Impact", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(10, 87, 163, 22);
		frmKwRegistroVehiculo.getContentPane().add(lblNewLabel_4);
		
		chck_radio = new JCheckBox("Radio");
		chck_radio.setBounds(10, 116, 64, 23);
		frmKwRegistroVehiculo.getContentPane().add(chck_radio);
		
		chck_antena = new JCheckBox("Antena");
		chck_antena.setBounds(10, 142, 76, 23);
		frmKwRegistroVehiculo.getContentPane().add(chck_antena);
		
		chck_bocina = new JCheckBox("Bocina");
		chck_bocina.setBounds(10, 168, 76, 23);
		frmKwRegistroVehiculo.getContentPane().add(chck_bocina);
		
		chck_airecondition = new JCheckBox("Aire Acondicionado");
		chck_airecondition.setBounds(102, 116, 143, 23);
		frmKwRegistroVehiculo.getContentPane().add(chck_airecondition);
		
		chck_jgalfombre = new JCheckBox("Juego de alfombras");
		chck_jgalfombre.setBounds(102, 142, 143, 23);
		frmKwRegistroVehiculo.getContentPane().add(chck_jgalfombre);
		
		chck_llaverueda = new JCheckBox("Llave de rueda");
		chck_llaverueda.setBounds(102, 168, 116, 23);
		frmKwRegistroVehiculo.getContentPane().add(chck_llaverueda);
		
		chck_gato = new JCheckBox("Gato");
		chck_gato.setBounds(263, 116, 99, 23);
		frmKwRegistroVehiculo.getContentPane().add(chck_gato);
		
		chck_gmrepuesto = new JCheckBox("Goma de repuesto");
		chck_gmrepuesto.setBounds(263, 142, 143, 23);
		frmKwRegistroVehiculo.getContentPane().add(chck_gmrepuesto);
		
		chck_taponvervula = new JCheckBox("Tapon de varvula");
		chck_taponvervula.setBounds(263, 168, 143, 23);
		frmKwRegistroVehiculo.getContentPane().add(chck_taponvervula);
		
		JLabel lblNewLabel_5 = new JLabel("Choque del vehiculo ");
		lblNewLabel_5.setFont(new Font("Impact", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(10, 207, 131, 22);
		frmKwRegistroVehiculo.getContentPane().add(lblNewLabel_5);
		
		rbt_no = new JRadioButton("No");
		rbt_no.setBounds(10, 236, 111, 23);
		frmKwRegistroVehiculo.getContentPane().add(rbt_no);
		
		rbt_si = new JRadioButton("Si");
		rbt_si.setBounds(10, 262, 111, 23);
		frmKwRegistroVehiculo.getContentPane().add(rbt_si);
		
		ButtonGroup rbt_desicion = new ButtonGroup();
		rbt_desicion.add(rbt_no);
		rbt_desicion.add(rbt_si);
		
		btn_listo = new JButton("Listo ");
		btn_listo.setBounds(271, 303, 116, 23);
		btn_listo.addActionListener(this);
		frmKwRegistroVehiculo.getContentPane().add(btn_listo);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==btn_listo) {
			comboBox_vehiculo.setSelectedItem("");
			textField.setText("");
			comboBox_color.setSelectedItem("");
			String info="Su registro se realizo corectamente";
			JOptionPane.showMessageDialog(btn_listo,info,"Muestra de resultados", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
