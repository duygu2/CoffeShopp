

import MernisService.SSNKPSPublicSoap;

import java.util.Locale;

public class MernisServiceAdaptor implements CustomerCheckService{
    @Override
    public boolean CheckIfRealPerson(Customer customer) throws Exception {
        SSNKPSPublicSoap soap= new SSNKPSPublicSoap();
        return soap.TCKimlikNoDogrula(Long.valueOf(customer.nationaltyId),customer.firstName.toUpperCase(Locale.ROOT),customer.lastName.toUpperCase(Locale.ROOT),customer.date.getYear());

    }
}
