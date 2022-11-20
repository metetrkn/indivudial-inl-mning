package se.systementor.supershoppen1.shop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserAccount {
    private String email;
    private String password;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    public UserAccount(String email, String password) {
        super();
        this.email = email;
        this.password = password;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getEmail()
    {
        return email;
    }
    public String getPassword()
    {
        return password;
    }
  
}
