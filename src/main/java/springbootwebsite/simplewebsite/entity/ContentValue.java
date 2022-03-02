package springbootwebsite.simplewebsite.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "content_value")
@Entity (name = "contentvalue")
public class ContentValue {
    @Id
    private Integer content_value_id;
    private String content_value;
    private Integer content_type;
    private Integer content_index;
    private Integer user_id;

    public Integer getContent_value_id() {
        return content_value_id;
    }

    public void setContent_value_id(Integer content_value_id) {
        this.content_value_id = content_value_id;
    }

    public String getContent_value() {
        return content_value;
    }

    public void setContent_value(String content_value) {
        this.content_value = content_value;
    }

    public Integer getContent_type() {
        return content_type;
    }

    public void setContent_type(Integer content_type) {
        this.content_type = content_type;
    }

    public Integer getContent_index() {
        return content_index;
    }

    public void setContent_index(Integer content_index) {
        this.content_index = content_index;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }
}

