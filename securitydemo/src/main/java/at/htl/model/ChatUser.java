package at.htl.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class ChatUser extends PanacheEntityBase {
    @Id
    public String userid;
    @Column(unique = true)
    public String username;
    public String password;

    @ManyToMany
    private List<Group> groups;
}
