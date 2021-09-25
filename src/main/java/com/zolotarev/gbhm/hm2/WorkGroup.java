package com.zolotarev.gbhm.hm2;

import com.zolotarev.gbhm.hm2.exceptions.ManyWorkersException;

import java.util.Arrays;

public class WorkGroup {
    private final Employee[] employees = new Employee[10];
    private int employeesCount=0;

    public WorkGroup(Employee ... newEmployees ){
        if (newEmployees.length>employees.length){
            throw new ManyWorkersException("Количество сотрудников в команде не может быть больше "+employees.length+"!");
        }
        System.arraycopy(newEmployees, 0, employees, 0, newEmployees.length);
        employeesCount+=newEmployees.length;
    }

    public void addNewEmployee(Employee ... newEmployees){
        if (getFreePlacesInGroup()<newEmployees.length){
            throw new ManyWorkersException("Количество сотрудников в команде не может быть больше "+employees.length+"!. На данный момент их "+employeesCount+".");
        }
        for (int i =0, j=0;i<employees.length&&j<newEmployees.length;i++){
            if (employees[i]==null){
                employees[i]=newEmployees[j];
                j++;
            }
        }
    }

    public void deleteEmployeeByIndex(int index){
        employees[index]=null;
    }

    public void deleteAllEmployees(){
        Arrays.fill(employees, null);
    }

    public int getFreePlacesInGroup(){
        return employees.length-employeesCount;
    }

    public void printInfoAboutEmployees(){
        for (Employee employee : employees) {
            if (employee != null) {
                employee.printInformation();
            }
        }
    }
}
