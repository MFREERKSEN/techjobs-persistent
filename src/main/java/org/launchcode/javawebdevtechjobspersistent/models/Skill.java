package org.launchcode.javawebdevtechjobspersistent.models;


import javax.persistence.Entity;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Entity
public class Skill extends AbstractEntity {

    public Skill() {}

    @Valid
    @NotBlank
    @Size
    public String description;

}
