package com.unrealtracker.raidapi.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "WeddingRess")
public class WeddingRes extends AuditModel {
    @Id
    @GeneratedValue(generator = "WeddingRes_generator")
    @SequenceGenerator(
            name = "WeddingRes_generator",
            sequenceName = "WeddingRes_sequence",
            initialValue = 1000
    )
    private Long id;

    @Column(columnDefinition = "text")
    private String name;

    @Column(columnDefinition = "text")
    private String additionalGuests;

    @Column(columnDefinition = "text")
    private String email;

    @Column(columnDefinition = "text")
    private String message;

    @Column(columnDefinition = "text")
    private String wedding;

    @Column(columnDefinition = "text")
    private String brunch;

    public String getWedding() {
        return wedding;
    }

    public void setWedding(String wedding) {
        this.wedding = wedding;
    }

    public String getBrunch() {
        return brunch;
    }

    public void setBrunch(String brunch) {
        this.brunch = brunch;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdditionalGuests() {
        return additionalGuests;
    }

    public void setAdditionalGuests(String additionalGuests) {
        this.additionalGuests = additionalGuests;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
