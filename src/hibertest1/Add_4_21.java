package hibertest1;

import java.util.List;

import org.DBConn.DBConn;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hibertest1.entity.Users;

public class Add_4_21 {
	public static void main(String[] args) {
		new Add_4_21().add("c","c");
	}
	public void add(String name,String pwd) {
		Users user=new Users();
		user.setLoginName(name);
		user.setLoginPwd(pwd);
		
		Configuration config=new Configuration().configure();
		SessionFactory sessionFactory=config.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(user);	
		tx.commit();
		
		try {			
			tx=session.beginTransaction();    //4.ｶ}ｩl､@ｭﾓ･讖�			
			session.save(user);		 //5.ｫ[､ﾆｰﾊｧ@	
			tx.commit();    //6.ｶﾇｰe･讖�
		} catch (Exception e) {
			if(tx!=null){
				tx.rollback();  //･讖^				
			}	
			e.printStackTrace();
		}finally{
			session.close();   //7.ﾃｬsession
		}
	}
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
}
