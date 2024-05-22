package service.concretes;

import entities.Customer;
import service.abstracts.BaseCustomerManager;
import service.abstracts.ICustomerCheckService;

import java.util.Base64;

public class NeroCustomerManager extends BaseCustomerManager {
    private ICustomerCheckService iCustomerCheckService;

    public NeroCustomerManager(ICustomerCheckService customerCheckService)
    {
         iCustomerCheckService = customerCheckService;
    }

    public void save(Customer customer)
    {
        if (iCustomerCheckService.CheckIfRealPerson(customer))
        {

        }
        else
        {
            throw new RuntimeException("Not a valid person");
        }
    }
}
