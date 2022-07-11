package com.roofhub.qa.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database
{
	
	public static String refNumber;
	public static String licenseNumber;
	public static String pets;
	
	/*
	 *   [TestMethod]
	 *   [Description("Fetch Reference number for invoice payment from the database")] 
	 */
	 
		public static String  InvoicePaymentRefNo() 
		    {
			String username ="ThinKsysQA";
			String password= "thinksys12#$";
			String path="jdbc:sqlserver://resmandev.database.windows.net;databaseName=ResMan_1355_QA; useSSL=false";
			try 
			{
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");	
				Connection conn =DriverManager.getConnection(path, username,password);
				Statement sta = conn.createStatement();
				String Sql = "SELECT top 1 ReferenceNumber FROM dbo.BankTransaction WHERE Objecttype='Payment' AND TransactionTypeGroup='Invoice' AND transactiontypename='Payment' AND ReferenceNumber IS NOT NULL ORDER BY DATE DESC" ;
				ResultSet rs = sta.executeQuery(Sql);
				while(rs.next())
				{
				   refNumber =rs.getString("ReferenceNumber");
					System.out.println(refNumber);
				}
			}
			catch (Exception e) 
			{
				System.out.println("Unable to make connection");
				e.printStackTrace();
			}
			return refNumber;
		    }
		
		
		/*
		 *   [TestMethod]
		 *   [Description("Fetch Reference number for invoice payment from the database")] 
		 */
		 
			public static String  LeasesRefNo() 
			   {
				String username ="ThinKsysQA";
				String password= "thinksys12#$";
				String path="jdbc:sqlserver://resmandev.database.windows.net;databaseName=ResMan_1355_QA; useSSL=false";
				try 
				{
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");	
					Connection conn =DriverManager.getConnection(path, username,password);
					Statement sta = conn.createStatement();
					String Sql = "SELECT top 1 u.number FROM  dbo.lease AS l,dbo.personlease AS p,dbo.UnitLeaseGroup AS ug,dbo.unit AS u WHERE l.LeaseID=p.LeaseID AND l.UnitLeaseGroupID=ug.UnitLeaseGroupID AND ug.UnitID=u.unitid ORDER BY ug.MoveInDate DESC";
					ResultSet rs = sta.executeQuery(Sql);
					while(rs.next())
					{
					   refNumber =rs.getString("number");
						System.out.println(refNumber);
					}
				}
				catch (Exception e) 
				{
					System.out.println("Unable to make connection");
					e.printStackTrace();
				}
				return refNumber;
			    }
		
			/*
			 *   [TestMethod]
			 *   [Description("Fetch Reference number for invoice payment from the database")] 
			 */
			 
				public static String  AutomobileNo() 
				   {
					String username ="ThinKsysQA";
					String password= "thinksys12#$";
					String path="jdbc:sqlserver://resmandev.database.windows.net;databaseName=ResMan_1355_QA; useSSL=false";
					try 
					{
						Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");	
						Connection conn =DriverManager.getConnection(path, username,password);
						
						Statement sta = conn.createStatement();
						
						String Sql = "SELECT TOP 1 auto.LicensePlateNumber FROM Automobile as auto, person AS per, PersonLease as pl WHERE auto.personid = per.personid AND per.PersonID = pl.PersonID AND LicensePlateNumber IS NOT NULL ORDER BY MoveInDate DESC";
						ResultSet rs = sta.executeQuery(Sql);
						while(rs.next())
						{
						   licenseNumber=rs.getString("LicensePlateNumber");
							System.out.println(licenseNumber);
						}
					}
					catch (Exception e) 
					{
						System.out.println("Unable to make connection");
						e.printStackTrace();
					}
					return licenseNumber;
				    }
		
				/*
				 *   [TestMethod]
				 *   [Description("Fetch Reference number for invoice payment from the database")] 
				 */
				 
					public static String  PetsName() 
					   {
						String username ="ThinKsysQA";
						String password= "thinksys12#$";
						String path="jdbc:sqlserver://resmandev.database.windows.net;databaseName=ResMan_1355_QA; useSSL=false";
						try 
						{
							Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");	
							Connection conn =DriverManager.getConnection(path, username,password);
							Statement sta = conn.createStatement();
							System.out.println("coonected");
							String Sql = "SELECT TOP 1 NAME FROM pet , person AS per WHERE pet.personid = per.personid AND (pet.Name LIKE '%[A-Z]%' OR Pet.Name LIKE '[0-9]') ORDER BY LastModified DESC" ;
							ResultSet rs = sta.executeQuery(Sql);
							while(rs.next())
							{
							   pets=rs.getString("NAME");
							}
						}
						catch (Exception e) 
						{
							System.out.println("Unable to make connection");
							e.printStackTrace();
						}
						return pets;
					    }	
                        }
