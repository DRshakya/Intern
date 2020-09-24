/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.resources;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Dipankar
 */
@ManagedBean
@SessionScoped
public class StudentBean{
    private List<Student> std;
    private Student item = new Student();
    private Student rollBack = null;
    private boolean edit;
    public StudentBean(){
        std = new ArrayList<Student>();
    }
    
    public void add() {
        if(std.isEmpty() == true)
            item.setId(1);
        else
        {
            int s = std.size();
            item.setId(s+1);
        }
        std.add(item);
        item = new Student();
    }
    
    public void edit(Student item) {
        this.item = item;
        edit = true;
    }
    
    public void saveEdit() {
        this.item = new Student();
        edit = false;
    }
    public void reset()
    {
        this.item.firstname=null;
        this.item.middlename=null;
        this.item.lastname=null;
        this.item.program=null;
        this.item.faculty=null;
    }
    
    public void cancel()
    {
        this.item.restore(rollBack);
        this.item = new Student();
        edit = false;
    }
    
    public void delete(Student item) throws IOException {
        
        std.remove(item);
    }
    
    public List<Student> getList() {
        return std;
    }
    
    public Student getItem() {
        return this.item;
    }
    
    public boolean isEdit() {
        return this.edit;
    }
}
