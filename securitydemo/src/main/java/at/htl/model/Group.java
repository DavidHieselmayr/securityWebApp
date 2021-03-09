package at.htl.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

@Entity
public class Group implements Serializable {
    @Id
    private long id;
    private String groupname;

    @ManyToMany (mappedBy = "groups")
    private List<ChatUser> users;

    @ManyToMany (mappedBy = "groupmessages")
    private List<Message> messagesgroups;

    public Group() {
        this.users = new LinkedList<ChatUser>();
        this.messagesgroups = new LinkedList<Message>();
    }

    public Group(String groupname) {
        this.setGroupname(groupname);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public List<ChatUser> getUsers() {
        return users;
    }

    public void setUsers(List<ChatUser> users) {
        this.users = users;
    }

    public List<Message> getMessagesgroups() {
        return messagesgroups;
    }

    public void setMessagesgroups(List<Message> messagesgroups) {
        this.messagesgroups = messagesgroups;
    }
}
