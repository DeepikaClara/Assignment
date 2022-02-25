package hibernate_projects.sample_programs;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) 
	{
		//step 1
	 Configuration c=new Configuration();
	 c=c.configure();
	 //step 2
	 SessionFactory sf=c.buildSessionFactory();
	 Session s=sf.openSession();
	 System.out.println("session is ready"+s);
	 //step 3
	  Transaction t=s.beginTransaction();
	  Student stu=new Student();
	  stu.setId(1);
	  stu.setName("roxy");
	  stu.setEmail("roxy@gmail.com");
	  stu.setDateOfBirth("01-02-2000");
	  s.save(stu);
	  t.commit();
	  System.out.println("data is saved");
	  s.close();	
	}


}
