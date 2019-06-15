package org.DBConn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBConn {
	
	public static Session conn() {
		Configuration con=new Configuration().configure();
		SessionFactory sf=con.buildSessionFactory();
		Session sn=sf.openSession();
		return sn;
	}
	
	public static void main(String[] args) {
		System.out.println(DBConn.conn());
	}
}
