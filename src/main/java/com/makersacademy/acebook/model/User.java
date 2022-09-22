package com.makersacademy.acebook.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;

import lombok.Data;

import static java.lang.Boolean.TRUE;

@Data
@Entity
@Table(name = "USERS")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
        private String useralias;
    private boolean enabled;

    public User() {
        this.enabled = TRUE;
    }

    public User(String username, String useralias, String password) {
        this.username = username;
        this.password = password;
            this.useralias = useralias;
        this.enabled = TRUE;
    }

    public User(String username, String password, String useralias, boolean enabled) {
        this.username = username;
        this.password = password;
            this.useralias = useralias;
        this.enabled = enabled;
    }

    public String getUsername() { return this.username; }
    public String getPassword() { return this.password; }
        public String getAlias() { return this.useralias;}
    public void setUsername(String username) { this.username = username; }
    public void setPassword(String password) { this.password = password; }
        public void setAlias(String useralias) {this.useralias = useralias;}
}
