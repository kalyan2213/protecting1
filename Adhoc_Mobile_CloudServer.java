import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.SliderUI;

public class Adhoc_Mobile_CloudServer implements ActionListener
{
	  JFrame f;
	  JPanel  p;
	  JButton b1,b2,b3;
	  ImageIcon ic;
	  JMenuBar mbr;
		JMenu m1;
		JMenuItem mi1, mi2,mi3,mi4,mi5,mi6;
	  
	  ImageIcon ic1,ic2,ic3,ic4,ic5,ic6,ic7,ic8,ic9,ic11,ic22,ic33,ic44,ic55,ic66,ic77,ic88,ic99,icc1,icc2,icc3,icc4,icc5,lab1,lab2,lab3,lab4;
	  JLabel op,op1,l1,l2,l3,l4,l5,l6,l7,l8,l9,l11,l22,l33,l44,l55,l66,l77,l88,l99,lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8,lb9;
	  JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13;
	  
	  ImageIcon icon1,icon2,icon3,icon4,icon5,icon6,icon7,icon8,icon9,icon11,icon12,icon13,icon14,ic888;
	  
	  ImageIcon icon101,icon22,icon33,icon44,icon55,icon66,icon77,icon88,icon99,icon111,icon222,icon333,icon444;
	  ImageIcon i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i22,i33,i44,i55,i66,i77,i88,i99,lb;
	  
	  JLabel lol1,lol2,lol3,lol4,lol5,lol6,lol7,lol8,lol9,lol10;
	  JLabel lo1,lo2,lo3,lo4,lo5,lo6,lo7,lo8,lo9,lo11,lo22,lo33,lo44,lo55;
	  ImageIcon con1,con2,con3,con4,con5,con6,con7,con8,con9,con11,con22,con33,con44,con55,con66,con77,con88,con99,con111,con222,con333,con444,con555,con888,con999;
	  
	  JLabel lbb1,lbb2,lbb3,lbb4,lbb5,lbb6,lbb7,lbb8;
	  String keyWord = "ef50a0ef2c3e3a5fdf803ae9752c8c66";
	  JLabel lk,lk1,lo444;
	  
	  public Font f1 = new Font("Times new Roman", Font.BOLD, 15);
	  public Font f2 = new Font("Times new Roman", Font.BOLD, 15);
	  
	  public Font f3 = new Font("Times new Roman", Font.BOLD, 16);
	  public Font f4 = new Font("Times new Roman", Font.BOLD, 19);
	  
	  public JTextArea tf = new JTextArea();
		public JTextField fname = new JTextField();
		public JScrollPane pane1 = new JScrollPane();
		
		public Adhoc_Mobile_CloudServer() 
		{
		

			
			  f=new JFrame("Adhoc Mobile Cloud Server::Protecting Location Privacy During Task Allocation in Mobile Cloud Computing");
			  p=new JPanel();
			  
//			  f.setResizable(false);
			  
			 p.setBackground(Color.white);
//			  p.setBackground(new Color(193, 157,130));
			 p.setBackground(Color.white);
			 
			  
			  b1=new JButton("Master Key");
			  b1.setBounds(60, 385, 150, 30);
//			  p.add(b1);
			  
			  b2=new JButton("Attacker Details");
			  b2.setBounds(240, 385, 150, 30);
//			  p.add(b2);
			  
			  b3=new JButton("Assign Distance");
			  b3.setBounds(580, 105, 150, 30);
			  //p.add(b3);
			  
				mbr = new JMenuBar();
				f.setJMenuBar(mbr);
				m1 = new JMenu("File");
				mi1 = new JMenuItem("View File");
				mi2 = new JMenuItem("View Attacker");
				mi3 = new JMenuItem("File Search and Response Details");
				mi4 = new JMenuItem("View Distance");
				mi5 = new JMenuItem("UnBlock User");
				mi6 = new JMenuItem("Exit");
				
				mbr.add(m1);
				m1.add(mi1);
				m1.add(mi2);
				m1.add(mi3);
				m1.add(mi4);
				m1.add(mi5);
				m1.add(mi6);
				
				
				
				lo444=new JLabel("CSP-->Cellular Service Provider");
				lo444.setBounds(20, 10, 250,200);

				lo444.setFont(f3);
				p.add(lo444);
				
			lo44=new JLabel("CCP-->Mobile Cloud Computing Platform");
			lo44.setBounds(20, 40, 250,200);
//			lo44.setForeground(Color.darkGray);
			lo44.setFont(f3);
			p.add(lo44);
			
			lo55=new JLabel("NN-->Mobile Servers");
			lo55.setBounds(20, 70, 250,200);
			lo55.setFont(f3);
			p.add(lo55);
			
			lk=new JLabel("File Found.....");
			lk.setBounds(620, 500, 250, 150);
			lk.setForeground(Color.RED);
			lk.setFont(f4);
			lk.setVisible(false);
			p.add(lk);
			
			lk1=new JLabel("File Not Found.....");
			lk1.setBounds(620, 500, 250, 150);
			lk1.setForeground(Color.RED);
			lk1.setFont(f4);
			lk1.setVisible(false);
			p.add(lk1);

					
					//labels
			  
			  
			  lol1=new JLabel("");
			  lol1.setBounds(85,220,270,280);
			  p.add(lol1);
			  
			  lol2=new JLabel("");
			  lol2.setBounds(170,220,270,280);
			  p.add(lol2);
			  
			  lol3=new JLabel("");
			  lol3.setBounds(240,220,270,280);
			  p.add(lol3);
			  
			  lol4=new JLabel("");
			  lol4.setBounds(30,380,270,280);
			  p.add(lol4);
			  
			  lol5=new JLabel("");
			  lol5.setBounds(105,380,270,280);
			  p.add(lol5);
			  
			  lol6=new JLabel("");
			  lol6.setBounds(438,260,190,190);
			  p.add(lol6);
			  
			  lol7=new JLabel("");
			  lol7.setBounds(545,260,190,190);
			  p.add(lol7);
			  
			  lol8=new JLabel("");
			  lol8.setBounds(609,260,190,190);
			  p.add(lol8);
			  
			  lol9=new JLabel("");
			  lol9.setBounds(370,380,270,280);
			  p.add(lol9);
			  
			  lol10=new JLabel("");
			  lol10.setBounds(490,380,270,280);
			  p.add(lol10);
			  
			  

					label1=new JLabel("CSP1");
					label1.setBounds(184,184,150,150);
					label1.setForeground(Color.white);
					label1.setFont(f1);
					p.add(label1);
					
					
					label2=new JLabel("CSP2");
					label2.setBounds(530,164,190,190);
					label2.setForeground(Color.white);
					label2.setFont(f1);
					p.add(label2);
//					
					label3=new JLabel("nn1");
					label3.setBounds(86,270,270,280);
					label3.setForeground(Color.white);
					label3.setFont(f1);
					p.add(label3);
					
					label4=new JLabel("nn2");
					label4.setBounds(187,270,270,280);
					label4.setForeground(Color.white);
					label4.setFont(f1);
					p.add(label4);
//					
					label5=new JLabel("nn3");
					label5.setBounds(275,270,270,280);
					label5.setForeground(Color.white);
					label5.setFont(f1);
					p.add(label5);
//					
					label6=new JLabel("nn4");
					label6.setBounds(425,317,190,190);
					label6.setForeground(Color.white);
					label6.setFont(f1);
					p.add(label6);
					
					label7=new JLabel("nn5");
					label7.setBounds(530,317,190,190);
					label7.setForeground(Color.white);
					label7.setFont(f1);
					p.add(label7);
					
					label8=new JLabel("nn6");
					label8.setBounds(615,317,190,190);
					label8.setForeground(Color.white);
					label8.setFont(f1);
					p.add(label8);
					
					
					label9=new JLabel("nn11");
					label9.setBounds(30,433,270,280);
					label9.setForeground(Color.white);
					label9.setFont(f1);
					p.add(label9);
					
					label10=new JLabel("nn111");
					label10.setBounds(125,433,270,280);
					label10.setForeground(Color.white);
					label10.setFont(f1);
					p.add(label10);
//			  
					
					label11=new JLabel("nn44");
					label11.setBounds(372,433,270,280);
					label11.setForeground(Color.white);
					label11.setFont(f1);
					p.add(label11);
					
					label12=new JLabel("nn444");
					label12.setBounds(470,433,270,280);
					label12.setForeground(Color.white);
					label12.setFont(f1);
					p.add(label12);
					
					label13=new JLabel("CCP");
					label13.setBounds(340,-13,270,280);
					label13.setForeground(Color.white);
					label13.setFont(f1);
					p.add(label13);
//			  
//		               // All images 
//			  
//			  
			    ic1=new ImageIcon(this.getClass().getResource("BlackLBS1.png"));
				l1=new JLabel();
				l1.setIcon(ic1);
				l1.setBounds(300,40,150,150);
				p.add(l1);
//				
//				
				ic2=new ImageIcon(this.getClass().getResource("Blackstation.png"));
				l2=new JLabel();
				l2.setIcon(ic2);
				l2.setBounds(160,160,190,190);
				p.add(l2);
//			
				ic3=new ImageIcon(this.getClass().getResource("Blackstation.png"));
				l3=new JLabel();
				l3.setIcon(ic3);
				l3.setBounds(500,160,190,190);
				p.add(l3);
//				
				ic4=new ImageIcon(this.getClass().getResource("Blacknode.png"));      //nn4
				l4=new JLabel();
				l4.setIcon(ic4);
				l4.setBounds(410,270,270,280);
				p.add(l4);
//				
				ic5=new ImageIcon(this.getClass().getResource("Blacknode.png"));   //nn5
				l5=new JLabel();
				l5.setIcon(ic5);
				l5.setBounds(513,270,270,280);
				p.add(l5);
//				
				ic6=new ImageIcon(this.getClass().getResource("Blacknode.png"));   //nn6
				l6=new JLabel();
				l6.setIcon(ic6);
				l6.setBounds(600,270,270,280);
				p.add(l6);
				
				ic7=new ImageIcon(this.getClass().getResource("Blacknode.png"));
				l7=new JLabel();
				l7.setIcon(ic7);
				l7.setBounds(70,270,270,280);
				p.add(l7);
//				
				ic8=new ImageIcon(this.getClass().getResource("Blacknode.png"));
				l8=new JLabel();
				l8.setIcon(ic8);
				l8.setBounds(170,270,270,280);
				p.add(l8);
//				
				ic9=new ImageIcon(this.getClass().getResource("Blacknode.png"));
				l9=new JLabel();
				l9.setIcon(ic9);
				l9.setBounds(260,270,270,280);
				p.add(l9);
//				
				ic11=new ImageIcon(this.getClass().getResource("Blacknode.png"));
				l11=new JLabel();
				l11.setIcon(ic11);
				l11.setBounds(20,436,270,280);
				p.add(l11);
//				
				ic22=new ImageIcon(this.getClass().getResource("Blacknode.png"));
				l22=new JLabel();
				l22.setIcon(ic22);
				l22.setBounds(120,436,270,280);
				p.add(l22);
//				
				ic33=new ImageIcon(this.getClass().getResource("Blacknode.png")); //nn44
				l33=new JLabel();
				l33.setIcon(ic33);
				l33.setBounds(360,435,270,280);
				p.add(l33);
				
				ic44=new ImageIcon(this.getClass().getResource("Blacknode.png")); //nn444
				l44=new JLabel();
				l44.setIcon(ic44);
				l44.setBounds(460,435,270,280);
				p.add(l44);
				
				ic55=new ImageIcon(this.getClass().getResource("blackcross1.png"));
				l55=new JLabel();
				l55.setIcon(ic55);
				l55.setBounds(88,260,150,160);
				p.add(l55);
				
				ic66=new ImageIcon(this.getClass().getResource("Blackdown.png"));
				l66=new JLabel();
				l66.setIcon(ic66);
				l66.setBounds(177,260,150,160);
				p.add(l66);
				
				ic77=new ImageIcon(this.getClass().getResource("blackcross2.png"));
				l77=new JLabel();
				l77.setIcon(ic77);
				l77.setBounds(217,260,150,160);
				p.add(l77);
				
				ic88=new ImageIcon(this.getClass().getResource("blackcross1.png"));    
				l88=new JLabel();
				l88.setIcon(ic88);
				l88.setBounds(425,260,150,160);
				p.add(l88);
				
				ic99=new ImageIcon(this.getClass().getResource("Blackdown.png"));      
				l99=new JLabel();
				l99.setIcon(ic99);
				l99.setBounds(520,260,150,160);
				p.add(l99);
				
				icc1=new ImageIcon(this.getClass().getResource("blackcross2.png"));    
				lb1=new JLabel();
				lb1.setIcon(icc1);
				lb1.setBounds(556,260,150,160);
				p.add(lb1);
				
				icc2=new ImageIcon(this.getClass().getResource("blackcross3.png"));
				lb2=new JLabel();
				lb2.setIcon(icc2);
				lb2.setBounds(30,420,150,160);
				p.add(lb2);
				
				icc3=new ImageIcon(this.getClass().getResource("blackcross4.png"));
				lb3=new JLabel();
				lb3.setIcon(icc3);
				lb3.setBounds(100,420,150,160);
				p.add(lb3);
				
				icc4=new ImageIcon(this.getClass().getResource("blackcross3.png"));
				lb4=new JLabel();
				lb4.setIcon(icc4);
				lb4.setBounds(370,420,150,160);
				p.add(lb4);
				
				icc5=new ImageIcon(this.getClass().getResource("blackcross4.png"));
				lb5=new JLabel();
				lb5.setIcon(icc5);
				lb5.setBounds(440,420,150,160);
				p.add(lb5);
			 
				
				lab1=new ImageIcon(this.getClass().getResource("newlong1.png"));
				lb6=new JLabel();
				lb6.setIcon(lab1);
				lb6.setBounds(220,110,150,160);
				p.add(lb6);
				
				lab2=new ImageIcon(this.getClass().getResource("newlong2.png"));
				lb7=new JLabel();
				lb7.setIcon(lab2);
				lb7.setBounds(425,110,150,160);
				p.add(lb7);
				
			  
			  f.setSize(800, 690);
			  f.setVisible(true);
			  p.setLayout(null);
			  
			  f.add(p);
			  
			    tf.setColumns(200);
				tf.setRows(100);
				tf.setName("tf");
				pane1.setName("pane");
				pane1.setViewportView(tf);
				pane1.setBounds(450, 250, 300, 200);
				
				mi1.addActionListener(this);
				mi2.addActionListener(this);
				mi3.addActionListener(this);
				mi4.addActionListener(this);
				mi5.addActionListener(this);
				b3.addActionListener(this);
			  
			  int[] port = new int[] { 401, 2001,4007,6005,2007,2009,1002,6767,5007,6007};

				for (int i = 0; i < 10; i++) {
					Thread th = new Thread(new PortListener(port[i]));
					th.start();
				}
		}
		
