package ru.learnup.mavenaccount.tax;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import ru.learnup.mavenaccount.tax.entities.Post;

import java.util.List;

public class DbHelper {

    private final SessionFactory sessionFactory;

    public DbHelper(String url, String user, String pass) {
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        final Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
        this.sessionFactory = metadata.getSessionFactoryBuilder().build();
    }

    public List<Post> getAllPosts() {
        try(Session session = sessionFactory.openSession()){
            final Query<Post> result = session.createQuery("from Post order by day asc", Post.class);
            return result.getResultList();
        }
    }
    public void addPost(Post post) {
        int id = getIdent();
        post.setDay(++id);
        try(Session session = sessionFactory.openSession()){
            final Transaction transaction = session.beginTransaction();
            session.save(post);
            transaction.commit();
        }
    }
    private int getIdent(){
        int num = 0;
        for (Post day : getAllPosts()){
            if (day.getDay() > num){
                num = day.getDay();
            }
        }
        return num;
    }
}