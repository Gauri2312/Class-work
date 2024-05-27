package com.example.Hibernate1ToMany;

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
        Department depart=new Department();
        depart.setName("HR");
        Department depart1=new Department();
        depart1.setName("IT");
        Employee emp1=new Employee();
        emp1.setName("Gauri");
        emp1.setDepartment(depart);
        
        Employee emp2=new Employee();
        emp2.setName("Advik");
        emp2.setDepartment(depart1);
        
        
        Employee emp3=new Employee();
        emp3.setName("Riya");
        emp3.setDepartment(depart1);
        
        depart.getEmployees().add(emp1);
        depart1.getEmployees().add(emp2);
        depart1.getEmployees().add(emp3);
        session.beginTransaction();
        session.save(depart);
        session.save(depart1);
        
        session.getTransaction().commit();
        }
        finally 
        {
        	session.close();
        	sessionFactory.close();
        }
            
    }
}
