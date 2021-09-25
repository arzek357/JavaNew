package com.zolotarev.gbhm.hm2;

public class Employee {
    private String name;
    private Integer age;
    private String mail;
    private String position;

    public Employee(String name,Integer age,String mail,String position){
        this.age=age;
        this.name=name;
        this.mail=mail;
        this.position=position;
    }

    public void printInformation(){
        System.out.printf("Имя работника: %s\nВозраст: %d\nПочта: %s\nДолжность: %s\n",name,age,mail,position);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
