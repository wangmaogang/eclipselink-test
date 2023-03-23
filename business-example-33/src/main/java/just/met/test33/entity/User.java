package just.met.test33.entity;

import javax.persistence.*;

/**
 * 用户
 *
 * @author wangmaogang
 */
@Entity
public class User {

    @Id
    @GeneratedValue
    protected Long id;

    private String name;

    @Column(unique = true)
    private String code;

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User(String name, String code) {
        this.name = name;
        this.code = code;
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

}
