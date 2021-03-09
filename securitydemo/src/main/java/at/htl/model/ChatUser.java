package at.htl.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

@Entity
public class ChatUser implements Serializable {
    @Id
    public long userid;
    @Column(unique = true)
    public String username;
    public String password;

    @ManyToMany
    private List<Group> groups;


    public ChatUser() {
        this.groups = new LinkedList<Group>();
    }

    public ChatUser(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
