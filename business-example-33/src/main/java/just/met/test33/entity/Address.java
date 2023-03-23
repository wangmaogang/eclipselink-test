package just.met.test33.entity;

import javax.persistence.*;

/**
 * 地址
 * @author wangmaogang
 */
@Entity
public class Address {

    @Id
    @GeneratedValue
    protected Long id;

    private String name;

    @Column(unique = true)
    private String code;

    @ManyToOne
    private User user;

    public Address() {
    }

    public Address(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        if (name == null) {
            return "";
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        if (code == null) {
            return "";
        }
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
