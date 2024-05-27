package com.example.Hibernate1ToManyExample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
        Session session=sessionFactory.openSession();
        
        try 
        {
        StandardData sdata=new StandardData();
        sdata.setClassName("BCA");
        sdata.setDiv(1);
        
        StandardData sdata1=new StandardData();
        sdata1.setClassName("MCA");
        sdata1.setDiv(2);
        
        Student s1=new Student();
        s1.setSname("Gauri");
        s1.setRollno(23);
        s1.setSdata(sdata);
        
        Student s2=new Student();
        s2.setSname("Reyansh");
        s2.setRollno(2);
        s2.setSdata(sdata1);
        
        
        Student s3=new Student();
        s3.setSname("Hari");
        s3.setRollno(15);
        s3.setSdata(sdata1);
        
        sdata.getStudents().add(s1);
        sdata1.getStudents().add(s2);
        sdata1.getStudents().add(s3);
        session.beginTransaction();
        session.save(sdata);
        session.save(sdata1);
        
        session.getTransaction().commit();
        }
        finally 
        {
        	session.close();
        	sessionFactory.close();
        }
            
    }
}
