package com.example.Song;

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
        System.out.println( "Hello World!" );
        Configuration cfg=new Configuration();
        
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory sessionFactory=cfg.buildSessionFactory();
        
        //created a session
        Session session=sessionFactory.openSession();
        
        //created transaction
        Transaction transaction=session.beginTransaction();
        
        Song obj=new Song();
        
        obj.setName("Aasman");
        obj.setSinger("Tanishk Bagchi");
        
        session.save(obj);
        System.out.println("Song added");
        transaction.commit();
        session.close();              
    }
}
