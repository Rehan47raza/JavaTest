package com;

public class Student {
private int rollNum;
private String name ;
private float marks;

Student(int rollNum,String name,float marks){
	this.rollNum=rollNum;
	this.name=name;
	this.marks=marks;
}

public int getRollNum() {
	return rollNum;
}

public void setRollNum(int rollNum) {
	this.rollNum = rollNum;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public float getMarks() {
	return marks;
}

public void setMarks(float marks) {
	this.marks = marks;
}
public int hashCode(){
	
	return rollNum;
}
public boolean equals(Object o){
	return (this==o);
	}
}
