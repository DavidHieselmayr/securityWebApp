package at.htl.repository;

import at.htl.model.ChatUser;
import at.htl.model.Group;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GroupRepository implements PanacheRepositoryBase<Group, String> {
}

