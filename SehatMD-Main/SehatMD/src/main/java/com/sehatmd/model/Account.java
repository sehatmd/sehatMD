package com.sehatmd.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//import com.quickstart.settings.validators.UniqueUsername;


@Entity
@Table(name = "qsecuser")
public class Account {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    //@UniqueUsername(message="Username already exists")
    @Size(min = 8, max = 255, message = "Username have to be grater than 8 characters")
    @Column(unique = true)
    private String username;

    @Column(name="first_name")
    private String firstName;
    
    @Column(name="last_name")
    private String lastName;
    
    @Column(name="phone")
    private String phone;
    
    @NotNull
    @Size(min = 8, max = 255, message = "Password have to be grater than 8 characters")
    private String password;

    @NotNull
    private boolean enabled = true;

    @NotNull
    private boolean credentialsexpired = false;

    @NotNull
    private boolean expired = false;

    @NotNull
    private boolean locked = false;
    
    @Column(name="created_date")
    private Date createdDate;

   
    
    public Account() {

    }

    public Account(Account account){
        this.id = account.getId();
        this.username = account.getUsername();
        this.password = account.getPassword();
        this.enabled = account.isEnabled();
        this.credentialsexpired = account.isCredentialsexpired();
        this.locked = account.isExpired();
       
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isCredentialsexpired() {
        return credentialsexpired;
    }

    public void setCredentialsexpired(boolean credentialsexpired) {
        this.credentialsexpired = credentialsexpired;
    }

    public boolean isExpired() {
        return expired;
    }

    public void setExpired(boolean expired) {
        this.expired = expired;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

   

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

}
