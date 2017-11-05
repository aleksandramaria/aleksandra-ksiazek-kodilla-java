package com.kodilla.patterns2.facade.employees;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by ola on 11/09/2017.
 */
@Transactional
@Repository
public interface EmployeeDao extends CrudRepository <Employee, Integer> {

    @Query
    List<Employee> retrieveLastname(@Param("LASTNAME") String lastname);

    @Query
    List<Employee> getForFragmentName(@Param("ARG") String arg);

}
