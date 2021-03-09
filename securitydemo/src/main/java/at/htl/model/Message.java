package at.htl.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Message {
    @Id
    private long id;
    private String usr;
    private String text;
    private LocalDateTime timestamp;

}