		public static void main(String[] args) 
		{
		  new Adhoc_Mobile_CloudServer();	
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
		          
					if(this.port==2001)
					{
						try 
						{
							ServerSocket soc=new ServerSocket(2001);
							while(true)
							{
								Socket ss=soc.accept();
								DataInputStream dis=new DataInputStream(ss.getInputStream());
								String station=dis.readUTF();
								String fname=dis.readUTF();
								String mac=dis.readUTF();
								String pk=dis.readUTF();
								String sk=dis.readUTF();
								String data=dis.readUTF();
								System.out.println("data recived successfully");
								
								AES enc = new AES();
								String content=enc.encrypt(data, keyWord);
								
								SimpleDateFormat sdfDate = new SimpleDateFormat(
								"dd/MM/yyyy");
						        SimpleDateFormat sdfTime = new SimpleDateFormat(
								"HH:mm:ss");

						          Date now = new Date();

						          String strDate = sdfDate.format(now);
						          String strTime = sdfTime.format(now);
		     
						          String dt = strDate + "   " + strTime;
						          
						          
						            PrintStream p1 = new PrintStream(new FileOutputStream("server/"+fname));
									p1.print(content);
								
								
								int mn1=0;
								int mn2=0;
								int mn3=0;
								int mn4=0;
								int mn5=0;
								
								 DBCon db=new DBCon();
					        	 Connection con=db.getConnection();
					        	 
								Statement stmt1 = con.createStatement();
								String sql1 = "select * from BS1 where NNodes='nn1'";
								ResultSet rs1 = stmt1.executeQuery(sql1);
								if(rs1.next()==true)
								{
									mn1=rs1.getInt(2);
									System.out.println(" dist  "  +mn1);
									
								}
								
								Statement stmt2 = con.createStatement();
								String sql2 = "select * from BS1 where NNodes='nn2'";
								ResultSet rs2 = stmt2.executeQuery(sql2);
								if(rs2.next()==true)
								{
									mn2=rs2.getInt(2);
								}
//								
								Statement stmt3 = con.createStatement();
								String sql3 = "select * from BS1 where NNodes='nn3'";
								ResultSet rs3 = stmt3.executeQuery(sql3);
								if(rs3.next()==true)
								{
									mn3=rs3.getInt(2);
								}
								
								Statement stmt4 = con.createStatement();
								String sql4 = "select * from NN1 where NNodes='nn11'";
								ResultSet rs4 = stmt4.executeQuery(sql4);
								if(rs4.next()==true)
								{
									mn4=rs4.getInt(2);
								}
								
								
								Statement stmt5 = con.createStatement();
								String sql5 = "select * from NN1 where NNodes='nn111'";
								ResultSet rs5 = stmt5.executeQuery(sql5);
								if(rs5.next()==true)
								{
									mn5=rs5.getInt(2);
								}
								
								System.out.println(mn1);
								System.out.println(mn2);
								System.out.println(mn3);
								System.out.println(mn4);
								System.out.println(mn5);
								
								String dtt1=Integer.toString(mn1);
		                        String dtt2=Integer.toString(mn2);
		                        String dtt3=Integer.toString(mn3);
		                        String dtt4=Integer.toString(mn4);
		                        String dtt5=Integer.toString(mn5);
								
								
//							
								
								
								
								//calculating distance
		
								//images starts here
								
		                        Thread.sleep(1000);
								icon1=new ImageIcon(this.getClass().getResource("GreenLBS.png"));
								l1.setIcon(icon1);
								
								int count=0;
								
								
								
								String r1 = "BS1";
								String r2 = "BS2";
								
								if(station.equalsIgnoreCase("BS1"))
								{
									Thread.sleep(2000);
									icon101=new ImageIcon(this.getClass().getResource("newlonggreen1.png"));
									lb6.setIcon(icon101);
									
									Thread.sleep(2000);
									icon2=new ImageIcon(this.getClass().getResource("Greenstation.png"));
									l2.setIcon(icon2);
									
									
									lol1.setText(dtt1);
									lol2.setText(dtt2);
									lol3.setText(dtt3);
									lol4.setText(dtt4);
									lol5.setText(dtt5);
						                 
						        		Statement stmt51 = con.createStatement();
										String sql51 = "select * from BS1 where Station='" + r1+ "' order by Distance asc";
										ResultSet rs51 = stmt51.executeQuery(sql51);
									
								while(rs51.next()==true)     
											
							      {
									count++;
									if(count==1)                //count  1   
									{
									

									String nodename=rs51.getString(1);              
									System.out.println("node name    "+nodename);
									
									if(nodename.equalsIgnoreCase("nn1"))  
									{
										Thread.sleep(2000);
										icon66=new ImageIcon(this.getClass().getResource("greencross1.png"));
										l55.setIcon(icon66);
										
										Thread.sleep(2000);
										icon3=new ImageIcon(this.getClass().getResource("Greennode.png"));
										l7.setIcon(icon3);
											int mn18=0;
											int mn28=0;
											
//											
											Statement stmt10 = con.createStatement();
											String sql10 = "select * from NN1 where NNodes='nn11'";
											ResultSet rs10 = stmt10.executeQuery(sql10);
											if(rs10.next()==true)
											{
												mn18=rs10.getInt(2);
												System.out.println(" dist  "  +mn1);
												
											}
//											
											Statement stmt20 = con.createStatement();
											String sql20 = "select * from NN1 where NNodes='nn111'";
											ResultSet rs20 = stmt20.executeQuery(sql20);
											if(rs20.next()==true)
											{
												mn28=rs20.getInt(2);
											}
											
											
							
											System.out.println(mn1);
											System.out.println(mn2);
											
											if(mn1<mn18 && mn1<mn28)
											{
												//store data here
												Thread.sleep(2000);
												icon66=new ImageIcon(this.getClass().getResource("greencross1.png"));
												l55.setIcon(icon66);
												
												Thread.sleep(2000);
												icon3=new ImageIcon(this.getClass().getResource("Greennode.png"));
												l7.setIcon(icon3);
												
												new File("LBS/BS1/nn1").mkdir();
												
												PrintStream p = new PrintStream(new FileOutputStream("LBS/BS1/nn1/"+fname+".txt"));
												p.print(content);
												
												Statement stmt = con.createStatement();
												String sql = "insert into OwnerFiles values('"+fname+"','BS1','nn1','"+sk+"','"+pk+"','"+mac+"')";
												stmt.executeUpdate(sql);
												
												
												
											}else
//						
											if(mn18<mn28 && mn18<mn1)
											{
												
												Thread.sleep(2000);
												icon44=new ImageIcon(this.getClass().getResource("Greencross3.png"));
												lb2.setIcon(icon44);
												
												
												Thread.sleep(2000);
												icon6=new ImageIcon(this.getClass().getResource("Greennode.png"));
												l11.setIcon(icon6);
												
                                                 new File("LBS/BS1/nn11").mkdir();
												
												PrintStream p = new PrintStream(new FileOutputStream("LBS/BS1/nn11/"+fname+".txt"));
												p.print(content);
												
												Statement stmt = con.createStatement();
												String sql = "insert into OwnerFiles values('"+fname+"','BS1','nn11','"+sk+"','"+pk+"','"+mac+"')";
												stmt.executeUpdate(sql); 
												
												
											
											
											} else
												if(mn28<mn18 && mn28<mn1)
												{
													Thread.sleep(2000);
													icon55=new ImageIcon(this.getClass().getResource("Greencross4.png"));
													lb3.setIcon(icon55);
													
											
													Thread.sleep(2000);
													icon7=new ImageIcon(this.getClass().getResource("Greennode.png"));
													l22.setIcon(icon7);
													
													    new File("LBS/BS1/nn111").mkdir();
														
														PrintStream p = new PrintStream(new FileOutputStream("LBS/BS1/nn111/"+fname+".txt"));
														p.print(content);
														
														Statement stmt = con.createStatement();
														String sql = "insert into OwnerFiles values('"+fname+"','BS1','nn111','"+sk+"','"+pk+"','"+mac+"')";
														stmt.executeUpdate(sql);
													
													
													
												
												}
					
									}
									else if(nodename.equalsIgnoreCase("nn2"))
									{
										
										Thread.sleep(2000);
										icon22=new ImageIcon(this.getClass().getResource("greendown.png"));
										l66.setIcon(icon22);
										
										
										
										Thread.sleep(2000);
										icon4=new ImageIcon(this.getClass().getResource("Greennode.png"));
										l8.setIcon(icon4);
										
										    new File("LBS/BS1/nn2").mkdir();
											
											PrintStream p = new PrintStream(new FileOutputStream("LBS/BS1/nn2/"+fname+".txt"));
											p.print(content);
											
											Statement stmt = con.createStatement();
											String sql = "insert into OwnerFiles values('"+fname+"','BS1','nn2','"+sk+"','"+pk+"','"+mac+"')";
											stmt.executeUpdate(sql);
										
									
										
									
									}
									else if(nodename.equalsIgnoreCase("nn3"))
									{
										
										Thread.sleep(2000);
										icon33=new ImageIcon(this.getClass().getResource("Greencross2.png"));
										l77.setIcon(icon33);
										
										
										Thread.sleep(2000);
										icon5=new ImageIcon(this.getClass().getResource("Greennode.png"));
										l9.setIcon(icon5);
										
										   new File("LBS/BS1/nn3").mkdir();
											
											PrintStream p = new PrintStream(new FileOutputStream("LBS/BS1/nn3/"+fname+".txt"));
											p.print(content);
											
											Statement stmt = con.createStatement();
											String sql = "insert into OwnerFiles values('"+fname+"','BS1','nn3','"+sk+"','"+pk+"','"+mac+"')";
											stmt.executeUpdate(sql);
										
										
							
									}								
											
								}  //count 1 finish
								
								} //while finish
								
								
								Thread.sleep(2500);
								l1.setIcon(ic1);
								l2.setIcon(ic2);
								l3.setIcon(ic3);
								l4.setIcon(ic4);
								l5.setIcon(ic5);
								l6.setIcon(ic6);
								l7.setIcon(ic7);
								l8.setIcon(ic8);
								l9.setIcon(ic9);
								l11.setIcon(ic11);
								l22.setIcon(ic22);
								l33.setIcon(ic33);
								l44.setIcon(ic44);
								l55.setIcon(ic55);
								l66.setIcon(ic66);
								l77.setIcon(ic77);
								l88.setIcon(ic88);
								l99.setIcon(ic99);
								
								lb1.setIcon(icc1);
								lb2.setIcon(icc2);
								lb3.setIcon(icc3);
								lb4.setIcon(icc4);
								lb5.setIcon(icc5);
								
								lb6.setIcon(lab1);
								lb7.setIcon(lab2);
								
								//Number label
								lol1.setText("");
								lol2.setText("");
								lol3.setText("");
								lol4.setText("");
								lol5.setText("");
								lol6.setText("");
								lol7.setText("");
								lol8.setText("");
								lol9.setText("");
								lol10.setText("");
								lol1.setText("");
								
								DataOutputStream dos=new DataOutputStream(ss.getOutputStream());
								dos.writeUTF("success");
								System.out.println("msg send to owner");
									
								}
							       else  
									if(station.equals("BS2"))                                    //Base station 2
									{
										Thread.sleep(2000);
										icon77=new ImageIcon(this.getClass().getResource("newlonggreen2.png"));
										lb7.setIcon(icon77);
										
										
										Thread.sleep(2000);
										icon8=new ImageIcon(this.getClass().getResource("Greenstation.png"));
										l3.setIcon(icon8);
								
										int m1=0;
										int m2=0;
										int m3=0;
										int m4=0;
										int m5=0;
								
										Statement stmt13 = con.createStatement();
										String sql13 = "select * from BS2 where NNodes='nn4'";
										ResultSet rs13 = stmt13.executeQuery(sql13);
										if(rs13.next()==true)
										{
											m1=rs13.getInt(2);
											System.out.println(" dist  "  +m1);
											
										}
										
										Statement stmt23= con.createStatement();
										String sql23 = "select * from BS2 where NNodes='nn5'";
										ResultSet rs23 = stmt23.executeQuery(sql23);
										if(rs23.next()==true)
										{
											m2=rs23.getInt(2);
										}
//										
										Statement stmt33 = con.createStatement();
										String sql33 = "select * from BS2 where NNodes='nn6'";
										ResultSet rs33 = stmt33.executeQuery(sql33);
										if(rs33.next()==true)
										{
											m3=rs33.getInt(2);
										}
										
										Statement stmt43 = con.createStatement();
										String sql43 = "select * from NN2 where NNodes='nn44'";
										ResultSet rs43 = stmt43.executeQuery(sql43);
										if(rs43.next()==true)
										{
											m4=rs43.getInt(2);
										}
										
										
										Statement stmt53 = con.createStatement();
										String sql53 = "select * from NN2 where NNodes='nn444'";
										ResultSet rs53 = stmt53.executeQuery(sql53);
										if(rs53.next()==true)
										{
											m5=rs53.getInt(2);
										}
										
										System.out.println(m1);
										System.out.println(m2);
										System.out.println(m3);
										System.out.println(m4);
										System.out.println(m5);
										
										String dtt11=Integer.toString(m1);
				                        String dtt22=Integer.toString(m2);
				                        String dtt33=Integer.toString(m3);
				                        String dtt44=Integer.toString(m4);
				                        String dtt55=Integer.toString(m5);
										
										lol6.setText(dtt11);
										lol7.setText(dtt22);
										lol8.setText(dtt33);
										lol9.setText(dtt44);
										lol10.setText(dtt55);
										
										
							                 
							        		Statement stmt51 = con.createStatement();
											String sql51 = "select * from BS2 where Station='" + r2+ "' order by Distance asc";
											ResultSet rs51 = stmt51.executeQuery(sql51);
										
									while(rs51.next()==true)     
												
								      {
										count++;
										if(count==1)                //count  1   
										{
										

										String nodename=rs51.getString(1);              
										System.out.println("node name    "+nodename);
										
										if(nodename.equalsIgnoreCase("nn4"))  
										{
											
											Thread.sleep(2000);
											ic888=new ImageIcon(this.getClass().getResource("greencross1.png"));
											l88.setIcon(ic888);
											
											
											Thread.sleep(2000);
											icon9=new ImageIcon(this.getClass().getResource("Greennode.png"));
											l4.setIcon(icon9);
										
											
												int mn18=0;
												int mn28=0;
												
//												
												Statement stmt10 = con.createStatement();
												String sql10 = "select * from NN2 where NNodes='nn44'";
												ResultSet rs10 = stmt10.executeQuery(sql10);
												if(rs10.next()==true)
												{
													mn18=rs10.getInt(2);
													System.out.println(" dist  "  +mn1);
													
												}
//												
												Statement stmt20 = con.createStatement();
												String sql20 = "select * from NN2 where NNodes='nn444'";
												ResultSet rs20 = stmt20.executeQuery(sql20);
												if(rs20.next()==true)
												{
													mn28=rs20.getInt(2);
												}
												
												
								
												System.out.println(mn1);
												System.out.println(mn2);
												
												if(m1<mn18 && m1<mn28)
												{
													//store data here
												
													
													Thread.sleep(2000);
													ic888=new ImageIcon(this.getClass().getResource("greencross1.png"));
													l88.setIcon(ic888);
													
													
													Thread.sleep(2000);
													icon9=new ImageIcon(this.getClass().getResource("Greennode.png"));
													l4.setIcon(icon9);
													
													new File("LBS/BS2/nn4").mkdir();
													
													PrintStream p = new PrintStream(new FileOutputStream("LBS/BS2/nn4/"+fname+".txt"));
													p.print(content);
													
													Statement stmt = con.createStatement();
													String sql = "insert into OwnerFiles values('"+fname+"','BS2','nn4','"+sk+"','"+pk+"','"+mac+"')";
													stmt.executeUpdate(sql);
													
													
													
												}else
//							
												if(mn18<mn28 && mn18<m1)
												{
													
													Thread.sleep(2000);
													icon222=new ImageIcon(this.getClass().getResource("Greencross3.png"));
													lb4.setIcon(icon222);
													
													Thread.sleep(2000);
													icon13=new ImageIcon(this.getClass().getResource("Greennode.png"));
													l33.setIcon(icon13);
													
	                                                 new File("LBS/BS2/nn44").mkdir();
													
													PrintStream p = new PrintStream(new FileOutputStream("LBS/BS2/nn44/"+fname+".txt"));
													p.print(content);
													
													Statement stmt = con.createStatement();
													String sql = "insert into OwnerFiles values('"+fname+"','BS2','nn44','"+sk+"','"+pk+"','"+mac+"')";
													stmt.executeUpdate(sql); 
													
													
													
												
												} else
													if(mn28<mn18 && mn28<m1)
													{
														Thread.sleep(2000);
														icon333=new ImageIcon(this.getClass().getResource("Greencross4.png"));
														lb5.setIcon(icon333);
//														
														   Thread.sleep(2000);
														icon14=new ImageIcon(this.getClass().getResource("Greennode.png"));
														l44.setIcon(icon14);
														
														    new File("LBS/BS2/nn444").mkdir();
															
															PrintStream p = new PrintStream(new FileOutputStream("LBS/BS2/nn444/"+fname+".txt"));
															p.print(content);
															
															Statement stmt = con.createStatement();
															String sql = "insert into OwnerFiles values('"+fname+"','BS1','nn444','"+sk+"','"+pk+"','"+mac+"')";
															stmt.executeUpdate(sql);
														
														
														
													
													}
						
										}
										else if(nodename.equalsIgnoreCase("nn5"))
										{
											
											Thread.sleep(2000);
											icon99=new ImageIcon(this.getClass().getResource("greendown.png"));      
											l99.setIcon(icon99);
											
											
											Thread.sleep(2000);
											icon11=new ImageIcon(this.getClass().getResource("Greennode.png"));
											l5.setIcon(icon11);
											
											    new File("LBS/BS2/nn5").mkdir();
												
												PrintStream p = new PrintStream(new FileOutputStream("LBS/BS2/nn5/"+fname+".txt"));
												p.print(content);
												
												Statement stmt = con.createStatement();
												String sql = "insert into OwnerFiles values('"+fname+"','BS2','nn5','"+sk+"','"+pk+"','"+mac+"')";
												stmt.executeUpdate(sql);
											
											
											
										
										}
										else if(nodename.equalsIgnoreCase("nn6"))
										{
											
											Thread.sleep(2000);
											icon111=new ImageIcon(this.getClass().getResource("Greencross2.png"));    
											lb1.setIcon(icon111);
											
											Thread.sleep(2000);
											icon12=new ImageIcon(this.getClass().getResource("Greennode.png"));
											l6.setIcon(icon12);
											
											   new File("LBS/BS2/nn6").mkdir();
												
												PrintStream p = new PrintStream(new FileOutputStream("LBS/BS2/nn6/"+fname+".txt"));
												p.print(content);
												
												Statement stmt = con.createStatement();
												String sql = "insert into OwnerFiles values('"+fname+"','BS2','nn6','"+sk+"','"+pk+"','"+mac+"')";
												stmt.executeUpdate(sql);
											
											
								
										}								
												
									}  //count 1 finish
									
									} //while finish of BS2
										
									
									Thread.sleep(2500);
									l1.setIcon(ic1);
									l2.setIcon(ic2);
									l3.setIcon(ic3);
									l4.setIcon(ic4);
									l5.setIcon(ic5);
									l6.setIcon(ic6);
									l7.setIcon(ic7);
									l8.setIcon(ic8);
									l9.setIcon(ic9);
									l11.setIcon(ic11);
									l22.setIcon(ic22);
									l33.setIcon(ic33);
									l44.setIcon(ic44);
									l55.setIcon(ic55);
									l66.setIcon(ic66);
									l77.setIcon(ic77);
									l88.setIcon(ic88);
									l99.setIcon(ic99);
									
									lb1.setIcon(icc1);
									lb2.setIcon(icc2);
									lb3.setIcon(icc3);
									lb4.setIcon(icc4);
									lb5.setIcon(icc5);
									
									lb6.setIcon(lab1);
									lb7.setIcon(lab2);
									
									//Number label
									lol1.setText("");
									lol2.setText("");
									lol3.setText("");
									lol4.setText("");
									lol5.setText("");
									lol6.setText("");
									lol7.setText("");
									lol8.setText("");
									lol9.setText("");
									lol10.setText("");
									lol1.setText("");
										
										
									
									DataOutputStream dos=new DataOutputStream(ss.getOutputStream());
									dos.writeUTF("success");
									System.out.println("msg send to owner");
									}
								
							}
							
						} catch (Exception e) {
							
						}
						
						//Clear all images
						
						
						
					}
					
					if(this.port==4007)    //..END USER REQ
					{
						try 
						{
							ServerSocket ss=new ServerSocket(4007);
							while(true)
							{
								Socket sc=ss.accept();
								DataInputStream dis=new DataInputStream(sc.getInputStream());
								
								String user=dis.readUTF();
								String fname=dis.readUTF();
								String sk=dis.readUTF();
								System.out.println("  All data recived from user");
								
								AES enc = new AES();
								
								SimpleDateFormat sdfDate = new SimpleDateFormat(
								"dd/MM/yyyy");
						        SimpleDateFormat sdfTime = new SimpleDateFormat(
								"HH:mm:ss");

						          Date now = new Date();
						          String strDate = sdfDate.format(now);
						          String strTime = sdfTime.format(now);
						          String dt = strDate + "   " + strTime;
								
								
								String r1 = "BS1";
								String r2 = "BS2";
								
								 DBCon db=new DBCon();
					        	 Connection con=db.getConnection();
					        	 
					        	 String data="";
					        	 
					        	 Statement sttt=con.createStatement();
					        	 String sq1 = "select * from Attacker where Attacker='"+user+"'";
					        	 ResultSet rs=sttt.executeQuery(sq1);
					        	 
					        	 System.out.println("Query Checked");
					        	 if(rs.next()==true)
					        	 {
					        		    Thread.sleep(2000);
					        		    icon1=new ImageIcon(this.getClass().getResource("GreenLBS.png"));
										l1.setIcon(icon1);
					        		 
					        		  Thread.sleep(2000);
					        		  lb=new ImageIcon(this.getClass().getResource("RedLBS.png"));
					  				  l1.setIcon(lb);
					        		 
					        		 DataOutputStream dos=new DataOutputStream(sc.getOutputStream());
					        		 dos.writeUTF("attcker");
					        		 dos.writeUTF("attcker");
					        		 System.out.println("attacker msg send to user");
					        		 
					        	 }else
					        		 
					        	    {
					        		 
					    
					        		Statement stmt51 = con.createStatement();
									String sql51 = "select * from BS1 where Station='" + r1+ "' order by Distance asc";
									ResultSet rs51 = stmt51.executeQuery(sql51);
					        	 
									int count=0;
					        	 
									while(rs51.next()==true)             
									{   
										
										
										Thread.sleep(2000);
										icon1=new ImageIcon(this.getClass().getResource("GreenLBS.png"));
										l1.setIcon(icon1);
										
										Thread.sleep(2000);
										icon101=new ImageIcon(this.getClass().getResource("newlonggreen1.png"));
										lb6.setIcon(icon101);
										
										Thread.sleep(2000);
										icon2=new ImageIcon(this.getClass().getResource("Greenstation.png"));
										l2.setIcon(icon2);
										
										int mn11=0;
										int mn22=0;
										int mn33=0;
										int mn44=0;
										int mn55=0;
										
//										 
							        	 
										Statement stmt15 = con.createStatement();
										String sql100 = "select * from BS1 where NNodes='nn1'";
										ResultSet rs15 = stmt15.executeQuery(sql100);
										if(rs15.next()==true)
										{
											mn11=rs15.getInt(2);
											System.out.println(" dist  "  +mn11);
											
										}
										
										Statement stmt25 = con.createStatement();
										String sql200 = "select * from BS1 where NNodes='nn2'";
										ResultSet rs25 = stmt25.executeQuery(sql200);
										if(rs25.next()==true)
										{
											mn22=rs25.getInt(2);
										}
										
										Statement stmt35 = con.createStatement();
										String sql300 = "select * from BS1 where NNodes='nn3'";
										ResultSet rs35 = stmt35.executeQuery(sql300);
										if(rs35.next()==true)
										{
											mn33=rs35.getInt(2);
										}
										
										Statement stmt45 = con.createStatement();
										String sql4 = "select * from NN1 where NNodes='nn11'";
										ResultSet rs45 = stmt45.executeQuery(sql4);
										if(rs45.next()==true)
										{
											mn44=rs45.getInt(2);
										}
										
										
										Statement stmt55 = con.createStatement();
										String sql5 = "select * from NN1 where NNodes='nn111'";
										ResultSet rs55 = stmt55.executeQuery(sql5);
										if(rs55.next()==true)
										{
											mn55=rs55.getInt(2);
										}
										
										System.out.println(mn11);
										System.out.println(mn22);
										System.out.println(mn33);
										System.out.println(mn44);
										System.out.println(mn55);
										
										String dtt1=Integer.toString(mn11);
				                        String dtt2=Integer.toString(mn22);
				                        String dtt3=Integer.toString(mn33);
				                        String dtt4=Integer.toString(mn44);
				                        String dtt5=Integer.toString(mn55);
										
										lol1.setText(dtt1);
										lol2.setText(dtt2);
										lol3.setText(dtt3);
										lol4.setText(dtt4);
										lol5.setText(dtt5);
//										
										
										
										count++;
										if(count==1)                //count  1   
										{
											String nodename=rs51.getString(1);              
											System.out.println("node name    "+nodename);         
											
											if(nodename.equalsIgnoreCase("nn1"))  
											{
												
												Thread.sleep(2000);
												icon66=new ImageIcon(this.getClass().getResource("greencross1.png"));
												l55.setIcon(icon66);
												
												Thread.sleep(2000);
												icon3=new ImageIcon(this.getClass().getResource("Greennode.png"));
												l7.setIcon(icon3);
												
												
												Statement stmt01 = con.createStatement();
												String sql01 = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn1'";
												ResultSet rs01 = stmt01.executeQuery(sql01);
								        		if(rs01.next()==true)
												  {
													
													
													FileInputStream fin = new FileInputStream("LBS/BS1/nn1/"+fname+".txt");
													byte[] b = new byte[fin.available()];
													fin.read(b);
													String cont = new String(b);
													
													data=enc.decrypt(cont, keyWord);
												
												Statement st=con.createStatement();
												String sql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn1','"+dt+"','Found')";
												st.executeUpdate(sql);
												System.out.println("status inserted");
												
												lk.setVisible(true);
												Thread.sleep(900);
												lk.setVisible(false);
												Thread.sleep(900);
												lk.setVisible(true);
												
												
													
													DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
													dout.writeUTF("success");
													dout.writeUTF(data);
													
												 break;	
													
												}
												else 
													if(rs01.next()==false)   //else of node 1
												   {
									
														Statement st90=con.createStatement();
														String sql8="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn1','"+dt+"','Not Found')";
														st90.executeUpdate(sql8);
														System.out.println("status inserted");
														
													
														Thread.sleep(2000);
														con1=new ImageIcon(this.getClass().getResource("Rednode.png"));
														l7.setIcon(con1);
														
														Thread.sleep(2000);
														con2=new ImageIcon(this.getClass().getResource("Redcross1.png"));
														l55.setIcon(con2);
													
//													
													int mn1=0;
													int mn2=0;
//													
													Statement stmt1 = con.createStatement();
													String sql1 = "select * from NN1 where NNodes='nn11'";
													ResultSet rs1 = stmt1.executeQuery(sql1);
													if(rs1.next()==true)
													{
														mn1=rs1.getInt(2);
														System.out.println(" dist  "  +mn1);
														
													}
//													
													Statement stmt2 = con.createStatement();
													String sql2 = "select * from NN1 where NNodes='nn111'";
													ResultSet rs2 = stmt2.executeQuery(sql2);
													if(rs2.next()==true)
													{
														mn2=rs2.getInt(2);
													}
													
													System.out.println(mn1);
													System.out.println(mn2);
//													
//													
													if(mn1<mn2)
													{
														
														Thread.sleep(2000);
														icon44=new ImageIcon(this.getClass().getResource("Greencross3.png"));
														lb2.setIcon(icon44);
														
														
														Thread.sleep(2000);
														icon6=new ImageIcon(this.getClass().getResource("Greennode.png"));
														l11.setIcon(icon6);
														
							
														Statement stm1 = con.createStatement();
														String sql = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn11'";
														ResultSet rss1 = stm1.executeQuery(sql);
														if(rss1.next()==true)
														{
															
															
															FileInputStream fin = new FileInputStream("LBS/BS1/nn11/"+fname+".txt");
															byte[] b = new byte[fin.available()];
															fin.read(b);
															String cont = new String(b);
															
															data=enc.decrypt(cont, keyWord);
														
															Statement st=con.createStatement();
															String sqll="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn11','"+dt+"','Found')";
															st.executeUpdate(sqll);
															System.out.println("status inserted");
															
										
															lk.setVisible(true);
															Thread.sleep(900);
															lk.setVisible(false);
															Thread.sleep(900);
															lk.setVisible(true);
															
															//lines for n1
															Thread.sleep(2000);
															icon3=new ImageIcon(this.getClass().getResource("Greennode.png"));
															l7.setIcon(icon3);
															
															Thread.sleep(2000);
															icon66=new ImageIcon(this.getClass().getResource("greencross1.png"));
															l55.setIcon(icon66);
															
															DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
															dout.writeUTF("success");
															dout.writeUTF(data);
															 break;	
															
														}
														else 
															if(rss1.next()==false)  //else of nn1 
														    {
															//no file
															
																Statement stee=con.createStatement();
																String sqlle="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn11','"+dt+"','Not Found')";
																stee.executeUpdate(sqlle);
																System.out.println("status inserted");
																
															
	
																Thread.sleep(2000);
																con3=new ImageIcon(this.getClass().getResource("Rednode.png"));
																l11.setIcon(con3);
																
																Thread.sleep(2000);
																con4=new ImageIcon(this.getClass().getResource("Redcross3.png"));
																lb2.setIcon(con4);
														
															
															Thread.sleep(2000);
															icon55=new ImageIcon(this.getClass().getResource("Greencross4.png"));
															lb3.setIcon(icon55);
															
													
															Thread.sleep(2000);
															icon7=new ImageIcon(this.getClass().getResource("Greennode.png"));
															l22.setIcon(icon7);
															
															
															Statement st = con.createStatement();
															String sqq = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn111'";
															ResultSet rss = st.executeQuery(sqq);
															if(rss.next()==true)
															{
																
																
																FileInputStream fin = new FileInputStream("LBS/BS1/nn111/"+fname+".txt");
																byte[] b = new byte[fin.available()];
																fin.read(b);
																String cont = new String(b);
																
																data=enc.decrypt(cont, keyWord);
															
																Statement stt=con.createStatement();
																String sqll="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','n111','"+dt+"','Found')";
																stt.executeUpdate(sqll);
																System.out.println("status inserted");
																
																
																

																lk.setVisible(true);
																Thread.sleep(900);
																lk.setVisible(false);
																Thread.sleep(900);
																lk.setVisible(true);
																
																//lines for n1
																Thread.sleep(2000);
																icon3=new ImageIcon(this.getClass().getResource("Greennode.png"));
																l7.setIcon(icon3);
																
																Thread.sleep(2000);
																icon66=new ImageIcon(this.getClass().getResource("greencross1.png"));
																l55.setIcon(icon66);
																
																DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
																dout.writeUTF("success");
																dout.writeUTF(data);
																
															     break;	
																
															}
															else if(rss.next()==false)
															{
																//no files
																
																Statement stt=con.createStatement();
																String sqll="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','n111','"+dt+"','Not Found')";
																stt.executeUpdate(sqll);
																System.out.println("status inserted");
																
								
																Thread.sleep(2000);
																con5=new ImageIcon(this.getClass().getResource("Rednode.png"));
																l22.setIcon(con5);
																
																Thread.sleep(2000);
																con6=new ImageIcon(this.getClass().getResource("Redcross4.png"));
																lb3.setIcon(con6);
																
															
																
															}
														}
										
													} 
														if(mn2<mn1)
														{
															Thread.sleep(2000);
															icon55=new ImageIcon(this.getClass().getResource("Greencross4.png"));
															lb3.setIcon(icon55);
															
													
															Thread.sleep(2000);
															icon7=new ImageIcon(this.getClass().getResource("Greennode.png"));
															l22.setIcon(icon7);
															
															
															Statement st = con.createStatement();
															String sqq = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn111'";
															ResultSet rss = st.executeQuery(sqq);
															if(rss.next()==true)
															{
																
																
																FileInputStream fin = new FileInputStream("LBS/BS1/nn111/"+fname+".txt");
																byte[] b = new byte[fin.available()];
																fin.read(b);
																String cont = new String(b);
																
																data=enc.decrypt(cont, keyWord);
															
																Statement sto=con.createStatement();
																String sqlo="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn111','"+dt+"','Found')";
																sto.executeUpdate(sqlo);
																System.out.println("status inserted");
																
																lk.setVisible(true);
																Thread.sleep(900);
																lk.setVisible(false);
																Thread.sleep(900);
																lk.setVisible(true);
																
																//lines for n1
																Thread.sleep(2000);
																icon3=new ImageIcon(this.getClass().getResource("Greennode.png"));
																l7.setIcon(icon3);
																
																Thread.sleep(2000);
																icon66=new ImageIcon(this.getClass().getResource("greencross1.png"));
																l55.setIcon(icon66);
																
																DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
																dout.writeUTF("success");
																dout.writeUTF(data);
																
															     break;	
																
															}
															else if(rss.next()==false)
															{
																//no files
																Statement sto=con.createStatement();
																String sqlo="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn111','"+dt+"','Not Found')";
																sto.executeUpdate(sqlo);
																System.out.println("status inserted");
																
																
																Thread.sleep(2000);
																con5=new ImageIcon(this.getClass().getResource("Rednode.png"));
																l22.setIcon(con5);
																
																Thread.sleep(2000);
																con6=new ImageIcon(this.getClass().getResource("Redcross4.png"));
																lb3.setIcon(con6);
																
														
																Thread.sleep(2000);
																icon44=new ImageIcon(this.getClass().getResource("Greencross3.png"));
																lb2.setIcon(icon44);
																
																
																Thread.sleep(2000);
																icon6=new ImageIcon(this.getClass().getResource("Greennode.png"));
																l11.setIcon(icon6);
																
									
																Statement stm1 = con.createStatement();
																String sql = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn11'";
																ResultSet rss1 = stm1.executeQuery(sql);
																if(rss1.next()==true)
																{
																	
																	
																	FileInputStream fin = new FileInputStream("LBS/BS1/nn11/"+fname+".txt");
																	byte[] b = new byte[fin.available()];
																	fin.read(b);
																	String cont = new String(b);
																	
																	data=enc.decrypt(cont, keyWord);
																
																	Statement stp=con.createStatement();
																	String sqlp="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn11','"+dt+"','Found')";
																	stp.executeUpdate(sqlp);
																	System.out.println("status inserted");
																	
																	lk.setVisible(true);
																	Thread.sleep(900);
																	lk.setVisible(false);
																	Thread.sleep(900);
																	lk.setVisible(true);
																	
																	//lines for n1
																	Thread.sleep(2000);
																	icon3=new ImageIcon(this.getClass().getResource("Greennode.png"));
																	l7.setIcon(icon3);
																	
																	Thread.sleep(2000);
																	icon66=new ImageIcon(this.getClass().getResource("greencross1.png"));
																	l55.setIcon(icon66);
																	
																	DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
																	dout.writeUTF("success");
																	dout.writeUTF(data);
																	 break;	
																	
																}else 
																{
																   //not found	
																	Statement stp=con.createStatement();
																	String sqlp="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn11','"+dt+"','Not Found')";
																	stp.executeUpdate(sqlp);
																	System.out.println("status inserted");
																	
																	
																	Thread.sleep(2000);
																	con3=new ImageIcon(this.getClass().getResource("Rednode.png"));
																	l11.setIcon(con3);
																	
																	Thread.sleep(2000);
																	con4=new ImageIcon(this.getClass().getResource("Redcross3.png"));
																	lb2.setIcon(con4);
																	
																	
																}
																
																
															}
															
															
															
														
															
														}
													
												}
												
											
											
												
												
											}
											else if(nodename.equalsIgnoreCase("nn2"))
											{
												
												Thread.sleep(2000);
												icon22=new ImageIcon(this.getClass().getResource("greendown.png"));
												l66.setIcon(icon22);
												
												
												
												Thread.sleep(2000);
												icon4=new ImageIcon(this.getClass().getResource("Greennode.png"));
												l8.setIcon(icon4);
												
												Statement stmt01 = con.createStatement();
												String sql01 = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn2'";
												ResultSet rs01 = stmt01.executeQuery(sql01);
												if(rs01.next()==true)
												{
													
													
													FileInputStream fin = new FileInputStream("LBS/BS1/nn2/"+fname+".txt");
													byte[] b = new byte[fin.available()];
													fin.read(b);
													String cont = new String(b);
													
													data=enc.decrypt(cont, keyWord);
												
													Statement st=con.createStatement();
													String sql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn2','"+dt+"','Found')";
													st.executeUpdate(sql);
													System.out.println("status inserted");
													
													lk.setVisible(true);
													Thread.sleep(900);
													lk.setVisible(false);
													Thread.sleep(900);
													lk.setVisible(true);
													
													DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
													dout.writeUTF("success");
													dout.writeUTF(data);
													 break;	
													
												}
												else if(rs01.next()==false)
												{
												       //no file
													
													Statement st=con.createStatement();
													String sql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn2','"+dt+"','Not Found')";
													st.executeUpdate(sql);
													System.out.println("status inserted");
													
									
													Thread.sleep(2000);
													con7=new ImageIcon(this.getClass().getResource("Rednode.png"));
													l8.setIcon(con7);
													
													Thread.sleep(2000);
													con8=new ImageIcon(this.getClass().getResource("Reddown.png"));
													l66.setIcon(con8);
												}
											}
											else if(nodename.equalsIgnoreCase("nn3"))
											{
												
												Thread.sleep(2000);
												icon33=new ImageIcon(this.getClass().getResource("Greencross2.png"));
												l77.setIcon(icon33);
												
												
												Thread.sleep(2000);
												icon5=new ImageIcon(this.getClass().getResource("Greennode.png"));
												l9.setIcon(icon5);
												
												Statement stmt01 = con.createStatement();
												String sql01 = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn3'";
												ResultSet rs01 = stmt01.executeQuery(sql01);
												if(rs01.next()==true)
												{
													
													
													FileInputStream fin = new FileInputStream("LBS/BS1/nn3/"+fname+".txt");
													byte[] b = new byte[fin.available()];
													fin.read(b);
													String cont = new String(b);
													
													data=enc.decrypt(cont, keyWord);
												
													Statement st=con.createStatement();
													String sql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn3','"+dt+"','Found')";
													st.executeUpdate(sql);
													System.out.println("status inserted");
													
													lk.setVisible(true);
													Thread.sleep(900);
													lk.setVisible(false);
													Thread.sleep(900);
													lk.setVisible(true);
													
													DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
													dout.writeUTF("success");
													dout.writeUTF(data);
													 break;	
													
												}
												else if(rs01.next()==false)
												{
													
													//no file
													
													Statement st=con.createStatement();
													String sql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn3','"+dt+"','Not Found')";
													st.executeUpdate(sql);
													System.out.println("status inserted");
													
				
													Thread.sleep(2000);
													con9=new ImageIcon(this.getClass().getResource("Rednode.png"));
													l9.setIcon(con9);
													
													Thread.sleep(2000);
													con11=new ImageIcon(this.getClass().getResource("Redcross2.png"));
													l77.setIcon(con11);
													
													
												}
											}								
													
											
										}else
										
										if(count==2)                         //count    2
										{
											

											String nodename=rs51.getString(1);
											System.out.println("node name    "+nodename);
											
											if(nodename.equalsIgnoreCase("nn1"))
											{
												Thread.sleep(2000);
												icon66=new ImageIcon(this.getClass().getResource("greencross1.png"));
												l55.setIcon(icon66);
												
												Thread.sleep(2000);
												icon3=new ImageIcon(this.getClass().getResource("Greennode.png"));
												l7.setIcon(icon3);
												
												
												Statement stmt01 = con.createStatement();
												String sql01 = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn1'";
												ResultSet rs01 = stmt01.executeQuery(sql01);
								        		if(rs01.next()==true)
												  {
													
													
													FileInputStream fin = new FileInputStream("LBS/BS1/nn1/"+fname+".txt");
													byte[] b = new byte[fin.available()];
													fin.read(b);
													String cont = new String(b);
													
													data=enc.decrypt(cont, keyWord);
												
													Statement st=con.createStatement();
													String sql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn1','"+dt+"','Found')";
													st.executeUpdate(sql);
													System.out.println("status inserted");
													
													lk.setVisible(true);
													Thread.sleep(900);
													lk.setVisible(false);
													Thread.sleep(900);
													lk.setVisible(true);
													
													DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
													dout.writeUTF("success");
													dout.writeUTF(data);
													
												 break;	
													
												}
												else if(rs01.next()==false)
												{
													//no file

													Statement stg=con.createStatement();
													String sqlg="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn1','"+dt+"','Not Found')";
													stg.executeUpdate(sqlg);
													System.out.println("status inserted");
													
													Thread.sleep(2000);
													con1=new ImageIcon(this.getClass().getResource("Rednode.png"));
													l7.setIcon(con1);
													
													Thread.sleep(2000);
													con2=new ImageIcon(this.getClass().getResource("Redcross1.png"));
													l55.setIcon(con2);
													
													
													
													int mn1=0;
													int mn2=0;
													
													Statement stmt1 = con.createStatement();
													String sql1 = "select * from NN1 where NNodes='nn11'";
													ResultSet rs1 = stmt1.executeQuery(sql1);
													if(rs1.next()==true)
													{
														mn1=rs1.getInt(2);
														System.out.println(" dist  "  +mn1);
														
													}
													
													Statement stmt2 = con.createStatement();
													String sql2 = "select * from NN1 where NNodes='nn111'";
													ResultSet rs2 = stmt2.executeQuery(sql2);
													if(rs2.next()==true)
													{
														mn2=rs2.getInt(2);
													}
													
													System.out.println(mn1);
													System.out.println(mn2);
													
													
													if(mn1<mn2)
													{
														
														Thread.sleep(2000);
														icon44=new ImageIcon(this.getClass().getResource("Greencross3.png"));
														lb2.setIcon(icon44);
														
														
														Thread.sleep(2000);
														icon6=new ImageIcon(this.getClass().getResource("Greennode.png"));
														l11.setIcon(icon6);
														
							
														Statement stm1 = con.createStatement();
														String sql = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn11'";
														ResultSet rss1 = stm1.executeQuery(sql);
														if(rss1.next()==true)
														{
															
															
															FileInputStream fin = new FileInputStream("LBS/BS1/nn11/"+fname+".txt");
															byte[] b = new byte[fin.available()];
															fin.read(b);
															String cont = new String(b);
															
															data=enc.decrypt(cont, keyWord);
														
															Statement st=con.createStatement();
															String sqlb="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn11','"+dt+"','Found')";
															st.executeUpdate(sqlb);
															System.out.println("status inserted");
															
											
															lk.setVisible(true);
															Thread.sleep(900);
															lk.setVisible(false);
															Thread.sleep(900);
															lk.setVisible(true);
															
															
															//lines for n1
															Thread.sleep(2000);
															icon3=new ImageIcon(this.getClass().getResource("Greennode.png"));
															l7.setIcon(icon3);
															
															Thread.sleep(2000);
															icon66=new ImageIcon(this.getClass().getResource("greencross1.png"));
															l55.setIcon(icon66);
															
															DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
															dout.writeUTF("success");
															dout.writeUTF(data);
															 break;	
															
														}
														else if(rss1.next()==false)
														{
															//no file

															Statement st2=con.createStatement();
															String sqlb="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn11','"+dt+"','Not Found')";
															st2.executeUpdate(sqlb);
															System.out.println("status inserted");
															
															
															Thread.sleep(2000);
															con3=new ImageIcon(this.getClass().getResource("Rednode.png"));
															l11.setIcon(con3);
															
															Thread.sleep(2000);
															con4=new ImageIcon(this.getClass().getResource("Redcross3.png"));
															lb2.setIcon(con4);
														
															
															Thread.sleep(2000);
															icon55=new ImageIcon(this.getClass().getResource("Greencross4.png"));
															lb3.setIcon(icon55);
															
													
															Thread.sleep(2000);
															icon7=new ImageIcon(this.getClass().getResource("Greennode.png"));
															l22.setIcon(icon7);
															
															
															Statement st = con.createStatement();
															String sqq = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn111'";
															ResultSet rss = st.executeQuery(sqq);
															if(rss.next()==true)
															{
																
																
																FileInputStream fin = new FileInputStream("LBS/BS1/nn111/"+fname+".txt");
																byte[] b = new byte[fin.available()];
																fin.read(b);
																String cont = new String(b);
																data=enc.decrypt(cont, keyWord);
															
																Statement str=con.createStatement();
																String sqlr="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn111','"+dt+"','Found')";
																str.executeUpdate(sqlr);
																System.out.println("status inserted");
																
																
																lk.setVisible(true);
																Thread.sleep(900);
																lk.setVisible(false);
																Thread.sleep(900);
																lk.setVisible(true);
																
																//lines for n1
																Thread.sleep(2000);
																icon3=new ImageIcon(this.getClass().getResource("Greennode.png"));
																l7.setIcon(icon3);
																
																Thread.sleep(2000);
																icon66=new ImageIcon(this.getClass().getResource("greencross1.png"));
																l55.setIcon(icon66);
																
																DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
																dout.writeUTF("success");
																dout.writeUTF(data);
																
															     break;	
																
															}
															else if(rss.next()==false)
															{
																//no files
																
																Statement str=con.createStatement();
																String sqlr="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn111','"+dt+"','Not Found')";
																str.executeUpdate(sqlr);
																System.out.println("status inserted");
																
																
																Thread.sleep(2000);
																con5=new ImageIcon(this.getClass().getResource("Rednode.png"));
																l22.setIcon(con5);
																
																Thread.sleep(2000);
																con6=new ImageIcon(this.getClass().getResource("Redcross4.png"));
																lb3.setIcon(con6);
																
															}
														
															
															
															
															
														}
										
													} 
														if(mn2<mn1)
														{
															Thread.sleep(2000);
															icon55=new ImageIcon(this.getClass().getResource("Greencross4.png"));
															lb3.setIcon(icon55);
															
													
															Thread.sleep(2000);
															icon7=new ImageIcon(this.getClass().getResource("Greennode.png"));
															l22.setIcon(icon7);
															
															
															Statement st = con.createStatement();
															String sqq = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn111'";
															ResultSet rss = st.executeQuery(sqq);
															if(rss.next()==true)
															{
																
																
																FileInputStream fin = new FileInputStream("LBS/BS1/nn111/"+fname+".txt");
																byte[] b = new byte[fin.available()];
																fin.read(b);
																String cont = new String(b);
																data=enc.decrypt(cont, keyWord);
															
																Statement sst=con.createStatement();
																String ssql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1',''nn111,'"+dt+"','Found')";
																sst.executeUpdate(ssql);
																System.out.println("status inserted");
																
																
																
																lk.setVisible(true);
																Thread.sleep(900);
																lk.setVisible(false);
																Thread.sleep(900);
																lk.setVisible(true);
																
																//lines for n1
																Thread.sleep(2000);
																icon3=new ImageIcon(this.getClass().getResource("Greennode.png"));
																l7.setIcon(icon3);
																
																Thread.sleep(2000);
																icon66=new ImageIcon(this.getClass().getResource("greencross1.png"));
																l55.setIcon(icon66);
																
																DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
																dout.writeUTF("success");
																dout.writeUTF(data);
																
															     break;	
																
															}
															else if(rs01.next()==false)
															{
																//no files
																
																Statement sst=con.createStatement();
																String ssql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1',''nn111,'"+dt+"','Not Found')";
																sst.executeUpdate(ssql);
																System.out.println("status inserted"); 
															
																Thread.sleep(2000);
																con5=new ImageIcon(this.getClass().getResource("Rednode.png"));
																l22.setIcon(con5);
																
																Thread.sleep(2000);
																con6=new ImageIcon(this.getClass().getResource("Redcross4.png"));
																lb3.setIcon(con6);
																
																
																Thread.sleep(2000);
																icon44=new ImageIcon(this.getClass().getResource("Greencross3.png"));
																lb2.setIcon(icon44);
																
																
																Thread.sleep(2000);
																icon6=new ImageIcon(this.getClass().getResource("Greennode.png"));
																l11.setIcon(icon6);
																
									
																Statement stm1 = con.createStatement();
																String sql = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn11'";
																ResultSet rss1 = stm1.executeQuery(sql);
																if(rss1.next()==true)
																{
																	
																	
																	FileInputStream fin = new FileInputStream("LBS/BS1/nn11/"+fname+".txt");
																	byte[] b = new byte[fin.available()];
																	fin.read(b);
																	String cont = new String(b);
																	
																	data=enc.decrypt(cont, keyWord);
																
																	Statement srt=con.createStatement();
																	String sqlr="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn11','"+dt+"','Found')";
																	srt.executeUpdate(sqlr);
																	System.out.println("status inserted");
																	
																	lk.setVisible(true);
																	Thread.sleep(900);
																	lk.setVisible(false);
																	Thread.sleep(900);
																	lk.setVisible(true);
																	
																	//lines for n1
																	Thread.sleep(2000);
																	icon3=new ImageIcon(this.getClass().getResource("Greennode.png"));
																	l7.setIcon(icon3);
																	
																	Thread.sleep(2000);
																	icon66=new ImageIcon(this.getClass().getResource("greencross1.png"));
																	l55.setIcon(icon66);
																	
																	DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
																	dout.writeUTF("success");
																	dout.writeUTF(data);
																	 break;	
																	
																}else 
																{
																   //not found	
																	
																	Statement srt=con.createStatement();
																	String sqlr="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn11','"+dt+"','Not Found')";
																	srt.executeUpdate(sqlr);
																	System.out.println("status inserted");
																	
																	Thread.sleep(2000);
																	con3=new ImageIcon(this.getClass().getResource("Rednode.png"));
																	l11.setIcon(con3);
																	
																	Thread.sleep(2000);
																	con4=new ImageIcon(this.getClass().getResource("Redcross3.png"));
																	lb2.setIcon(con4);
																	
																	
																}
																
																
															
																
															}
															
															
															
														
															
														}
													
												
													
												}
												
											
											
												
												
											}
											else if(nodename.equalsIgnoreCase("nn2"))
											{
												
												Thread.sleep(2000);
												icon22=new ImageIcon(this.getClass().getResource("greendown.png"));
												l66.setIcon(icon22);
												
												
												
												Thread.sleep(2000);
												icon4=new ImageIcon(this.getClass().getResource("Greennode.png"));
												l8.setIcon(icon4);
												
												Statement stmt01 = con.createStatement();
												String sql01 = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn2'";
												ResultSet rs01 = stmt01.executeQuery(sql01);
												if(rs01.next()==true)
												{
													
													
													FileInputStream fin = new FileInputStream("LBS/BS1/nn2/"+fname+".txt");
													byte[] b = new byte[fin.available()];
													fin.read(b);
													String cont = new String(b);
													data=enc.decrypt(cont, keyWord);
												
													Statement st=con.createStatement();
													String sql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn2','"+dt+"','Found')";
													st.executeUpdate(sql);
													System.out.println("status inserted");
													
													lk.setVisible(true);
													Thread.sleep(900);
													lk.setVisible(false);
													Thread.sleep(900);
													lk.setVisible(true);
													
													DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
													dout.writeUTF("success");
													dout.writeUTF(data);
													 break;	
													
												}
												else if(rs01.next()==false)
												{
												       //no file
													

													Statement st=con.createStatement();
													String sql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn2','"+dt+"','Not Found')";
													st.executeUpdate(sql);
													System.out.println("status inserted");
													
													Thread.sleep(2000);
													con7=new ImageIcon(this.getClass().getResource("Rednode.png"));
													l8.setIcon(con7);
													
													Thread.sleep(2000);
													con8=new ImageIcon(this.getClass().getResource("Reddown.png"));
													l66.setIcon(con8);
													
												}
											}
											else if(nodename.equalsIgnoreCase("nn3"))
											{
												Thread.sleep(2000);
												icon33=new ImageIcon(this.getClass().getResource("Greencross2.png"));
												l77.setIcon(icon33);
												
												
												Thread.sleep(2000);
												icon5=new ImageIcon(this.getClass().getResource("Greennode.png"));
												l9.setIcon(icon5);
												
												
												Statement stmt01 = con.createStatement();
												String sql01 = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn3'";
												ResultSet rs01 = stmt01.executeQuery(sql01);
												if(rs01.next()==true)
												{
													
													
													FileInputStream fin = new FileInputStream("LBS/BS1/nn3/"+fname+".txt");
													byte[] b = new byte[fin.available()];
													fin.read(b);
													String cont = new String(b);
													
													data=enc.decrypt(cont, keyWord);
												
													Statement st=con.createStatement();
													String sql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn3','"+dt+"','Found')";
													st.executeUpdate(sql);
													System.out.println("status inserted");
													
													lk.setVisible(true);
													Thread.sleep(900);
													lk.setVisible(false);
													Thread.sleep(900);
													lk.setVisible(true);
													
													DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
													dout.writeUTF("success");
													dout.writeUTF(data);
													 break;	
													
												}
												else if(rs01.next()==false)
												{
													
													//no file
													
													Statement st=con.createStatement();
													String sql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn3','"+dt+"','Not Found')";
													st.executeUpdate(sql);
													System.out.println("status inserted");
													
													Thread.sleep(2000);
													con9=new ImageIcon(this.getClass().getResource("Rednode.png"));
													l9.setIcon(con9);
													
													Thread.sleep(2000);
													con11=new ImageIcon(this.getClass().getResource("Redcross2.png"));
													l77.setIcon(con11);
													
												
												}
												
												
												
												
												
											}

										}else 
											if(count==3)              //count  3
											{
								
												
												String nodename=rs51.getString(1);
												System.out.println("node name    "+nodename);
												
												if(nodename.equalsIgnoreCase("nn1"))
												{
													
													Thread.sleep(2000);
													icon66=new ImageIcon(this.getClass().getResource("greencross1.png"));
													l55.setIcon(icon66);
													
													Thread.sleep(2000);
													icon3=new ImageIcon(this.getClass().getResource("Greennode.png"));
													l7.setIcon(icon3);
													
													
													Statement stmt01 = con.createStatement();
													String sql01 = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn1'";
													ResultSet rs01 = stmt01.executeQuery(sql01);
									        		if(rs01.next()==true)
													  {
														
														
														FileInputStream fin = new FileInputStream("LBS/BS1/nn1/"+fname+".txt");
														byte[] b = new byte[fin.available()];
														fin.read(b);
														String cont = new String(b);
														
														data=enc.decrypt(cont, keyWord);
													
														Statement st=con.createStatement();
														String sql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn1','"+dt+"','Found')";
														st.executeUpdate(sql);
														System.out.println("status inserted");
														
														lk.setVisible(true);
														Thread.sleep(900);
														lk.setVisible(false);
														Thread.sleep(900);
														lk.setVisible(true);
														
														DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
														dout.writeUTF("success");
														dout.writeUTF(data);
														
													 break;	
														
													}
													else if(rs01.next()==false)
													{
														//no file
														
														Statement st5=con.createStatement();
														String sql511="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn1','"+dt+"','Not Found')";
														st5.executeUpdate(sql511);
														System.out.println("status inserted");
														
														
														Thread.sleep(2000);
														con1=new ImageIcon(this.getClass().getResource("Rednode.png"));
														l7.setIcon(con1);
														
														Thread.sleep(2000);
														con2=new ImageIcon(this.getClass().getResource("Redcross1.png"));
														l55.setIcon(con2);
														
														//no file
														
														int mn1=0;
														int mn2=0;
														
														Statement stmt1 = con.createStatement();
														String sql1 = "select * from NN1 where NNodes='nn11'";
														ResultSet rs1 = stmt1.executeQuery(sql1);
														if(rs1.next()==true)
														{
															mn1=rs1.getInt(2);
															System.out.println(" dist  "  +mn1);
															
														}
														
														Statement stmt2 = con.createStatement();
														String sql2 = "select * from NN1 where NNodes='nn111'";
														ResultSet rs2 = stmt2.executeQuery(sql2);
														if(rs2.next()==true)
														{
															mn2=rs2.getInt(2);
														}
														
														System.out.println(mn1);
														System.out.println(mn2);
														
														
														if(mn1<mn2)
														{
															
															Thread.sleep(2000);
															icon44=new ImageIcon(this.getClass().getResource("Greencross3.png"));
															lb2.setIcon(icon44);
															
															
															Thread.sleep(2000);
															icon6=new ImageIcon(this.getClass().getResource("Greennode.png"));
															l11.setIcon(icon6);
															
								
															Statement stm1 = con.createStatement();
															String sql = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn11'";
															ResultSet rss1 = stm1.executeQuery(sql);
															if(rss1.next()==true)
															{
																
																
																FileInputStream fin = new FileInputStream("LBS/BS1/nn11/"+fname+".txt");
																byte[] b = new byte[fin.available()];
																fin.read(b);
																String cont = new String(b);
																
																data=enc.decrypt(cont, keyWord);
															
																Statement stn=con.createStatement();
																String sqln="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn11','"+dt+"','Found')";
																stn.executeUpdate(sqln);
																System.out.println("status inserted");
																
																
																
																lk.setVisible(true);
																Thread.sleep(900);
																lk.setVisible(false);
																Thread.sleep(900);
																lk.setVisible(true);
																
																//lines for n1
																Thread.sleep(2000);
																icon3=new ImageIcon(this.getClass().getResource("Greennode.png"));
																l7.setIcon(icon3);
																
																Thread.sleep(2000);
																icon66=new ImageIcon(this.getClass().getResource("greencross1.png"));
																l55.setIcon(icon66);
																
																DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
																dout.writeUTF("success");
																dout.writeUTF(data);
																 break;	
																
															}
															else if(rss1.next()==false)
															{
																//no fiule
																
																Statement stn=con.createStatement();
																String sqln="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn11','"+dt+"','Not Found')";
																stn.executeUpdate(sqln);
																System.out.println("status inserted");
															
																

																Thread.sleep(2000);
																con3=new ImageIcon(this.getClass().getResource("Rednode.png"));
																l11.setIcon(con3);
																
																Thread.sleep(2000);
																con4=new ImageIcon(this.getClass().getResource("Redcross3.png"));
																lb2.setIcon(con4);
																
																Thread.sleep(2000);
																icon55=new ImageIcon(this.getClass().getResource("Greencross4.png"));
																lb3.setIcon(icon55);
																
														
																Thread.sleep(2000);
																icon7=new ImageIcon(this.getClass().getResource("Greennode.png"));
																l22.setIcon(icon7);
																
																
																Statement st = con.createStatement();
																String sqq = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn111'";
																ResultSet rss = st.executeQuery(sqq);
																if(rss.next()==true)
																{
																	
																	
																	FileInputStream fin = new FileInputStream("LBS/BS1/nn111/"+fname+".txt");
																	byte[] b = new byte[fin.available()];
																	fin.read(b);
																	String cont = new String(b);
																	
																	data=enc.decrypt(cont, keyWord);
																
																	Statement pst=con.createStatement();
																	String psql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn111','"+dt+"','Found')";
																	pst.executeUpdate(psql);
																	System.out.println("status inserted");
																	
																	lk.setVisible(true);
																	Thread.sleep(900);
																	lk.setVisible(false);
																	Thread.sleep(900);
																	lk.setVisible(true);
																	
																	//lines for n1
																	Thread.sleep(2000);
																	icon3=new ImageIcon(this.getClass().getResource("Greennode.png"));
																	l7.setIcon(icon3);
																	
																	Thread.sleep(2000);
																	icon66=new ImageIcon(this.getClass().getResource("greencross1.png"));
																	l55.setIcon(icon66);
																	
																	DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
																	dout.writeUTF("success");
																	dout.writeUTF(data);
																	
																     break;	
																	
																}
																else if(rss.next()==false)
																{
																	//no files
																	
																	Statement pst=con.createStatement();
																	String psql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn111','"+dt+"','Not nFound')";
																	pst.executeUpdate(psql);
																	System.out.println("status inserted");
																	
																	Thread.sleep(2000);
																	con5=new ImageIcon(this.getClass().getResource("Rednode.png"));
																	l22.setIcon(con5);
																	
																	Thread.sleep(2000);
																	con6=new ImageIcon(this.getClass().getResource("Redcross4.png"));
																	lb3.setIcon(con6);
																	
																	Thread.sleep(2000);
																	con888=new ImageIcon(this.getClass().getResource("Redstation.png"));
																	l2.setIcon(con888);
																	
																	
																	checkr2(fname,sk,sc,user);
																}
															
																
															}
											
														} 
															if(mn2<mn1)
															{
																Thread.sleep(2000);
																icon55=new ImageIcon(this.getClass().getResource("Greencross4.png"));
																lb3.setIcon(icon55);
																
														
																Thread.sleep(2000);
																icon7=new ImageIcon(this.getClass().getResource("Greennode.png"));
																l22.setIcon(icon7);
																
																
																Statement st = con.createStatement();
																String sqq = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn111'";
																ResultSet rss = st.executeQuery(sqq);
																if(rss.next()==true)
																{
																	
																	
																	FileInputStream fin = new FileInputStream("LBS/BS1/nn111/"+fname+".txt");
																	byte[] b = new byte[fin.available()];
																	fin.read(b);
																	String cont = new String(b);
																	
																	data=enc.decrypt(cont, keyWord);
																
																	Statement smmt=con.createStatement();
																	String sqlmm="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn111','"+dt+"','Found')";
																	smmt.executeUpdate(sqlmm);
																	System.out.println("status inserted");
																	
																	
																	
																	lk.setVisible(true);
																	Thread.sleep(900);
																	lk.setVisible(false);
																	Thread.sleep(900);
																	lk.setVisible(true);
																	
																	//lines for n1
																	Thread.sleep(2000);
																	icon3=new ImageIcon(this.getClass().getResource("Greennode.png"));
																	l7.setIcon(icon3);
																	
																	Thread.sleep(2000);
																	icon66=new ImageIcon(this.getClass().getResource("greencross1.png"));
																	l55.setIcon(icon66);
																	
																	DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
																	dout.writeUTF("success");
																	dout.writeUTF(data);
																	
																     break;	
																	
																}
																else if(rs01.next()==false)
																{
																	//no files

																	//no files
																	Statement smmt=con.createStatement();
																	String sqlmm="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn111','"+dt+"','Not Found')";
																	smmt.executeUpdate(sqlmm);
																	System.out.println("status inserted");
																	
																	Thread.sleep(2000);
																	con5=new ImageIcon(this.getClass().getResource("Rednode.png"));
																	l22.setIcon(con5);
																	
																	Thread.sleep(2000);
																	con6=new ImageIcon(this.getClass().getResource("Redcross4.png"));
																	lb3.setIcon(con6);
																	
																	Thread.sleep(2000);
																	icon44=new ImageIcon(this.getClass().getResource("Greencross3.png"));
																	lb2.setIcon(icon44);
																	
																	
																	Thread.sleep(2000);
																	icon6=new ImageIcon(this.getClass().getResource("Greennode.png"));
																	l11.setIcon(icon6);
																	
										
																	Statement stm1 = con.createStatement();
																	String sql = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn11'";
																	ResultSet rss1 = stm1.executeQuery(sql);
																	if(rss1.next()==true)
																	{
																		
																		
																		FileInputStream fin = new FileInputStream("LBS/BS1/nn11/"+fname+".txt");
																		byte[] b = new byte[fin.available()];
																		fin.read(b);
																		String cont = new String(b);
																		
																		data=enc.decrypt(cont, keyWord);
																	
																		Statement xst=con.createStatement();
																		String xsql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn11','"+dt+"','Found')";
																		xst.executeUpdate(xsql);
																		System.out.println("status inserted");
																		
																		lk.setVisible(true);
																		Thread.sleep(900);
																		lk.setVisible(false);
																		Thread.sleep(900);
																		lk.setVisible(true);
																		
																		//lines for n1
																		Thread.sleep(2000);
																		icon3=new ImageIcon(this.getClass().getResource("Greennode.png"));
																		l7.setIcon(icon3);
																		
																		Thread.sleep(2000);
																		icon66=new ImageIcon(this.getClass().getResource("greencross1.png"));
																		l55.setIcon(icon66);
																		
																		DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
																		dout.writeUTF("success");
																		dout.writeUTF(data);
																		 break;	
																		
																	}else 
																	{
																	   //not found	
																		
																		Statement xst=con.createStatement();
																		String xsql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn11','"+dt+"','Not Found')";
																		xst.executeUpdate(xsql);
																		System.out.println("status inserted");
																		
																		
																		Thread.sleep(2000);
																		con3=new ImageIcon(this.getClass().getResource("Rednode.png"));
																		l11.setIcon(con3);
																		
																		Thread.sleep(2000);
																		con4=new ImageIcon(this.getClass().getResource("Redcross3.png"));
																		lb2.setIcon(con4);
																	
																		Thread.sleep(2000);
																		con888=new ImageIcon(this.getClass().getResource("Redstation.png"));
																		l2.setIcon(con888);
																		
																		checkr2(fname,sk,sc,user);
																	}
																	
																	
																
																}
																
																
																
															
																
															}
														
													
														
													}
													
												
												
													
													
												}
												else if(nodename.equalsIgnoreCase("nn2"))
												{
													
													Thread.sleep(2000);
													icon22=new ImageIcon(this.getClass().getResource("greendown.png"));
													l66.setIcon(icon22);
													
													
													
													Thread.sleep(2000);
													icon4=new ImageIcon(this.getClass().getResource("Greennode.png"));
													l8.setIcon(icon4);
													
													Statement stmt01 = con.createStatement();
													String sql01 = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn2'";
													ResultSet rs01 = stmt01.executeQuery(sql01);
													if(rs01.next()==true)
													{
														
														
														FileInputStream fin = new FileInputStream("LBS/BS1/nn2/"+fname+".txt");
														byte[] b = new byte[fin.available()];
														fin.read(b);
														String cont = new String(b);
														
														data=enc.decrypt(cont, keyWord);
													
														Statement st=con.createStatement();
														String sql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn2','"+dt+"','Found')";
														st.executeUpdate(sql);
														System.out.println("status inserted");
														
														lk.setVisible(true);
														Thread.sleep(900);
														lk.setVisible(false);
														Thread.sleep(900);
														lk.setVisible(true);
														
														DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
														dout.writeUTF("success");
														dout.writeUTF(data);
														 break;	
														
													}
													else if(rs01.next()==false)
													{
													       //no file
														Statement st=con.createStatement();
														String sql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn2','"+dt+"','Not Found')";
														st.executeUpdate(sql);
														System.out.println("status inserted");
														
														Thread.sleep(2000);
														con7=new ImageIcon(this.getClass().getResource("Rednode.png"));
														l8.setIcon(con7);
														
														Thread.sleep(2000);
														con8=new ImageIcon(this.getClass().getResource("Reddown.png"));
														l66.setIcon(con8);
														
														Thread.sleep(2000);
														con888=new ImageIcon(this.getClass().getResource("Redstation.png"));
														l2.setIcon(con888);
														
														
														checkr2(fname,sk,sc,user);
													}
												}
												else if(nodename.equalsIgnoreCase("nn3"))
												{
													
													Thread.sleep(2000);
													icon33=new ImageIcon(this.getClass().getResource("Greencross2.png"));
													l77.setIcon(icon33);
													
													
													Thread.sleep(2000);
													icon5=new ImageIcon(this.getClass().getResource("Greennode.png"));
													l9.setIcon(icon5);
													
													Statement stmt01 = con.createStatement();
													String sql01 = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn3'";
													ResultSet rs01 = stmt01.executeQuery(sql01);
													if(rs01.next()==true)
													{
														
														
														FileInputStream fin = new FileInputStream("LBS/BS1/nn3/"+fname+".txt");
														byte[] b = new byte[fin.available()];
														fin.read(b);
														String cont = new String(b);
														
														data=enc.decrypt(cont, keyWord);
													
														Statement st=con.createStatement();
														String sql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn3','"+dt+"','Found')";
														st.executeUpdate(sql);
														System.out.println("status inserted");
														
														lk.setVisible(true);
														Thread.sleep(900);
														lk.setVisible(false);
														Thread.sleep(900);
														lk.setVisible(true);
														
														DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
														dout.writeUTF("success");
														dout.writeUTF(data);
														 break;	
														
													}
													else if(rs01.next()==false)
													{
														
														//no file
														Statement st=con.createStatement();
														String sql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn3','"+dt+"','Not Found')";
														st.executeUpdate(sql);
														System.out.println("status inserted");
														
														Thread.sleep(2000);
														con9=new ImageIcon(this.getClass().getResource("Rednode.png"));
														l9.setIcon(con9);
														
														Thread.sleep(2000);
														con11=new ImageIcon(this.getClass().getResource("Redcross2.png"));
														l77.setIcon(con11);
														
														Thread.sleep(2000);
														con888=new ImageIcon(this.getClass().getResource("Redstation.png"));
														l2.setIcon(con888);
														
														checkr2(fname,sk,sc,user);
													}
													
													
													
													
													
												}
												
											}
									} 
									
							}
									
									//Clear all images
					        	 
					        	    Thread.sleep(2000);
									
									l1.setIcon(ic1);
									l2.setIcon(ic2);
									l3.setIcon(ic3);
									l4.setIcon(ic4);
									l5.setIcon(ic5);
									l6.setIcon(ic6);
									l7.setIcon(ic7);
									l8.setIcon(ic8);
									l9.setIcon(ic9);
									l11.setIcon(ic11);
									l22.setIcon(ic22);
									l33.setIcon(ic33);
									l44.setIcon(ic44);
									l55.setIcon(ic55);
									l66.setIcon(ic66);
									l77.setIcon(ic77);
									l88.setIcon(ic88);
									l99.setIcon(ic99);
									
									lb1.setIcon(icc1);
									lb2.setIcon(icc2);
									lb3.setIcon(icc3);
									lb4.setIcon(icc4);
									lb5.setIcon(icc5);
									
									lb6.setIcon(lab1);
									lb7.setIcon(lab2);
									
									//Number label
									lol1.setText("");
									lol2.setText("");
									lol3.setText("");
									lol4.setText("");
									lol5.setText("");
									lol6.setText("");
									lol7.setText("");
									lol8.setText("");
									lol9.setText("");
									lol10.setText("");
									lol1.setText("");
									lk.setVisible(false);
									lk1.setVisible(false);
					
							}
						} catch (Exception e) {
							
						}
						
					}
					
					if(this.port==5007)   //END User 2
					{

						try 
						{
							ServerSocket ss=new ServerSocket(5007);
							while(true)
							{
								Socket sc=ss.accept();
								DataInputStream dis=new DataInputStream(sc.getInputStream());
								
								String user=dis.readUTF();
								String fname=dis.readUTF();
								String sk=dis.readUTF();
								System.out.println("  All data recived from user");
								
								AES enc = new AES();
								
								SimpleDateFormat sdfDate = new SimpleDateFormat(
								"dd/MM/yyyy");
						        SimpleDateFormat sdfTime = new SimpleDateFormat(
								"HH:mm:ss");

						          Date now = new Date();
						          String strDate = sdfDate.format(now);
						          String strTime = sdfTime.format(now);
						          String dt = strDate + "   " + strTime;
								
								
								String r1 = "BS1";
								String r2 = "BS2";
								
								 DBCon db=new DBCon();
					        	 Connection con=db.getConnection();
					        	 
					        	 String data="";
					        	 
					        	 Statement sttt=con.createStatement();
					        	 String sq1 = "select * from Attacker where Attacker='"+user+"'";
					        	 ResultSet rs=sttt.executeQuery(sq1);
					        	 
					        	 System.out.println("Query Checked");
					        	 if(rs.next()==true)
					        	 {
					        		    Thread.sleep(2000);
					        		    icon1=new ImageIcon(this.getClass().getResource("GreenLBS.png"));
										l1.setIcon(icon1);
					        		 
					        		  Thread.sleep(2000);
					        		  lb=new ImageIcon(this.getClass().getResource("RedLBS.png"));
					  				  l1.setIcon(lb);
					        		 
					        		 DataOutputStream dos=new DataOutputStream(sc.getOutputStream());
					        		 dos.writeUTF("attcker");
					        		 dos.writeUTF("attcker");
					        		 System.out.println("attacker msg send to user");
					        		 
					        	 }else
					        		 
					        	    {
					        		 
					    
					        		Statement stmt51 = con.createStatement();
									String sql51 = "select * from BS1 where Station='" + r1+ "' order by Distance asc";
									ResultSet rs51 = stmt51.executeQuery(sql51);
					        	 
									int count=0;
					        	 
									while(rs51.next()==true)             
									{   
										
										
										Thread.sleep(2000);
										icon1=new ImageIcon(this.getClass().getResource("GreenLBS.png"));
										l1.setIcon(icon1);
										
										Thread.sleep(2000);
										icon101=new ImageIcon(this.getClass().getResource("newlonggreen1.png"));
										lb6.setIcon(icon101);
										
										Thread.sleep(2000);
										icon2=new ImageIcon(this.getClass().getResource("Greenstation.png"));
										l2.setIcon(icon2);
										
										int mn11=0;
										int mn22=0;
										int mn33=0;
										int mn44=0;
										int mn55=0;
										
//										 
							        	 
										Statement stmt15 = con.createStatement();
										String sql100 = "select * from BS1 where NNodes='nn1'";
										ResultSet rs15 = stmt15.executeQuery(sql100);
										if(rs15.next()==true)
										{
											mn11=rs15.getInt(2);
											System.out.println(" dist  "  +mn11);
											
										}
										
										Statement stmt25 = con.createStatement();
										String sql200 = "select * from BS1 where NNodes='nn2'";
										ResultSet rs25 = stmt25.executeQuery(sql200);
										if(rs25.next()==true)
										{
											mn22=rs25.getInt(2);
										}
										
										Statement stmt35 = con.createStatement();
										String sql300 = "select * from BS1 where NNodes='nn3'";
										ResultSet rs35 = stmt35.executeQuery(sql300);
										if(rs35.next()==true)
										{
											mn33=rs35.getInt(2);
										}
										
										Statement stmt45 = con.createStatement();
										String sql4 = "select * from NN1 where NNodes='nn11'";
										ResultSet rs45 = stmt45.executeQuery(sql4);
										if(rs45.next()==true)
										{
											mn44=rs45.getInt(2);
										}
										
										
										Statement stmt55 = con.createStatement();
										String sql5 = "select * from NN1 where NNodes='nn111'";
										ResultSet rs55 = stmt55.executeQuery(sql5);
										if(rs55.next()==true)
										{
											mn55=rs55.getInt(2);
										}
										
										System.out.println(mn11);
										System.out.println(mn22);
										System.out.println(mn33);
										System.out.println(mn44);
										System.out.println(mn55);
										
										String dtt1=Integer.toString(mn11);
				                        String dtt2=Integer.toString(mn22);
				                        String dtt3=Integer.toString(mn33);
				                        String dtt4=Integer.toString(mn44);
				                        String dtt5=Integer.toString(mn55);
										
										lol1.setText(dtt1);
										lol2.setText(dtt2);
										lol3.setText(dtt3);
										lol4.setText(dtt4);
										lol5.setText(dtt5);
//										
										
										
										count++;
										if(count==1)                //count  1   
										{
											String nodename=rs51.getString(1);              
											System.out.println("node name    "+nodename);         
											
											if(nodename.equalsIgnoreCase("nn1"))  
											{
												
												Thread.sleep(2000);
												icon66=new ImageIcon(this.getClass().getResource("greencross1.png"));
												l55.setIcon(icon66);
												
												Thread.sleep(2000);
												icon3=new ImageIcon(this.getClass().getResource("Greennode.png"));
												l7.setIcon(icon3);
												
												
												Statement stmt01 = con.createStatement();
												String sql01 = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn1'";
												ResultSet rs01 = stmt01.executeQuery(sql01);
								        		if(rs01.next()==true)
												  {
													
													
													FileInputStream fin = new FileInputStream("LBS/BS1/nn1/"+fname+".txt");
													byte[] b = new byte[fin.available()];
													fin.read(b);
													String cont = new String(b);
													
													data=enc.decrypt(cont, keyWord);
												
												Statement st=con.createStatement();
												String sql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn1','"+dt+"','Found')";
												st.executeUpdate(sql);
												System.out.println("status inserted");
												
												lk.setVisible(true);
												Thread.sleep(900);
												lk.setVisible(false);
												Thread.sleep(900);
												lk.setVisible(true);
												
												
													
													DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
													dout.writeUTF("success");
													dout.writeUTF(data);
													
												 break;	
													
												}
												else 
													if(rs01.next()==false)   //else of node 1
												   {
									
														Statement st90=con.createStatement();
														String sql8="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn1','"+dt+"','Not Found')";
														st90.executeUpdate(sql8);
														System.out.println("status inserted");
														
													
														Thread.sleep(2000);
														con1=new ImageIcon(this.getClass().getResource("Rednode.png"));
														l7.setIcon(con1);
														
														Thread.sleep(2000);
														con2=new ImageIcon(this.getClass().getResource("Redcross1.png"));
														l55.setIcon(con2);
													
//													
													int mn1=0;
													int mn2=0;
//													
													Statement stmt1 = con.createStatement();
													String sql1 = "select * from NN1 where NNodes='nn11'";
													ResultSet rs1 = stmt1.executeQuery(sql1);
													if(rs1.next()==true)
													{
														mn1=rs1.getInt(2);
														System.out.println(" dist  "  +mn1);
														
													}
//													
													Statement stmt2 = con.createStatement();
													String sql2 = "select * from NN1 where NNodes='nn111'";
													ResultSet rs2 = stmt2.executeQuery(sql2);
													if(rs2.next()==true)
													{
														mn2=rs2.getInt(2);
													}
													
													System.out.println(mn1);
													System.out.println(mn2);
//													
//													
													if(mn1<mn2)
													{
														
														Thread.sleep(2000);
														icon44=new ImageIcon(this.getClass().getResource("Greencross3.png"));
														lb2.setIcon(icon44);
														
														
														Thread.sleep(2000);
														icon6=new ImageIcon(this.getClass().getResource("Greennode.png"));
														l11.setIcon(icon6);
														
							
														Statement stm1 = con.createStatement();
														String sql = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn11'";
														ResultSet rss1 = stm1.executeQuery(sql);
														if(rss1.next()==true)
														{
															
															
															FileInputStream fin = new FileInputStream("LBS/BS1/nn11/"+fname+".txt");
															byte[] b = new byte[fin.available()];
															fin.read(b);
															String cont = new String(b);
															
															data=enc.decrypt(cont, keyWord);
														
															Statement st=con.createStatement();
															String sqll="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn11','"+dt+"','Found')";
															st.executeUpdate(sqll);
															System.out.println("status inserted");
															
										
															lk.setVisible(true);
															Thread.sleep(900);
															lk.setVisible(false);
															Thread.sleep(900);
															lk.setVisible(true);
															
															//lines for n1
															Thread.sleep(2000);
															icon3=new ImageIcon(this.getClass().getResource("Greennode.png"));
															l7.setIcon(icon3);
															
															Thread.sleep(2000);
															icon66=new ImageIcon(this.getClass().getResource("greencross1.png"));
															l55.setIcon(icon66);
															
															DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
															dout.writeUTF("success");
															dout.writeUTF(data);
															 break;	
															
														}
														else 
															if(rss1.next()==false)  //else of nn1 
														    {
															//no file
															
																Statement stee=con.createStatement();
																String sqlle="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn11','"+dt+"','Not Found')";
																stee.executeUpdate(sqlle);
																System.out.println("status inserted");
																
															
	
																Thread.sleep(2000);
																con3=new ImageIcon(this.getClass().getResource("Rednode.png"));
																l11.setIcon(con3);
																
																Thread.sleep(2000);
																con4=new ImageIcon(this.getClass().getResource("Redcross3.png"));
																lb2.setIcon(con4);
														
															
															Thread.sleep(2000);
															icon55=new ImageIcon(this.getClass().getResource("Greencross4.png"));
															lb3.setIcon(icon55);
															
													
															Thread.sleep(2000);
															icon7=new ImageIcon(this.getClass().getResource("Greennode.png"));
															l22.setIcon(icon7);
															
															
															Statement st = con.createStatement();
															String sqq = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn111'";
															ResultSet rss = st.executeQuery(sqq);
															if(rss.next()==true)
															{
																
																
																FileInputStream fin = new FileInputStream("LBS/BS1/nn111/"+fname+".txt");
																byte[] b = new byte[fin.available()];
																fin.read(b);
																String cont = new String(b);
																
																data=enc.decrypt(cont, keyWord);
															
																Statement stt=con.createStatement();
																String sqll="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','n111','"+dt+"','Found')";
																stt.executeUpdate(sqll);
																System.out.println("status inserted");
																
																
																

																lk.setVisible(true);
																Thread.sleep(900);
																lk.setVisible(false);
																Thread.sleep(900);
																lk.setVisible(true);
																
																//lines for n1
																Thread.sleep(2000);
																icon3=new ImageIcon(this.getClass().getResource("Greennode.png"));
																l7.setIcon(icon3);
																
																Thread.sleep(2000);
																icon66=new ImageIcon(this.getClass().getResource("greencross1.png"));
																l55.setIcon(icon66);
																
																DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
																dout.writeUTF("success");
																dout.writeUTF(data);
																
															     break;	
																
															}
															else if(rss.next()==false)
															{
																//no files
																
																Statement stt=con.createStatement();
																String sqll="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','n111','"+dt+"','Not Found')";
																stt.executeUpdate(sqll);
																System.out.println("status inserted");
																
								
																Thread.sleep(2000);
																con5=new ImageIcon(this.getClass().getResource("Rednode.png"));
																l22.setIcon(con5);
																
																Thread.sleep(2000);
																con6=new ImageIcon(this.getClass().getResource("Redcross4.png"));
																lb3.setIcon(con6);
																
															
																
															}
														}
										
													} 
														if(mn2<mn1)
														{
															Thread.sleep(2000);
															icon55=new ImageIcon(this.getClass().getResource("Greencross4.png"));
															lb3.setIcon(icon55);
															
													
															Thread.sleep(2000);
															icon7=new ImageIcon(this.getClass().getResource("Greennode.png"));
															l22.setIcon(icon7);
															
															
															Statement st = con.createStatement();
															String sqq = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn111'";
															ResultSet rss = st.executeQuery(sqq);
															if(rss.next()==true)
															{
																
																
																FileInputStream fin = new FileInputStream("LBS/BS1/nn111/"+fname+".txt");
																byte[] b = new byte[fin.available()];
																fin.read(b);
																String cont = new String(b);
																
																data=enc.decrypt(cont, keyWord);
															
																Statement sto=con.createStatement();
																String sqlo="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn111','"+dt+"','Found')";
																sto.executeUpdate(sqlo);
																System.out.println("status inserted");
																
																lk.setVisible(true);
																Thread.sleep(900);
																lk.setVisible(false);
																Thread.sleep(900);
																lk.setVisible(true);
																
																//lines for n1
																Thread.sleep(2000);
																icon3=new ImageIcon(this.getClass().getResource("Greennode.png"));
																l7.setIcon(icon3);
																
																Thread.sleep(2000);
																icon66=new ImageIcon(this.getClass().getResource("greencross1.png"));
																l55.setIcon(icon66);
																
																DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
																dout.writeUTF("success");
																dout.writeUTF(data);
																
															     break;	
																
															}
															else if(rss.next()==false)
															{
																//no files
																Statement sto=con.createStatement();
																String sqlo="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn111','"+dt+"','Not Found')";
																sto.executeUpdate(sqlo);
																System.out.println("status inserted");
																
																
																Thread.sleep(2000);
																con5=new ImageIcon(this.getClass().getResource("Rednode.png"));
																l22.setIcon(con5);
																
																Thread.sleep(2000);
																con6=new ImageIcon(this.getClass().getResource("Redcross4.png"));
																lb3.setIcon(con6);
																
														
																Thread.sleep(2000);
																icon44=new ImageIcon(this.getClass().getResource("Greencross3.png"));
																lb2.setIcon(icon44);
																
																
																Thread.sleep(2000);
																icon6=new ImageIcon(this.getClass().getResource("Greennode.png"));
																l11.setIcon(icon6);
																
									
																Statement stm1 = con.createStatement();
																String sql = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn11'";
																ResultSet rss1 = stm1.executeQuery(sql);
																if(rss1.next()==true)
																{
																	
																	
																	FileInputStream fin = new FileInputStream("LBS/BS1/nn11/"+fname+".txt");
																	byte[] b = new byte[fin.available()];
																	fin.read(b);
																	String cont = new String(b);
																	
																	data=enc.decrypt(cont, keyWord);
																
																	Statement stp=con.createStatement();
																	String sqlp="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn11','"+dt+"','Found')";
																	stp.executeUpdate(sqlp);
																	System.out.println("status inserted");
																	
																	lk.setVisible(true);
																	Thread.sleep(900);
																	lk.setVisible(false);
																	Thread.sleep(900);
																	lk.setVisible(true);
																	
																	//lines for n1
																	Thread.sleep(2000);
																	icon3=new ImageIcon(this.getClass().getResource("Greennode.png"));
																	l7.setIcon(icon3);
																	
																	Thread.sleep(2000);
																	icon66=new ImageIcon(this.getClass().getResource("greencross1.png"));
																	l55.setIcon(icon66);
																	
																	DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
																	dout.writeUTF("success");
																	dout.writeUTF(data);
																	 break;	
																	
																}else 
																{
																   //not found	
																	Statement stp=con.createStatement();
																	String sqlp="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn11','"+dt+"','Not Found')";
																	stp.executeUpdate(sqlp);
																	System.out.println("status inserted");
																	
																	
																	Thread.sleep(2000);
																	con3=new ImageIcon(this.getClass().getResource("Rednode.png"));
																	l11.setIcon(con3);
																	
																	Thread.sleep(2000);
																	con4=new ImageIcon(this.getClass().getResource("Redcross3.png"));
																	lb2.setIcon(con4);
																	
																	
																}
																
																
															}
															
															
															
														
															
														}
													
												}
												
											
											
												
												
											}
											else if(nodename.equalsIgnoreCase("nn2"))
											{
												
												Thread.sleep(2000);
												icon22=new ImageIcon(this.getClass().getResource("greendown.png"));
												l66.setIcon(icon22);
												
												
												
												Thread.sleep(2000);
												icon4=new ImageIcon(this.getClass().getResource("Greennode.png"));
												l8.setIcon(icon4);
												
												Statement stmt01 = con.createStatement();
												String sql01 = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn2'";
												ResultSet rs01 = stmt01.executeQuery(sql01);
												if(rs01.next()==true)
												{
													
													
													FileInputStream fin = new FileInputStream("LBS/BS1/nn2/"+fname+".txt");
													byte[] b = new byte[fin.available()];
													fin.read(b);
													String cont = new String(b);
													
													data=enc.decrypt(cont, keyWord);
												
													Statement st=con.createStatement();
													String sql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn2','"+dt+"','Found')";
													st.executeUpdate(sql);
													System.out.println("status inserted");
													
													lk.setVisible(true);
													Thread.sleep(900);
													lk.setVisible(false);
													Thread.sleep(900);
													lk.setVisible(true);
													
													DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
													dout.writeUTF("success");
													dout.writeUTF(data);
													 break;	
													
												}
												else if(rs01.next()==false)
												{
												       //no file
													
													Statement st=con.createStatement();
													String sql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn2','"+dt+"','Not Found')";
													st.executeUpdate(sql);
													System.out.println("status inserted");
													
									
													Thread.sleep(2000);
													con7=new ImageIcon(this.getClass().getResource("Rednode.png"));
													l8.setIcon(con7);
													
													Thread.sleep(2000);
													con8=new ImageIcon(this.getClass().getResource("Reddown.png"));
													l66.setIcon(con8);
												}
											}
											else if(nodename.equalsIgnoreCase("nn3"))
											{
												
												Thread.sleep(2000);
												icon33=new ImageIcon(this.getClass().getResource("Greencross2.png"));
												l77.setIcon(icon33);
												
												
												Thread.sleep(2000);
												icon5=new ImageIcon(this.getClass().getResource("Greennode.png"));
												l9.setIcon(icon5);
												
												Statement stmt01 = con.createStatement();
												String sql01 = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn3'";
												ResultSet rs01 = stmt01.executeQuery(sql01);
												if(rs01.next()==true)
												{
													
													
													FileInputStream fin = new FileInputStream("LBS/BS1/nn3/"+fname+".txt");
													byte[] b = new byte[fin.available()];
													fin.read(b);
													String cont = new String(b);
													
													data=enc.decrypt(cont, keyWord);
												
													Statement st=con.createStatement();
													String sql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn3','"+dt+"','Found')";
													st.executeUpdate(sql);
													System.out.println("status inserted");
													
													lk.setVisible(true);
													Thread.sleep(900);
													lk.setVisible(false);
													Thread.sleep(900);
													lk.setVisible(true);
													
													DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
													dout.writeUTF("success");
													dout.writeUTF(data);
													 break;	
													
												}
												else if(rs01.next()==false)
												{
													
													//no file
													
													Statement st=con.createStatement();
													String sql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn3','"+dt+"','Not Found')";
													st.executeUpdate(sql);
													System.out.println("status inserted");
													
				
													Thread.sleep(2000);
													con9=new ImageIcon(this.getClass().getResource("Rednode.png"));
													l9.setIcon(con9);
													
													Thread.sleep(2000);
													con11=new ImageIcon(this.getClass().getResource("Redcross2.png"));
													l77.setIcon(con11);
													
													
												}
											}								
													
											
										}else
										
										if(count==2)                         //count    2
										{
											

											String nodename=rs51.getString(1);
											System.out.println("node name    "+nodename);
											
											if(nodename.equalsIgnoreCase("nn1"))
											{
												Thread.sleep(2000);
												icon66=new ImageIcon(this.getClass().getResource("greencross1.png"));
												l55.setIcon(icon66);
												
												Thread.sleep(2000);
												icon3=new ImageIcon(this.getClass().getResource("Greennode.png"));
												l7.setIcon(icon3);
												
												
												Statement stmt01 = con.createStatement();
												String sql01 = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn1'";
												ResultSet rs01 = stmt01.executeQuery(sql01);
								        		if(rs01.next()==true)
												  {
													
													
													FileInputStream fin = new FileInputStream("LBS/BS1/nn1/"+fname+".txt");
													byte[] b = new byte[fin.available()];
													fin.read(b);
													String cont = new String(b);
													
													data=enc.decrypt(cont, keyWord);
												
													Statement st=con.createStatement();
													String sql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn1','"+dt+"','Found')";
													st.executeUpdate(sql);
													System.out.println("status inserted");
													
													lk.setVisible(true);
													Thread.sleep(900);
													lk.setVisible(false);
													Thread.sleep(900);
													lk.setVisible(true);
													
													DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
													dout.writeUTF("success");
													dout.writeUTF(data);
													
												 break;	
													
												}
												else if(rs01.next()==false)
												{
													//no file

													Statement stg=con.createStatement();
													String sqlg="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn1','"+dt+"','Not Found')";
													stg.executeUpdate(sqlg);
													System.out.println("status inserted");
													
													Thread.sleep(2000);
													con1=new ImageIcon(this.getClass().getResource("Rednode.png"));
													l7.setIcon(con1);
													
													Thread.sleep(2000);
													con2=new ImageIcon(this.getClass().getResource("Redcross1.png"));
													l55.setIcon(con2);
													
													
													
													int mn1=0;
													int mn2=0;
													
													Statement stmt1 = con.createStatement();
													String sql1 = "select * from NN1 where NNodes='nn11'";
													ResultSet rs1 = stmt1.executeQuery(sql1);
													if(rs1.next()==true)
													{
														mn1=rs1.getInt(2);
														System.out.println(" dist  "  +mn1);
														
													}
													
													Statement stmt2 = con.createStatement();
													String sql2 = "select * from NN1 where NNodes='nn111'";
													ResultSet rs2 = stmt2.executeQuery(sql2);
													if(rs2.next()==true)
													{
														mn2=rs2.getInt(2);
													}
													
													System.out.println(mn1);
													System.out.println(mn2);
													
													
													if(mn1<mn2)
													{
														
														Thread.sleep(2000);
														icon44=new ImageIcon(this.getClass().getResource("Greencross3.png"));
														lb2.setIcon(icon44);
														
														
														Thread.sleep(2000);
														icon6=new ImageIcon(this.getClass().getResource("Greennode.png"));
														l11.setIcon(icon6);
														
							
														Statement stm1 = con.createStatement();
														String sql = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn11'";
														ResultSet rss1 = stm1.executeQuery(sql);
														if(rss1.next()==true)
														{
															
															
															FileInputStream fin = new FileInputStream("LBS/BS1/nn11/"+fname+".txt");
															byte[] b = new byte[fin.available()];
															fin.read(b);
															String cont = new String(b);
															
															data=enc.decrypt(cont, keyWord);
														
															Statement st=con.createStatement();
															String sqlb="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn11','"+dt+"','Found')";
															st.executeUpdate(sqlb);
															System.out.println("status inserted");
															
											
															lk.setVisible(true);
															Thread.sleep(900);
															lk.setVisible(false);
															Thread.sleep(900);
															lk.setVisible(true);
															
															
															//lines for n1
															Thread.sleep(2000);
															icon3=new ImageIcon(this.getClass().getResource("Greennode.png"));
															l7.setIcon(icon3);
															
															Thread.sleep(2000);
															icon66=new ImageIcon(this.getClass().getResource("greencross1.png"));
															l55.setIcon(icon66);
															
															DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
															dout.writeUTF("success");
															dout.writeUTF(data);
															 break;	
															
														}
														else if(rss1.next()==false)
														{
															//no file

															Statement st2=con.createStatement();
															String sqlb="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn11','"+dt+"','Not Found')";
															st2.executeUpdate(sqlb);
															System.out.println("status inserted");
															
															
															Thread.sleep(2000);
															con3=new ImageIcon(this.getClass().getResource("Rednode.png"));
															l11.setIcon(con3);
															
															Thread.sleep(2000);
															con4=new ImageIcon(this.getClass().getResource("Redcross3.png"));
															lb2.setIcon(con4);
														
															
															Thread.sleep(2000);
															icon55=new ImageIcon(this.getClass().getResource("Greencross4.png"));
															lb3.setIcon(icon55);
															
													
															Thread.sleep(2000);
															icon7=new ImageIcon(this.getClass().getResource("Greennode.png"));
															l22.setIcon(icon7);
															
															
															Statement st = con.createStatement();
															String sqq = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn111'";
															ResultSet rss = st.executeQuery(sqq);
															if(rss.next()==true)
															{
																
																
																FileInputStream fin = new FileInputStream("LBS/BS1/nn111/"+fname+".txt");
																byte[] b = new byte[fin.available()];
																fin.read(b);
																String cont = new String(b);
																data=enc.decrypt(cont, keyWord);
															
																Statement str=con.createStatement();
																String sqlr="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn111','"+dt+"','Found')";
																str.executeUpdate(sqlr);
																System.out.println("status inserted");
																
																
																lk.setVisible(true);
																Thread.sleep(900);
																lk.setVisible(false);
																Thread.sleep(900);
																lk.setVisible(true);
																
																//lines for n1
																Thread.sleep(2000);
																icon3=new ImageIcon(this.getClass().getResource("Greennode.png"));
																l7.setIcon(icon3);
																
																Thread.sleep(2000);
																icon66=new ImageIcon(this.getClass().getResource("greencross1.png"));
																l55.setIcon(icon66);
																
																DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
																dout.writeUTF("success");
																dout.writeUTF(data);
																
															     break;	
																
															}
															else if(rss.next()==false)
															{
																//no files
																
																Statement str=con.createStatement();
																String sqlr="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn111','"+dt+"','Not Found')";
																str.executeUpdate(sqlr);
																System.out.println("status inserted");
																
																
																Thread.sleep(2000);
																con5=new ImageIcon(this.getClass().getResource("Rednode.png"));
																l22.setIcon(con5);
																
																Thread.sleep(2000);
																con6=new ImageIcon(this.getClass().getResource("Redcross4.png"));
																lb3.setIcon(con6);
																
															}
														
															
															
															
															
														}
										
													} 
														if(mn2<mn1)
														{
															Thread.sleep(2000);
															icon55=new ImageIcon(this.getClass().getResource("Greencross4.png"));
															lb3.setIcon(icon55);
															
													
															Thread.sleep(2000);
															icon7=new ImageIcon(this.getClass().getResource("Greennode.png"));
															l22.setIcon(icon7);
															
															
															Statement st = con.createStatement();
															String sqq = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn111'";
															ResultSet rss = st.executeQuery(sqq);
															if(rss.next()==true)
															{
																
																
																FileInputStream fin = new FileInputStream("LBS/BS1/nn111/"+fname+".txt");
																byte[] b = new byte[fin.available()];
																fin.read(b);
																String cont = new String(b);
																data=enc.decrypt(cont, keyWord);
															
																Statement sst=con.createStatement();
																String ssql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1',''nn111,'"+dt+"','Found')";
																sst.executeUpdate(ssql);
																System.out.println("status inserted");
																
																
																
																lk.setVisible(true);
																Thread.sleep(900);
																lk.setVisible(false);
																Thread.sleep(900);
																lk.setVisible(true);
																
																//lines for n1
																Thread.sleep(2000);
																icon3=new ImageIcon(this.getClass().getResource("Greennode.png"));
																l7.setIcon(icon3);
																
																Thread.sleep(2000);
																icon66=new ImageIcon(this.getClass().getResource("greencross1.png"));
																l55.setIcon(icon66);
																
																DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
																dout.writeUTF("success");
																dout.writeUTF(data);
																
															     break;	
																
															}
															else if(rs01.next()==false)
															{
																//no files
																
																Statement sst=con.createStatement();
																String ssql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1',''nn111,'"+dt+"','Not Found')";
																sst.executeUpdate(ssql);
																System.out.println("status inserted"); 
															
																Thread.sleep(2000);
																con5=new ImageIcon(this.getClass().getResource("Rednode.png"));
																l22.setIcon(con5);
																
																Thread.sleep(2000);
																con6=new ImageIcon(this.getClass().getResource("Redcross4.png"));
																lb3.setIcon(con6);
																
																
																Thread.sleep(2000);
																icon44=new ImageIcon(this.getClass().getResource("Greencross3.png"));
																lb2.setIcon(icon44);
																
																
																Thread.sleep(2000);
																icon6=new ImageIcon(this.getClass().getResource("Greennode.png"));
																l11.setIcon(icon6);
																
									
																Statement stm1 = con.createStatement();
																String sql = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn11'";
																ResultSet rss1 = stm1.executeQuery(sql);
																if(rss1.next()==true)
																{
																	
																	
																	FileInputStream fin = new FileInputStream("LBS/BS1/nn11/"+fname+".txt");
																	byte[] b = new byte[fin.available()];
																	fin.read(b);
																	String cont = new String(b);
																	
																	data=enc.decrypt(cont, keyWord);
																
																	Statement srt=con.createStatement();
																	String sqlr="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn11','"+dt+"','Found')";
																	srt.executeUpdate(sqlr);
																	System.out.println("status inserted");
																	
																	lk.setVisible(true);
																	Thread.sleep(900);
																	lk.setVisible(false);
																	Thread.sleep(900);
																	lk.setVisible(true);
																	
																	//lines for n1
																	Thread.sleep(2000);
																	icon3=new ImageIcon(this.getClass().getResource("Greennode.png"));
																	l7.setIcon(icon3);
																	
																	Thread.sleep(2000);
																	icon66=new ImageIcon(this.getClass().getResource("greencross1.png"));
																	l55.setIcon(icon66);
																	
																	DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
																	dout.writeUTF("success");
																	dout.writeUTF(data);
																	 break;	
																	
																}else 
																{
																   //not found	
																	
																	Statement srt=con.createStatement();
																	String sqlr="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn11','"+dt+"','Not Found')";
																	srt.executeUpdate(sqlr);
																	System.out.println("status inserted");
																	
																	Thread.sleep(2000);
																	con3=new ImageIcon(this.getClass().getResource("Rednode.png"));
																	l11.setIcon(con3);
																	
																	Thread.sleep(2000);
																	con4=new ImageIcon(this.getClass().getResource("Redcross3.png"));
																	lb2.setIcon(con4);
																	
																	
																}
																
																
															
																
															}
															
															
															
														
															
														}
													
												
													
												}
												
											
											
												
												
											}
											else if(nodename.equalsIgnoreCase("nn2"))
											{
												
												Thread.sleep(2000);
												icon22=new ImageIcon(this.getClass().getResource("greendown.png"));
												l66.setIcon(icon22);
												
												
												
												Thread.sleep(2000);
												icon4=new ImageIcon(this.getClass().getResource("Greennode.png"));
												l8.setIcon(icon4);
												
												Statement stmt01 = con.createStatement();
												String sql01 = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn2'";
												ResultSet rs01 = stmt01.executeQuery(sql01);
												if(rs01.next()==true)
												{
													
													
													FileInputStream fin = new FileInputStream("LBS/BS1/nn2/"+fname+".txt");
													byte[] b = new byte[fin.available()];
													fin.read(b);
													String cont = new String(b);
													data=enc.decrypt(cont, keyWord);
												
													Statement st=con.createStatement();
													String sql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn2','"+dt+"','Found')";
													st.executeUpdate(sql);
													System.out.println("status inserted");
													
													lk.setVisible(true);
													Thread.sleep(900);
													lk.setVisible(false);
													Thread.sleep(900);
													lk.setVisible(true);
													
													DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
													dout.writeUTF("success");
													dout.writeUTF(data);
													 break;	
													
												}
												else if(rs01.next()==false)
												{
												       //no file
													

													Statement st=con.createStatement();
													String sql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn2','"+dt+"','Not Found')";
													st.executeUpdate(sql);
													System.out.println("status inserted");
													
													Thread.sleep(2000);
													con7=new ImageIcon(this.getClass().getResource("Rednode.png"));
													l8.setIcon(con7);
													
													Thread.sleep(2000);
													con8=new ImageIcon(this.getClass().getResource("Reddown.png"));
													l66.setIcon(con8);
													
												}
											}
											else if(nodename.equalsIgnoreCase("nn3"))
											{
												Thread.sleep(2000);
												icon33=new ImageIcon(this.getClass().getResource("Greencross2.png"));
												l77.setIcon(icon33);
												
												
												Thread.sleep(2000);
												icon5=new ImageIcon(this.getClass().getResource("Greennode.png"));
												l9.setIcon(icon5);
												
												
												Statement stmt01 = con.createStatement();
												String sql01 = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn3'";
												ResultSet rs01 = stmt01.executeQuery(sql01);
												if(rs01.next()==true)
												{
													
													
													FileInputStream fin = new FileInputStream("LBS/BS1/nn3/"+fname+".txt");
													byte[] b = new byte[fin.available()];
													fin.read(b);
													String cont = new String(b);
													
													data=enc.decrypt(cont, keyWord);
												
													Statement st=con.createStatement();
													String sql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn3','"+dt+"','Found')";
													st.executeUpdate(sql);
													System.out.println("status inserted");
													
													lk.setVisible(true);
													Thread.sleep(900);
													lk.setVisible(false);
													Thread.sleep(900);
													lk.setVisible(true);
													
													DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
													dout.writeUTF("success");
													dout.writeUTF(data);
													 break;	
													
												}
												else if(rs01.next()==false)
												{
													
													//no file
													
													Statement st=con.createStatement();
													String sql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn3','"+dt+"','Not Found')";
													st.executeUpdate(sql);
													System.out.println("status inserted");
													
													Thread.sleep(2000);
													con9=new ImageIcon(this.getClass().getResource("Rednode.png"));
													l9.setIcon(con9);
													
													Thread.sleep(2000);
													con11=new ImageIcon(this.getClass().getResource("Redcross2.png"));
													l77.setIcon(con11);
													
												
												}
												
												
												
												
												
											}

										}else 
											if(count==3)              //count  3
											{
								
												
												String nodename=rs51.getString(1);
												System.out.println("node name    "+nodename);
												
												if(nodename.equalsIgnoreCase("nn1"))
												{
													
													Thread.sleep(2000);
													icon66=new ImageIcon(this.getClass().getResource("greencross1.png"));
													l55.setIcon(icon66);
													
													Thread.sleep(2000);
													icon3=new ImageIcon(this.getClass().getResource("Greennode.png"));
													l7.setIcon(icon3);
													
													
													Statement stmt01 = con.createStatement();
													String sql01 = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn1'";
													ResultSet rs01 = stmt01.executeQuery(sql01);
									        		if(rs01.next()==true)
													  {
														
														
														FileInputStream fin = new FileInputStream("LBS/BS1/nn1/"+fname+".txt");
														byte[] b = new byte[fin.available()];
														fin.read(b);
														String cont = new String(b);
														
														data=enc.decrypt(cont, keyWord);
													
														Statement st=con.createStatement();
														String sql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn1','"+dt+"','Found')";
														st.executeUpdate(sql);
														System.out.println("status inserted");
														
														lk.setVisible(true);
														Thread.sleep(900);
														lk.setVisible(false);
														Thread.sleep(900);
														lk.setVisible(true);
														
														DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
														dout.writeUTF("success");
														dout.writeUTF(data);
														
													 break;	
														
													}
													else if(rs01.next()==false)
													{
														//no file
														
														Statement st5=con.createStatement();
														String sql511="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn1','"+dt+"','Not Found')";
														st5.executeUpdate(sql511);
														System.out.println("status inserted");
														
														
														Thread.sleep(2000);
														con1=new ImageIcon(this.getClass().getResource("Rednode.png"));
														l7.setIcon(con1);
														
														Thread.sleep(2000);
														con2=new ImageIcon(this.getClass().getResource("Redcross1.png"));
														l55.setIcon(con2);
														
														//no file
														
														int mn1=0;
														int mn2=0;
														
														Statement stmt1 = con.createStatement();
														String sql1 = "select * from NN1 where NNodes='nn11'";
														ResultSet rs1 = stmt1.executeQuery(sql1);
														if(rs1.next()==true)
														{
															mn1=rs1.getInt(2);
															System.out.println(" dist  "  +mn1);
															
														}
														
														Statement stmt2 = con.createStatement();
														String sql2 = "select * from NN1 where NNodes='nn111'";
														ResultSet rs2 = stmt2.executeQuery(sql2);
														if(rs2.next()==true)
														{
															mn2=rs2.getInt(2);
														}
														
														System.out.println(mn1);
														System.out.println(mn2);
														
														
														if(mn1<mn2)
														{
															
															Thread.sleep(2000);
															icon44=new ImageIcon(this.getClass().getResource("Greencross3.png"));
															lb2.setIcon(icon44);
															
															
															Thread.sleep(2000);
															icon6=new ImageIcon(this.getClass().getResource("Greennode.png"));
															l11.setIcon(icon6);
															
								
															Statement stm1 = con.createStatement();
															String sql = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn11'";
															ResultSet rss1 = stm1.executeQuery(sql);
															if(rss1.next()==true)
															{
																
																
																FileInputStream fin = new FileInputStream("LBS/BS1/nn11/"+fname+".txt");
																byte[] b = new byte[fin.available()];
																fin.read(b);
																String cont = new String(b);
																
																data=enc.decrypt(cont, keyWord);
															
																Statement stn=con.createStatement();
																String sqln="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn11','"+dt+"','Found')";
																stn.executeUpdate(sqln);
																System.out.println("status inserted");
																
																
																
																lk.setVisible(true);
																Thread.sleep(900);
																lk.setVisible(false);
																Thread.sleep(900);
																lk.setVisible(true);
																
																//lines for n1
																Thread.sleep(2000);
																icon3=new ImageIcon(this.getClass().getResource("Greennode.png"));
																l7.setIcon(icon3);
																
																Thread.sleep(2000);
																icon66=new ImageIcon(this.getClass().getResource("greencross1.png"));
																l55.setIcon(icon66);
																
																DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
																dout.writeUTF("success");
																dout.writeUTF(data);
																 break;	
																
															}
															else if(rss1.next()==false)
															{
																//no fiule
																
																Statement stn=con.createStatement();
																String sqln="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn11','"+dt+"','Not Found')";
																stn.executeUpdate(sqln);
																System.out.println("status inserted");
															
																

																Thread.sleep(2000);
																con3=new ImageIcon(this.getClass().getResource("Rednode.png"));
																l11.setIcon(con3);
																
																Thread.sleep(2000);
																con4=new ImageIcon(this.getClass().getResource("Redcross3.png"));
																lb2.setIcon(con4);
																
																Thread.sleep(2000);
																icon55=new ImageIcon(this.getClass().getResource("Greencross4.png"));
																lb3.setIcon(icon55);
																
														
																Thread.sleep(2000);
																icon7=new ImageIcon(this.getClass().getResource("Greennode.png"));
																l22.setIcon(icon7);
																
																
																Statement st = con.createStatement();
																String sqq = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn111'";
																ResultSet rss = st.executeQuery(sqq);
																if(rss.next()==true)
																{
																	
																	
																	FileInputStream fin = new FileInputStream("LBS/BS1/nn111/"+fname+".txt");
																	byte[] b = new byte[fin.available()];
																	fin.read(b);
																	String cont = new String(b);
																	
																	data=enc.decrypt(cont, keyWord);
																
																	Statement pst=con.createStatement();
																	String psql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn111','"+dt+"','Found')";
																	pst.executeUpdate(psql);
																	System.out.println("status inserted");
																	
																	lk.setVisible(true);
																	Thread.sleep(900);
																	lk.setVisible(false);
																	Thread.sleep(900);
																	lk.setVisible(true);
																	
																	//lines for n1
																	Thread.sleep(2000);
																	icon3=new ImageIcon(this.getClass().getResource("Greennode.png"));
																	l7.setIcon(icon3);
																	
																	Thread.sleep(2000);
																	icon66=new ImageIcon(this.getClass().getResource("greencross1.png"));
																	l55.setIcon(icon66);
																	
																	DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
																	dout.writeUTF("success");
																	dout.writeUTF(data);
																	
																     break;	
																	
																}
																else if(rss.next()==false)
																{
																	//no files
																	
																	Statement pst=con.createStatement();
																	String psql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn111','"+dt+"','Not nFound')";
																	pst.executeUpdate(psql);
																	System.out.println("status inserted");
																	
																	Thread.sleep(2000);
																	con5=new ImageIcon(this.getClass().getResource("Rednode.png"));
																	l22.setIcon(con5);
																	
																	Thread.sleep(2000);
																	con6=new ImageIcon(this.getClass().getResource("Redcross4.png"));
																	lb3.setIcon(con6);
																	
																	Thread.sleep(2000);
																	con888=new ImageIcon(this.getClass().getResource("Redstation.png"));
																	l2.setIcon(con888);
																	
																	
																	checkr2(fname,sk,sc,user);
																}
															
																
															}
											
														} 
															if(mn2<mn1)
															{
																Thread.sleep(2000);
																icon55=new ImageIcon(this.getClass().getResource("Greencross4.png"));
																lb3.setIcon(icon55);
																
														
																Thread.sleep(2000);
																icon7=new ImageIcon(this.getClass().getResource("Greennode.png"));
																l22.setIcon(icon7);
																
																
																Statement st = con.createStatement();
																String sqq = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn111'";
																ResultSet rss = st.executeQuery(sqq);
																if(rss.next()==true)
																{
																	
																	
																	FileInputStream fin = new FileInputStream("LBS/BS1/nn111/"+fname+".txt");
																	byte[] b = new byte[fin.available()];
																	fin.read(b);
																	String cont = new String(b);
																	
																	data=enc.decrypt(cont, keyWord);
																
																	Statement smmt=con.createStatement();
																	String sqlmm="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn111','"+dt+"','Found')";
																	smmt.executeUpdate(sqlmm);
																	System.out.println("status inserted");
																	
																	
																	
																	lk.setVisible(true);
																	Thread.sleep(900);
																	lk.setVisible(false);
																	Thread.sleep(900);
																	lk.setVisible(true);
																	
																	//lines for n1
																	Thread.sleep(2000);
																	icon3=new ImageIcon(this.getClass().getResource("Greennode.png"));
																	l7.setIcon(icon3);
																	
																	Thread.sleep(2000);
																	icon66=new ImageIcon(this.getClass().getResource("greencross1.png"));
																	l55.setIcon(icon66);
																	
																	DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
																	dout.writeUTF("success");
																	dout.writeUTF(data);
																	
																     break;	
																	
																}
																else if(rs01.next()==false)
																{
																	//no files

																	//no files
																	Statement smmt=con.createStatement();
																	String sqlmm="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn111','"+dt+"','Not Found')";
																	smmt.executeUpdate(sqlmm);
																	System.out.println("status inserted");
																	
																	Thread.sleep(2000);
																	con5=new ImageIcon(this.getClass().getResource("Rednode.png"));
																	l22.setIcon(con5);
																	
																	Thread.sleep(2000);
																	con6=new ImageIcon(this.getClass().getResource("Redcross4.png"));
																	lb3.setIcon(con6);
																	
																	Thread.sleep(2000);
																	icon44=new ImageIcon(this.getClass().getResource("Greencross3.png"));
																	lb2.setIcon(icon44);
																	
																	
																	Thread.sleep(2000);
																	icon6=new ImageIcon(this.getClass().getResource("Greennode.png"));
																	l11.setIcon(icon6);
																	
										
																	Statement stm1 = con.createStatement();
																	String sql = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn11'";
																	ResultSet rss1 = stm1.executeQuery(sql);
																	if(rss1.next()==true)
																	{
																		
																		
																		FileInputStream fin = new FileInputStream("LBS/BS1/nn11/"+fname+".txt");
																		byte[] b = new byte[fin.available()];
																		fin.read(b);
																		String cont = new String(b);
																		
																		data=enc.decrypt(cont, keyWord);
																	
																		Statement xst=con.createStatement();
																		String xsql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn11','"+dt+"','Found')";
																		xst.executeUpdate(xsql);
																		System.out.println("status inserted");
																		
																		lk.setVisible(true);
																		Thread.sleep(900);
																		lk.setVisible(false);
																		Thread.sleep(900);
																		lk.setVisible(true);
																		
																		//lines for n1
																		Thread.sleep(2000);
																		icon3=new ImageIcon(this.getClass().getResource("Greennode.png"));
																		l7.setIcon(icon3);
																		
																		Thread.sleep(2000);
																		icon66=new ImageIcon(this.getClass().getResource("greencross1.png"));
																		l55.setIcon(icon66);
																		
																		DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
																		dout.writeUTF("success");
																		dout.writeUTF(data);
																		 break;	
																		
																	}else 
																	{
																	   //not found	
																		
																		Statement xst=con.createStatement();
																		String xsql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn11','"+dt+"','Not Found')";
																		xst.executeUpdate(xsql);
																		System.out.println("status inserted");
																		
																		
																		Thread.sleep(2000);
																		con3=new ImageIcon(this.getClass().getResource("Rednode.png"));
																		l11.setIcon(con3);
																		
																		Thread.sleep(2000);
																		con4=new ImageIcon(this.getClass().getResource("Redcross3.png"));
																		lb2.setIcon(con4);
																	
																		Thread.sleep(2000);
																		con888=new ImageIcon(this.getClass().getResource("Redstation.png"));
																		l2.setIcon(con888);
																		
																		checkr2(fname,sk,sc,user);
																	}
																	
																	
																
																}
																
																
																
															
																
															}
														
													
														
													}
													
												
												
													
													
												}
												else if(nodename.equalsIgnoreCase("nn2"))
												{
													
													Thread.sleep(2000);
													icon22=new ImageIcon(this.getClass().getResource("greendown.png"));
													l66.setIcon(icon22);
													
													
													
													Thread.sleep(2000);
													icon4=new ImageIcon(this.getClass().getResource("Greennode.png"));
													l8.setIcon(icon4);
													
													Statement stmt01 = con.createStatement();
													String sql01 = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn2'";
													ResultSet rs01 = stmt01.executeQuery(sql01);
													if(rs01.next()==true)
													{
														
														
														FileInputStream fin = new FileInputStream("LBS/BS1/nn2/"+fname+".txt");
														byte[] b = new byte[fin.available()];
														fin.read(b);
														String cont = new String(b);
														
														data=enc.decrypt(cont, keyWord);
													
														Statement st=con.createStatement();
														String sql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn2','"+dt+"','Found')";
														st.executeUpdate(sql);
														System.out.println("status inserted");
														
														lk.setVisible(true);
														Thread.sleep(900);
														lk.setVisible(false);
														Thread.sleep(900);
														lk.setVisible(true);
														
														DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
														dout.writeUTF("success");
														dout.writeUTF(data);
														 break;	
														
													}
													else if(rs01.next()==false)
													{
													       //no file
														Statement st=con.createStatement();
														String sql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn2','"+dt+"','Not Found')";
														st.executeUpdate(sql);
														System.out.println("status inserted");
														
														Thread.sleep(2000);
														con7=new ImageIcon(this.getClass().getResource("Rednode.png"));
														l8.setIcon(con7);
														
														Thread.sleep(2000);
														con8=new ImageIcon(this.getClass().getResource("Reddown.png"));
														l66.setIcon(con8);
														
														Thread.sleep(2000);
														con888=new ImageIcon(this.getClass().getResource("Redstation.png"));
														l2.setIcon(con888);
														
														
														checkr2(fname,sk,sc,user);
													}
												}
												else if(nodename.equalsIgnoreCase("nn3"))
												{
													
													Thread.sleep(2000);
													icon33=new ImageIcon(this.getClass().getResource("Greencross2.png"));
													l77.setIcon(icon33);
													
													
													Thread.sleep(2000);
													icon5=new ImageIcon(this.getClass().getResource("Greennode.png"));
													l9.setIcon(icon5);
													
													Statement stmt01 = con.createStatement();
													String sql01 = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn3'";
													ResultSet rs01 = stmt01.executeQuery(sql01);
													if(rs01.next()==true)
													{
														
														
														FileInputStream fin = new FileInputStream("LBS/BS1/nn3/"+fname+".txt");
														byte[] b = new byte[fin.available()];
														fin.read(b);
														String cont = new String(b);
														
														data=enc.decrypt(cont, keyWord);
													
														Statement st=con.createStatement();
														String sql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn3','"+dt+"','Found')";
														st.executeUpdate(sql);
														System.out.println("status inserted");
														
														lk.setVisible(true);
														Thread.sleep(900);
														lk.setVisible(false);
														Thread.sleep(900);
														lk.setVisible(true);
														
														DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
														dout.writeUTF("success");
														dout.writeUTF(data);
														 break;	
														
													}
													else if(rs01.next()==false)
													{
														
														//no file
														Statement st=con.createStatement();
														String sql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn3','"+dt+"','Not Found')";
														st.executeUpdate(sql);
														System.out.println("status inserted");
														
														Thread.sleep(2000);
														con9=new ImageIcon(this.getClass().getResource("Rednode.png"));
														l9.setIcon(con9);
														
														Thread.sleep(2000);
														con11=new ImageIcon(this.getClass().getResource("Redcross2.png"));
														l77.setIcon(con11);
														
														Thread.sleep(2000);
														con888=new ImageIcon(this.getClass().getResource("Redstation.png"));
														l2.setIcon(con888);
														
														checkr2(fname,sk,sc,user);
													}
													
													
													
													
													
												}
												
											}
									} 
									
							}
									
									//Clear all images
					        	 
					        	    Thread.sleep(2000);
									
									l1.setIcon(ic1);
									l2.setIcon(ic2);
									l3.setIcon(ic3);
									l4.setIcon(ic4);
									l5.setIcon(ic5);
									l6.setIcon(ic6);
									l7.setIcon(ic7);
									l8.setIcon(ic8);
									l9.setIcon(ic9);
									l11.setIcon(ic11);
									l22.setIcon(ic22);
									l33.setIcon(ic33);
									l44.setIcon(ic44);
									l55.setIcon(ic55);
									l66.setIcon(ic66);
									l77.setIcon(ic77);
									l88.setIcon(ic88);
									l99.setIcon(ic99);
									
									lb1.setIcon(icc1);
									lb2.setIcon(icc2);
									lb3.setIcon(icc3);
									lb4.setIcon(icc4);
									lb5.setIcon(icc5);
									
									lb6.setIcon(lab1);
									lb7.setIcon(lab2);
									
									//Number label
									lol1.setText("");
									lol2.setText("");
									lol3.setText("");
									lol4.setText("");
									lol5.setText("");
									lol6.setText("");
									lol7.setText("");
									lol8.setText("");
									lol9.setText("");
									lol10.setText("");
									lol1.setText("");
									lk.setVisible(false);
									lk1.setVisible(false);
					
							}
						} catch (Exception e) {
							
						}
						
					
					}
					
					if(this.port==6007)
					{


						try 
						{
							ServerSocket ss=new ServerSocket(6007);
							while(true)
							{
								Socket sc=ss.accept();
								DataInputStream dis=new DataInputStream(sc.getInputStream());
								
								String user=dis.readUTF();
								String fname=dis.readUTF();
								String sk=dis.readUTF();
								System.out.println("  All data recived from user");
								
								AES enc = new AES();
								
								SimpleDateFormat sdfDate = new SimpleDateFormat(
								"dd/MM/yyyy");
						        SimpleDateFormat sdfTime = new SimpleDateFormat(
								"HH:mm:ss");

						          Date now = new Date();
						          String strDate = sdfDate.format(now);
						          String strTime = sdfTime.format(now);
						          String dt = strDate + "   " + strTime;
								
								
								String r1 = "BS1";
								String r2 = "BS2";
								
								 DBCon db=new DBCon();
					        	 Connection con=db.getConnection();
					        	 
					        	 String data="";
					        	 
					        	 Statement sttt=con.createStatement();
					        	 String sq1 = "select * from Attacker where Attacker='"+user+"'";
					        	 ResultSet rs=sttt.executeQuery(sq1);
					        	 
					        	 System.out.println("Query Checked");
					        	 if(rs.next()==true)
					        	 {
					        		    Thread.sleep(2000);
					        		    icon1=new ImageIcon(this.getClass().getResource("GreenLBS.png"));
										l1.setIcon(icon1);
					        		 
					        		  Thread.sleep(2000);
					        		  lb=new ImageIcon(this.getClass().getResource("RedLBS.png"));
					  				  l1.setIcon(lb);
					        		 
					        		 DataOutputStream dos=new DataOutputStream(sc.getOutputStream());
					        		 dos.writeUTF("attcker");
					        		 dos.writeUTF("attcker");
					        		 System.out.println("attacker msg send to user");
					        		 
					        	 }else
					        		 
					        	    {
					        		 
					    
					        		Statement stmt51 = con.createStatement();
									String sql51 = "select * from BS1 where Station='" + r1+ "' order by Distance asc";
									ResultSet rs51 = stmt51.executeQuery(sql51);
					        	 
									int count=0;
					        	 
									while(rs51.next()==true)             
									{   
										
										
										Thread.sleep(2000);
										icon1=new ImageIcon(this.getClass().getResource("GreenLBS.png"));
										l1.setIcon(icon1);
										
										Thread.sleep(2000);
										icon101=new ImageIcon(this.getClass().getResource("newlonggreen1.png"));
										lb6.setIcon(icon101);
										
										Thread.sleep(2000);
										icon2=new ImageIcon(this.getClass().getResource("Greenstation.png"));
										l2.setIcon(icon2);
										
										int mn11=0;
										int mn22=0;
										int mn33=0;
										int mn44=0;
										int mn55=0;
										
//										 
							        	 
										Statement stmt15 = con.createStatement();
										String sql100 = "select * from BS1 where NNodes='nn1'";
										ResultSet rs15 = stmt15.executeQuery(sql100);
										if(rs15.next()==true)
										{
											mn11=rs15.getInt(2);
											System.out.println(" dist  "  +mn11);
											
										}
										
										Statement stmt25 = con.createStatement();
										String sql200 = "select * from BS1 where NNodes='nn2'";
										ResultSet rs25 = stmt25.executeQuery(sql200);
										if(rs25.next()==true)
										{
											mn22=rs25.getInt(2);
										}
										
										Statement stmt35 = con.createStatement();
										String sql300 = "select * from BS1 where NNodes='nn3'";
										ResultSet rs35 = stmt35.executeQuery(sql300);
										if(rs35.next()==true)
										{
											mn33=rs35.getInt(2);
										}
										
										Statement stmt45 = con.createStatement();
										String sql4 = "select * from NN1 where NNodes='nn11'";
										ResultSet rs45 = stmt45.executeQuery(sql4);
										if(rs45.next()==true)
										{
											mn44=rs45.getInt(2);
										}
										
										
										Statement stmt55 = con.createStatement();
										String sql5 = "select * from NN1 where NNodes='nn111'";
										ResultSet rs55 = stmt55.executeQuery(sql5);
										if(rs55.next()==true)
										{
											mn55=rs55.getInt(2);
										}
										
										System.out.println(mn11);
										System.out.println(mn22);
										System.out.println(mn33);
										System.out.println(mn44);
										System.out.println(mn55);
										
										String dtt1=Integer.toString(mn11);
				                        String dtt2=Integer.toString(mn22);
				                        String dtt3=Integer.toString(mn33);
				                        String dtt4=Integer.toString(mn44);
				                        String dtt5=Integer.toString(mn55);
										
										lol1.setText(dtt1);
										lol2.setText(dtt2);
										lol3.setText(dtt3);
										lol4.setText(dtt4);
										lol5.setText(dtt5);
//										
										
										
										count++;
										if(count==1)                //count  1   
										{
											String nodename=rs51.getString(1);              
											System.out.println("node name    "+nodename);         
											
											if(nodename.equalsIgnoreCase("nn1"))  
											{
												
												Thread.sleep(2000);
												icon66=new ImageIcon(this.getClass().getResource("greencross1.png"));
												l55.setIcon(icon66);
												
												Thread.sleep(2000);
												icon3=new ImageIcon(this.getClass().getResource("Greennode.png"));
												l7.setIcon(icon3);
												
												
												Statement stmt01 = con.createStatement();
												String sql01 = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn1'";
												ResultSet rs01 = stmt01.executeQuery(sql01);
								        		if(rs01.next()==true)
												  {
													
													
													FileInputStream fin = new FileInputStream("LBS/BS1/nn1/"+fname+".txt");
													byte[] b = new byte[fin.available()];
													fin.read(b);
													String cont = new String(b);
													
													data=enc.decrypt(cont, keyWord);
												
												Statement st=con.createStatement();
												String sql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn1','"+dt+"','Found')";
												st.executeUpdate(sql);
												System.out.println("status inserted");
												
												lk.setVisible(true);
												Thread.sleep(900);
												lk.setVisible(false);
												Thread.sleep(900);
												lk.setVisible(true);
												
												
													
													DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
													dout.writeUTF("success");
													dout.writeUTF(data);
													
												 break;	
													
												}
												else 
													if(rs01.next()==false)   //else of node 1
												   {
									
														Statement st90=con.createStatement();
														String sql8="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn1','"+dt+"','Not Found')";
														st90.executeUpdate(sql8);
														System.out.println("status inserted");
														
													
														Thread.sleep(2000);
														con1=new ImageIcon(this.getClass().getResource("Rednode.png"));
														l7.setIcon(con1);
														
														Thread.sleep(2000);
														con2=new ImageIcon(this.getClass().getResource("Redcross1.png"));
														l55.setIcon(con2);
													
//													
													int mn1=0;
													int mn2=0;
//													
													Statement stmt1 = con.createStatement();
													String sql1 = "select * from NN1 where NNodes='nn11'";
													ResultSet rs1 = stmt1.executeQuery(sql1);
													if(rs1.next()==true)
													{
														mn1=rs1.getInt(2);
														System.out.println(" dist  "  +mn1);
														
													}
//													
													Statement stmt2 = con.createStatement();
													String sql2 = "select * from NN1 where NNodes='nn111'";
													ResultSet rs2 = stmt2.executeQuery(sql2);
													if(rs2.next()==true)
													{
														mn2=rs2.getInt(2);
													}
													
													System.out.println(mn1);
													System.out.println(mn2);
//													
//													
													if(mn1<mn2)
													{
														
														Thread.sleep(2000);
														icon44=new ImageIcon(this.getClass().getResource("Greencross3.png"));
														lb2.setIcon(icon44);
														
														
														Thread.sleep(2000);
														icon6=new ImageIcon(this.getClass().getResource("Greennode.png"));
														l11.setIcon(icon6);
														
							
														Statement stm1 = con.createStatement();
														String sql = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn11'";
														ResultSet rss1 = stm1.executeQuery(sql);
														if(rss1.next()==true)
														{
															
															
															FileInputStream fin = new FileInputStream("LBS/BS1/nn11/"+fname+".txt");
															byte[] b = new byte[fin.available()];
															fin.read(b);
															String cont = new String(b);
															
															data=enc.decrypt(cont, keyWord);
														
															Statement st=con.createStatement();
															String sqll="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn11','"+dt+"','Found')";
															st.executeUpdate(sqll);
															System.out.println("status inserted");
															
										
															lk.setVisible(true);
															Thread.sleep(900);
															lk.setVisible(false);
															Thread.sleep(900);
															lk.setVisible(true);
															
															//lines for n1
															Thread.sleep(2000);
															icon3=new ImageIcon(this.getClass().getResource("Greennode.png"));
															l7.setIcon(icon3);
															
															Thread.sleep(2000);
															icon66=new ImageIcon(this.getClass().getResource("greencross1.png"));
															l55.setIcon(icon66);
															
															DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
															dout.writeUTF("success");
															dout.writeUTF(data);
															 break;	
															
														}
														else 
															if(rss1.next()==false)  //else of nn1 
														    {
															//no file
															
																Statement stee=con.createStatement();
																String sqlle="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn11','"+dt+"','Not Found')";
																stee.executeUpdate(sqlle);
																System.out.println("status inserted");
																
															
	
																Thread.sleep(2000);
																con3=new ImageIcon(this.getClass().getResource("Rednode.png"));
																l11.setIcon(con3);
																
																Thread.sleep(2000);
																con4=new ImageIcon(this.getClass().getResource("Redcross3.png"));
																lb2.setIcon(con4);
														
															
															Thread.sleep(2000);
															icon55=new ImageIcon(this.getClass().getResource("Greencross4.png"));
															lb3.setIcon(icon55);
															
													
															Thread.sleep(2000);
															icon7=new ImageIcon(this.getClass().getResource("Greennode.png"));
															l22.setIcon(icon7);
															
															
															Statement st = con.createStatement();
															String sqq = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn111'";
															ResultSet rss = st.executeQuery(sqq);
															if(rss.next()==true)
															{
																
																
																FileInputStream fin = new FileInputStream("LBS/BS1/nn111/"+fname+".txt");
																byte[] b = new byte[fin.available()];
																fin.read(b);
																String cont = new String(b);
																
																data=enc.decrypt(cont, keyWord);
															
																Statement stt=con.createStatement();
																String sqll="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','n111','"+dt+"','Found')";
																stt.executeUpdate(sqll);
																System.out.println("status inserted");
																
																
																

																lk.setVisible(true);
																Thread.sleep(900);
																lk.setVisible(false);
																Thread.sleep(900);
																lk.setVisible(true);
																
																//lines for n1
																Thread.sleep(2000);
																icon3=new ImageIcon(this.getClass().getResource("Greennode.png"));
																l7.setIcon(icon3);
																
																Thread.sleep(2000);
																icon66=new ImageIcon(this.getClass().getResource("greencross1.png"));
																l55.setIcon(icon66);
																
																DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
																dout.writeUTF("success");
																dout.writeUTF(data);
																
															     break;	
																
															}
															else if(rss.next()==false)
															{
																//no files
																
																Statement stt=con.createStatement();
																String sqll="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','n111','"+dt+"','Not Found')";
																stt.executeUpdate(sqll);
																System.out.println("status inserted");
																
								
																Thread.sleep(2000);
																con5=new ImageIcon(this.getClass().getResource("Rednode.png"));
																l22.setIcon(con5);
																
																Thread.sleep(2000);
																con6=new ImageIcon(this.getClass().getResource("Redcross4.png"));
																lb3.setIcon(con6);
																
															
																
															}
														}
										
													} 
														if(mn2<mn1)
														{
															Thread.sleep(2000);
															icon55=new ImageIcon(this.getClass().getResource("Greencross4.png"));
															lb3.setIcon(icon55);
															
													
															Thread.sleep(2000);
															icon7=new ImageIcon(this.getClass().getResource("Greennode.png"));
															l22.setIcon(icon7);
															
															
															Statement st = con.createStatement();
															String sqq = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn111'";
															ResultSet rss = st.executeQuery(sqq);
															if(rss.next()==true)
															{
																
																
																FileInputStream fin = new FileInputStream("LBS/BS1/nn111/"+fname+".txt");
																byte[] b = new byte[fin.available()];
																fin.read(b);
																String cont = new String(b);
																
																data=enc.decrypt(cont, keyWord);
															
																Statement sto=con.createStatement();
																String sqlo="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn111','"+dt+"','Found')";
																sto.executeUpdate(sqlo);
																System.out.println("status inserted");
																
																lk.setVisible(true);
																Thread.sleep(900);
																lk.setVisible(false);
																Thread.sleep(900);
																lk.setVisible(true);
																
																//lines for n1
																Thread.sleep(2000);
																icon3=new ImageIcon(this.getClass().getResource("Greennode.png"));
																l7.setIcon(icon3);
																
																Thread.sleep(2000);
																icon66=new ImageIcon(this.getClass().getResource("greencross1.png"));
																l55.setIcon(icon66);
																
																DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
																dout.writeUTF("success");
																dout.writeUTF(data);
																
															     break;	
																
															}
															else if(rss.next()==false)
															{
																//no files
																Statement sto=con.createStatement();
																String sqlo="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn111','"+dt+"','Not Found')";
																sto.executeUpdate(sqlo);
																System.out.println("status inserted");
																
																
																Thread.sleep(2000);
																con5=new ImageIcon(this.getClass().getResource("Rednode.png"));
																l22.setIcon(con5);
																
																Thread.sleep(2000);
																con6=new ImageIcon(this.getClass().getResource("Redcross4.png"));
																lb3.setIcon(con6);
																
														
																Thread.sleep(2000);
																icon44=new ImageIcon(this.getClass().getResource("Greencross3.png"));
																lb2.setIcon(icon44);
																
																
																Thread.sleep(2000);
																icon6=new ImageIcon(this.getClass().getResource("Greennode.png"));
																l11.setIcon(icon6);
																
									
																Statement stm1 = con.createStatement();
																String sql = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn11'";
																ResultSet rss1 = stm1.executeQuery(sql);
																if(rss1.next()==true)
																{
																	
																	
																	FileInputStream fin = new FileInputStream("LBS/BS1/nn11/"+fname+".txt");
																	byte[] b = new byte[fin.available()];
																	fin.read(b);
																	String cont = new String(b);
																	
																	data=enc.decrypt(cont, keyWord);
																
																	Statement stp=con.createStatement();
																	String sqlp="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn11','"+dt+"','Found')";
																	stp.executeUpdate(sqlp);
																	System.out.println("status inserted");
																	
																	lk.setVisible(true);
																	Thread.sleep(900);
																	lk.setVisible(false);
																	Thread.sleep(900);
																	lk.setVisible(true);
																	
																	//lines for n1
																	Thread.sleep(2000);
																	icon3=new ImageIcon(this.getClass().getResource("Greennode.png"));
																	l7.setIcon(icon3);
																	
																	Thread.sleep(2000);
																	icon66=new ImageIcon(this.getClass().getResource("greencross1.png"));
																	l55.setIcon(icon66);
																	
																	DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
																	dout.writeUTF("success");
																	dout.writeUTF(data);
																	 break;	
																	
																}else 
																{
																   //not found	
																	Statement stp=con.createStatement();
																	String sqlp="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn11','"+dt+"','Not Found')";
																	stp.executeUpdate(sqlp);
																	System.out.println("status inserted");
																	
																	
																	Thread.sleep(2000);
																	con3=new ImageIcon(this.getClass().getResource("Rednode.png"));
																	l11.setIcon(con3);
																	
																	Thread.sleep(2000);
																	con4=new ImageIcon(this.getClass().getResource("Redcross3.png"));
																	lb2.setIcon(con4);
																	
																	
																}
																
																
															}
															
															
															
														
															
														}
													
												}
												
											
											
												
												
											}
											else if(nodename.equalsIgnoreCase("nn2"))
											{
												
												Thread.sleep(2000);
												icon22=new ImageIcon(this.getClass().getResource("greendown.png"));
												l66.setIcon(icon22);
												
												
												
												Thread.sleep(2000);
												icon4=new ImageIcon(this.getClass().getResource("Greennode.png"));
												l8.setIcon(icon4);
												
												Statement stmt01 = con.createStatement();
												String sql01 = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn2'";
												ResultSet rs01 = stmt01.executeQuery(sql01);
												if(rs01.next()==true)
												{
													
													
													FileInputStream fin = new FileInputStream("LBS/BS1/nn2/"+fname+".txt");
													byte[] b = new byte[fin.available()];
													fin.read(b);
													String cont = new String(b);
													
													data=enc.decrypt(cont, keyWord);
												
													Statement st=con.createStatement();
													String sql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn2','"+dt+"','Found')";
													st.executeUpdate(sql);
													System.out.println("status inserted");
													
													lk.setVisible(true);
													Thread.sleep(900);
													lk.setVisible(false);
													Thread.sleep(900);
													lk.setVisible(true);
													
													DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
													dout.writeUTF("success");
													dout.writeUTF(data);
													 break;	
													
												}
												else if(rs01.next()==false)
												{
												       //no file
													
													Statement st=con.createStatement();
													String sql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn2','"+dt+"','Not Found')";
													st.executeUpdate(sql);
													System.out.println("status inserted");
													
									
													Thread.sleep(2000);
													con7=new ImageIcon(this.getClass().getResource("Rednode.png"));
													l8.setIcon(con7);
													
													Thread.sleep(2000);
													con8=new ImageIcon(this.getClass().getResource("Reddown.png"));
													l66.setIcon(con8);
												}
											}
											else if(nodename.equalsIgnoreCase("nn3"))
											{
												
												Thread.sleep(2000);
												icon33=new ImageIcon(this.getClass().getResource("Greencross2.png"));
												l77.setIcon(icon33);
												
												
												Thread.sleep(2000);
												icon5=new ImageIcon(this.getClass().getResource("Greennode.png"));
												l9.setIcon(icon5);
												
												Statement stmt01 = con.createStatement();
												String sql01 = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn3'";
												ResultSet rs01 = stmt01.executeQuery(sql01);
												if(rs01.next()==true)
												{
													
													
													FileInputStream fin = new FileInputStream("LBS/BS1/nn3/"+fname+".txt");
													byte[] b = new byte[fin.available()];
													fin.read(b);
													String cont = new String(b);
													
													data=enc.decrypt(cont, keyWord);
												
													Statement st=con.createStatement();
													String sql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn3','"+dt+"','Found')";
													st.executeUpdate(sql);
													System.out.println("status inserted");
													
													lk.setVisible(true);
													Thread.sleep(900);
													lk.setVisible(false);
													Thread.sleep(900);
													lk.setVisible(true);
													
													DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
													dout.writeUTF("success");
													dout.writeUTF(data);
													 break;	
													
												}
												else if(rs01.next()==false)
												{
													
													//no file
													
													Statement st=con.createStatement();
													String sql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn3','"+dt+"','Not Found')";
													st.executeUpdate(sql);
													System.out.println("status inserted");
													
				
													Thread.sleep(2000);
													con9=new ImageIcon(this.getClass().getResource("Rednode.png"));
													l9.setIcon(con9);
													
													Thread.sleep(2000);
													con11=new ImageIcon(this.getClass().getResource("Redcross2.png"));
													l77.setIcon(con11);
													
													
												}
											}								
													
											
										}else
										
										if(count==2)                         //count    2
										{
											

											String nodename=rs51.getString(1);
											System.out.println("node name    "+nodename);
											
											if(nodename.equalsIgnoreCase("nn1"))
											{
												Thread.sleep(2000);
												icon66=new ImageIcon(this.getClass().getResource("greencross1.png"));
												l55.setIcon(icon66);
												
												Thread.sleep(2000);
												icon3=new ImageIcon(this.getClass().getResource("Greennode.png"));
												l7.setIcon(icon3);
												
												
												Statement stmt01 = con.createStatement();
												String sql01 = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn1'";
												ResultSet rs01 = stmt01.executeQuery(sql01);
								        		if(rs01.next()==true)
												  {
													
													
													FileInputStream fin = new FileInputStream("LBS/BS1/nn1/"+fname+".txt");
													byte[] b = new byte[fin.available()];
													fin.read(b);
													String cont = new String(b);
													
													data=enc.decrypt(cont, keyWord);
												
													Statement st=con.createStatement();
													String sql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn1','"+dt+"','Found')";
													st.executeUpdate(sql);
													System.out.println("status inserted");
													
													lk.setVisible(true);
													Thread.sleep(900);
													lk.setVisible(false);
													Thread.sleep(900);
													lk.setVisible(true);
													
													DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
													dout.writeUTF("success");
													dout.writeUTF(data);
													
												 break;	
													
												}
												else if(rs01.next()==false)
												{
													//no file

													Statement stg=con.createStatement();
													String sqlg="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn1','"+dt+"','Not Found')";
													stg.executeUpdate(sqlg);
													System.out.println("status inserted");
													
													Thread.sleep(2000);
													con1=new ImageIcon(this.getClass().getResource("Rednode.png"));
													l7.setIcon(con1);
													
													Thread.sleep(2000);
													con2=new ImageIcon(this.getClass().getResource("Redcross1.png"));
													l55.setIcon(con2);
													
													
													
													int mn1=0;
													int mn2=0;
													
													Statement stmt1 = con.createStatement();
													String sql1 = "select * from NN1 where NNodes='nn11'";
													ResultSet rs1 = stmt1.executeQuery(sql1);
													if(rs1.next()==true)
													{
														mn1=rs1.getInt(2);
														System.out.println(" dist  "  +mn1);
														
													}
													
													Statement stmt2 = con.createStatement();
													String sql2 = "select * from NN1 where NNodes='nn111'";
													ResultSet rs2 = stmt2.executeQuery(sql2);
													if(rs2.next()==true)
													{
														mn2=rs2.getInt(2);
													}
													
													System.out.println(mn1);
													System.out.println(mn2);
													
													
													if(mn1<mn2)
													{
														
														Thread.sleep(2000);
														icon44=new ImageIcon(this.getClass().getResource("Greencross3.png"));
														lb2.setIcon(icon44);
														
														
														Thread.sleep(2000);
														icon6=new ImageIcon(this.getClass().getResource("Greennode.png"));
														l11.setIcon(icon6);
														
							
														Statement stm1 = con.createStatement();
														String sql = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn11'";
														ResultSet rss1 = stm1.executeQuery(sql);
														if(rss1.next()==true)
														{
															
															
															FileInputStream fin = new FileInputStream("LBS/BS1/nn11/"+fname+".txt");
															byte[] b = new byte[fin.available()];
															fin.read(b);
															String cont = new String(b);
															
															data=enc.decrypt(cont, keyWord);
														
															Statement st=con.createStatement();
															String sqlb="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn11','"+dt+"','Found')";
															st.executeUpdate(sqlb);
															System.out.println("status inserted");
															
											
															lk.setVisible(true);
															Thread.sleep(900);
															lk.setVisible(false);
															Thread.sleep(900);
															lk.setVisible(true);
															
															
															//lines for n1
															Thread.sleep(2000);
															icon3=new ImageIcon(this.getClass().getResource("Greennode.png"));
															l7.setIcon(icon3);
															
															Thread.sleep(2000);
															icon66=new ImageIcon(this.getClass().getResource("greencross1.png"));
															l55.setIcon(icon66);
															
															DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
															dout.writeUTF("success");
															dout.writeUTF(data);
															 break;	
															
														}
														else if(rss1.next()==false)
														{
															//no file

															Statement st2=con.createStatement();
															String sqlb="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn11','"+dt+"','Not Found')";
															st2.executeUpdate(sqlb);
															System.out.println("status inserted");
															
															
															Thread.sleep(2000);
															con3=new ImageIcon(this.getClass().getResource("Rednode.png"));
															l11.setIcon(con3);
															
															Thread.sleep(2000);
															con4=new ImageIcon(this.getClass().getResource("Redcross3.png"));
															lb2.setIcon(con4);
														
															
															Thread.sleep(2000);
															icon55=new ImageIcon(this.getClass().getResource("Greencross4.png"));
															lb3.setIcon(icon55);
															
													
															Thread.sleep(2000);
															icon7=new ImageIcon(this.getClass().getResource("Greennode.png"));
															l22.setIcon(icon7);
															
															
															Statement st = con.createStatement();
															String sqq = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn111'";
															ResultSet rss = st.executeQuery(sqq);
															if(rss.next()==true)
															{
																
																
																FileInputStream fin = new FileInputStream("LBS/BS1/nn111/"+fname+".txt");
																byte[] b = new byte[fin.available()];
																fin.read(b);
																String cont = new String(b);
																data=enc.decrypt(cont, keyWord);
															
																Statement str=con.createStatement();
																String sqlr="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn111','"+dt+"','Found')";
																str.executeUpdate(sqlr);
																System.out.println("status inserted");
																
																
																lk.setVisible(true);
																Thread.sleep(900);
																lk.setVisible(false);
																Thread.sleep(900);
																lk.setVisible(true);
																
																//lines for n1
																Thread.sleep(2000);
																icon3=new ImageIcon(this.getClass().getResource("Greennode.png"));
																l7.setIcon(icon3);
																
																Thread.sleep(2000);
																icon66=new ImageIcon(this.getClass().getResource("greencross1.png"));
																l55.setIcon(icon66);
																
																DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
																dout.writeUTF("success");
																dout.writeUTF(data);
																
															     break;	
																
															}
															else if(rss.next()==false)
															{
																//no files
																
																Statement str=con.createStatement();
																String sqlr="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn111','"+dt+"','Not Found')";
																str.executeUpdate(sqlr);
																System.out.println("status inserted");
																
																
																Thread.sleep(2000);
																con5=new ImageIcon(this.getClass().getResource("Rednode.png"));
																l22.setIcon(con5);
																
																Thread.sleep(2000);
																con6=new ImageIcon(this.getClass().getResource("Redcross4.png"));
																lb3.setIcon(con6);
																
															}
														
															
															
															
															
														}
										
													} 
														if(mn2<mn1)
														{
															Thread.sleep(2000);
															icon55=new ImageIcon(this.getClass().getResource("Greencross4.png"));
															lb3.setIcon(icon55);
															
													
															Thread.sleep(2000);
															icon7=new ImageIcon(this.getClass().getResource("Greennode.png"));
															l22.setIcon(icon7);
															
															
															Statement st = con.createStatement();
															String sqq = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn111'";
															ResultSet rss = st.executeQuery(sqq);
															if(rss.next()==true)
															{
																
																
																FileInputStream fin = new FileInputStream("LBS/BS1/nn111/"+fname+".txt");
																byte[] b = new byte[fin.available()];
																fin.read(b);
																String cont = new String(b);
																data=enc.decrypt(cont, keyWord);
															
																Statement sst=con.createStatement();
																String ssql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1',''nn111,'"+dt+"','Found')";
																sst.executeUpdate(ssql);
																System.out.println("status inserted");
																
																
																
																lk.setVisible(true);
																Thread.sleep(900);
																lk.setVisible(false);
																Thread.sleep(900);
																lk.setVisible(true);
																
																//lines for n1
																Thread.sleep(2000);
																icon3=new ImageIcon(this.getClass().getResource("Greennode.png"));
																l7.setIcon(icon3);
																
																Thread.sleep(2000);
																icon66=new ImageIcon(this.getClass().getResource("greencross1.png"));
																l55.setIcon(icon66);
																
																DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
																dout.writeUTF("success");
																dout.writeUTF(data);
																
															     break;	
																
															}
															else if(rs01.next()==false)
															{
																//no files
																
																Statement sst=con.createStatement();
																String ssql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1',''nn111,'"+dt+"','Not Found')";
																sst.executeUpdate(ssql);
																System.out.println("status inserted"); 
															
																Thread.sleep(2000);
																con5=new ImageIcon(this.getClass().getResource("Rednode.png"));
																l22.setIcon(con5);
																
																Thread.sleep(2000);
																con6=new ImageIcon(this.getClass().getResource("Redcross4.png"));
																lb3.setIcon(con6);
																
																
																Thread.sleep(2000);
																icon44=new ImageIcon(this.getClass().getResource("Greencross3.png"));
																lb2.setIcon(icon44);
																
																
																Thread.sleep(2000);
																icon6=new ImageIcon(this.getClass().getResource("Greennode.png"));
																l11.setIcon(icon6);
																
									
																Statement stm1 = con.createStatement();
																String sql = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn11'";
																ResultSet rss1 = stm1.executeQuery(sql);
																if(rss1.next()==true)
																{
																	
																	
																	FileInputStream fin = new FileInputStream("LBS/BS1/nn11/"+fname+".txt");
																	byte[] b = new byte[fin.available()];
																	fin.read(b);
																	String cont = new String(b);
																	
																	data=enc.decrypt(cont, keyWord);
																
																	Statement srt=con.createStatement();
																	String sqlr="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn11','"+dt+"','Found')";
																	srt.executeUpdate(sqlr);
																	System.out.println("status inserted");
																	
																	lk.setVisible(true);
																	Thread.sleep(900);
																	lk.setVisible(false);
																	Thread.sleep(900);
																	lk.setVisible(true);
																	
																	//lines for n1
																	Thread.sleep(2000);
																	icon3=new ImageIcon(this.getClass().getResource("Greennode.png"));
																	l7.setIcon(icon3);
																	
																	Thread.sleep(2000);
																	icon66=new ImageIcon(this.getClass().getResource("greencross1.png"));
																	l55.setIcon(icon66);
																	
																	DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
																	dout.writeUTF("success");
																	dout.writeUTF(data);
																	 break;	
																	
																}else 
																{
																   //not found	
																	
																	Statement srt=con.createStatement();
																	String sqlr="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn11','"+dt+"','Not Found')";
																	srt.executeUpdate(sqlr);
																	System.out.println("status inserted");
																	
																	Thread.sleep(2000);
																	con3=new ImageIcon(this.getClass().getResource("Rednode.png"));
																	l11.setIcon(con3);
																	
																	Thread.sleep(2000);
																	con4=new ImageIcon(this.getClass().getResource("Redcross3.png"));
																	lb2.setIcon(con4);
																	
																	
																}
																
																
															
																
															}
															
															
															
														
															
														}
													
												
													
												}
												
											
											
												
												
											}
											else if(nodename.equalsIgnoreCase("nn2"))
											{
												
												Thread.sleep(2000);
												icon22=new ImageIcon(this.getClass().getResource("greendown.png"));
												l66.setIcon(icon22);
												
												
												
												Thread.sleep(2000);
												icon4=new ImageIcon(this.getClass().getResource("Greennode.png"));
												l8.setIcon(icon4);
												
												Statement stmt01 = con.createStatement();
												String sql01 = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn2'";
												ResultSet rs01 = stmt01.executeQuery(sql01);
												if(rs01.next()==true)
												{
													
													
													FileInputStream fin = new FileInputStream("LBS/BS1/nn2/"+fname+".txt");
													byte[] b = new byte[fin.available()];
													fin.read(b);
													String cont = new String(b);
													data=enc.decrypt(cont, keyWord);
												
													Statement st=con.createStatement();
													String sql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn2','"+dt+"','Found')";
													st.executeUpdate(sql);
													System.out.println("status inserted");
													
													lk.setVisible(true);
													Thread.sleep(900);
													lk.setVisible(false);
													Thread.sleep(900);
													lk.setVisible(true);
													
													DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
													dout.writeUTF("success");
													dout.writeUTF(data);
													 break;	
													
												}
												else if(rs01.next()==false)
												{
												       //no file
													

													Statement st=con.createStatement();
													String sql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn2','"+dt+"','Not Found')";
													st.executeUpdate(sql);
													System.out.println("status inserted");
													
													Thread.sleep(2000);
													con7=new ImageIcon(this.getClass().getResource("Rednode.png"));
													l8.setIcon(con7);
													
													Thread.sleep(2000);
													con8=new ImageIcon(this.getClass().getResource("Reddown.png"));
													l66.setIcon(con8);
													
												}
											}
											else if(nodename.equalsIgnoreCase("nn3"))
											{
												Thread.sleep(2000);
												icon33=new ImageIcon(this.getClass().getResource("Greencross2.png"));
												l77.setIcon(icon33);
												
												
												Thread.sleep(2000);
												icon5=new ImageIcon(this.getClass().getResource("Greennode.png"));
												l9.setIcon(icon5);
												
												
												Statement stmt01 = con.createStatement();
												String sql01 = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn3'";
												ResultSet rs01 = stmt01.executeQuery(sql01);
												if(rs01.next()==true)
												{
													
													
													FileInputStream fin = new FileInputStream("LBS/BS1/nn3/"+fname+".txt");
													byte[] b = new byte[fin.available()];
													fin.read(b);
													String cont = new String(b);
													
													data=enc.decrypt(cont, keyWord);
												
													Statement st=con.createStatement();
													String sql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn3','"+dt+"','Found')";
													st.executeUpdate(sql);
													System.out.println("status inserted");
													
													lk.setVisible(true);
													Thread.sleep(900);
													lk.setVisible(false);
													Thread.sleep(900);
													lk.setVisible(true);
													
													DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
													dout.writeUTF("success");
													dout.writeUTF(data);
													 break;	
													
												}
												else if(rs01.next()==false)
												{
													
													//no file
													
													Statement st=con.createStatement();
													String sql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn3','"+dt+"','Not Found')";
													st.executeUpdate(sql);
													System.out.println("status inserted");
													
													Thread.sleep(2000);
													con9=new ImageIcon(this.getClass().getResource("Rednode.png"));
													l9.setIcon(con9);
													
													Thread.sleep(2000);
													con11=new ImageIcon(this.getClass().getResource("Redcross2.png"));
													l77.setIcon(con11);
													
												
												}
												
												
												
												
												
											}

										}else 
											if(count==3)              //count  3
											{
								
												
												String nodename=rs51.getString(1);
												System.out.println("node name    "+nodename);
												
												if(nodename.equalsIgnoreCase("nn1"))
												{
													
													Thread.sleep(2000);
													icon66=new ImageIcon(this.getClass().getResource("greencross1.png"));
													l55.setIcon(icon66);
													
													Thread.sleep(2000);
													icon3=new ImageIcon(this.getClass().getResource("Greennode.png"));
													l7.setIcon(icon3);
													
													
													Statement stmt01 = con.createStatement();
													String sql01 = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn1'";
													ResultSet rs01 = stmt01.executeQuery(sql01);
									        		if(rs01.next()==true)
													  {
														
														
														FileInputStream fin = new FileInputStream("LBS/BS1/nn1/"+fname+".txt");
														byte[] b = new byte[fin.available()];
														fin.read(b);
														String cont = new String(b);
														
														data=enc.decrypt(cont, keyWord);
													
														Statement st=con.createStatement();
														String sql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn1','"+dt+"','Found')";
														st.executeUpdate(sql);
														System.out.println("status inserted");
														
														lk.setVisible(true);
														Thread.sleep(900);
														lk.setVisible(false);
														Thread.sleep(900);
														lk.setVisible(true);
														
														DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
														dout.writeUTF("success");
														dout.writeUTF(data);
														
													 break;	
														
													}
													else if(rs01.next()==false)
													{
														//no file
														
														Statement st5=con.createStatement();
														String sql511="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn1','"+dt+"','Not Found')";
														st5.executeUpdate(sql511);
														System.out.println("status inserted");
														
														
														Thread.sleep(2000);
														con1=new ImageIcon(this.getClass().getResource("Rednode.png"));
														l7.setIcon(con1);
														
														Thread.sleep(2000);
														con2=new ImageIcon(this.getClass().getResource("Redcross1.png"));
														l55.setIcon(con2);
														
														//no file
														
														int mn1=0;
														int mn2=0;
														
														Statement stmt1 = con.createStatement();
														String sql1 = "select * from NN1 where NNodes='nn11'";
														ResultSet rs1 = stmt1.executeQuery(sql1);
														if(rs1.next()==true)
														{
															mn1=rs1.getInt(2);
															System.out.println(" dist  "  +mn1);
															
														}
														
														Statement stmt2 = con.createStatement();
														String sql2 = "select * from NN1 where NNodes='nn111'";
														ResultSet rs2 = stmt2.executeQuery(sql2);
														if(rs2.next()==true)
														{
															mn2=rs2.getInt(2);
														}
														
														System.out.println(mn1);
														System.out.println(mn2);
														
														
														if(mn1<mn2)
														{
															
															Thread.sleep(2000);
															icon44=new ImageIcon(this.getClass().getResource("Greencross3.png"));
															lb2.setIcon(icon44);
															
															
															Thread.sleep(2000);
															icon6=new ImageIcon(this.getClass().getResource("Greennode.png"));
															l11.setIcon(icon6);
															
								
															Statement stm1 = con.createStatement();
															String sql = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn11'";
															ResultSet rss1 = stm1.executeQuery(sql);
															if(rss1.next()==true)
															{
																
																
																FileInputStream fin = new FileInputStream("LBS/BS1/nn11/"+fname+".txt");
																byte[] b = new byte[fin.available()];
																fin.read(b);
																String cont = new String(b);
																
																data=enc.decrypt(cont, keyWord);
															
																Statement stn=con.createStatement();
																String sqln="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn11','"+dt+"','Found')";
																stn.executeUpdate(sqln);
																System.out.println("status inserted");
																
																
																
																lk.setVisible(true);
																Thread.sleep(900);
																lk.setVisible(false);
																Thread.sleep(900);
																lk.setVisible(true);
																
																//lines for n1
																Thread.sleep(2000);
																icon3=new ImageIcon(this.getClass().getResource("Greennode.png"));
																l7.setIcon(icon3);
																
																Thread.sleep(2000);
																icon66=new ImageIcon(this.getClass().getResource("greencross1.png"));
																l55.setIcon(icon66);
																
																DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
																dout.writeUTF("success");
																dout.writeUTF(data);
																 break;	
																
															}
															else if(rss1.next()==false)
															{
																//no fiule
																
																Statement stn=con.createStatement();
																String sqln="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn11','"+dt+"','Not Found')";
																stn.executeUpdate(sqln);
																System.out.println("status inserted");
															
																

																Thread.sleep(2000);
																con3=new ImageIcon(this.getClass().getResource("Rednode.png"));
																l11.setIcon(con3);
																
																Thread.sleep(2000);
																con4=new ImageIcon(this.getClass().getResource("Redcross3.png"));
																lb2.setIcon(con4);
																
																Thread.sleep(2000);
																icon55=new ImageIcon(this.getClass().getResource("Greencross4.png"));
																lb3.setIcon(icon55);
																
														
																Thread.sleep(2000);
																icon7=new ImageIcon(this.getClass().getResource("Greennode.png"));
																l22.setIcon(icon7);
																
																
																Statement st = con.createStatement();
																String sqq = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn111'";
																ResultSet rss = st.executeQuery(sqq);
																if(rss.next()==true)
																{
																	
																	
																	FileInputStream fin = new FileInputStream("LBS/BS1/nn111/"+fname+".txt");
																	byte[] b = new byte[fin.available()];
																	fin.read(b);
																	String cont = new String(b);
																	
																	data=enc.decrypt(cont, keyWord);
																
																	Statement pst=con.createStatement();
																	String psql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn111','"+dt+"','Found')";
																	pst.executeUpdate(psql);
																	System.out.println("status inserted");
																	
																	lk.setVisible(true);
																	Thread.sleep(900);
																	lk.setVisible(false);
																	Thread.sleep(900);
																	lk.setVisible(true);
																	
																	//lines for n1
																	Thread.sleep(2000);
																	icon3=new ImageIcon(this.getClass().getResource("Greennode.png"));
																	l7.setIcon(icon3);
																	
																	Thread.sleep(2000);
																	icon66=new ImageIcon(this.getClass().getResource("greencross1.png"));
																	l55.setIcon(icon66);
																	
																	DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
																	dout.writeUTF("success");
																	dout.writeUTF(data);
																	
																     break;	
																	
																}
																else if(rss.next()==false)
																{
																	//no files
																	
																	Statement pst=con.createStatement();
																	String psql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn111','"+dt+"','Not nFound')";
																	pst.executeUpdate(psql);
																	System.out.println("status inserted");
																	
																	Thread.sleep(2000);
																	con5=new ImageIcon(this.getClass().getResource("Rednode.png"));
																	l22.setIcon(con5);
																	
																	Thread.sleep(2000);
																	con6=new ImageIcon(this.getClass().getResource("Redcross4.png"));
																	lb3.setIcon(con6);
																	
																	Thread.sleep(2000);
																	con888=new ImageIcon(this.getClass().getResource("Redstation.png"));
																	l2.setIcon(con888);
																	
																	
																	checkr2(fname,sk,sc,user);
																}
															
																
															}
											
														} 
															if(mn2<mn1)
															{
																Thread.sleep(2000);
																icon55=new ImageIcon(this.getClass().getResource("Greencross4.png"));
																lb3.setIcon(icon55);
																
														
																Thread.sleep(2000);
																icon7=new ImageIcon(this.getClass().getResource("Greennode.png"));
																l22.setIcon(icon7);
																
																
																Statement st = con.createStatement();
																String sqq = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn111'";
																ResultSet rss = st.executeQuery(sqq);
																if(rss.next()==true)
																{
																	
																	
																	FileInputStream fin = new FileInputStream("LBS/BS1/nn111/"+fname+".txt");
																	byte[] b = new byte[fin.available()];
																	fin.read(b);
																	String cont = new String(b);
																	
																	data=enc.decrypt(cont, keyWord);
																
																	Statement smmt=con.createStatement();
																	String sqlmm="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn111','"+dt+"','Found')";
																	smmt.executeUpdate(sqlmm);
																	System.out.println("status inserted");
																	
																	
																	
																	lk.setVisible(true);
																	Thread.sleep(900);
																	lk.setVisible(false);
																	Thread.sleep(900);
																	lk.setVisible(true);
																	
																	//lines for n1
																	Thread.sleep(2000);
																	icon3=new ImageIcon(this.getClass().getResource("Greennode.png"));
																	l7.setIcon(icon3);
																	
																	Thread.sleep(2000);
																	icon66=new ImageIcon(this.getClass().getResource("greencross1.png"));
																	l55.setIcon(icon66);
																	
																	DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
																	dout.writeUTF("success");
																	dout.writeUTF(data);
																	
																     break;	
																	
																}
																else if(rs01.next()==false)
																{
																	//no files

																	//no files
																	Statement smmt=con.createStatement();
																	String sqlmm="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn111','"+dt+"','Not Found')";
																	smmt.executeUpdate(sqlmm);
																	System.out.println("status inserted");
																	
																	Thread.sleep(2000);
																	con5=new ImageIcon(this.getClass().getResource("Rednode.png"));
																	l22.setIcon(con5);
																	
																	Thread.sleep(2000);
																	con6=new ImageIcon(this.getClass().getResource("Redcross4.png"));
																	lb3.setIcon(con6);
																	
																	Thread.sleep(2000);
																	icon44=new ImageIcon(this.getClass().getResource("Greencross3.png"));
																	lb2.setIcon(icon44);
																	
																	
																	Thread.sleep(2000);
																	icon6=new ImageIcon(this.getClass().getResource("Greennode.png"));
																	l11.setIcon(icon6);
																	
										
																	Statement stm1 = con.createStatement();
																	String sql = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn11'";
																	ResultSet rss1 = stm1.executeQuery(sql);
																	if(rss1.next()==true)
																	{
																		
																		
																		FileInputStream fin = new FileInputStream("LBS/BS1/nn11/"+fname+".txt");
																		byte[] b = new byte[fin.available()];
																		fin.read(b);
																		String cont = new String(b);
																		
																		data=enc.decrypt(cont, keyWord);
																	
																		Statement xst=con.createStatement();
																		String xsql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn11','"+dt+"','Found')";
																		xst.executeUpdate(xsql);
																		System.out.println("status inserted");
																		
																		lk.setVisible(true);
																		Thread.sleep(900);
																		lk.setVisible(false);
																		Thread.sleep(900);
																		lk.setVisible(true);
																		
																		//lines for n1
																		Thread.sleep(2000);
																		icon3=new ImageIcon(this.getClass().getResource("Greennode.png"));
																		l7.setIcon(icon3);
																		
																		Thread.sleep(2000);
																		icon66=new ImageIcon(this.getClass().getResource("greencross1.png"));
																		l55.setIcon(icon66);
																		
																		DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
																		dout.writeUTF("success");
																		dout.writeUTF(data);
																		 break;	
																		
																	}else 
																	{
																	   //not found	
																		
																		Statement xst=con.createStatement();
																		String xsql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn11','"+dt+"','Not Found')";
																		xst.executeUpdate(xsql);
																		System.out.println("status inserted");
																		
																		
																		Thread.sleep(2000);
																		con3=new ImageIcon(this.getClass().getResource("Rednode.png"));
																		l11.setIcon(con3);
																		
																		Thread.sleep(2000);
																		con4=new ImageIcon(this.getClass().getResource("Redcross3.png"));
																		lb2.setIcon(con4);
																	
																		Thread.sleep(2000);
																		con888=new ImageIcon(this.getClass().getResource("Redstation.png"));
																		l2.setIcon(con888);
																		
																		checkr2(fname,sk,sc,user);
																	}
																	
																	
																
																}
																
																
																
															
																
															}
														
													
														
													}
													
												
												
													
													
												}
												else if(nodename.equalsIgnoreCase("nn2"))
												{
													
													Thread.sleep(2000);
													icon22=new ImageIcon(this.getClass().getResource("greendown.png"));
													l66.setIcon(icon22);
													
													
													
													Thread.sleep(2000);
													icon4=new ImageIcon(this.getClass().getResource("Greennode.png"));
													l8.setIcon(icon4);
													
													Statement stmt01 = con.createStatement();
													String sql01 = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn2'";
													ResultSet rs01 = stmt01.executeQuery(sql01);
													if(rs01.next()==true)
													{
														
														
														FileInputStream fin = new FileInputStream("LBS/BS1/nn2/"+fname+".txt");
														byte[] b = new byte[fin.available()];
														fin.read(b);
														String cont = new String(b);
														
														data=enc.decrypt(cont, keyWord);
													
														Statement st=con.createStatement();
														String sql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn2','"+dt+"','Found')";
														st.executeUpdate(sql);
														System.out.println("status inserted");
														
														lk.setVisible(true);
														Thread.sleep(900);
														lk.setVisible(false);
														Thread.sleep(900);
														lk.setVisible(true);
														
														DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
														dout.writeUTF("success");
														dout.writeUTF(data);
														 break;	
														
													}
													else if(rs01.next()==false)
													{
													       //no file
														Statement st=con.createStatement();
														String sql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn2','"+dt+"','Not Found')";
														st.executeUpdate(sql);
														System.out.println("status inserted");
														
														Thread.sleep(2000);
														con7=new ImageIcon(this.getClass().getResource("Rednode.png"));
														l8.setIcon(con7);
														
														Thread.sleep(2000);
														con8=new ImageIcon(this.getClass().getResource("Reddown.png"));
														l66.setIcon(con8);
														
														Thread.sleep(2000);
														con888=new ImageIcon(this.getClass().getResource("Redstation.png"));
														l2.setIcon(con888);
														
														
														checkr2(fname,sk,sc,user);
													}
												}
												else if(nodename.equalsIgnoreCase("nn3"))
												{
													
													Thread.sleep(2000);
													icon33=new ImageIcon(this.getClass().getResource("Greencross2.png"));
													l77.setIcon(icon33);
													
													
													Thread.sleep(2000);
													icon5=new ImageIcon(this.getClass().getResource("Greennode.png"));
													l9.setIcon(icon5);
													
													Statement stmt01 = con.createStatement();
													String sql01 = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn3'";
													ResultSet rs01 = stmt01.executeQuery(sql01);
													if(rs01.next()==true)
													{
														
														
														FileInputStream fin = new FileInputStream("LBS/BS1/nn3/"+fname+".txt");
														byte[] b = new byte[fin.available()];
														fin.read(b);
														String cont = new String(b);
														
														data=enc.decrypt(cont, keyWord);
													
														Statement st=con.createStatement();
														String sql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn3','"+dt+"','Found')";
														st.executeUpdate(sql);
														System.out.println("status inserted");
														
														lk.setVisible(true);
														Thread.sleep(900);
														lk.setVisible(false);
														Thread.sleep(900);
														lk.setVisible(true);
														
														DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
														dout.writeUTF("success");
														dout.writeUTF(data);
														 break;	
														
													}
													else if(rs01.next()==false)
													{
														
														//no file
														Statement st=con.createStatement();
														String sql="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS1','nn3','"+dt+"','Not Found')";
														st.executeUpdate(sql);
														System.out.println("status inserted");
														
														Thread.sleep(2000);
														con9=new ImageIcon(this.getClass().getResource("Rednode.png"));
														l9.setIcon(con9);
														
														Thread.sleep(2000);
														con11=new ImageIcon(this.getClass().getResource("Redcross2.png"));
														l77.setIcon(con11);
														
														Thread.sleep(2000);
														con888=new ImageIcon(this.getClass().getResource("Redstation.png"));
														l2.setIcon(con888);
														
														checkr2(fname,sk,sc,user);
													}
													
													
													
													
													
												}
												
											}
									} 
									
							}
									
									//Clear all images
					        	 
					        	    Thread.sleep(2000);
									
									l1.setIcon(ic1);
									l2.setIcon(ic2);
									l3.setIcon(ic3);
									l4.setIcon(ic4);
									l5.setIcon(ic5);
									l6.setIcon(ic6);
									l7.setIcon(ic7);
									l8.setIcon(ic8);
									l9.setIcon(ic9);
									l11.setIcon(ic11);
									l22.setIcon(ic22);
									l33.setIcon(ic33);
									l44.setIcon(ic44);
									l55.setIcon(ic55);
									l66.setIcon(ic66);
									l77.setIcon(ic77);
									l88.setIcon(ic88);
									l99.setIcon(ic99);
									
									lb1.setIcon(icc1);
									lb2.setIcon(icc2);
									lb3.setIcon(icc3);
									lb4.setIcon(icc4);
									lb5.setIcon(icc5);
									
									lb6.setIcon(lab1);
									lb7.setIcon(lab2);
									
									//Number label
									lol1.setText("");
									lol2.setText("");
									lol3.setText("");
									lol4.setText("");
									lol5.setText("");
									lol6.setText("");
									lol7.setText("");
									lol8.setText("");
									lol9.setText("");
									lol10.setText("");
									lol1.setText("");
									lk.setVisible(false);
									lk1.setVisible(false);
					
							}
						} catch (Exception e) {
							
						}
						
					
					
					}
					
					if(this.port==6005)
					{
						try 
						{
						  ServerSocket sss=new ServerSocket(6005);
						  while(true)
						  {
							  Socket sc=sss.accept();
							  DataInputStream dis=new DataInputStream(sc.getInputStream());
							  String msg=dis.readUTF();
							  if(msg.equals("Req"))
								  {
								  
								   Vector data=new Vector();
								  
								     DBCon db=new DBCon();
						        	 Connection con=db.getConnection();
						        	 
						        	 Statement st=con.createStatement();
						        	 String sql="select fname from Ownerfiles";
						        	 ResultSet rs=st.executeQuery(sql);
						        	 
						        	 ResultSetMetaData rsm=rs.getMetaData();
						        		int col=rsm.getColumnCount();



						        		            while(rs.next())
						        		             {
						        		Vector row = new Vector();
						        		  for(int i = 1; i <=col; i++){
						        		                   row.addElement(rs.getObject(i));

						        		             }

						        		data.addElement(row);
						        		             }
						        	 
						        	 ObjectOutputStream obj=new ObjectOutputStream(sc.getOutputStream());
										obj.writeObject(data);
										System.out.println("Vector send to user"   +l1);
						        	
								  
								  }
						  }
						} catch (Exception e) {
							// TODO: handle exception
						}
					}
					
					if(this.port==2007)
					{
						try 
						{
						     DBCon db=new DBCon();
				        	 Connection con=db.getConnection();
				        	 AES enc = new AES();
								
							
							ServerSocket ss=new ServerSocket(2007);
							while(true)
							{
								Socket s= ss.accept();
								DataInputStream diis=new DataInputStream(s.getInputStream());
								String fname=diis.readUTF();
								System.out.println("    "+fname);

								Statement stmt = con.createStatement();
								String sql = "select * from Ownerfiles where fname='"+fname+"'";
								ResultSet rs = stmt.executeQuery(sql);
								
								System.out.println("Condiotion checked");
								String content="";
								String file="";
								if(rs.next()==true)
								{
									
									FileInputStream fis = new FileInputStream("server/"+fname);
									byte b[] = new byte[fis.available()];
									fis.read(b);
									content = new String(b);
									System.out.println("getting data");
									
									 file=enc.decrypt(content, keyWord);
								}
								DataOutputStream dos=new DataOutputStream(s.getOutputStream());
								dos.writeUTF(file);
								System.out.println("content dec   "+(content));
								System.out.println("data send to attacker");
							}
						} catch (Exception e) {
							// TODO: handle exception
						}
					}
					
					if(this.port==2009)
					{


						  try 
						  {
				 		     DBCon db=new DBCon();
					        	 Connection con=db.getConnection();
							  
							ServerSocket ss=new ServerSocket(2009);
							while(true)
							{
								AES enc = new AES();
								Socket s=ss.accept();
								DataInputStream dis=new DataInputStream(s.getInputStream());
								String fdata=dis.readUTF();
								String file=dis.readUTF();
						     	System.out.println("new data");
						     	
//						     	String fakedata=(enc.encrypt(fdata, keyWord));
								
						     	FileOutputStream fos = new FileOutputStream("LBS/modified/"+ file);
								fos.write(fdata.getBytes());
								fos.close();
								
						         	//new MAC
								String mac="";
								MessageDigest md = MessageDigest.getInstance("SHA1");
								FileInputStream in1 = new FileInputStream("LBS\\modified\\"
										+ file);
								DigestInputStream dis2 = new DigestInputStream(in1, md);
								BufferedInputStream bd = new BufferedInputStream(dis2);

								while (true) {
									int b2 = bd.read();
									if (b2 == -1)
										break;
								}

								BigInteger bi2 = new BigInteger(md.digest());
								mac = bi2.toString(16);
								System.out.println("The updated mac is:" + mac);
						     	
						     	
								Statement st=con.createStatement();
								String sql="update Ownerfiles set mac='"+mac+"' where fname='"+file+"'";
								st.executeUpdate(sql);
								
								DataOutputStream dos=new DataOutputStream(s.getOutputStream());
								dos.writeUTF("modif");
							
							}
						} catch (Exception e) {
							// TODO: handle exception
						}
					  
					 
					  
				      
					}
					
					if(this.port==1002)
					{
						
						 DBCon db=new DBCon();
			        	 Connection con=db.getConnection();
						try 
						{
						  ServerSocket ss=new ServerSocket(1002);
						  while(true)
						  {
							  Socket s=ss.accept();
							  DataInputStream dis=new DataInputStream( s.getInputStream());
							  String user=dis.readUTF();
							  System.out.println("name taken");
							  
								Statement stmt19 = con.createStatement();
								String sql16 = "delete * from Attacker where Attacker='"+user+"'";
								stmt19.executeUpdate(sql16);
								System.out.println("user deleted successfully");
								
							  DataOutputStream dos=new DataOutputStream(s.getOutputStream());
							  dos.writeUTF("success");
							  
							  
						  }
						} catch (Exception e) {
							// TODO: handle exception
						}
					}
					
					if(this.port==6767)
					{
						 DBCon db=new DBCon();
			        	 Connection con=db.getConnection();
						
						try 
						{
						  ServerSocket ss=new ServerSocket(6767);
						  while(true)
						  {
							  Socket s=ss.accept();
							  DataInputStream dis=new DataInputStream(s.getInputStream());
							  String fname=dis.readUTF();
							  String omac=dis.readUTF();
							  System.out.println("data taken");
							  
								Statement stmt19 = con.createStatement();
								String sql16 = "select * from Ownerfiles where fname='"+fname+"'";
								ResultSet rs=stmt19.executeQuery(sql16);
								
								String mac="";
								
								if(rs.next()==true)
								{
									 mac=rs.getString(6);
									
								}
								
								if(omac.equals(mac))
								{
									DataOutputStream dos=new DataOutputStream(s.getOutputStream());
									dos.writeUTF("safe");
								}else
									if(!omac.equals(mac))
									{
										DataOutputStream dos=new DataOutputStream(s.getOutputStream());
										dos.writeUTF("unsafe");
									}
							  
							  
						  }
						} catch (Exception e) {
							// TODO: handle exception
						}
					}
					
					
				}
				
				
				public void checkr2(String filename,String sk,Socket soc,String user)
				{
					try 
					{
						String fname=filename;
						String sec=sk;
						String user1=user;
						
						System.out.println("file   "+  filename  );
						System.out.println("key   "+  sec  );
						System.out.println("user   "+  user  );
						
						Socket sc = soc;
						String r2 ="BS2";
						
						SimpleDateFormat sdfDate = new SimpleDateFormat(
						"dd/MM/yyyy");
				        SimpleDateFormat sdfTime = new SimpleDateFormat(
						"HH:mm:ss");

				          Date now = new Date();

				          String strDate = sdfDate.format(now);
				          String strTime = sdfTime.format(now);
     
				          String dt = strDate + "   " + strTime;
						
						 DBCon db=new DBCon();
			        	 Connection con=db.getConnection();
			        	 
			        	 String data="";
			        	 AES enc=new AES();
			        	 

							int mn111=0;
							int mn222=0;
							int mn333=0;
							int mn444=0;
							int mn555=0;
		
							Statement stmt19 = con.createStatement();
							String sql16 = "select * from BS2 where NNodes='nn4'";
							ResultSet rs16 = stmt19.executeQuery(sql16);
							if(rs16.next()==true)
							{
								mn111=rs16.getInt(2);
								System.out.println(" dist  "  +mn111);
								
							}
							
							Statement stmt27 = con.createStatement();
							String sql26 = "select * from BS2 where NNodes='nn5'";
							ResultSet rs26 = stmt27.executeQuery(sql26);
							if(rs26.next()==true)
							{
								mn222=rs26.getInt(2);
							}
							
							Statement stmt37 = con.createStatement();
							String sql36 = "select * from BS2 where NNodes='nn6'";
							ResultSet rs36 = stmt37.executeQuery(sql36);
							if(rs36.next()==true)
							{
								mn333=rs36.getInt(2);
							}
							
							Statement stmt47 = con.createStatement();
							String sql46 = "select * from NN2 where NNodes='nn44'";
							ResultSet rs46 = stmt47.executeQuery(sql46);
							if(rs46.next()==true)
							{
								mn444=rs46.getInt(2);
							}
							
							
							Statement stmt57 = con.createStatement();
							String sql56 = "select * from NN2 where NNodes='nn444'";
							ResultSet rs56 = stmt57.executeQuery(sql56);
							if(rs56.next()==true)
							{
								mn555=rs56.getInt(2);
							}
							
							System.out.println(mn111);
							System.out.println(mn222);
							System.out.println(mn333);
							System.out.println(mn444);
							System.out.println(mn555);
							
							String dtt1=Integer.toString(mn111);
	                        String dtt2=Integer.toString(mn222);
	                        String dtt3=Integer.toString(mn333);
	                        String dtt4=Integer.toString(mn444);
	                        String dtt5=Integer.toString(mn555);
							
							lol6.setText(dtt1);
							lol7.setText(dtt2);
							lol8.setText(dtt3);
							lol9.setText(dtt4);
							lol10.setText(dtt5);
			        	 
			        	 
			    
			        	 Statement stmt51 = con.createStatement();
			     		String sql51 = "select * from BS2 where Station='" + r2
			     				+ "' order by Distance asc";
			     		
			     		ResultSet rs51 = stmt51.executeQuery(sql51);
			    		
			    		
			    		int count=0;
			    		while(rs51.next()==true)
			    		{
			    			Thread.sleep(2000);
			    			i2=new ImageIcon(this.getClass().getResource("newlonggreen2.png"));
							lb7.setIcon(i2);
			    			
			    			Thread.sleep(2000);
							i1=new ImageIcon(this.getClass().getResource("Greenstation.png"));
							l3.setIcon(i1);
			    			
			    			
							
							
			    			count++;
			    			if(count==1)
			    			{

								String nodename=rs51.getString(1);
								
								if(nodename.equalsIgnoreCase("nn4"))
								{
									
									Thread.sleep(2000);
									i3=new ImageIcon(this.getClass().getResource("greencross1.png"));    
									l88.setIcon(i3);
									
									Thread.sleep(2000);
									i4=new ImageIcon(this.getClass().getResource("Greennode.png"));
									l4.setIcon(i4);
			
									Statement stmt01 = con.createStatement();
									String sql01 = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn4'";
									ResultSet rs01 = stmt01.executeQuery(sql01);
					        		if(rs01.next()==true)
									  {
										
										
										FileInputStream fin = new FileInputStream("LBS/BS2/nn4/"+fname+".txt");
										byte[] b = new byte[fin.available()];
										fin.read(b);
										String cont = new String(b);
										
										data=enc.decrypt(cont, keyWord);
									
										Statement sto=con.createStatement();
										String sqlo="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS2','nn4','"+dt+"','Found')";
										sto.executeUpdate(sqlo);
										System.out.println("status inserted");
										
										lk.setVisible(true);
										Thread.sleep(900);
										lk.setVisible(false);
										Thread.sleep(900);
										lk.setVisible(true);
										
										DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
										dout.writeUTF("success");
										dout.writeUTF(data);
										
									 break;	
										
									}
									else if(rs01.next()==false)
									{
										//no file
										
										
										Statement s=con.createStatement();
										String sqlop="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS2','nn4','"+dt+"','Not Found')";
										s.executeUpdate(sqlop);
										System.out.println("status inserted");
										
										
										Thread.sleep(2000);
										con55=new ImageIcon(this.getClass().getResource("Rednode.png"));
										l4.setIcon(con55);
										
										
										Thread.sleep(2000);
										con66=new ImageIcon(this.getClass().getResource("Redcross1.png"));    
										l88.setIcon(con66);
										
										
										
										int mn1=0;
										int mn2=0;
										
										Statement stmt1 = con.createStatement();
										String sql1 = "select * from NN2 where NNodes='nn44'";
										ResultSet rs1 = stmt1.executeQuery(sql1);
										
										if(rs1.next()==true)
										{
											mn1=rs1.getInt(2);
											System.out.println(" dist  "  +mn1);
											
										}
										
										Statement stmt2 = con.createStatement();
										String sql2 = "select * from NN2 where NNodes='nn444'";
										ResultSet rs2 = stmt2.executeQuery(sql2);
										if(rs2.next()==true)
										{
											mn2=rs2.getInt(2);
										}
										
										System.out.println(mn1);
										System.out.println(mn2);
										
										if(mn1<mn2)
										{
											
											Thread.sleep(2000);
											i5=new ImageIcon(this.getClass().getResource("Greencross3.png"));
											lb4.setIcon(i5);
											
											Thread.sleep(2000);
											i6=new ImageIcon(this.getClass().getResource("Greennode.png")); //nn44
											l33.setIcon(i6);
											
											
											Statement stm1 = con.createStatement();
											String sql = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn44'";
											ResultSet rss1 = stm1.executeQuery(sql);
											if(rss1.next()==true)
											{
												
												
												FileInputStream fin = new FileInputStream("LBS/BS2/nn44/"+fname+".txt");
												byte[] b = new byte[fin.available()];
												fin.read(b);
												String cont = new String(b);
												
												data=enc.decrypt(cont, keyWord);
											
												Statement sto=con.createStatement();
												String sqlo="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS2','nn44','"+dt+"','Found')";
												sto.executeUpdate(sqlo);
												System.out.println("status inserted");
												
						
												lk.setVisible(true);
												Thread.sleep(900);
												lk.setVisible(false);
												Thread.sleep(900);
												lk.setVisible(true);
												
												//lines for nn4
												Thread.sleep(2000);
												i4=new ImageIcon(this.getClass().getResource("Greennode.png"));
												l4.setIcon(i4);
												
												Thread.sleep(2000);
												i3=new ImageIcon(this.getClass().getResource("greencross1.png"));    
												l88.setIcon(i3);
												
												DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
												dout.writeUTF("success");
												dout.writeUTF(data);
												 break;	
												
											}
											else 
												if(rss1.next()==false)
											{
												//no file
													
													
													Statement stto=con.createStatement();
													String sqloo="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS2','nn44','"+dt+"','Not Found')";
													stto.executeUpdate(sqloo);
													System.out.println("status inserted");
													
													
													Thread.sleep(2000);
													con88=new ImageIcon(this.getClass().getResource("Rednode.png")); //nn44
													l33.setIcon(con88);
													
													Thread.sleep(2000);
													con77=new ImageIcon(this.getClass().getResource("Redcross3.png"));
													lb4.setIcon(con77);
													
													
													Thread.sleep(2000);
													i7=new ImageIcon(this.getClass().getResource("Greencross4.png"));
													lb5.setIcon(i7);
													
													Thread.sleep(2000);
													i8=new ImageIcon(this.getClass().getResource("Greennode.png")); //nn444
													l44.setIcon(i8);
													
													
												Statement st = con.createStatement();
												String sqq = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn444'";
												ResultSet rss = st.executeQuery(sqq);
												if(rss.next()==true)
												{
													
													
													FileInputStream fin = new FileInputStream("LBS/BS2/nn444/"+fname+".txt");
													byte[] b = new byte[fin.available()];
													fin.read(b);
													String cont = new String(b);
													
													data=enc.decrypt(cont, keyWord);
												
													Statement sto=con.createStatement();
													String sqlo="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS2','nn444','"+dt+"','Found')";
													sto.executeUpdate(sqlo);
													System.out.println("status inserted");
													
													lk.setVisible(true);
													Thread.sleep(900);
													lk.setVisible(false);
													Thread.sleep(900);
													lk.setVisible(true);
													
													//lines for nn4
													Thread.sleep(2000);
													i4=new ImageIcon(this.getClass().getResource("Greennode.png"));
													l4.setIcon(i4);
													
													Thread.sleep(2000);
													i3=new ImageIcon(this.getClass().getResource("greencross1.png"));    
													l88.setIcon(i3);
													
													DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
													dout.writeUTF("success");
													dout.writeUTF(data);
													
												     break;	
													
												}
												else if(rss.next()==false)
												{
													//no files
													
													Statement sto=con.createStatement();
													String sqlo="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS2','nn444','"+dt+"','Not Found')";
													sto.executeUpdate(sqlo);
													System.out.println("status inserted");
													
												
													Thread.sleep(2000);
													i8=new ImageIcon(this.getClass().getResource("Rednode.png")); //nn444
													l44.setIcon(i8);
													
													Thread.sleep(2000);
													con99=new ImageIcon(this.getClass().getResource("Redcross4.png"));
													lb5.setIcon(con99);
													
													
												}
											}
							
										} 
										
										if(mn2<mn1)
										{
											
											Thread.sleep(2000);
											i7=new ImageIcon(this.getClass().getResource("Greencross4.png"));
											lb5.setIcon(i7);
											
											Thread.sleep(2000);
											i8=new ImageIcon(this.getClass().getResource("Greennode.png")); //nn444
											l44.setIcon(i8);
						
											Statement st = con.createStatement();
											String sqq = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn444'";
											ResultSet rss = st.executeQuery(sqq);
											if(rss.next()==true)
											{
												
												
												FileInputStream fin = new FileInputStream("LBS/BS2/nn444/"+fname+".txt");
												byte[] b = new byte[fin.available()];
												fin.read(b);
												String cont = new String(b);
												
												data=enc.decrypt(cont, keyWord);
											
												Statement sto=con.createStatement();
												String sqlo="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS2','nn444','"+dt+"','Found')";
												sto.executeUpdate(sqlo);
												System.out.println("status inserted");
												
												
												
												
												lk.setVisible(true);
												Thread.sleep(900);
												lk.setVisible(false);
												Thread.sleep(900);
												lk.setVisible(true);
												
												//lines for nn4
												Thread.sleep(2000);
												i4=new ImageIcon(this.getClass().getResource("Greennode.png"));
												l4.setIcon(i4);
												
												Thread.sleep(2000);
												i3=new ImageIcon(this.getClass().getResource("greencross1.png"));    
												l88.setIcon(i3);
												
												DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
												dout.writeUTF("success");
												dout.writeUTF(data);
												
											     break;	
												
											}
											else 
												if(rss.next()==false)
											{
												//no files
												
													Statement sty=con.createStatement();
													String sqly="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS2','nn444','"+dt+"','Not Found')";
													sty.executeUpdate(sqly);
													System.out.println("status inserted");
													
													
													
													Thread.sleep(2000);
													i8=new ImageIcon(this.getClass().getResource("Rednode.png")); //nn444
													l44.setIcon(i8);
													
													Thread.sleep(2000);
													con99=new ImageIcon(this.getClass().getResource("Redcross4.png"));
													lb5.setIcon(con99);
													
													
													
													
													Thread.sleep(2000);
													i5=new ImageIcon(this.getClass().getResource("Greencross3.png"));
													lb4.setIcon(i5);
													
													Thread.sleep(2000);
													i6=new ImageIcon(this.getClass().getResource("Greennode.png")); //nn44
													l33.setIcon(i6);
													
													
												Statement stm1 = con.createStatement();
												String sql = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn44'";
												ResultSet rss1 = stm1.executeQuery(sql);
												if(rss1.next()==true)
												{
													
													
													FileInputStream fin = new FileInputStream("LBS/BS2/nn44/"+fname+".txt");
													byte[] b = new byte[fin.available()];
													fin.read(b);
													String cont = new String(b);
													
													data=enc.decrypt(cont, keyWord);
												
													Statement sto=con.createStatement();
													String sqlo="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS2','nn44','"+dt+"','Found')";
													sto.executeUpdate(sqlo);
													System.out.println("status inserted");
													
													lk.setVisible(true);
													Thread.sleep(900);
													lk.setVisible(false);
													Thread.sleep(900);
													lk.setVisible(true);
													
													//lines for nn4
													Thread.sleep(2000);
													i4=new ImageIcon(this.getClass().getResource("Greennode.png"));
													l4.setIcon(i4);
													
													Thread.sleep(2000);
													i3=new ImageIcon(this.getClass().getResource("greencross1.png"));    
													l88.setIcon(i3);
													
													DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
													dout.writeUTF("success");
													dout.writeUTF(data);
													 break;	
													
												}else 
												{
												   //not found	
													
													Statement sto=con.createStatement();
													String sqlo="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS2','nn44','"+dt+"','Not Found')";
													sto.executeUpdate(sqlo);
													System.out.println("status inserted");
													
													
													Thread.sleep(2000);
													con88=new ImageIcon(this.getClass().getResource("Rednode.png")); //nn44
													l33.setIcon(con88);
													
													Thread.sleep(2000);
													con77=new ImageIcon(this.getClass().getResource("Redcross3.png"));
													lb4.setIcon(con77);
													
													
												}
												
											}
											
										}
										
										
										
									}
									
								
								
									
									
								}
								else if(nodename.equalsIgnoreCase("nn5"))
								{
									Thread.sleep(2000);
									i7=new ImageIcon(this.getClass().getResource("Blackdown.png"));     
									l99.setIcon(i7);
									
									Thread.sleep(2000);
									i8=new ImageIcon(this.getClass().getResource("Greennode.png"));   //nn5
									l5.setIcon(i8);
									
									Statement stmt01 = con.createStatement();
									String sql01 = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn5'";
									ResultSet rs01 = stmt01.executeQuery(sql01);
									if(rs01.next()==true)
									{
										
										
										FileInputStream fin = new FileInputStream("LBS/BS2/nn5/"+fname+".txt");
										byte[] b = new byte[fin.available()];
										fin.read(b);
										String cont = new String(b);
										
										data=enc.decrypt(cont, keyWord);
									
										Statement sto=con.createStatement();
										String sqlo="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS2','nn5','"+dt+"','Found')";
										sto.executeUpdate(sqlo);
										System.out.println("status inserted");
										
										lk.setVisible(true);
										Thread.sleep(900);
										lk.setVisible(false);
										Thread.sleep(900);
										lk.setVisible(true);
										
										DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
										dout.writeUTF("success");
										dout.writeUTF(data);
										 break;	
										
									}
									else if(rs01.next()==false)
									{
									       //no file
										Statement sto=con.createStatement();
										String sqlo="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS2','nn5','"+dt+"','Not Found')";
										sto.executeUpdate(sqlo);
										System.out.println("status inserted");
										
										
										Thread.sleep(2000);
										con222=new ImageIcon(this.getClass().getResource("Rednode.png"));   //nn5
										l5.setIcon(con222);
										
										Thread.sleep(2000);
										con111=new ImageIcon(this.getClass().getResource("Reddown.png"));     
										l99.setIcon(con111);
										
										
										
									}
								}
								else if(nodename.equalsIgnoreCase("nn6"))
								{
									Thread.sleep(2000);
									i9=new ImageIcon(this.getClass().getResource("Greencross2.png"));    
									lb1.setIcon(i9);
									
									Thread.sleep(2000);
									i11=new ImageIcon(this.getClass().getResource("Greennode.png"));   //nn6
									l6.setIcon(i11);
									
									Statement stmt01 = con.createStatement();
									String sql01 = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn6'";
									ResultSet rs01 = stmt01.executeQuery(sql01);
									if(rs01.next()==true)
									{
										
										
										FileInputStream fin = new FileInputStream("LBS/BS2/nn6/"+fname+".txt");
										byte[] b = new byte[fin.available()];
										fin.read(b);
										String cont = new String(b);
										
										data=enc.decrypt(cont, keyWord);
									
										Statement sto=con.createStatement();
										String sqlo="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS2','nn6','"+dt+"','Found')";
										sto.executeUpdate(sqlo);
										System.out.println("status inserted");
										
										lk.setVisible(true);
										Thread.sleep(900);
										lk.setVisible(false);
										Thread.sleep(900);
										lk.setVisible(true);
										
										DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
										dout.writeUTF("success");
										dout.writeUTF(data);
										 break;	
										
									}
									else if(rs01.next()==false)
									{
										
										//no file
										Statement sto=con.createStatement();
										String sqlo="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS2','nn6','"+dt+"','Not Found')";
										sto.executeUpdate(sqlo);
										System.out.println("status inserted");
										
										Thread.sleep(2000);
										con444=new ImageIcon(this.getClass().getResource("Rednode.png"));   //nn6
										l6.setIcon(con444);
										
										Thread.sleep(2000);
										con333=new ImageIcon(this.getClass().getResource("Redcross2.png"));    
										lb1.setIcon(con333);
										
									}
									
									
									
									
									
								}
			
									
			    			}else  
			    				if(count==2)     //count  2(BS2)
			    				{
									String nodename=rs51.getString(1);
									
									if(nodename.equalsIgnoreCase("nn4"))
									{
										
										Thread.sleep(2000);
										i3=new ImageIcon(this.getClass().getResource("greencross1.png"));    
										l88.setIcon(i3);
										
										Thread.sleep(2000);
										i4=new ImageIcon(this.getClass().getResource("Greennode.png"));
										l4.setIcon(i4);
										
										Statement stmt01 = con.createStatement();
										String sql01 = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn4'";
										ResultSet rs01 = stmt01.executeQuery(sql01);
						        		if(rs01.next()==true)
										  {
											
											
											FileInputStream fin = new FileInputStream("LBS/BS2/nn4/"+fname+".txt");
											byte[] b = new byte[fin.available()];
											fin.read(b);
											String cont = new String(b);
											
											data=enc.decrypt(cont, keyWord);
										
											Statement sto=con.createStatement();
											String sqlo="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS2','nn4',"+dt+"','Found')";
											sto.executeUpdate(sqlo);
											System.out.println("status inserted");
											
											lk.setVisible(true);
											Thread.sleep(900);
											lk.setVisible(false);
											Thread.sleep(900);
											lk.setVisible(true);
											
											DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
											dout.writeUTF("success");
											dout.writeUTF(data);
											
										 break;	
											
										}
										else if(rs01.next()==false)
										{
											//no file

											Statement staa=con.createStatement();
											String sqlaa="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS2','nn4',"+dt+"','Not Found')";
											staa.executeUpdate(sqlaa);
											System.out.println("status inserted");
											
											Thread.sleep(2000);
											con55=new ImageIcon(this.getClass().getResource("Rednode.png"));
											l4.setIcon(con55);
											
											
											Thread.sleep(2000);
											con66=new ImageIcon(this.getClass().getResource("Redcross1.png"));    
											l88.setIcon(con66);
											
											
											int mn1=0;
											int mn2=0;
											
											Statement stmt1 = con.createStatement();
											String sql1 = "select * from NN2 where NNodes='nn44'";
											ResultSet rs1 = stmt1.executeQuery(sql1);
											
											if(rs1.next()==true)
											{
												mn1=rs1.getInt(2);
												System.out.println(" dist  "  +mn1);
												
											}
											
											Statement stmt2 = con.createStatement();
											String sql2 = "select * from NN2 where NNodes='nn444'";
											ResultSet rs2 = stmt2.executeQuery(sql2);
											if(rs2.next()==true)
											{
												mn2=rs2.getInt(2);
											}
											
											System.out.println(mn1);
											System.out.println(mn2);
											
											if(mn1<mn2)
											{
												
												Thread.sleep(2000);
												i5=new ImageIcon(this.getClass().getResource("Greencross3.png"));
												lb4.setIcon(i5);
												
												Thread.sleep(2000);
												i6=new ImageIcon(this.getClass().getResource("Greennode.png")); //nn44
												l33.setIcon(i6);
												
												
												
												Statement stm1 = con.createStatement();
												String sql = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn44'";
												ResultSet rss1 = stm1.executeQuery(sql);
												if(rss1.next()==true)
												{
													
													
													FileInputStream fin = new FileInputStream("LBS/BS2/nn44/"+fname+".txt");
													byte[] b = new byte[fin.available()];
													fin.read(b);
													String cont = new String(b);
													
													data=enc.decrypt(cont, keyWord);
												
													Statement sto=con.createStatement();
													String sqlo="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS2','nn44','"+dt+"','Found')";
													sto.executeUpdate(sqlo);
													System.out.println("status inserted");
													
													
													
													lk.setVisible(true);
													Thread.sleep(900);
													lk.setVisible(false);
													Thread.sleep(900);
													lk.setVisible(true);
													
													//lines for nn4
													Thread.sleep(2000);
													i4=new ImageIcon(this.getClass().getResource("Greennode.png"));
													l4.setIcon(i4);
													
													Thread.sleep(2000);
													i3=new ImageIcon(this.getClass().getResource("greencross1.png"));    
													l88.setIcon(i3);
													
													DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
													dout.writeUTF("success");
													dout.writeUTF(data);
													 break;	
													
												}
												else 
													if(rss1.next()==false)
												{
													//no file
														
														Statement stl=con.createStatement();
														String sqlh="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS2','nn44','"+dt+"','Not Found')";
														stl.executeUpdate(sqlh);
														System.out.println("status inserted");
														
														
														
														Thread.sleep(2000);
														con88=new ImageIcon(this.getClass().getResource("Rednode.png")); //nn44
														l33.setIcon(con88);
														
														Thread.sleep(2000);
														con77=new ImageIcon(this.getClass().getResource("Redcross3.png"));
														lb4.setIcon(con77);
														
														Thread.sleep(2000);
														i7=new ImageIcon(this.getClass().getResource("Greencross4.png"));
														lb5.setIcon(i7);
														
														Thread.sleep(2000);
														i8=new ImageIcon(this.getClass().getResource("Greennode.png")); //nn444
														l44.setIcon(i8);
														
													Statement st = con.createStatement();
													String sqq = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn444'";
													ResultSet rss = st.executeQuery(sqq);
													if(rss.next()==true)
													{
														
														
														FileInputStream fin = new FileInputStream("LBS/BS2/nn444/"+fname+".txt");
														byte[] b = new byte[fin.available()];
														fin.read(b);
														String cont = new String(b);
														
														data=enc.decrypt(cont, keyWord);
													
														Statement sto=con.createStatement();
														String sqlo="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS2','nn444','"+dt+"','Found')";
														sto.executeUpdate(sqlo);
														System.out.println("status inserted");
														
														lk.setVisible(true);
														Thread.sleep(900);
														lk.setVisible(false);
														Thread.sleep(900);
														lk.setVisible(true);
														
														//lines for nn4
														Thread.sleep(2000);
														i4=new ImageIcon(this.getClass().getResource("Greennode.png"));
														l4.setIcon(i4);
														
														Thread.sleep(2000);
														i3=new ImageIcon(this.getClass().getResource("greencross1.png"));    
														l88.setIcon(i3);
														
														DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
														dout.writeUTF("success");
														dout.writeUTF(data);
														
													     break;	
														
													}
													else if(rss.next()==false)
													{
														//no files
														Statement sto=con.createStatement();
														String sqlo="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS2','nn444','"+dt+"','Not Found')";
														sto.executeUpdate(sqlo);
														System.out.println("status inserted");
														
														
														
														Thread.sleep(2000);
														i8=new ImageIcon(this.getClass().getResource("Rednode.png")); //nn444
														l44.setIcon(i8);
														
														Thread.sleep(2000);
														con99=new ImageIcon(this.getClass().getResource("Redcross4.png"));
														lb5.setIcon(con99);
														
														
													}
												}
								
											} 
											
											if(mn2<mn1)
											{
							
												Statement st = con.createStatement();
												String sqq = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn444'";
												ResultSet rss = st.executeQuery(sqq);
												if(rss.next()==true)
												{
													Thread.sleep(2000);
													i7=new ImageIcon(this.getClass().getResource("Greencross4.png"));
													lb5.setIcon(i7);
													
													Thread.sleep(2000);
													i8=new ImageIcon(this.getClass().getResource("Greennode.png")); //nn444
													l44.setIcon(i8);
													
													FileInputStream fin = new FileInputStream("LBS/BS2/nn444/"+fname+".txt");
													byte[] b = new byte[fin.available()];
													fin.read(b);
													String cont = new String(b);
													
													data=enc.decrypt(cont, keyWord);
												
													Statement sto=con.createStatement();
													String sqlo="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS2','nn444','"+dt+"','Found')";
													sto.executeUpdate(sqlo);
													System.out.println("status inserted");
													
													
													
													lk.setVisible(true);
													Thread.sleep(900);
													lk.setVisible(false);
													Thread.sleep(900);
													lk.setVisible(true);
													
													//lines for nn4
													Thread.sleep(2000);
													i4=new ImageIcon(this.getClass().getResource("Greennode.png"));
													l4.setIcon(i4);
													
													Thread.sleep(2000);
													i3=new ImageIcon(this.getClass().getResource("greencross1.png"));    
													l88.setIcon(i3);
													
													DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
													dout.writeUTF("success");
													dout.writeUTF(data);
													
												     break;	
													
												}
												else 
													if(rss.next()==false)
												{
													//no files
														Statement std=con.createStatement();
														String sqld="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS2','nn444','"+dt+"','Not Found')";
														std.executeUpdate(sqld);
														System.out.println("status inserted");
														
														
														Thread.sleep(2000);
														i8=new ImageIcon(this.getClass().getResource("Rednode.png")); //nn444
														l44.setIcon(i8);
														
														
														Thread.sleep(2000);
														con99=new ImageIcon(this.getClass().getResource("Redcross4.png"));
														lb5.setIcon(con99);
														
														
													
													Statement stm1 = con.createStatement();
													String sql = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn44'";
													ResultSet rss1 = stm1.executeQuery(sql);
													if(rss1.next()==true)
													{
														Thread.sleep(2000);
														i5=new ImageIcon(this.getClass().getResource("Greencross3.png"));
														lb4.setIcon(i5);
														
														Thread.sleep(2000);
														i6=new ImageIcon(this.getClass().getResource("Greennode.png")); //nn44
														l33.setIcon(i6);
														
														FileInputStream fin = new FileInputStream("LBS/BS2/nn44/"+fname+".txt");
														byte[] b = new byte[fin.available()];
														fin.read(b);
														String cont = new String(b);
														
														data=enc.decrypt(cont, keyWord);
													
														Statement sto=con.createStatement();
														String sqlo="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS2','nn44','"+dt+"','Found')";
														sto.executeUpdate(sqlo);
														System.out.println("status inserted");
														
														lk.setVisible(true);
														Thread.sleep(900);
														lk.setVisible(false);
														Thread.sleep(900);
														lk.setVisible(true);
														
														//lines for nn4
														Thread.sleep(2000);
														i4=new ImageIcon(this.getClass().getResource("Greennode.png"));
														l4.setIcon(i4);
														
														Thread.sleep(2000);
														i3=new ImageIcon(this.getClass().getResource("greencross1.png"));    
														l88.setIcon(i3);
														
														DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
														dout.writeUTF("success");
														dout.writeUTF(data);
														 break;	
														
													}else 
													{
													   //not found	
														Statement skl=con.createStatement();
														String sqbl="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS2','nn44','"+dt+"','Not Found')";
														skl.executeUpdate(sqbl);
														System.out.println("status inserted");
														
														Thread.sleep(2000);
														con88=new ImageIcon(this.getClass().getResource("Rednode.png")); //nn44
														l33.setIcon(con88);
														
														Thread.sleep(2000);
														con77=new ImageIcon(this.getClass().getResource("Redcross3.png"));
														lb4.setIcon(con77);
														
													}
													
												}
												
												
												
											
												
											}
											
											
											
										
										}
										
									
									
										
										
									}
									else if(nodename.equalsIgnoreCase("nn5"))
									{
										
										Thread.sleep(2000);
										i7=new ImageIcon(this.getClass().getResource("greendown.png"));     
										l99.setIcon(i7);
										
										Thread.sleep(2000);
										i8=new ImageIcon(this.getClass().getResource("Greennode.png"));   //nn5
										l5.setIcon(i8);
										
										Statement stmt01 = con.createStatement();
										String sql01 = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn5'";
										ResultSet rs01 = stmt01.executeQuery(sql01);
										if(rs01.next()==true)
										{
											
											
											FileInputStream fin = new FileInputStream("LBS/BS2/nn5/"+fname+".txt");
											byte[] b = new byte[fin.available()];
											fin.read(b);
											String cont = new String(b);
											
											data=enc.decrypt(cont, keyWord);
										
											Statement sto=con.createStatement();
											String sqlo="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS2','nn5','"+dt+"','Found')";
											sto.executeUpdate(sqlo);
											System.out.println("status inserted");
											
											lk.setVisible(true);
											Thread.sleep(900);
											lk.setVisible(false);
											Thread.sleep(900);
											lk.setVisible(true);
											
											DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
											dout.writeUTF("success");
											dout.writeUTF(data);
											 break;	
											
										}
										else if(rs01.next()==false)
										{
										       //no file
											Statement sto=con.createStatement();
											String sqlo="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS2','nn5','"+dt+"','Not Found')";
											sto.executeUpdate(sqlo);
											System.out.println("status inserted");
											
											
											
											Thread.sleep(2000);
											con222=new ImageIcon(this.getClass().getResource("Rednode.png"));   //nn5
											l5.setIcon(con222);
											
											Thread.sleep(2000);
											con111=new ImageIcon(this.getClass().getResource("Reddown.png"));     
											l99.setIcon(con111);
											
										}
									}
									else if(nodename.equalsIgnoreCase("nn6"))
									{
										Thread.sleep(2000);
										i9=new ImageIcon(this.getClass().getResource("Greencross2.png"));    
										lb1.setIcon(i9);
										
										Thread.sleep(2000);
										i11=new ImageIcon(this.getClass().getResource("Greennode.png"));   //nn6
										l6.setIcon(i11);
										
										
										Statement stmt01 = con.createStatement();
										String sql01 = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn6'";
										ResultSet rs01 = stmt01.executeQuery(sql01);
										if(rs01.next()==true)
										{
											
											
											FileInputStream fin = new FileInputStream("LBS/BS2/nn6/"+fname+".txt");
											byte[] b = new byte[fin.available()];
											fin.read(b);
											String cont = new String(b);
											
											data=enc.decrypt(cont, keyWord);
										
											Statement sto=con.createStatement();
											String sqlo="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS2','nn6','"+dt+"','Found')";
											sto.executeUpdate(sqlo);
											System.out.println("status inserted");
											
											lk.setVisible(true);
											Thread.sleep(900);
											lk.setVisible(false);
											Thread.sleep(900);
											lk.setVisible(true);
											
											DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
											dout.writeUTF("success");
											dout.writeUTF(data);
											 break;	
											
										}
										else if(rs01.next()==false)
										{
											
											//no file
											Statement sto=con.createStatement();
											String sqlo="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS2','nn6','"+dt+"','Not Found')";
											sto.executeUpdate(sqlo);
											System.out.println("status inserted");
											
											
											Thread.sleep(2000);
											con444=new ImageIcon(this.getClass().getResource("Rednode.png"));   //nn6
											l6.setIcon(con444);
											
											Thread.sleep(2000);
											con333=new ImageIcon(this.getClass().getResource("Redcross2.png"));    
											lb1.setIcon(con333);
										}	
									}
			
			    				}else 
			    					if(count==3)
			    					{
			    						


										String nodename=rs51.getString(1);
										
										if(nodename.equalsIgnoreCase("nn4"))
										{
											
											Thread.sleep(2000);
											i3=new ImageIcon(this.getClass().getResource("greencross1.png"));    
											l88.setIcon(i3);
											
											Thread.sleep(2000);
											i4=new ImageIcon(this.getClass().getResource("Greennode.png"));
											l4.setIcon(i4);
											
											
											Statement stmt01 = con.createStatement();
											String sql01 = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn4'";
											ResultSet rs01 = stmt01.executeQuery(sql01);
							        		if(rs01.next()==true)
											  {
												
												
												FileInputStream fin = new FileInputStream("LBS/BS2/nn4/"+fname+".txt");
												byte[] b = new byte[fin.available()];
												fin.read(b);
												String cont = new String(b);
												
												data=enc.decrypt(cont, keyWord);
											
												Statement sto=con.createStatement();
												String sqlo="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS2','nn4','"+dt+"','Found')";
												sto.executeUpdate(sqlo);
												System.out.println("status inserted");
												
												lk.setVisible(true);
												Thread.sleep(900);
												lk.setVisible(false);
												Thread.sleep(900);
												lk.setVisible(true);
												
												DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
												dout.writeUTF("success");
												dout.writeUTF(data);
												
											 break;	
												
											}
											else if(rs01.next()==false)
											{
												//no file

												Statement stkk=con.createStatement();
												String sqlkk="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS2','nn4','"+dt+"','Not Found')";
												stkk.executeUpdate(sqlkk);
												System.out.println("status inserted");
												
												Thread.sleep(2000);
												con55=new ImageIcon(this.getClass().getResource("Rednode.png"));
												l4.setIcon(con55);
												
												
												Thread.sleep(2000);
												con66=new ImageIcon(this.getClass().getResource("Redcross1.png"));    
												l88.setIcon(con66);
												
												
												int mn1=0;
												int mn2=0;
												
												Statement stmt1 = con.createStatement();
												String sql1 = "select * from NN2 where NNodes='nn44'";
												ResultSet rs1 = stmt1.executeQuery(sql1);
												
												if(rs1.next()==true)
												{
													mn1=rs1.getInt(2);
													System.out.println(" dist  "  +mn1);
													
												}
												
												Statement stmt2 = con.createStatement();
												String sql2 = "select * from NN2 where NNodes='nn444'";
												ResultSet rs2 = stmt2.executeQuery(sql2);
												if(rs2.next()==true)
												{
													mn2=rs2.getInt(2);
												}
												
												System.out.println(mn1);
												System.out.println(mn2);
												
												if(mn1<mn2)
												{
													
													Thread.sleep(2000);
													i5=new ImageIcon(this.getClass().getResource("Greencross3.png"));
													lb4.setIcon(i5);
													
													Thread.sleep(2000);
													i6=new ImageIcon(this.getClass().getResource("Greennode.png")); //nn44
													l33.setIcon(i6);
													
													
													Statement stm1 = con.createStatement();
													String sql = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn44'";
													ResultSet rss1 = stm1.executeQuery(sql);
													if(rss1.next()==true)
													{
														
														
														FileInputStream fin = new FileInputStream("LBS/BS2/nn44/"+fname+".txt");
														byte[] b = new byte[fin.available()];
														fin.read(b);
														String cont = new String(b);
														
														data=enc.decrypt(cont, keyWord);
													
														Statement sto=con.createStatement();
														String sqlo="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS2','nn44','"+dt+"','Found')";
														sto.executeUpdate(sqlo);
														System.out.println("status inserted");
														
														
														
														lk.setVisible(true);
														Thread.sleep(900);
														lk.setVisible(false);
														Thread.sleep(900);
														lk.setVisible(true);
														
														//lines for nn4
														Thread.sleep(2000);
														i4=new ImageIcon(this.getClass().getResource("Greennode.png"));
														l4.setIcon(i4);
														
														Thread.sleep(2000);
														i3=new ImageIcon(this.getClass().getResource("greencross1.png"));    
														l88.setIcon(i3);
														
														DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
														dout.writeUTF("success");
														dout.writeUTF(data);
														 break;	
														
													}
													else 
														if(rss1.next()==false)
													{
														//no file
															
															Statement stv=con.createStatement();
															String sq="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS2','nn44','"+dt+"','Not Found')";
															stv.executeUpdate(sq);
															System.out.println("status inserted");	
															
															Thread.sleep(2000);
															con88=new ImageIcon(this.getClass().getResource("Rednode.png")); //nn44
															l33.setIcon(con88);
															
															Thread.sleep(2000);
															con77=new ImageIcon(this.getClass().getResource("Redcross3.png"));
															lb4.setIcon(con77);
															
															
															
															Thread.sleep(2000);
															i7=new ImageIcon(this.getClass().getResource("Greencross4.png"));
															lb5.setIcon(i7);
															
															Thread.sleep(2000);
															i8=new ImageIcon(this.getClass().getResource("Greennode.png")); //nn444
															l44.setIcon(i8);
															
															
														Statement st = con.createStatement();
														String sqq = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn444'";
														ResultSet rss = st.executeQuery(sqq);
														if(rss.next()==true)
														{
															
															
															FileInputStream fin = new FileInputStream("LBS/BS2/nn444/"+fname+".txt");
															byte[] b = new byte[fin.available()];
															fin.read(b);
															String cont = new String(b);
															
															data=enc.decrypt(cont, keyWord);
														
															Statement sto=con.createStatement();
															String sqlo="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS2','nn444','"+dt+"','Found')";
															sto.executeUpdate(sqlo);
															System.out.println("status inserted");
															
															lk.setVisible(true);
															Thread.sleep(900);
															lk.setVisible(false);
															Thread.sleep(900);
															lk.setVisible(true);
															
															//lines for nn4
															Thread.sleep(2000);
															i4=new ImageIcon(this.getClass().getResource("Greennode.png"));
															l4.setIcon(i4);
															
															Thread.sleep(2000);
															i3=new ImageIcon(this.getClass().getResource("greencross1.png"));    
															l88.setIcon(i3);
															
															DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
															dout.writeUTF("success");
															dout.writeUTF(data);
															
														     break;	
															
														}
														else if(rss.next()==false)
														{
															//no files
															
															Statement stnno=con.createStatement();
															String sqlnno="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS2','nn444','"+dt+"','Not Found')";
															stnno.executeUpdate(sqlnno);
															System.out.println("status inserted");
															
															Thread.sleep(2000);
															i8=new ImageIcon(this.getClass().getResource("Rednode.png")); //nn444
															l44.setIcon(i8);

															Thread.sleep(2000);
															con99=new ImageIcon(this.getClass().getResource("Redcross4.png"));
															lb5.setIcon(con99);
															
															
															
															Statement st1=con.createStatement();
															String sql11="insert into Attacker values('"+user1+"','"+fname+"','"+sk+"','"+dt+"')";
															st1.executeUpdate(sql11);
															System.out.println("user insetred into Attacker list");
															
															
															Thread.sleep(2000);
															con999=new ImageIcon(this.getClass().getResource("Redstation.png"));
															l3.setIcon(con999);
															
															lk1.setVisible(true);
															Thread.sleep(900);
															lk1.setVisible(false);
															Thread.sleep(900);
															lk1.setVisible(true);
															
															DataOutputStream dos=new DataOutputStream(sc.getOutputStream());
															dos.writeUTF("fail");
															dos.writeUTF("fail");
															
														}
													}
									
												} 
												
												if(mn2<mn1)
												{
								
													Thread.sleep(2000);
													i7=new ImageIcon(this.getClass().getResource("Greencross4.png"));
													lb5.setIcon(i7);
													
													Thread.sleep(2000);
													i8=new ImageIcon(this.getClass().getResource("Greennode.png")); //nn444
													l44.setIcon(i8);
													
													
													Statement st = con.createStatement();
													String sqq = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn444'";
													ResultSet rss = st.executeQuery(sqq);
													if(rss.next()==true)
													{
														
														
														FileInputStream fin = new FileInputStream("LBS/BS2/nn444/"+fname+".txt");
														byte[] b = new byte[fin.available()];
														fin.read(b);
														String cont = new String(b);
														
														data=enc.decrypt(cont, keyWord);
													
														Statement sto=con.createStatement();
														String sqlo="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS2','nn444','"+dt+"','Found')";
														sto.executeUpdate(sqlo);
														System.out.println("status inserted");
														
														
														
														lk.setVisible(true);
														Thread.sleep(900);
														lk.setVisible(false);
														Thread.sleep(900);
														lk.setVisible(true);
														
														//lines for nn4
														Thread.sleep(2000);
														i4=new ImageIcon(this.getClass().getResource("Greennode.png"));
														l4.setIcon(i4);
														
														Thread.sleep(2000);
														i3=new ImageIcon(this.getClass().getResource("greencross1.png"));    
														l88.setIcon(i3);
														
														DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
														dout.writeUTF("success");
														dout.writeUTF(data);
														
													     break;	
														
													}
													else 
														if(rss.next()==false)
													{
														//no files
															Statement s=con.createStatement();
															String sqn="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS2','nn444','"+dt+"','Not Found')";
															s.executeUpdate(sqn);
															System.out.println("status inserted");
															
															Thread.sleep(2000);
															i8=new ImageIcon(this.getClass().getResource("Rednode.png")); //nn444
															l44.setIcon(i8);

															Thread.sleep(2000);
															con99=new ImageIcon(this.getClass().getResource("Redcross4.png"));
															lb5.setIcon(con99);
															
														
														
															Thread.sleep(2000);
															i5=new ImageIcon(this.getClass().getResource("Greencross3.png"));
															lb4.setIcon(i5);
															
															Thread.sleep(2000);
															i6=new ImageIcon(this.getClass().getResource("Greennode.png")); //nn44
															l33.setIcon(i6);
															
															
															
														Statement stm1 = con.createStatement();
														String sql = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn44'";
														ResultSet rss1 = stm1.executeQuery(sql);
														if(rss1.next()==true)
														{
															
															
															FileInputStream fin = new FileInputStream("LBS/BS2/nn44/"+fname+".txt");
															byte[] b = new byte[fin.available()];
															fin.read(b);
															String cont = new String(b);
															
															data=enc.decrypt(cont, keyWord);
														
															Statement sto=con.createStatement();
															String sqlo="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS2','nn44','"+dt+"','Found')";
															sto.executeUpdate(sqlo);
															System.out.println("status inserted");
															
															lk.setVisible(true);
															Thread.sleep(900);
															lk.setVisible(false);
															Thread.sleep(900);
															lk.setVisible(true);
															
															//lines for nn4
															Thread.sleep(2000);
															i4=new ImageIcon(this.getClass().getResource("Greennode.png"));
															l4.setIcon(i4);
															
															Thread.sleep(2000);
															i3=new ImageIcon(this.getClass().getResource("greencross1.png"));    
															l88.setIcon(i3);
															
															DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
															dout.writeUTF("success");
															dout.writeUTF(data);
															 break;	
															
														}else 
														{
														   //not found	
															Statement sto=con.createStatement();
															String sqlo="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS2','nn44','"+dt+"','Not Found')";
															sto.executeUpdate(sqlo);
															System.out.println("status inserted");
															
															
															
															Thread.sleep(2000);
															con88=new ImageIcon(this.getClass().getResource("Rednode.png")); //nn44
															l33.setIcon(con88);
															
															Thread.sleep(2000);
															con77=new ImageIcon(this.getClass().getResource("Redcross3.png"));
															lb4.setIcon(con77);
															
															Statement st1=con.createStatement();
															String sql11="insert into Attacker values('"+user1+"','"+fname+"','"+sk+"','"+dt+"')";
															st1.executeUpdate(sql11);
															System.out.println("user insetred into Attacker list");
															
															Thread.sleep(2000);
															con999=new ImageIcon(this.getClass().getResource("Redstation.png"));
															l3.setIcon(con999);
															
															lk1.setVisible(true);
															Thread.sleep(900);
															lk1.setVisible(false);
															Thread.sleep(900);
															lk1.setVisible(true);
															
															DataOutputStream dos=new DataOutputStream(sc.getOutputStream());
															dos.writeUTF("fail");
															dos.writeUTF("fail");
														}
														
													}
													
													
													
												
													
												}
												
												
												
											
											}
											
										
										
											
											
										}
										else if(nodename.equalsIgnoreCase("nn5"))
										{
											
											Thread.sleep(2000);
											i7=new ImageIcon(this.getClass().getResource("Blackdown.png"));     
											l99.setIcon(i7);
											
											Thread.sleep(2000);
											i8=new ImageIcon(this.getClass().getResource("Greennode.png"));   //nn5
											l5.setIcon(i8);
											
											Statement stmt01 = con.createStatement();
											String sql01 = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn5'";
											ResultSet rs01 = stmt01.executeQuery(sql01);
											if(rs01.next()==true)
											{
												
												
												FileInputStream fin = new FileInputStream("LBS/BS2/nn5/"+fname+".txt");
												byte[] b = new byte[fin.available()];
												fin.read(b);
												String cont = new String(b);
												
												data=enc.decrypt(cont, keyWord);
											
												Statement sto=con.createStatement();
												String sqlo="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS2','nn5','"+dt+"','Found')";
												sto.executeUpdate(sqlo);
												System.out.println("status inserted");
												
												lk.setVisible(true);
												Thread.sleep(900);
												lk.setVisible(false);
												Thread.sleep(900);
												lk.setVisible(true);
												
												DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
												dout.writeUTF("success");
												dout.writeUTF(data);
												 break;	
												
											}
											else if(rs01.next()==false)
											{
											       //no file
												
												
												
												Statement sto=con.createStatement();
												String sqlo="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS2','nn5','"+dt+"','Not Found')";
												sto.executeUpdate(sqlo);
												System.out.println("status inserted");
												
												
												Thread.sleep(2000);
												con222=new ImageIcon(this.getClass().getResource("Rednode.png"));   //nn5
												l5.setIcon(con222);
												
												Thread.sleep(2000);
												con111=new ImageIcon(this.getClass().getResource("Reddown.png"));     
												l99.setIcon(con111);
												
												
												
												Statement st1=con.createStatement();
												String sql11="insert into Attacker values('"+user1+"','"+fname+"','"+sk+"','"+dt+"')";
												st1.executeUpdate(sql11);
												System.out.println("user insetred into Attacker list");
												
												lk1.setVisible(true);
												Thread.sleep(900);
												lk1.setVisible(false);
												Thread.sleep(900);
												lk1.setVisible(true);
												
												DataOutputStream dos=new DataOutputStream(sc.getOutputStream());
												dos.writeUTF("fail");
												dos.writeUTF("fail");
											}
										}
										else if(nodename.equalsIgnoreCase("nn6"))
										{
											
											Thread.sleep(2000);
											i9=new ImageIcon(this.getClass().getResource("Greencross2.png"));    
											lb1.setIcon(i9);
											
											Thread.sleep(2000);
											i11=new ImageIcon(this.getClass().getResource("Greennode.png"));   //nn6
											l6.setIcon(i11);
											
											Statement stmt01 = con.createStatement();
											String sql01 = "select * from OwnerFiles where fname='"+fname+"' and sk='"+sk+"' and nnode='nn6'";
											ResultSet rs01 = stmt01.executeQuery(sql01);
											if(rs01.next()==true)
											{
												
												
												FileInputStream fin = new FileInputStream("LBS/BS2/nn6/"+fname+".txt");
												byte[] b = new byte[fin.available()];
												fin.read(b);
												String cont = new String(b);
											
												
												data=enc.decrypt(cont, keyWord);
												Statement sto=con.createStatement();
												String sqlo="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS2','nn6','"+dt+"','Found')";
												sto.executeUpdate(sqlo);
												System.out.println("status inserted");
												
												lk.setVisible(true);
												Thread.sleep(900);
												lk.setVisible(false);
												Thread.sleep(900);
												lk.setVisible(true);
												
												DataOutputStream dout = new DataOutputStream(sc.getOutputStream());
												dout.writeUTF("success");
												dout.writeUTF(data);
												 break;	
												
											}
											else if(rs01.next()==false)
											{
												
												//no file
												Statement sto=con.createStatement();
												String sqlo="insert into Search values ('"+user+"','"+fname+"','"+sk+"','BS2','nn6','"+dt+"','Not Found')";
												sto.executeUpdate(sqlo);
												System.out.println("status inserted");
												
												Thread.sleep(2000);
												con444=new ImageIcon(this.getClass().getResource("Rednode.png"));   //nn6
												l6.setIcon(con444);
												
												Thread.sleep(2000);
												con333=new ImageIcon(this.getClass().getResource("Redcross2.png"));    
												lb1.setIcon(con333);
												
												
												Statement st1=con.createStatement();
												String sql11="insert into Attacker values('"+user1+"','"+fname+"','"+sk+"','"+dt+"')";
												st1.executeUpdate(sql11);
												System.out.println("user insetred into Attacker list");
												
												Thread.sleep(2000);
												con999=new ImageIcon(this.getClass().getResource("Redstation.png"));
												l3.setIcon(con999);
												
												lk1.setVisible(true);
												Thread.sleep(900);
												lk1.setVisible(false);
												Thread.sleep(900);
												lk1.setVisible(true);
												
												DataOutputStream dos=new DataOutputStream(sc.getOutputStream());
												dos.writeUTF("fail");
												dos.writeUTF("fail");
											}	
										}
							
			    					}
			    		}
		
					} catch (Exception e) {
					
					}
				}				
}


		@Override
		public void actionPerformed(ActionEvent e) 
		{
		
			if(e.getSource()==mi1)
			{
				Viewserverfiles oo=new Viewserverfiles();
			}
			
			if(e.getSource()==mi2)
			{
				ViewAttack attack=new ViewAttack();
				
			}
			
			if(e.getSource()==mi3)
			{
				ViewSearch view=new ViewSearch();
			}
			
			if(e.getSource()==b3)
			{
				 DBCon db=new DBCon();
	        	 Connection con=db.getConnection();
				
				String[] stations = { "Select Station", "BS1", "BS2"};
				String station = (String) JOptionPane.showInputDialog(null,
						"Select station", "Select", JOptionPane.QUESTION_MESSAGE,
						null, stations, stations[0]);
				if(station.equals("BS1"))
				{
					String[] nodes = { "Select NNode", "NN1", "NN2","NN3","NN11","NN111"};
					String node = (String) JOptionPane.showInputDialog(null,
							"Select NNode", "Select", JOptionPane.QUESTION_MESSAGE,
							null, nodes, nodes[0]);
					
					
					String dist=JOptionPane.showInputDialog("Enter NNode Distance");
					
				
//					
				     if(node.equals("NN1"))
				     {
				    	try 
				    	{
				    		 Statement st=con.createStatement();
				    		 String sql="update BS1 set Distance='"+dist+"' where NNodes='nn1'";
				    		 st.executeUpdate(sql);
				    		 System.out.println("Distance Assigned");
				    		 
				    		 
				    		 Statement stt=con.createStatement();
				    		 String sqlt="update AllNodes set Distance='"+dist+"' where NNode='nn1'";
				    		 stt.executeUpdate(sqlt);
				    		 System.out.println("Distance Assigned");
				    		 
						} catch (Exception e2) {
							// TODO: handle exception
						}
				    	 
				     }else
				    	 if(node.equals("NN2"))
				    	 {

						    	try 
						    	{
						    		 Statement st=con.createStatement();
						    		 String sql="update BS1 set Distance='"+dist+"' where NNodes='nn2'";
						    		 st.executeUpdate(sql);
						    		 System.out.println("Distance Assigned");
						    		 
						    		 Statement stt=con.createStatement();
						    		 String sqlt="update AllNodes set Distance='"+dist+"' where NNode='nn2'";
						    		 stt.executeUpdate(sqlt);
						    		 System.out.println("Distance Assigned");
						    		 
								} catch (Exception e2) {
									// TODO: handle exception
								}
						    	   
				    	 }else
				    		 if(node.equals("NN3"))
				    		 {
							    	try 
							    	{
							    		 Statement st=con.createStatement();
							    		 String sql="update BS1 set Distance='"+dist+"' where NNodes='nn3'";
							    		 st.executeUpdate(sql);
							    		 System.out.println("Distance Assigned");
							    		 
							    		 Statement stt=con.createStatement();
							    		 String sqlt="update AllNodes set Distance='"+dist+"' where NNode='nn3'";
							    		 stt.executeUpdate(sqlt);
							    		 System.out.println("Distance Assigned");
							    		 
									} catch (Exception e2) {
										// TODO: handle exception
									}
							    	   
					    	 
				    		 }else
				    			 if(node.equals("NN11"))
				    			 {
								    	try 
								    	{
								    		 Statement st=con.createStatement();
								    		 String sql="update NN1 set Distance='"+dist+"' where NNodes='nn11'";
								    		 st.executeUpdate(sql);
								    		 System.out.println("Distance Assigned");
								    		 
								    		 Statement stt=con.createStatement();
								    		 String sqlt="update AllNodes set Distance='"+dist+"' where NNode='nn11'";
								    		 stt.executeUpdate(sqlt);
								    		 System.out.println("Distance Assigned");
								    		 
										} catch (Exception e2) {
											// TODO: handle exception
										}
								    	   
						    	 
					    		 
				    			 }else
				    				 if(node.equals("NN111"))
					    			 {
									    	try 
									    	{
									    		 Statement st=con.createStatement();
									    		 String sql="update NN1 set Distance='"+dist+"' where NNodes='nn111'";
									    		 st.executeUpdate(sql);
									    		 System.out.println("Distance Assigned");
									    		 
									    		 Statement stt=con.createStatement();
									    		 String sqlt="update AllNodes set Distance='"+dist+"' where NNode='nn111'";
									    		 stt.executeUpdate(sqlt);
									    		 System.out.println("Distance Assigned");
									    		 
											} catch (Exception e2) {
												// TODO: handle exception
											}
									    	   
							    	 
						    		 
					    			 }
				    				 
				    	 
				    	 
					
					
				}
				
				if(station.equals("BS2"))
				{

					String[] nodes = { "Select NNode", "NN4", "NN5","NN6","NN44","NN444"};
					String node = (String) JOptionPane.showInputDialog(null,
							"Select NNode", "Select", JOptionPane.QUESTION_MESSAGE,
							null, nodes, nodes[0]);
					
					
					String dist=JOptionPane.showInputDialog("Enter NNode Distance");
					
				
//					
				     if(node.equals("NN4"))
				     {
				    	try 
				    	{
				    		 Statement st=con.createStatement();
				    		 String sql="update BS2 set Distance='"+dist+"' where NNodes='nn4'";
				    		 st.executeUpdate(sql);
				    		 System.out.println("Distance Assigned");
				    		 
				    		 Statement stt=con.createStatement();
				    		 String sqlt="update AllNodes set Distance='"+dist+"' where NNode='nn4'";
				    		 stt.executeUpdate(sqlt);
				    		 System.out.println("Distance Assigned");
				    		 
						} catch (Exception e2) {
							// TODO: handle exception
						}
				    	 
				     }else
				    	 if(node.equals("NN5"))
				    	 {

						    	try 
						    	{
						    		 Statement st=con.createStatement();
						    		 String sql="update BS2 set Distance='"+dist+"' where NNodes='nn5'";
						    		 st.executeUpdate(sql);
						    		 System.out.println("Distance Assigned");
						    		 
						    		 Statement stt=con.createStatement();
						    		 String sqlt="update AllNodes set Distance='"+dist+"' where NNode='nn5'";
						    		 stt.executeUpdate(sqlt);
						    		 System.out.println("Distance Assigned");
						    		 
								} catch (Exception e2) {
									// TODO: handle exception
								}
						    	   
				    	 }else
				    		 if(node.equals("NN6"))
				    		 {
							    	try 
							    	{
							    		 Statement st=con.createStatement();
							    		 String sql="update BS2 set Distance='"+dist+"' where NNodes='nn6'";
							    		 st.executeUpdate(sql);
							    		 System.out.println("Distance Assigned");
							    		 
							    		 Statement stt=con.createStatement();
							    		 String sqlt="update AllNodes set Distance='"+dist+"' where NNode='nn6'";
							    		 stt.executeUpdate(sqlt);
							    		 System.out.println("Distance Assigned");
							    		 
									} catch (Exception e2) {
										// TODO: handle exception
									}
							    	   
					    	 
				    		 }else
				    			 if(node.equals("NN44"))
				    			 {
								    	try 
								    	{
								    		 Statement st=con.createStatement();
								    		 String sql="update NN2 set Distance='"+dist+"' where NNodes='nn44'";
								    		 st.executeUpdate(sql);
								    		 System.out.println("Distance Assigned");
								    		 
								    		 Statement stt=con.createStatement();
								    		 String sqlt="update AllNodes set Distance='"+dist+"' where NNode='nn44'";
								    		 stt.executeUpdate(sqlt);
								    		 System.out.println("Distance Assigned");
								    		 
										} catch (Exception e2) {
											// TODO: handle exception
										}
								    	   
						    	 
					    		 
				    			 }else
				    				 if(node.equals("NN444"))
					    			 {
									    	try 
									    	{
									    		 Statement st=con.createStatement();
									    		 String sql="update NN2 set Distance='"+dist+"' where NNodes='nn444'";
									    		 st.executeUpdate(sql);
									    		 System.out.println("Distance Assigned");
									    		 
									    		 Statement stt=con.createStatement();
									    		 String sqlt="update AllNodes set Distance='"+dist+"' where NNode='nn444'";
									    		 stt.executeUpdate(sqlt);
									    		 System.out.println("Distance Assigned");
									    		 
											} catch (Exception e2) {
												// TODO: handle exception
											}
									    	   
							    	 
						    		 
					    			 }
				    				 
				    	 
				    	 
					
					
				
				}
				
			}
			
			if(e.getSource()==mi4)
			{
				ViewDistance dist=new ViewDistance();
			}
			
			if(e.getSource()==mi5)
			{
				 DBCon db=new DBCon();
	        	 Connection con=db.getConnection();
				
				String name = JOptionPane.showInputDialog("Enter Username To UnBlock");
				
				try 
				{
					Statement stmt19 = con.createStatement();
					String sql16 = "delete * from Attacker where Attacker='"+name+"'";
					stmt19.executeUpdate(sql16);
					System.out.println("user deleted successfully");
					JOptionPane.showMessageDialog(null,"User UnBlocked Successfully");
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
				
			
			}
		}
}
