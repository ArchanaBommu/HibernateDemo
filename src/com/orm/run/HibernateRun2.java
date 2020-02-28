package com.orm.run;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.orm.model.Dept;
import com.orm.model.Emp;
import com.orm.utils.SessionProvider;

public class HibernateRun2 {
	
	public static void main(String[] args)
	{
		SessionFactory sf = SessionProvider.getSessionFactory();
		Session s = sf.openSession();
		
		Query q = s.createQuery("from Dept");
		List<Dept> list = q.list();
		for(Dept d: list)
		{
			System.out.println(d.getName());
			System.out.println("------------------------");
			for(Emp x:d.getEmployess())
				System.out.println(x.getName()+""+x.getCity());
		}
	/*	Transaction t = s.beginTransaction();
		Dept d = new Dept(2,"Production");
		
		Emp e1 = new Emp(4,"Manish","Chennai","Manager");
		Emp e2 = new Emp(5,"Ramesh","Indore","Clerk");
		Emp e3 = new Emp(6,"Jose","Jaipur","Supervisor");
		
		e1.setDept(d);
		e2.setDept(d);
		e3.setDept(d);
		
		Set<Emp> set = new HashSet<Emp>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		
		d.setEmployess(set);
		s.save(d);
		t.commit(); */
		
		
		
		
	}

}
