package at.htl.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Group {
    @Id
    private long id;
    private String groupname;

}
