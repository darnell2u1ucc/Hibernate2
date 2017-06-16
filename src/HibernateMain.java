import org.dbj.UserDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateMain {
	
	
	public static void main(String[] args){
		
		
		UserDetails userdetails = new UserDetails();
		userdetails.setDayName("Mon");
		userdetails.setDay(13);
		userdetails.setMonth(6);
		userdetails.setYear(2017);
		userdetails.setHours(5.5);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(userdetails);
		session.getTransaction().commit();
		session.close();
		
	}

}
