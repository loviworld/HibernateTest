/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernateonetomany.dao;

import hibernateonetomany.models.Address;
import hibernateonetomany.models.Employee;
import java.util.List;

/**
 *
 * @author Tharanga
 */
public interface EmployeeDAO {
    
    public Integer insertEmployee(Employee employee);
    
    public void updateEmployee(Employee employee);
    
    public void removeEmployee(Employee employee);
    
    public List<Employee> listEmployee();
    
    public Employee findEmployee(Integer id);
    
}
