

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Receiver extends javax.swing.JFrame {

	public String userName;
	String ip;
	int port;
	Border b11,b22,b33;
	
	MenuBar mbr;
	Menu file;
	MenuItem item1,item2,item3;

	public DefaultTableModel dft;

	public Receiver() {
		initComponents();
		init();
	}

	private void init() {
		// TODO Auto-generated method stub

	}

	private void initComponents() {

		MenuBar mbr;
		Menu file;
		MenuItem bu, exit;
        
        
        JLabel k11 = new JLabel();
        Border b11 = BorderFactory.createBevelBorder(0);
        k11.setBorder(b11);
        k11.setBounds(10, 60, 300, 150);
        
        JLabel k12 = new JLabel();
        Border b22 = BorderFactory.createBevelBorder(0);
        k12.setBorder(b11);
        k12.setBounds(325, 60, 411, 150);
        
        JLabel k13 = new JLabel();
        Border b33 = BorderFactory.createBevelBorder(0);
        k13.setBorder(b33);
        k13.setBounds(130, 275, 330, 80);
        
        
       
		
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		txtOwner = new javax.swing.JTextField();
		btnReqToOwner = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		tbl = new javax.swing.JTable();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel33 = new javax.swing.JLabel();
		txtFile = new javax.swing.JTextField();
		txtFile1 = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		txtSecCode = new javax.swing.JTextField();
		btnReqToCloud = new javax.swing.JButton();
		jLabel5 = new javax.swing.JLabel();
		jScrollPane2 = new javax.swing.JScrollPane();
		jtaRecFile = new javax.swing.JTextArea();
		btnExit = new javax.swing.JButton();
		imglabel = new javax.swing.JLabel(new ImageIcon(
				"src/com/design/User.jpg"));

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		jPanel1.setBackground(new java.awt.Color(250, 250, 250));
		jPanel1.setBorder(javax.swing.BorderFactory
				.createTitledBorder("Cloud User"));
		jPanel1.setLayout(null);
		
		jPanel1.add(k11);
		jPanel1.add(k12);
		jPanel1.add(k13);
		
		
		ImageIcon im = new ImageIcon(this.getClass().getResource("Receiver.PNG"));
		
		JLabel image = new JLabel();
		image.setIcon(im);

		image.setBounds(0,0,1000,60);

		mbr = new MenuBar();
		setMenuBar(mbr);

		file = new Menu("Exit");

		bu = new MenuItem("Owner Request");

		exit = new MenuItem("Exit");

		//file.add(bu);

		file.add(exit);
		mbr.add(file);

		jLabel1.setText("Owner / Port : ");
		// jPanel1.add(jLabel1);
		// jLabel1.setBounds(30, 30, 100, 20);
		// jPanel1.add(txtOwner);
		// txtOwner.setBounds(110, 30, 170, 20);

		exit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				exitPerformActionPerformed(evt);
			}
		});

		/*
		 * dft=new DefaultTableModel(); tbl.setModel(dft);
		 * jScrollPane1.setViewportView(tbl);
		 * 
		 * dft.addColumn("File Name"); dft.addColumn("MAC");
		 * dft.addColumn("Security Code");
		 * 
		 * jPanel1.add(jScrollPane1); jScrollPane1.setBounds(30, 80, 710, 110);
		 */

		jLabel2.setText("Security Details");
		// jPanel1.add(jLabel2);
		// jLabel2.setBounds(30, 60, 190, 14);

		jLabel33.setText("Enter User Name:");
		jPanel1.add(jLabel33);
		jLabel33.setBounds(20, 80, 90, 20);
		jPanel1.add(txtFile1);
		txtFile1.setBounds(120, 80, 160, 20);

		jLabel3.setText("Enter File Name:");
		jPanel1.add(jLabel3);
		jLabel3.setBounds(30, 120, 90, 20);
		jPanel1.add(txtFile);
		txtFile.setBounds(120, 120, 160, 20);

		jLabel4.setText("Secutity Code :");
		jPanel1.add(jLabel4);
		jLabel4.setBounds(30, 160, 90, 20);
		jPanel1.add(txtSecCode);
		txtSecCode.setBounds(120, 160, 160, 20);

		btnReqToCloud.setText("Request to Cloud Server");
		btnReqToCloud.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnReqToCloudActionPerformed(evt);
			}
		});

		jPanel1.add(btnReqToCloud);
		btnReqToCloud.setBounds(150, 300, 160, 40);

		jLabel5.setText("Received File :");
		jPanel1.add(jLabel5);
		jLabel5.setBounds(330, 50, 80, 14);

		jtaRecFile.setColumns(20);
		jtaRecFile.setRows(5);
		jScrollPane2.setViewportView(jtaRecFile);

		jPanel1.add(jScrollPane2);
		jScrollPane2.setBounds(330, 70, 400, 110);

		btnExit.setText("Exit");
		btnExit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnExitActionPerformed(evt);
			}
		});
		jPanel1.add(btnExit);
		btnExit.setBounds(333, 300, 100, 40);
		// jPanel1.add(imglabel);
		getContentPane().add(jPanel1);
		jPanel1.setBounds(10, 10, 800, 450);
		bu.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				mbsActionPerformed(evt);
			}
		});
		
		setSize(800, 500);
		setResizable(false);
		setTitle("Receiver::PACK Prediction-Based Cloud Bandwidth and Cost Reduction System");
		setVisible(true);
		imglabel.setBounds(0, -20, 1200, 850);
		
		//getContentPane().add(image);
		
		jPanel1.setBackground(new Color(240, 120, 250));
		
		
		
		
		
		
		int[] ports = new int[]
			              		{ 10002};

			              		for (int i = 0; i < 1; i++)
			              		{
			              			Thread t = new Thread(new PortListener1(ports[i]));
			              			t.setName("Listener-" + ports[i]);
			              			t.start();

			              		}
			              		
			              		

	}// </editor-fold>

	// GEN-END:initComponents

	private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {
		
		System.exit(0);
	}

	private void mbsActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:

	}

	private void btnReqToCloudActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:

		String uname = txtFile1.getText();
		String fle = txtFile.getText();
		String sec = txtSecCode.getText();
		try {

			
			Socket con1=new Socket("localhost",10001);
			DataOutputStream dos1 = new DataOutputStream(con1.getOutputStream());
			dos1.writeUTF("UserRequest");
			
			dos1.writeUTF(uname);
			dos1.writeUTF(fle);
			dos1.writeUTF(sec);
			
			
			DataInputStream	dis = new DataInputStream(con1.getInputStream());
			String response = dis.readUTF();
			
			
			if(response.equals("success"))
			{
				
				
				
			

					String fname = dis.readUTF();

					String sk = dis.readUTF();

					String ct = dis.readUTF();

					System.out.println("User:"+fname);
					System.out.println("User:"+sk);
					System.out.println("User:"+ct);
					
					FileOutputStream fos = new FileOutputStream("User/"+ fname);
					fos.write(ct.getBytes());
					
					
					JOptionPane.showMessageDialog(null, fname+"Reveivecd and Stored into User");
					
				
					jtaRecFile.append(ct);
					
					fos.close();
					
					
					

			}
			if(response.equals("failure"))
			{
				
				JOptionPane.showMessageDialog(null, "File Name or Secret Key Wrong U  R Automatically Blocked","Message From Cloud Server", JOptionPane.WARNING_MESSAGE);

			}
			
			if(response.equals("Block"))
			{
				
				JOptionPane.showMessageDialog(null, "U R Currentlly Blocked Pls Contact Cloud Server","Message From Cloud Server", JOptionPane.WARNING_MESSAGE);

			}
		
			
			
			
}
		 catch (Exception e) {
			System.out.println(e);
		}

	}

	private void exitPerformActionPerformed(java.awt.event.ActionEvent evt) {
		System.exit(0);
	}

	public static void main(String args[]) {
		try {
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Receiver().setVisible(true);
			}
		});
	}

	// GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton btnExit;
	private javax.swing.JButton btnReqToCloud;
	private javax.swing.JButton btnReqToOwner;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel33;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	public javax.swing.JTextArea jtaRecFile;
	private javax.swing.JTable tbl;
	private javax.swing.JTextField txtFile;
	private javax.swing.JTextField txtFile1;
	private javax.swing.JTextField txtOwner;
	private javax.swing.JTextField txtSecCode;
	private javax.swing.JLabel imglabel;
	// End of variables declaration//GEN-END:variables

}


