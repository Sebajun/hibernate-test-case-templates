package cern.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "REFERENTIALS")
@PrimaryKeyJoinColumn(name = "REFERENTIAL_ID")
public class Referential extends Point {

    @Column(name = "REFERENTIAL_NAME")
    private String referentialName;
}
