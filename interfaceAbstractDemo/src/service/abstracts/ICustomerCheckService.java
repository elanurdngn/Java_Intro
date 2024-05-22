package service.abstracts;

import entities.Customer;

public interface ICustomerCheckService {
    boolean CheckIfRealPerson(Customer customer);
}
