package hibertest1;

import java.util.List;

import org.DBConn.DBConn;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibertest1.entity.Users;

public class Login_4_21 {
	public static boolean check(String name) {
		String sql="select * from users";
		Session sn=DBConn.conn();
		SQLQuery qry=sn.createSQLQuery(sql);
		qry.addEntity(Users.class);
		List list= qry.list();
		for(Object o:list) {
			Users b=(Users)o;
			if(b.getLoginName().equals(name))return true;
		}

		return false;
	}
	public static Users load(String name,String pwd){
		String sql="select * from users";
		Session sn=DBConn.conn();
		SQLQuery qry=sn.createSQLQuery(sql);
		qry.addEntity(Users.class);
		List list= qry.list();
		for(Object o:list) {
			Users b=(Users)o;
			if(b.getLoginName().equals(name)&&b.getLoginPwd().equals(pwd))return b;
		}
		return null;
		
	}
}
