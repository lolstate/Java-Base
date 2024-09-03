package com.lolstate.auth.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table("users")
public class UserEntity extends BaseEntity {
    @Column("username")
    private String username;

    @Column("password")
    @JsonIgnore
    private String password;

    @Column("email")
    private String email;

    @Column("phone")
    private String phone;

    @Column("role")
    private String role;

    @Column("status")
    private String status;
}
