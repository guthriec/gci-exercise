package gci.contracts;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class ServiceItem {
  public String site;
  public String service;
  public long monthlyCentsOwed;
}

public class LineItemContract extends Contract {
  private ArrayList<ServiceItem> serviceItems;

  public LineItemContract(String id, LocalDate startDate, LocalDate endDate) {
    super(id, startDate, endDate);
    this.serviceItems = new ArrayList<ServiceItem>();
  }

  public void addServiceItem(ServiceItem item) {
    serviceItems.add(item);
  }

  public String getTitle() {
    return "Contract #" + super.getId();
  }

  //TODO: Implement
  public String getPriceDescriptor() {
    return "";
  }

  public List<ServiceItem> getServiceItems() {
    return serviceItems;
  }


}
