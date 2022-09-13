package com.example.CrudApplication.model;

public class User {
    private String name;
    private int rollno;
    private String department;

    public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String name, int rollno, String department) {
        this.name = name;
        this.rollno = rollno;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
