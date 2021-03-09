package at.htl.repository;

import at.htl.model.ChatUser;
import at.htl.model.Message;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MessageRepository implements PanacheRepositoryBase<Message, String> {
}

