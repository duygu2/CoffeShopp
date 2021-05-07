public abstract class BaseCustomerManager implements CustomerService{
    public void Save(Customer customer) throws Exception {
        System.out.println("Müşteri kayıt edildi:"+customer.firstName);
    }
}
