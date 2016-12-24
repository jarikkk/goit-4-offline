package ua.goit.offline4.dao.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ua.goit.offline4.dao.OrderDao;
import ua.goit.offline4.entity.Order;

import java.util.List;
import java.util.function.Supplier;

public class OrderDaoHibernate implements OrderDao {

    private SessionFactory sessionFactory;

    public OrderDaoHibernate(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    //адский конструктор
   // private Supplier<Session> sessionSupplier;
    //public OrderDaoHibernate(Supplier<Session>sessionSupplier) {
       // this.sessionSupplier = sessionSupplier;
   // }


    @Override
    public List<Order> getAll() {
       // sessionFactory.getCurrentSession();
        try(Session session = sessionFactory.openSession()){
            return session.createQuery("from Order", Order.class).list();
        }

    }
}
