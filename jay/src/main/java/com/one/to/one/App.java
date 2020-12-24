package com.one.to.one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration configuration = new Configuration();

		// Directly pick the file from path
		// /OneToOneDurgesh/src/main/resources/hibernate.cfg.xml
		// No need to write the configuration file name in configure()
		// (e.g-hibernate.cfg.xml)
		// **************************************************************
		Configuration configure = configuration.configure();

		SessionFactory sessionFactory = configure.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Question q = new Question();
		q.setId(101);
		q.setQuestion("What is java?");
		
		Answer a = new Answer();
		a.setId(201);
		a.setAnswer_title("Java is Platfrom independent");
		q.setAnswer(a);
		
		Transaction transaction = session.beginTransaction();
		session.save(q);
		session.save(a);
		
		transaction.commit();
		session.clear();
		
		
    }
}
