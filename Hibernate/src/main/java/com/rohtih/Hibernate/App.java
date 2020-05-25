package com.rohtih.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.rohtih.Hibernate.entity.Rohith;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    		
    	Rohith newEntry = new Rohith();
    	newEntry.setId(3);
    	newEntry.setName("Rohtih");
    	newEntry.setEmail("Rigufg@gmask.ccm");
    	
    	Configuration con = new Configuration().configure().addAnnotatedClass(Rohith.class);
    	ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
    	
    			
    	SessionFactory sf = con.buildSessionFactory(reg);
    	

    	
    	Session session = sf.openSession();
    	Transaction tx = session.beginTransaction();
    	
    	session.save(newEntry);
    	
    	tx.commit();
    	
    }
}
