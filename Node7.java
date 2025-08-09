import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class Node7
{
	JFrame jf;
	Container c;
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b1,b2,b3;
	JTextArea ta1;
	JScrollPane sp;
	public Font f1 = new Font("Calibrie", Font.BOLD , 17);
	
	Node7()
	{
		jf = new JFrame("Node-7");
		c = jf.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.RED);
		ta1 = new JTextArea();
		ta1.setRows(100);
		ta1.setColumns(100);
		
		sp = new JScrollPane();
		sp.setViewportView(ta1);
		sp.setBounds(80, 300, 400, 300);
		
		l1 = new JLabel("File Name  :");l1.setFont(f1);
		l1.setBounds(70, 200, 160, 30);
		
		l2 = new JLabel("Mac Address  :");l2.setFont(f1);
		l2.setBounds(70, 250, 160, 30);
		
		t1 = new JTextField(15);
		t1.setBounds(190, 200, 210, 35);
		
		t2 = new JTextField(15);
		t2.setBounds(190, 250, 210, 35);
		
		c.add(sp);c.add(l1);c.add(l2);c.add(t1);c.add(t2);
		
		jf.show();
		jf.setSize(550, 700);
		
		int[] ports = new int[]{5007};
		for(int i=0;i<1;i++)
		{
			Thread t = new Thread(new PortListener(ports[i]));
			t.start();
		}
	}
	
	class PortListener implements Runnable {
		BufferedOutputStream bos = null;

		ServerSocket server;
		Socket con;
		BufferedReader br = null;
		int port;

		public PortListener(int port) {
			this.port = port;
		}

		@Override
		public void run() {

			if(this.port==5007)
			{
			  try
			  {
				server = new ServerSocket(5007);
				
				while(true)
				{
					con = server.accept();
				  	DataInputStream dis = new DataInputStream(con.getInputStream());
				  	
				  	String s = dis.readUTF();
				  	String mac = dis.readUTF();
				  	String fname = dis.readUTF();
				  	
				  	t1.setText(fname);
				  	t2.setText(mac);
	              	ta1.setText(s);		
	              	System.out.println("File received Successfully To Node-7");
	              	System.out.println(s);
				}
				  
			    }
			  catch (Exception e) 
			    {
					// TODO: handle exception
				}
				}
		}
	}
	public static void main(String[] args)
	{
		new Node7();
	}

}
