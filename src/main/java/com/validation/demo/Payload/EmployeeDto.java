package com.validation.demo.Payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class EmployeeDto {


    private int id;

    @NotEmpty
    @Size(min = 4, message = "name should consist of 4 characters")
    private String name;
    @NotEmpty
    @Email(message = "provide proper mail id")
    private String email;

    @NotEmpty
    @Min(value = 1000000, message = "mob no must be 10 digits")
    private String mobile;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
