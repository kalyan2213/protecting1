import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.DigestInputStream;
import java.security.MessageDigest;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Node4 implements ActionListener {
	JFrame jf;
	Container c;
	JLabel l1, l2, l3;
	JTextField t1, t2, t3;
	JButton b1, b2, b3;
	JTextArea ta1;
	JScrollPane sp;
	String mac;

	public Font f1 = new Font("Calibrie", Font.BOLD, 17);

	Node4() {
		jf = new JFrame("Node-4");
		c = jf.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.MAGENTA);
		ta1 = new JTextArea();
		ta1.setRows(100);
		ta1.setColumns(100);

		sp = new JScrollPane();
		sp.setViewportView(ta1);
		sp.setBounds(80, 300, 400, 300);

		b1 = new JButton("Modify");
		//b1.setBounds(190, 625, 100, 35);

		l1 = new JLabel("File Name  :");
		l1.setFont(f1);
		l1.setBounds(70, 200, 160, 30);

		l2 = new JLabel("Mac Address  :");
		l2.setFont(f1);
		l2.setBounds(70, 250, 160, 30);

		t1 = new JTextField(15);
		t1.setBounds(190, 200, 210, 35);

		t2 = new JTextField(15);
		t2.setBounds(190, 250, 210, 35);

		b1.addActionListener(this);
		c.add(sp);
		c.add(l1);
		c.add(b1);
		c.add(l2);
		c.add(t1);
		c.add(t2);
		jf.show();
		jf.setSize(550, 700);

		int[] ports = new int[] { 5004 };
		for (int i = 0; i < 1; i++) {
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

			if (this.port == 5004) {
				try {
					server = new ServerSocket(5004);

					while (true) {
						con = server.accept();
						DataInputStream dis = new DataInputStream(con
								.getInputStream());

						String s = dis.readUTF();
						mac = dis.readUTF();
						String fname = dis.readUTF();

						t1.setText(fname);
						t2.setText(mac);
						ta1.setText(s);

						System.out
								.println("File received Successfully To Node-1");
						System.out.println(s);
					}

				} catch (Exception e) {
					// TODO: handle exception
				}
			}

		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			
			Attacker1 at = new Attacker1();
			at.t1.setText(t1.getText());
			at.ta1.setText(ta1.getText());

			// try
			// {
			// String modify = ta1.getText();
			// PrintStream p1 = new PrintStream(new FileOutputStream("Owner\\" +
			// t1.getText()));
			// p1.print(modify);
			//			
			// MessageDigest md = MessageDigest.getInstance("SHA1");
			// FileInputStream in1 = new FileInputStream("Owner\\" +
			// t1.getText());
			// DigestInputStream dis2 = new DigestInputStream(in1, md);
			// BufferedInputStream bd = new BufferedInputStream(dis2);
			//
			// while (true)
			// {
			// int b2 = bd.read();
			// if (b2 == -1)
			// break;
			// }
			//
			// BigInteger bi2 = new BigInteger(md.digest());
			// mac = bi2.toString(16);
			// t2.setText(mac);
			// System.out.println(mac);
			//			
			// Socket client1 = new Socket("localhost", 6001);
			// DataOutputStream ds = new
			// DataOutputStream(client1.getOutputStream());
			// ds.writeUTF("MacUpdated");
			// ds.writeUTF("Revocation");
			// ds.writeUTF(mac);
			// //ds.writeUTF(t1.getText());
			//			
			// }
			// catch(Exception ee)
			// {
			// ee.printStackTrace();
			// }
		}
	}

	public static void main(String[] args) {
		new Node4();

	}

}
