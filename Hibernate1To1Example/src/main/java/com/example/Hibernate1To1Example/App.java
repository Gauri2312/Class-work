//WAP to implement one to one relationship between person and aadhar entity

package com.example.Hibernate1To1Example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.example.Hibernate1To1Example.Aadhar;
import com.example.Hibernate1To1Example.Person;
import com.util.HibernateUtil;

public class App 
{
    public static void main( String[] args )
    {
        SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
        
        Session session=sessionFactory.openSession();
       
        session.beginTransaction();
        
        try {
        Person person=new Person();
        person.setPname("Rahul");
        person.setContactno(70754);
        person.setEmail("rrah@gmail.com");
        
        Aadhar aadhar=new Aadhar();
        aadhar.setAid(179);
        aadhar.setAname("Rahul");
        
        person.setAadhar(aadhar);
        aadhar.setPerson(person);
        
        session.save(person);
        session.getTransaction().commit();
        
        Person retrievedPerson=session.get(Person.class,person.getPid());
        Aadhar retrievedAadhar=retrievedPerson.getAadhar();
        
        System.out.println("Person: "+retrievedPerson.getPname());
        System.out.println("Aadhar: "+retrievedAadhar.getAid());
        }
        finally {
        	session.close();
        	sessionFactory.close();
        }
        
    }
}
