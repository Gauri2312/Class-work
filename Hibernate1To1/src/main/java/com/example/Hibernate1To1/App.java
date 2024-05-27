package com.example.Hibernate1To1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.example.Hibernate1To1.User;
import com.util.HibernateUtil;
import com.example.Hibernate1To1.Address;

public class App 
{
    public static void main( String[] args )
    {
        
        SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
        
        Session session=sessionFactory.openSession();
       
        session.beginTransaction();
        
        try {
        User user=new User();
        user.setUserName("Ram");
        
        Address address=new Address();
        address.setCity("Mumbai");
        
        user.setAddress(address);
        address.setUser(user);
        
        session.save(user);
        session.getTransaction().commit();
        
        User retrievedUser=session.get(User.class,user.getId());
        Address retrievedAddress=retrievedUser.getAddress();
        
        System.out.println("User: "+retrievedUser.getUserName());
        System.out.println("Address: "+retrievedAddress.getCity());
        }
        finally {
        	session.close();
        	sessionFactory.close();
        }
        
        
    }
}
