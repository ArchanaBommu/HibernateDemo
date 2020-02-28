package com.orm.run;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.orm.model.Person;
import com.orm.utils.SessionProvider;

public class HibernateRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf = SessionProvider.getSessionFactory();
		Session s = sf.openSession();
		
	//	Query q = s.createQuery("from Person where name like 'A%'");
		Criteria q = s.createCriteria(Person.class);
		Criterion c1 = Restrictions.like("name", "A%");
		q.add(c1);
		List<Person> list =q.list();
		
		for(Person person:list)
		System.out.println(person.getName()+" "+ person.getCity());
	/*	Transaction t = s.beginTransaction();
		Person p = new Person(1,"A","Bangalore"); 
		Person p1 = new Person(2,"B","Hyderabad");
		 p1 = new Person(2,"C","Chennai");// object not part of hibernate
		s.saveOrUpdate(p);
		s.saveOrUpdate(p1);
		s.delete(p1);
		//s.saveOrUpdate(p2);//a new object is added to hibernate session
					// p is managed object
		t.commit(); */ // now the data goes to db
		System.out.println("A new record is added...!!!!");
	}

}
