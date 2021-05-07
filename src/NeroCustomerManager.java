public class NeroCustomerManager extends BaseCustomerManager {

    CustomerCheckService customerCheckService;
    public NeroCustomerManager(CustomerCheckService customerCheckService){
        this.customerCheckService=customerCheckService;
    }

    public void Save(Customer customer) throws Exception {
        if(customerCheckService.CheckIfRealPerson(customer)){
            super.Save(customer);
        }
        else{
            System.out.println("Not a valid person!");
        }
    }
}

