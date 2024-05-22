package service.concretes;

import entities.Customer;
import service.abstracts.ICustomerCheckService;

public class CustomerCheckManager implements ICustomerCheckService {
    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        return true;
    }
}
