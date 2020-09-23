/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.resources;

import javax.faces.bean.ManagedBean;
import java.util.*;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Dipankar
 */
@ManagedBean
@SessionScoped
public class Student {
    private String firstname;
    private String middlename;
    private String lastname;
    private String faculty;
    private String program;
        
    public Student(){
        
    }
    
    //gettera setter

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }
    
    
    
    
    
    
    
    
    
}
