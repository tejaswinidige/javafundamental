package com.Project.SpringAngular.CustomerController;
import com.Project.SpringAngular.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
 
@EnableJpaRepositories
@Repository

public interface CustomerRepo extends JpaRepository<Customer,Integer> {

}
