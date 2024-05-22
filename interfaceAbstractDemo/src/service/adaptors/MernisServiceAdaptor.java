package service.adaptors;

import entities.Customer;
import service.abstracts.ICustomerCheckService;

public class MernisServiceAdaptor implements ICustomerCheckService {

    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        //KPSPublicSoapClient client =new KPSPublicSoapClient();
        //return client.TCKimlikNoDogrula(Convert.ToInt64(customer.NationalityId), customer.FirstName.ToUpper(),
               // customer.LastName.ToUpper(), customer.DateOfBirth.Year);
        return true;
    }
}
