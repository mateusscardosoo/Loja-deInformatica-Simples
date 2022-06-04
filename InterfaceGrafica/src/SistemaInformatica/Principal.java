package SistemaInformatica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class Principal extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	JCheckBox checkCarregador = new JCheckBox("Carregador - R$ 300,00");
	JCheckBox checkPasta = new JCheckBox("Pasta - R$ 300,00");
	JCheckBox checkEstabilizador = new JCheckBox("Estabilizador- R$ 300,00");
	JCheckBox checkTeclado = new JCheckBox("Teclado - R$ 300,00");
	JComboBox comboPlacaDeVideo = new JComboBox();
	Notebook n1 = new Notebook();
	Desktop d1 = new Desktop();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		  try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {    //Nimbus = netbeans; Windows = windows; metal = tema cru java
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
	           	System.err.println(ex);
	        } 
		   
		   
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 453, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CONFIGURE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setBounds(162, 11, 152, 14);
		contentPane.add(lblNewLabel);
		
		JRadioButton rbNotebook = new JRadioButton("Notebook");
		rbNotebook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rbNotebook.isSelected()) {
					checkCarregador.setEnabled(true);
					checkPasta.setEnabled(true);
					
					checkEstabilizador.setEnabled(false);
					checkTeclado.setEnabled(false);
					checkEstabilizador.setSelected(false);
					checkTeclado.setSelected(false);
					
				}
			}
		});
		rbNotebook.setSelected(true);
		buttonGroup.add(rbNotebook);
		rbNotebook.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		rbNotebook.setBounds(59, 32, 109, 23);
		contentPane.add(rbNotebook);
		
		JRadioButton rbDesktop = new JRadioButton("Desktop");
		rbDesktop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rbDesktop.isSelected()) {
					checkEstabilizador.setEnabled(true);
					checkTeclado.setEnabled(true);
					
					checkCarregador.setEnabled(false);
					checkPasta.setEnabled(false);
					checkCarregador.setSelected(false);
					checkPasta.setSelected(false);
				}
			}
		});
		buttonGroup.add(rbDesktop);
		rbDesktop.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		rbDesktop.setBounds(243, 32, 109, 23);
		contentPane.add(rbDesktop);
		
		JLabel lblNewLabel_1 = new JLabel("PLACA M\u00C3E");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1.setBounds(53, 84, 99, 14);
		contentPane.add(lblNewLabel_1);
		
		JComboBox cbPlacaMae = new JComboBox();
		cbPlacaMae.setModel(new DefaultComboBoxModel(new String[] {"MODELO 1 - R$ 600,00", "MODELO 2 - R$ 800,00", "MODELO 3 - R$ 1000,00"}));
		cbPlacaMae.setBounds(162, 82, 190, 22);
		contentPane.add(cbPlacaMae);
		
		JLabel lblNewLabel_1_1 = new JLabel("HD");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1_1.setBounds(53, 112, 99, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JComboBox cbHD = new JComboBox();
		cbHD.setModel(new DefaultComboBoxModel(new String[] {"500 GB - R$ 300,00", "1 TB - R$ 500,00", "2 TB - R$ 700,00"}));
		cbHD.setBounds(162, 110, 190, 22);
		contentPane.add(cbHD);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Processador");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1_1_1.setBounds(53, 167, 99, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JComboBox cbProcessador = new JComboBox();
		cbProcessador.setModel(new DefaultComboBoxModel(new String[] {"MODELO 1 - R$ 500,00", "MODELO 2 - R$ 700,00", "MODELO 3 - R$ 900,00"}));
		cbProcessador.setBounds(162, 165, 190, 22);
		contentPane.add(cbProcessador);
		
		JComboBox cbMemoria = new JComboBox();
		cbMemoria.setModel(new DefaultComboBoxModel(new String[] {"MODELO 1 - R$ 300,00", "MODELO 2 - R$ 400,00", "MODELO 3 - R$ 500,00"}));
		cbMemoria.setBounds(162, 137, 190, 22);
		contentPane.add(cbMemoria);
		
		JLabel lblNewLabel_1_2 = new JLabel("Memoria");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1_2.setBounds(53, 139, 99, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JCheckBox checkPlacaDeVideo = new JCheckBox("Placa de Video");
		checkPlacaDeVideo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(checkPlacaDeVideo.isSelected()) {
					comboPlacaDeVideo.setEnabled(true);
				}
				else {
					comboPlacaDeVideo.setEnabled(false);
				}
			}
		});
		checkPlacaDeVideo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		checkPlacaDeVideo.setBounds(6, 200, 152, 23);
		contentPane.add(checkPlacaDeVideo);
		comboPlacaDeVideo.setEnabled(false);
		comboPlacaDeVideo.setModel(new DefaultComboBoxModel(new String[] {"MODELO 1 - R$ 200,00", "MODELO 2 - R$ 400,00", "MODELO 3 - R$ 600,00"}));
		comboPlacaDeVideo.setBounds(162, 198, 190, 22);
		contentPane.add(comboPlacaDeVideo);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 231, 438, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(220, 231, 1, 76);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 306, 438, 2);
		contentPane.add(separator_2);
		
		
		checkCarregador.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		checkCarregador.setBounds(6, 240, 208, 23);
		contentPane.add(checkCarregador);
		
		checkPasta.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		checkPasta.setBounds(6, 266, 208, 23);
		contentPane.add(checkPasta);
		
		checkEstabilizador.setEnabled(false);
		checkEstabilizador.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		checkEstabilizador.setBounds(220, 240, 218, 23);
		contentPane.add(checkEstabilizador);
		
		checkTeclado.setEnabled(false);
		checkTeclado.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		checkTeclado.setBounds(220, 266, 208, 23);
		contentPane.add(checkTeclado);
		
		JCheckBox checkGarantia = new JCheckBox("Garantia Estendida");
		checkGarantia.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		checkGarantia.setBounds(129, 314, 185, 23);
		contentPane.add(checkGarantia);
		
		JButton btnNewButton = new JButton("Finalizar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rbNotebook.isSelected()) {
					//NOTEBOOK
					n1.setConfiguracao("");
					//PLACA MÃE
					if(cbPlacaMae.getSelectedIndex()== 0) {
						n1.setPlacaMae(600);
						n1.setConfiguracao("PLACA MÃE "+ cbPlacaMae.getSelectedItem()+ "\n");
					}
					else if (cbPlacaMae.getSelectedIndex()== 1) {
						n1.setPlacaMae(800);
						n1.setConfiguracao("PLACA MÃE "+ cbPlacaMae.getSelectedItem()+ "\n");
					}
					else if (cbPlacaMae.getSelectedIndex()== 2) {
						n1.setPlacaMae(1000);
						n1.setConfiguracao("PLACA MÃE "+ cbPlacaMae.getSelectedItem()+ "\n");
					}
					
					
					//HD
					if(cbHD.getSelectedIndex()== 0) {
						n1.setHd(300);
						n1.setConfiguracao(n1.getConfiguracao() +"HD "+  cbHD.getSelectedItem()+ "\n");
					}
					else if (cbHD.getSelectedIndex()== 1) {
						n1.setHd(500);
						n1.setConfiguracao(n1.getConfiguracao() +"HD "+  cbHD.getSelectedItem()+ "\n");
					}
					else if (cbHD.getSelectedIndex()== 2) {
						n1.setHd(700);
						n1.setConfiguracao(n1.getConfiguracao() +"HD "+  cbHD.getSelectedItem()+ "\n");
				}
					
					//Memoria
					if(cbMemoria.getSelectedIndex()== 0) {
						n1.setMemoria(300);
						n1.setConfiguracao(n1.getConfiguracao() + "MEMORIA "+ cbMemoria.getSelectedItem()+"\n");
					}
					else if(cbMemoria.getSelectedIndex()== 1) {
						n1.setMemoria(400);
						n1.setConfiguracao(n1.getConfiguracao() + "MEMORIA "+ cbMemoria.getSelectedItem()+"\n");
				}
					else if(cbMemoria.getSelectedIndex()== 2) {
						n1.setMemoria(500);
						n1.setConfiguracao(n1.getConfiguracao() + "MEMORIA "+ cbMemoria.getSelectedItem()+"\n");
					
				
				}
					//PROCESSADOR
					
					if(cbProcessador.getSelectedIndex()== 0) {
						n1.setProcessador(500);
						n1.setConfiguracao(n1.getConfiguracao() + "PROCESSADOR "+ cbProcessador.getSelectedItem()+"\n");
					}
					else if(cbProcessador.getSelectedIndex()==1) {
						n1.setProcessador(700);
						n1.setConfiguracao(n1.getConfiguracao() + "PROCESSADOR "+ cbProcessador.getSelectedItem()+"\n");
					}
					else if(cbProcessador.getSelectedIndex()==2) {
						n1.setProcessador(900);
						n1.setConfiguracao(n1.getConfiguracao() + "PROCESSADOR "+ cbProcessador.getSelectedItem()+"\n");
				}
				
					//placa de video
					if(checkPlacaDeVideo.isSelected()) {
						if(comboPlacaDeVideo.getSelectedIndex()== 0) {
							n1.setPlacaVideo(200);
							
						}
						else if(comboPlacaDeVideo.getSelectedIndex()== 1) {
							n1.setPlacaVideo(400);
						
						}
						else {
							n1.setPlacaVideo(600);
							n1.setConfiguracao(n1.getConfiguracao() + "PLACA DE VIDEO "+ comboPlacaDeVideo.getSelectedItem()+"\n");
						}
						n1.setConfiguracao(n1.getConfiguracao() + "PLACA DE VIDEO "+ comboPlacaDeVideo.getSelectedItem()+"\n");
					}
					else {
						n1.setPlacaVideo(0);
					}
					
					
					
					//CARREGADOR
					if(checkCarregador.isSelected()) {
						n1.setCarregador(300);
						n1.setConfiguracao(n1.getConfiguracao() + checkCarregador.getText() + "\n" );
					}
					else {
						n1.setCarregador(0);
					}
					
					
					//PASTA
					if(checkPasta.isSelected()) {
						n1.setPasta(300);
						n1.setConfiguracao(n1.getConfiguracao() + checkPasta.getText() + "\n");
					}
					else {
						n1.setPasta(0);
					}
					
					//Volumes
					
					n1.setVolumes(1);
					n1.setConfiguracao(n1.getConfiguracao() + " Volumes "+ n1.getVolumes()+ "\n");
					
					if(checkGarantia.isSelected()) {
						n1.setGarantia(2);
						n1.setConfiguracao(n1.getConfiguracao() + " Garantia "+ n1.getGarantia()+ " Anos\n");
						n1.imprimeGarantia();
					
					}
					else {
						n1.setGarantia(1);
						n1.setConfiguracao(n1.getConfiguracao() + " Garantia "+ n1.getGarantia()+ " Ano\n");
						n1.imprime();
					}
				
				
			
			
					
				}
			
				
			
				else {
					//DESKTOP
					d1.setConfiguracao("");
					//PLACA MÃE
					if(cbPlacaMae.getSelectedIndex()== 0) {
						d1.setPlacaMae(600);
						d1.setConfiguracao("PLACA MÃE "+ cbPlacaMae.getSelectedItem()+ "\n");
					}
					else if (cbPlacaMae.getSelectedIndex()== 1) {
						d1.setPlacaMae(800);
						d1.setConfiguracao("PLACA MÃE "+ cbPlacaMae.getSelectedItem()+ "\n");
					}
					else if (cbPlacaMae.getSelectedIndex()== 2) {
						d1.setPlacaMae(1000);
						d1.setConfiguracao("PLACA MÃE "+ cbPlacaMae.getSelectedItem()+ "\n");
					}
					
					
					//HD
					if(cbHD.getSelectedIndex()== 0) {
						d1.setHd(300);
						d1.setConfiguracao(d1.getConfiguracao() +"HD "+  cbHD.getSelectedItem()+ "\n");
					}
					else if (cbHD.getSelectedIndex()== 1) {
						d1.setHd(500);
						d1.setConfiguracao(d1.getConfiguracao() +"HD "+  cbHD.getSelectedItem()+ "\n");
					}
					else if (cbHD.getSelectedIndex()== 2) {
						d1.setHd(700);
						d1.setConfiguracao(d1.getConfiguracao() +"HD "+  cbHD.getSelectedItem()+ "\n");
				}
					
					//Memoria
					if(cbMemoria.getSelectedIndex()== 0) {
						d1.setMemoria(300);
						d1.setConfiguracao(d1.getConfiguracao() + "MEMORIA "+ cbMemoria.getSelectedItem()+"\n");
					}
					else if(cbMemoria.getSelectedIndex()== 1) {
						d1.setMemoria(400);
						d1.setConfiguracao(d1.getConfiguracao() + "MEMORIA "+ cbMemoria.getSelectedItem()+"\n");
				}
					else if(cbMemoria.getSelectedIndex()== 2) {
						d1.setMemoria(500);
						d1.setConfiguracao(d1.getConfiguracao() + "MEMORIA "+ cbMemoria.getSelectedItem()+"\n");
					
				
				}
					//PROCESSADOR
					
					if(cbProcessador.getSelectedIndex()== 0) {
						d1.setProcessador(500);
						d1.setConfiguracao(d1.getConfiguracao() + "PROCESSADOR "+ cbProcessador.getSelectedItem()+"\n");
					}
					else if(cbProcessador.getSelectedIndex()==1) {
						d1.setProcessador(700);
						d1.setConfiguracao(d1.getConfiguracao() + "PROCESSADOR "+ cbProcessador.getSelectedItem()+"\n");
					}
					else if(cbProcessador.getSelectedIndex()==2) {
						d1.setProcessador(900);
						d1.setConfiguracao(d1.getConfiguracao() + "PROCESSADOR "+ cbProcessador.getSelectedItem()+"\n");
				}
				
					//placa de video
					if(checkPlacaDeVideo.isSelected()) {
						if(comboPlacaDeVideo.getSelectedIndex()== 0) {
							d1.setPlacaVideo(200);
							
						}
						else if(comboPlacaDeVideo.getSelectedIndex()== 1) {
							d1.setPlacaVideo(400);
						
						}
						else {
							d1.setPlacaVideo(600);
							d1.setConfiguracao(d1.getConfiguracao() + "PLACA DE VIDEO "+ comboPlacaDeVideo.getSelectedItem()+"\n");
						}
						d1.setConfiguracao(d1.getConfiguracao() + "PLACA DE VIDEO "+ comboPlacaDeVideo.getSelectedItem()+"\n");
					}
					else {
						d1.setPlacaVideo(0);
					}
					
					
					//Estabilizador
					if(checkEstabilizador.isSelected()) {
						d1.setEstabilizador(300);
						d1.setConfiguracao(d1.getConfiguracao() + checkEstabilizador.getText() + "\n" );
					}
					else {
						d1.setEstabilizador(0);
					}
					
					//Teclado
					if(checkTeclado.isSelected()== true) {
						d1.setTeclado(300);
						d1.setConfiguracao(d1.getConfiguracao() + checkTeclado.getText() + "\n");
						
					}
					else {
						d1.setTeclado(0);
					}
					
					//Volumes
					
					d1.setVolumes(4);
					d1.setConfiguracao(d1.getConfiguracao() + " Volumes "+ d1.getVolumes()+ "\n");
					
					if(checkGarantia.isSelected()) {
						d1.setGarantia(2);
						d1.setConfiguracao(d1.getConfiguracao() + " Garantia "+ d1.getGarantia()+ " Anos\n");
						d1.imprimeGarantia();
					
					}
					else {
						d1.setGarantia(1);
						d1.setConfiguracao(d1.getConfiguracao() + " Garantia "+ d1.getGarantia()+ " Ano\n");
						d1.imprime();
						
					}
					
					
					
					}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnNewButton.setBounds(145, 355, 152, 23);
		contentPane.add(btnNewButton);
	}
}
