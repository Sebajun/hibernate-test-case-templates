package cern.entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;


    @Entity
    @Table(name = "POINTS")
    @Inheritance(strategy = InheritanceType.JOINED)
    @AttributeOverride(name = "id", column = @Column(name = "POINT_ID"))
    public class Point{

        @Id
        private Long id;
        @Column(name = "POINT_NAME")
        private String name;

        @Column(name = "DESCRIPTION")
        private String description;

        @Column(name = "NOTE")
        private String note;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }
}
