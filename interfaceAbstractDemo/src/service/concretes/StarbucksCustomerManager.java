package service.concretes;

import entities.Customer;
import service.abstracts.BaseCustomerManager;
import service.abstracts.ICustomerCheckService;

public class StarbucksCustomerManager extends BaseCustomerManager {
    private ICustomerCheckService _customerCheckService;

    public StarbucksCustomerManager(ICustomerCheckService customerCheckService)
    {
        _customerCheckService = customerCheckService;
    }

    public void Save(Customer customer)
    {
        if (_customerCheckService.CheckIfRealPerson(customer))
        {

        }
        else
        {
            throw new RuntimeException("Not a valid person");
        }

    }
}
}
