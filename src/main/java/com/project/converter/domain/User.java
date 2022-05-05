package com.project.converter.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="USER_ID")
    private Long user_id;

    @Column(name="USER_LOGIN")
    private String user_login;

    @Column(name="USER_PASSWORD")
    private String user_password;
}
