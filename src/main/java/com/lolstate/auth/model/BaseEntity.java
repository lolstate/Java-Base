package com.lolstate.auth.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;
import org.springframework.data.relational.core.mapping.Column;

import java.util.UUID;

@Getter
@Setter
public class BaseEntity {
    @Id
    private UUID id;

    @CreatedDate
    @Column("created_date")
    private Long createdDate;

    @LastModifiedDate
    @Column("updated_date")
    private Long updatedDate;

    @Column("deleted_date")
    private Long deletedDate;

    @Column("version")
    @Version
    @JsonIgnore
    private Long version;
}
