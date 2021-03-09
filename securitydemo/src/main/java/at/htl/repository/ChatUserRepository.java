package at.htl.repository;

import at.htl.model.ChatUser;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ChatUserRepository implements PanacheRepositoryBase<ChatUser, String> {
}
