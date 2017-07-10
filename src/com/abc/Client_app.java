package com.abc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client_app 
{

	public static void main(String[] args) 
	{
		/*Configuration cfg=new Configuration();
		cfg=cfg.configure("com/abc/hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session ses=sf.openSession();
		*/
		
		Session ses=Hibernateutil.getSession();
		Transaction tx=ses.beginTransaction();
		
		Employee e1=new Employee();
		//e1.setEid(156);
		e1.setEname("suresh");
		e1.setEsalary("90000");
		
		//ses.save(e1);
		//ses.persist(e1);
		ses.save(e1);
		tx.commit();
		
		System.out.println("Success");
		
		
		
		

	}

}
