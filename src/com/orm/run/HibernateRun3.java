package com.orm.run;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.orm.model.Contact;
import com.orm.model.Dept;
import com.orm.model.Emp;
import com.orm.utils.SessionProvider;

public class HibernateRun3 {

		public static void main(String[] args)
		{
			SessionFactory sf = SessionProvider.getSessionFactory();
			Session s = sf.openSession();
			Transaction t = s.beginTransaction();
			Dept d = new Dept(2,"Production");
			
			Emp e1 = new Emp(4,"Manish","Chennai","Manager");
			Emp e2 = new Emp(5,"Ramesh","Indore","Clerk");
			Emp e3 = new Emp(6,"Jose","Jaipur","Supervisor");
			
			Contact c1 = new Contact(4,"12/2","Gandhi Road","1234567890");
			Contact c2 = new Contact(5,"12/3","Main Road","2345678901");
			Contact c3 = new Contact(6,"12/4","Robin Road","3456789012");
			
			e1.setContact(c1);
			e2.setContact(c2);
			e3.setContact(c3);
			
			e1.setDept(d);
			e2.setDept(d);
			e3.setDept(d);
			
			Set<Emp> set = new HashSet<Emp>();
			set.add(e1);
			set.add(e2);
			set.add(e3);
			
			d.setEmployess(set);
			s.update(d);
			t.commit(); 
		}
}
