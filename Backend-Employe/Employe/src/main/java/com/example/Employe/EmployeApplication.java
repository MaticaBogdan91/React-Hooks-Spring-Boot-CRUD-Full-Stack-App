package com.example.Employe;

import com.example.Employe.Model.Employee;
import com.example.Employe.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeApplication implements CommandLineRunner {
  public static void main(String[] args) {
    SpringApplication.run(EmployeApplication.class, args);
  }

  public EmployeApplication(EmployeeRepository employeeRepository) {
    this.employeeRepository = employeeRepository;
  }


  @Autowired
  private final EmployeeRepository employeeRepository;

  @Override
  public void run(String... args) throws Exception {
//
//    Employee employee = new Employee();
//    employee.setFirstName("Vasile");
//    employee.setLastName("Luca");
//    employee.setEmailId("raul@yahoo.com");
//    employeeRepository.save(employee);
//
//    Employee employee1 = new Employee();
//    employee.setFirstName("Ion");
//    employee.setLastName("Mara");
//    employee.setEmailId("Ion@yahoo.com");
//    employeeRepository.save(employee1);

  }
}
