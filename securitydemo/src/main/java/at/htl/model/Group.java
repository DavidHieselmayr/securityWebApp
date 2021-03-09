package at.htl.model;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

@Entity
public class Group {
    @Id
    private long id;
    private String groupname;

    @ManyToMany (mappedBy = "groups")
    private List<ChatUser> users;

    @OneToMany
    private List<Message> messages;

    /*
    public Group(){
        users = new List<ChatUser>();
        messages = new List<Message>();
    }*/
}
