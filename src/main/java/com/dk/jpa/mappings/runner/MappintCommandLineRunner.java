package com.dk.jpa.mappings.runner;

import com.dk.jpa.mappings.composite.entity.Account;
import com.dk.jpa.mappings.composite.entity.AccountId;
import com.dk.jpa.mappings.composite.entity.Employee;
import com.dk.jpa.mappings.composite.entity.EmployeeId;
import com.dk.jpa.mappings.composite.repository.AccountRepository;
import com.dk.jpa.mappings.composite.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class MappintCommandLineRunner implements CommandLineRunner {

  @Autowired
  private AccountRepository accountRepository;

  @Autowired
  private EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {
        // ======= `@IdClass` Annotation =======

        // create new accounts
        accountRepository.save(new Account("458666", "Checking", 4588));
        accountRepository.save(new Account("458689", "Checking", 2500));
        accountRepository.save(new Account("424265", "Saving", 100000));

        // fetch accounts by a given type
        List<Account> accounts = accountRepository.findByAccountType("Checking");
        accounts.forEach(System.out::println);

        // fetch account by composite key
        Optional<Account> account = accountRepository.findById(new AccountId("424265", "Saving"));
        account.ifPresent(System.out::println);

        // ======= `@EmbeddedId` Annotation =======

        // create new employees
        employeeRepository.save(new Employee(new EmployeeId(100L, 10L),
                "John Doe", "john@example.com", "123456"));
        employeeRepository.save(new Employee(new EmployeeId(101L, 20L),
                "Emma Ali", "emma@example.com", "654321"));

        // fetch employees by a given department id
        List<Employee> employees = employeeRepository.findByEmployeeIdDepartmentId(20L);
        employees.forEach(System.out::println);

        // fetch employee by composite key
        Optional<Employee> employee = employeeRepository.findById(new EmployeeId(100L, 10L));
        employee.ifPresent(System.out::println);
    }
}
