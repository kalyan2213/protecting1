import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.*;
public class Attacker implements ActionListener
{
  JFrame f;
  JPanel p;
  JLabel l1,l2,l3;
  JButton b1,b2;
  ImageIcon ic;
  JTextField tc;
  public Font f1 = new Font("Times new Roman", Font.BOLD, 17);
  public JTextArea tf = new JTextArea();
  public JTextField fname = new JTextField();
  public JScrollPane pane1 = new JScrollPane();
  
  public Attacker() 
  {
	
	  f=new JFrame("Attacker::Protecting Location Privacy During Task Allocation in Mobile Cloud Computing");
	  p=new JPanel();
	  p.setBackground(new Color(100, 210, 235));
	  f.setSize(500, 400);
	  f.setVisible(true);
	  p.setLayout(null);
	  f.setResizable(false);
	  b1=new JButton("Request File");
	  b1.setBounds(140, 320, 140, 30);
	  p.add(b1);
	  f.add(p);
	  b2=new JButton("Modified");
	  b2.setBounds(300, 320, 100, 30);
	  p.add(b2);
	  tc=new JTextField();
	  tc.setBounds(160, 250, 250, 200);
//	  p.add(tc);
	  l1=new JLabel("Enter New Key");
	  l1.setBounds(30, 130, 150, 30);
	  l1.setFont(f1);
	  p.add(l1);
	    tf.setColumns(200);
		tf.setRows(100);
		tf.setName("tf");
		pane1.setName("pane");
		pane1.setViewportView(tf);
		pane1.setBounds(150, 80, 300, 200);
		p.add(pane1);
		b1.addActionListener(this);
		b2.addActionListener(this);
	  
	  int[] port = new int[] { 401, 1006,201};

		for (int i = 0; i < 3; i++) {
			Thread th = new Thread(new PortListener(port[i]));
			th.start();
		}
	  
	  
}
  public static void main(String[] args) 
  {
	new Attacker();
}
  
  class PortListener implements Runnable {
		DataOutputStream dos = null;
		DataInputStream in = null;

		ServerSocket server;
		Socket connection;
		int i;
		String fileid;
		Connection con;
		Statement stmt;
		int port;

		public PortListener(int port) {
			this.port = port;
		}

		public void run() 
		{
      if(this.port==1006)
      {
    	  
    	  
      }else
    	  if(this.port==201)
    	  {
    		  
    	  }
      
      
		}
  
  }

@Override
public void actionPerformed(ActionEvent ae) 
     {
	
	if(ae.getSource()==b2)  //modify
	{
		try 
		{
			InetAddress ia = InetAddress.getLocalHost();
			String ip2= ia.getHostAddress();
			String file=JOptionPane.showInputDialog("Enter File name");
			
		  Socket s=new Socket("localhost",2009);
	
		  DataOutputStream dos=new DataOutputStream(s.getOutputStream());
		  dos.writeUTF(tf.getText());
		  dos.writeUTF(file);
		  System.out.println("data send to server");
		  
		  DataInputStream diss=new DataInputStream(s.getInputStream());
		  String msg=diss.readUTF();
		  if(msg.endsWith("modif"))
		  {
			  JOptionPane.showMessageDialog(null,"File Modifiied Successfully");
		  }
		  
		

		  
		  
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	if(ae.getSource()==b1)
	{
		  try 
		  {
			  String file=JOptionPane.showInputDialog("Enter File name");
			  String pro=JOptionPane.showInputDialog("Enter cloud server IP Address");
			  
			  Socket s=new Socket(pro,2007);
				
			  DataOutputStream dos=new DataOutputStream(s.getOutputStream());
			  dos.writeUTF(file);
			  System.out.println("Req send to server");
			  
			  DataInputStream dis=new DataInputStream(s.getInputStream());
			  String data=dis.readUTF();
			  tf.setText(data);
			  
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
     }
}
