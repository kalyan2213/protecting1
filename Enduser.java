import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Thread.State;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ReadOnlyBufferException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.*;
public class Enduser implements ActionListener
{
  JFrame f;
  JFrame ff;
  
  
  JPanel p;
  JPanel pp;
  
  JButton b1,b2,b3;
  JTextField t1,t2,t3,t4;
 
  
  JPanel panel;
  Vector data;
  Vector heading;
  
  ImageIcon ic;
  JScrollPane pane;
  
  ImageIcon ic1,ic2,ic3,ic4,ic5,ic6,ic7,ic8,ic9,ic11,ic22,ic33,ic44,ic55,ic66,ic77,ic88,ic99,icc1,icc2,icc3,icc4,icc5,lab1,lab2,lab3,lab4;
  JLabel op,op1,l1,l2,l3,l4,l5,l6,l7,l8,l9,l11,l22,l33,l44,l55,l66,l77,l88,l99,lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8,lb9;
  JLabel label1,label2,label3,label4,label5,label6,label7;
  
  JLabel lbb1,lbb2,lbb3,lbb4,lbb5,lbb6,lbb7,lbb8;
  
  public Font f1 = new Font("Times new Roman", Font.BOLD, 17);
  public JTextArea tf = new JTextArea();
	public JTextField fname = new JTextField();
	public JScrollPane pane1 = new JScrollPane();
  
  public Enduser() 
  {
	
	  f=new JFrame("EndUser::");
	  p=new JPanel();
	  f.setResizable(false);
	  
	  ff=new JFrame();

	  pp=new JPanel();
//	  
//	 p.setBackground(new Color(100, 240, 200));
	  p.setBackground(Color.white);
	 
	  
	  b1=new JButton("Download");
	  b1.setBounds(60, 460, 150, 30);
	  b1.setFont(f1);
	  p.add(b1);
	  
	  b2=new JButton("Request Sk");
	  b2.setBounds(240, 460, 150, 30);
	  b2.setFont(f1);
	  p.add(b2);
	  
	  b3=new JButton("View Files");
	  b3.setBounds(420, 460, 150, 30);
	  b3.setFont(f1);
	  p.add(b3);
	 
	  lbb1=new JLabel("Username");
	  lbb1.setBounds(450, 70, 150, 150);
	  lbb1.setFont(f1);
//	  p.add(lbb1);
	  
	  lbb2=new JLabel("Filename");
	  lbb2.setBounds(450, 130, 150, 150);
	  lbb2.setFont(f1);
//	  p.add(lbb2);
	  
	  lbb3=new JLabel("ScretKey");
	  lbb3.setBounds(450, 190, 150, 150);
	  lbb3.setFont(f1);
//	  p.add(lbb3);
	  
	  t1=new JTextField();
	  t1.setBounds(540, 130, 150, 30);
	 
	  t1.setFont(f1);
//	  p.add(t1);
	  
	  t2=new JTextField();
	  t2.setBounds(540, 190, 150, 30);
	  t2.setFont(f1);
//	  p.add(t2);
	  
	  t3=new JTextField();
	  t3.setBounds(540, 250, 150, 30);
	  t3.setFont(f1);
//	  p.add(t3);
	  
	  ic1=new ImageIcon(this.getClass().getResource("Picture1.jpg"));
	  lbb8=new JLabel();
	  lbb8.setIcon(ic1);
	  lbb8.setBounds(480, 100, 280, 290);
	  p.add(lbb8);
	  
	  
	  
	    tf.setColumns(200);
		tf.setRows(100);
		tf.setName("tf");
		pane1.setName("pane");
		pane1.setViewportView(tf);
		pane1.setBounds(40, 110, 340, 240);
		p.add(pane1);
		
		  f.setSize(800, 570);
		  f.setVisible(true);
		  p.setLayout(null);
		  
		   f.add(p);
		   
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	  
	  int[] port = new int[] { 401, 1001,201,2323,5005,5008};

		for (int i = 0; i < 6; i++) {
			Thread th = new Thread(new PortListener(port[i]));
			th.start();
		}
	  
	  
}
  public static void main(String[] args) 
  {
	new Enduser();
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
      if(this.port==1001)
      {
			try 
			{
				AES enc = new AES();
				 DBCon db=new DBCon();
	        	 Connection con=db.getConnection();
				
			   ServerSocket s1=new ServerSocket(1001);
			   while(true)
			   {
				Socket ss1=s1.accept();
				
	             DataInputStream dis=new DataInputStream(ss1.getInputStream());
	             String fname=dis.readUTF();
	             String key=dis.readUTF();
	             String pk=dis.readUTF();
	             String mac=dis.readUTF();
	             String sk=dis.readUTF();
	            
				System.out.println("data recived");
				
				Statement stmt1 = con.createStatement();
				String sql2="insert into metadata values('"+fname+"','"+key+"','"+pk+"','"+mac+"','"+sk+"')";
				stmt1.executeUpdate(sql2);
				System.out.println("Data inserted into manager db");
				
				
				DataOutputStream dos=new DataOutputStream(ss1.getOutputStream());
				dos.writeUTF("reach");
				System.out.println("reach msg send to engine");
				
				
				
			   }
			} catch (Exception e) {
				// TODO: handle exception
			}
		
		
      }
      
      if(this.port==5005)
      {
			try 
			{
				AES enc = new AES();
				 DBCon db=new DBCon();
	        	 Connection con=db.getConnection();
				
			   ServerSocket s1=new ServerSocket(5005);
			   while(true)
			   {
				Socket ss1=s1.accept();
				
				DataInputStream dis=new DataInputStream(ss1.getInputStream());
				
				String image=dis.readUTF();
				String status=dis.readUTF();
				String dt=dis.readUTF();
	
				System.out.println("data recived");
				
				Statement stmt1 = con.createStatement();
				String sql2="insert into Biometric values('"+image+"','"+dt+"','"+status+"')";
				stmt1.executeUpdate(sql2);
				System.out.println("Data inserted into manager db");
				
				if(status.equals("Pass"))
				{
					DataOutputStream dos=new DataOutputStream(ss1.getOutputStream());
					dos.writeUTF("Pass");
					System.out.println("pass msg send to pattern");
				}else
					if(status.equals("Fail"))
					{
						DataOutputStream dos=new DataOutputStream(ss1.getOutputStream());
						dos.writeUTF("Fail");
						System.out.println("fail msg send to pattern");
					}
				
				
			   }
			} catch (Exception e) {
				// TODO: handle exception
			}
		
		
    
      }
      
      if(this.port==5008)
      {

			try 
			{
				AES enc = new AES();
				 DBCon db=new DBCon();
	        	 Connection con=db.getConnection();
				
			   ServerSocket s1=new ServerSocket(5008);
			   while(true)
			   {
				Socket ss1=s1.accept();
				
				DataInputStream dis=new DataInputStream(ss1.getInputStream());
				
				String msg=dis.readUTF();
				String fname=dis.readUTF();
				String fakem=dis.readUTF();
				String date=dis.readUTF();
	
				System.out.println("data recived");
				
				Statement stmt1 = con.createStatement();
				String sql2="insert into Attacker values('"+fname+"','"+fakem+"','"+date+"')";
				stmt1.executeUpdate(sql2);
				System.out.println("Data inserted into manager db");
				
				
				DataOutputStream dos=new DataOutputStream(ss1.getOutputStream());
				dos.writeUTF("taken");
				System.out.println("reach msg send to pattern");
				
				
			   }
			} catch (Exception e) {
				// TODO: handle exception
			}
		
		
  
    
      }
     
      if(this.port==2323)
      {
			try 
			{
				 DBCon db=new DBCon();
	        	 Connection con=db.getConnection();
				
			   ServerSocket s1=new ServerSocket(2323);
			   while(true)
			   {
				Socket ss1=s1.accept();
				
				DataInputStream dis=new DataInputStream(ss1.getInputStream());
				
				String fake=dis.readUTF();
				System.out.println("fake data recived");
				
				
				Statement stmt1 = con.createStatement();
				String sql2="update patternmanager set fakedata='"+fake+"'";
				stmt1.executeUpdate(sql2);
				System.out.println("Data inserted into manager db");
				
				
				DataOutputStream dos=new DataOutputStream(ss1.getOutputStream());
				dos.writeUTF("reach");
				System.out.println("reach msg send to pattern");
				
			   }
			} catch (Exception e) {
				// TODO: handle exception
			}
		
		
    
      }
      
      
		}
  
  }

