import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AssignBW implements ActionListener {

	JFrame jf;
	Container c;
	JLabel l1, l2,l3,l4,l5;
	JTextField t1,t2,t3,t4,t5;
	JButton b1, b2, b3;
//	String N1,N2,N3,N4,N5;
	int i;

	AssignBW() {

		jf = new JFrame("Assign BW::Bandwidth Distributed Denial of Service  Attacks and Defense");
		c = jf.getContentPane();
		c.setLayout(null);
		
		c.setBackground(Color.cyan);

		l1 = new JLabel("Node-1");
		l2 = new JLabel("Node-2");
		l3 = new JLabel("Node-3");
		l4 = new JLabel("Node-4");
		l5 = new JLabel("Node-5");

		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		t4 = new JTextField();
		t5 = new JTextField();
		

 		b1 = new JButton("Submit");
//		b2 = new JButton("Reset");
//		b3 = new JButton("Register");

		l1.setBounds(50, 50, 100, 25);
		l2.setBounds(50, 100, 100, 25);
		l3.setBounds(50, 150, 100, 25);
		l4.setBounds(50, 200, 100, 25);
		l5.setBounds(50, 250, 100, 25);

		t1.setBounds(150, 50, 150, 25);
		t2.setBounds(150, 100, 150, 25);
		t3.setBounds(150, 150, 150, 25);
		t4.setBounds(150, 200, 150, 25);
		t5.setBounds(150, 250, 150, 25);

       	b1.setBounds(160, 320, 100, 30);
//		b2.setBounds(260, 175, 100, 30);
//		b3.setBounds(150, 175, 100, 30);
		c.add(l1);
		c.add(l2);
		c.add(l3);
		c.add(l4);
		c.add(l5);
		c.add(t1);
		c.add(t2);
		c.add(t3);
		c.add(t4);
		c.add(t5);
     	c.add(b1);
//		c.add(b2);
//		c.add(b3);
     	
     	b1.addActionListener(this);

		jf.setBounds(50, 100, 400, 400);
		jf.setVisible(true);

//		b1.addActionListener(this);
//		b2.addActionListener(this);
//		b3.addActionListener(this);

	}

	public static void main(String[] args) {
		new AssignBW();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {

			String bw1 = t1.getText();
			String bw2 = t2.getText();
			String bw3 = t3.getText();
			String bw4 = t4.getText();
			String bw5 = t5.getText();
			System.out.println("get the values");

			try {
				
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection con3 = DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};Dbq=src\\DDAttack.mdb");
				
				
				    Statement stmt = con3.createStatement();
					Statement stmt1 = con3.createStatement();
					Statement stmt2= con3.createStatement();
					Statement stmt3= con3.createStatement();
					Statement stmt4= con3.createStatement();
					
					String sql="update NodeBW set BW='"+bw1+"'  where Nodename='N1'";
					stmt.executeUpdate(sql);
				
					String sql1="update NodeBW set BW='"+bw2+"'  where Nodename='N2'";
					stmt1.executeUpdate(sql1);
					
					String sql2="update NodeBW set BW='"+bw3+"'  where Nodename='N3'";
					stmt2.executeUpdate(sql2);
					
					String sql3="update NodeBW set BW='"+bw4+"'  where Nodename='N4'";
					stmt3.executeUpdate(sql3);
					
					String sql4="update NodeBW set BW='"+bw5+"'  where Nodename='N5'";
					stmt4.executeUpdate(sql4);
				
				
				
		      		System.out.println("node BW inserted");
				
				
				String rip=JOptionPane.showInputDialog("Enter Router IP Address");
				Socket sk=new Socket("localhost",2001);
				DataOutputStream dos=new DataOutputStream(sk.getOutputStream());
				dos.writeUTF(bw1);
				dos.writeUTF(bw2);
				dos.writeUTF(bw3);
				dos.writeUTF(bw4);
				dos.writeUTF(bw5);
			
                System.out.println("BW Assigned");
                
                
               
                
                
                
                DataInputStream dis1=new DataInputStream(sk.getInputStream());
                String msg=dis1.readUTF();
                
                JOptionPane.showMessageDialog(null,msg);
				
			} catch (Exception ex) {
				System.out.println(ex);
			}
		}
		if (e.getSource() == b2) {
			
			t1.setText("");
			 t2.setText("");

		}
		if (e.getSource() == b3) {

			new Register();

		}

	}

}
