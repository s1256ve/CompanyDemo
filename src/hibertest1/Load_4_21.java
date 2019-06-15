package hibertest1;

import hibertest1.entity.Users;

import java.util.ArrayList;
import java.util.List;

import org.DBConn.DBConn;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Load_4_21 {
	public static void main(String[] args) {
		new Load_4_21().load(1);
	}
	public Users load(int index){
		Configuration config=new Configuration().configure();
		SessionFactory sessionFactory=config.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Users user=(Users)session.get(Users.class, new Integer(index));
		
		
		System.out.println(user.getLoginName()+" "+user.getLoginPwd());
		
		return user;
	}
	
	public static List<Users> load(){
		String sql="select * from users";
		Session sn=DBConn.conn();
		SQLQuery qry=sn.createSQLQuery(sql);//select * from book
		qry.addEntity(Users.class);//–ç‰ÂˆÈqry.addEntity("B",Book_5_12.class);
		List<Users> list=new ArrayList<>();
		for(Object o:qry.list()) {
			list.add((Users)o);
		}
		return list;
	}
}
