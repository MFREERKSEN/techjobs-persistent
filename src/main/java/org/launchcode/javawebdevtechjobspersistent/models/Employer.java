package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

//@JoinColumn
@Entity
public class Employer extends AbstractEntity {


    @OneToMany
    private List<Job> jobs;

    public Employer() {}

    @Valid
    @NotBlank(message = "Required Field")
    @Size(min=2,max=50,message = "Must be between 2 and 50 Char")
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
