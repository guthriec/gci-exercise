package gci.contracts;

import java.time.LocalDate;

public class DataProvider {
  ServiceOrder sampleServiceOrder() {
    LocalDate startDate = LocalDate.of(2015, 11, 24);
    LocalDate endDate = LocalDate.of(2018, 11, 30);
    ServiceOrder newContract = new ServiceOrder("WT-239", startDate, endDate, 348500, 27500);
    
    newContract.addInvoice(new Invoice(335783, 27500, LocalDate.of(2016, 1, 28)));
    
    return newContract;
  }

  LineItemContract sampleLineItemContract() {
    LocalDate startDate = LocalDate.of(2014, 2, 1);
    LocalDate endDate = LocalDate.of(2016, 2, 28);
    LineItemContract newContract = new LineItemContract("HB-134", startDate, endDate);
    
    ServiceItem itemOne = new ServiceItem();
    itemOne.site = "Site 1";
    itemOne.service = "100 Mbps MPLS";
    itemOne.monthlyCentsOwed = 742200;
    
    ServiceItem itemTwo = new ServiceItem();
    itemOne.site = "Site 2";
    itemOne.service = "100 Mbps MPLS";
    itemOne.monthlyCentsOwed = 332500;

    newContract.addServiceItem(itemOne);
    newContract.addServiceItem(itemTwo);

    newContract.addInvoice(new Invoice(312236, 742200 + 332500, LocalDate.of(2015, 12, 30)));
    
    return newContract;
  }

    ServiceAgreement sampleServiceAgreement() {
    LocalDate startDate = LocalDate.of(2015, 6, 18);
    LocalDate endDate = LocalDate.of(2016, 6, 18);
    ServiceAgreement newContract = new ServiceAgreement("SA-432", startDate, endDate, 12500);

    return newContract;
  }

}
