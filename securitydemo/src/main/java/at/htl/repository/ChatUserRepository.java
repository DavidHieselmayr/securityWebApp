package at.htl.repository;

import at.htl.model.ChatUser;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.swing.text.html.parser.Entity;
import javax.transaction.Transactional;
import java.io.Serializable;

@ApplicationScoped
public class ChatUserRepository implements Serializable {
    @Inject
    public EntityManager em;


    @Transactional
    public ChatUser createChatUser(ChatUser chatuser){
        em.persist(chatuser);
        return chatuser;
    }

    public ChatUser findById(long userid){
        return em.find(ChatUser.class,userid);
    }

}
