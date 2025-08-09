import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.Socket;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Attacker2 extends JFrame implements ActionListener
{
	
	
	
	
	Font f = new Font("Times New Roman",Font.BOLD,20);
	Container c;
	
	JButton browse,getinfo,Attack;
	JLabel j1,node,destip,l1;
	JTextField t1,t2;
	JComboBox node1 ;
	ImageIcon ic;
	
	
	JTextArea tf;
	JScrollPane jp;
	
	Attacker2()
	{
		c=getContentPane();
		c.setLayout(null);
		c.setBackground(new Color(120,114,200));
		
		setTitle("Attacker::Building a Scalable System for Stealthy P2PBotnet Detection");
		
		ic=new ImageIcon(this.getClass().getResource("Attack.png"));
		l1=new JLabel();
		l1.setIcon(ic);
		l1.setBounds(120, 20, 270, 250);
		c.add(l1);
		
		
		
		String[] rules = {"Select The Node","Node1","Node2","Node3","Node4","Node5","Node6","Node7","Node8","Node9"};
		 node1 = new JComboBox(rules);
		 node1.setSelectedIndex(0);
		 node1.addActionListener(this);
		 node1.setBounds(230,280,200,30);
		c.add(node1);
		
		
		
		
		Attack = new JButton("Attack");
		Attack.setBounds(250,500,100,30);
		Attack.addActionListener(this);
		c.add(Attack);
		
		
		
//		j1 = new JLabel("Attacker");
//		j1.setFont(f);
//		j1.setBounds(300,180,200,100);
//		c.add(j1);
		
		node = new JLabel(" Nodes Name");
		node.setFont(f);
		node.setBounds(50,250,200,100);
		c.add(node);
		
		t1= new JTextField();
		t1.setFont(f);
		t1.setBounds(420,230,200,200);
	//	c.add(t1);
		
		
		destip = new JLabel("Enter Bandwidth");
		destip.setFont(f);
		destip.setBounds(50,320,200,100);
		c.add(destip);
		
		t2= new JTextField();
		t2.setFont(f);
		t2.setBounds(230,340,190,100);
		t2.setEditable(true);
		c.add(t2);
		
		setSize(500,600);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==Attack)
		{
			try
			{
				InetAddress ia = InetAddress.getLocalHost();
				String ip1= ia.getHostAddress();
				String Bw=t2.getText();
				System.out.println("Bw"+Bw);

				
				
				String ip = JOptionPane.showInputDialog("Enter Router Ip-Address");
				Socket sc = new Socket(ip,309);
				String node=(String) node1.getSelectedItem();
				
				DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
				dout.writeUTF(node);
				dout.writeUTF(Bw);
				dout.writeUTF(ip1);
			
				DataInputStream din = new DataInputStream(sc.getInputStream());
				String msg=din.readUTF();
				System.out.println(msg);
				System.out.println("Node Attacked........ ");
				JOptionPane.showMessageDialog(null,msg);
				
				
			}
			catch(Exception e1)
			{
				e1.printStackTrace();
			}
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		new Attacker2();
	}
	
	

}
