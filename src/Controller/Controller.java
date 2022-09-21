package Controller;

import Model.*;
import View.*;

public class Controller {

    private EmployeeManager empMan = new EmployeeManager();
    private Department dep = new Department();

    public void startApp(){
        // Viewing and Controlling the application's GUI
        dbGUI view = new dbGUI();
        view.setVisible(true);
    }

    public String[] getEmpAsStringArray(String ID) {
        empMan.loadFromXML("Employees.xml");
        return empMan.getEmpAsStringArray(ID);
    }

    public void addingEmployees(String id, String name, String phone, String salary, String dptoCode){
        empMan.loadFromXML("Employees.xml");
        empMan.add(new Employee(id, name, Integer.parseInt(phone), Double.parseDouble(salary), dptoCode));
        empMan.createXML("Employees.xml");
    }

    public void addingDeparment(String code, String name, String address, String latitude, String longitude){
        dep.loadFromXML("Employees.xml");
       // dep.add(new Employee(code, name, address, new Coordinates(Double.parseDouble(latitude), Double.parseDouble(longitude))));// Aqui falta cambiar para agregar el departamento
        dep.createXML("Employees.xml");
    }
}
