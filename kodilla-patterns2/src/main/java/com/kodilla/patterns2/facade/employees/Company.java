package com.kodilla.patterns2.facade.employees;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//@NamedNativeQuery(
//        name = "Company.retrieveCompanyName",
//        query = "SELECT * FROM COMPANY WHERE NAME LIKE 'DAT%'",
//        resultClass = Company.class
//)

// "SELECT * FROM COMPANY WHERE NAME = 'DAT'"
// "SELECT * FROM COMPANY WHERE NAME LIKE \"% DAT %\";",
// "SELECT * FROM COMPANY WHERE NAME LIKE 'DAT%'"


@NamedQueries({
        @NamedQuery(
                name = "Company.retrieveCompanyName",
                query = "FROM Company WHERE COMPANY_NAME LIKE 'DAT%'"
        ),
        @NamedQuery(
                name = "Company.getForFragmentName",
                query = "FROM Company WHERE COMPANY_NAME LIKE :ARG"
        )
})

@Entity
@Table(name = "COMPANIES")
public class Company {
    private int id;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "COMPANY_ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "COMPANY_NAME")
    public String getName() {
        return name;
    }

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "companies")
    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }
}