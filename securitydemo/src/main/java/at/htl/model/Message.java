package at.htl.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

@Entity
public class Message implements Serializable {
    @Id
    private long id;
    private String text;
    private LocalDateTime timestamp;


    @ManyToMany
    private List<Group> groupmessages;

    public Message() {
        this.groupmessages = new LinkedList<Group>();
    }

    public Message(String username, String message, LocalDateTime now) {
        // TODO Benutzer muss hinzugefügt werden getInfo
        this.setText(message);
        this.setTimestamp(now);
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public List<Group> getGroupmessages() {
        return groupmessages;
    }

    public void setGroupmessages(List<Group> groupmessages) {
        this.groupmessages = groupmessages;
    }
}
