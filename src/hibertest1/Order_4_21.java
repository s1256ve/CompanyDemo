package hibertest1;

import java.util.ArrayList;
import java.util.List;

import org.DBConn.DBConn;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hibertest1.entity.Orders;
import hibertest1.entity.Users;

public class Order_4_21 {
	
	public static void add(String name,String pname,Integer price,Integer number,Integer amount) {
		Orders o=new Orders(name,pname,price,number,amount);
		
		
		Configuration config=new Configuration().configure();
		SessionFactory sessionFactory=config.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(o);	
		tx.commit();
		
		
	}
	public static List<Orders> load(){
		String sql="select * from orders";
		Session sn=DBConn.conn();
		SQLQuery qry=sn.createSQLQuery(sql);//select * from book
		qry.addEntity(Orders.class);//–ç‰ÂˆÈqry.addEntity("B",Book_5_12.class);
		List<Orders> list=new ArrayList<>();
		for(Object o:qry.list()) {
			list.add((Orders)o);
		}
		return list;
	}
}