@Override
public void actionPerformed(ActionEvent ae) 
     {
	
	if(ae.getSource()==b1)
	{
		
		String fname = JOptionPane.showInputDialog("Enter File name");
		String user = JOptionPane.showInputDialog("Enter  Username");
		String key = JOptionPane.showInputDialog("Enter Secret key");
		String ip = JOptionPane.showInputDialog("Enter  Cloudserver IP Address");
	
		try 
		{
			Socket ss=new Socket(ip,4007);
			DataOutputStream dos=new DataOutputStream(ss.getOutputStream());
			
			dos.writeUTF(user);
			dos.writeUTF(fname);
			dos.writeUTF(key);
			System.out.println("req send to server");
			
			DataInputStream diis=new DataInputStream(ss.getInputStream());
			String msg=diis.readUTF();
			String data=diis.readUTF();
			
			if(msg.equals("success"))
			{
				JOptionPane.showMessageDialog(null,"File Recived Successfully");
				tf.setText(data);
			}else 
				if(msg.equals("fail"))
				{
					JOptionPane.showMessageDialog(null,"Sorry You are entered Wrong File name or Skey You are Blocked");
				}else
					if(msg.equals("attcker"))
					{
						JOptionPane.showMessageDialog(null,"Sorry You are Currently Blocked By LBS Server");
					}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	if(ae.getSource()==b2)
	{
		
		String name = JOptionPane.showInputDialog("Enter your name");
		String fname = JOptionPane.showInputDialog("Enter File name");
		String ip = JOptionPane.showInputDialog("Enter Metadata server IP Address");
		
		try 
		{
			Socket s = new Socket(ip, 6001);
			DataOutputStream dos1 = new DataOutputStream(s.getOutputStream());
			dos1.writeUTF(name);
			dos1.writeUTF(fname);
			
			System.out.println("Req send to owner");
			
			DataInputStream dis=new DataInputStream(s.getInputStream());
		
			String sk=dis.readUTF();
			
			
		   JOptionPane.showMessageDialog(null,"Secrte Key is     "+sk);
				
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	
	}
	if(ae.getSource()==b3)
	{

	
		  String ip1 = JOptionPane.showInputDialog("Enter Clodserver IP Address");
		
		  
		  try 
			{
			  DBCon db=new DBCon();
	        	 Connection con=db.getConnection();
			  
				Socket s = new Socket(ip1, 6005);
				DataOutputStream dos1 = new DataOutputStream(s.getOutputStream());
				dos1.writeUTF("Req");
	
				System.out.println("Req send to  server");
				
				ObjectInputStream obi=new ObjectInputStream(s.getInputStream());
			    Vector list1=(Vector)obi.readObject();

			    System.out.println("        "+list1);
			    
			    ViewFiles vv=new ViewFiles(list1);
			
				
				
			
			} catch (Exception e) {
				// TODO: handle exception
			}
		  
		
	}
	
	
	
	
     }
}
