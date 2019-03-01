package gci.contracts;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ServiceOrder extends Contract {
  private long nonRecurringCents;
  private long recurringCents;

  public ServiceOrder(String id, LocalDate startDate, LocalDate endDate,
                      long nonRecurringCents, long recurringCents) {
    super(id, startDate, endDate);
    this.nonRecurringCents = nonRecurringCents;
    this.recurringCents = recurringCents;
  }

  public String getTitle() {
    return "Service Order #" + super.getId();
  }

  //TODO: Implement
  public String getPriceDescriptor() {
    return "";
  }
}
