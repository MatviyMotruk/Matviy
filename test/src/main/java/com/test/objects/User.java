package com.test.objects;

public class User {

    private String name;
    private String lastName;
    private int age;
    

    public String getName(){
        return name;
    }

    public String getLastName(){
        return lastName;
    }


    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setLastName(String lastName){
         this.lastName = lastName;
    }


    public void setAge(int age){
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof User) {

            User that = (User) obj;

            return this.name.equals(that.getName()) && that.lastName.equals(that.lastName) && this.age == that.getAge();

        }

        return false;
    }

    @Override
    public String toString() {
        return this.name + " " + this.lastName + " " + this.age;
    }

}
