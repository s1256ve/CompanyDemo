package hibertest1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hibertest1.entity.Users;

public class Delete_4_21 {
	public static void main(String[] args) {
		new Delete_4_21().delete(1);
	}
	public void delete(int index) {
		//起始化,讀取組態檔hibernate.cfg.xml
				Configuration config=new Configuration().configure();
				//讀取並解析映射檔案(Users.hbm.xml)，建立sessionFactory
				SessionFactory sessionFactory=config.buildSessionFactory();
				//開啟session
				Session session=sessionFactory.openSession();
				Transaction tx=null;
				
				Users user=(Users)session.get(Users.class, new Integer(index));
				
				try {
					tx=session.beginTransaction();
					session.delete(user);
					tx.commit();
				} catch (Exception e) {
					if(tx!=null) {
						tx.rollback();
					}
					e.printStackTrace();
				}finally {
					session.close();
				}
	}
}
