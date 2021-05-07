import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws Exception {
        BaseCustomerManager baseCustomerManager=new NeroCustomerManager(new MernisServiceAdaptor());
        Customer customer=new Customer();

        customer.firstName="Duygu";
        customer.lastName="Orhan";
        customer.date= LocalDate.of(2001,1,30);
        customer.id=1 ;
        customer.nationaltyId="2698";

        baseCustomerManager.Save(customer);
        System.out.println();
    }
}