class PortListener1 implements Runnable
{

	BufferedOutputStream bos = null;
	ServerSocket ss1, ss2;
	Socket s1, s2;
	ServerSocket server, server1;
	Socket connection, so;
	BufferedReader br = null;
	int port;

	public PortListener1(int port)
	{
		this.port = port;
	}

	public void run()
	{
	


		
		/*if(this.port==10002)
		
		{
			
			 try
				{ 
				 
				 Socket s;
				 while(true) 
				 {
				 
				 
				 ServerSocket ss=new ServerSocket(10002);
				 
				 s=ss.accept();
				 
				 DataInputStream dis1 = new DataInputStream(s.getInputStream());

				String fname = dis1.readUTF();

				String sk = dis1.readUTF();

				String ct = dis1.readUTF();

				System.out.println("User:"+fname);
				System.out.println("User:"+sk);
				System.out.println("User:"+ct);
				
				FileOutputStream fos = new FileOutputStream("User/"
						+ fname);
				fos.write(ct.getBytes());
				
				
				JOptionPane.showMessageDialog(null, fname+"Reveivecd and Stored into User");
				
			
				
				
				fos.close();
				
				
				s.close();
				ss.close();
				
				

				
				
				}
				 
				
				}
				catch(Exception e){System.out.println(e);}
				

				
				
			
			
			
			
			
		}*/
		 
	}
}	
