package com.project.uber.UberApp.entities;
import com.project.uber.UberApp.entities.enums.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Set;

//This is user class can only be used for authentication or
//authorization purposes

@Entity
@Table(name = "app_user")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //User Related Details
    public Long id;
    public String name;
    @Column(unique=true)
    public String email;
    public String password;


    @ElementCollection(fetch = FetchType.LAZY)
    @Enumerated(EnumType.STRING)
    private Set<Role> roles;
}
