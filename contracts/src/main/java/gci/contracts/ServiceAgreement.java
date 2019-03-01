package gci.contracts;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ServiceAgreement extends Contract {
  private long hourlyCents;

  public ServiceAgreement(String id, LocalDate startDate, LocalDate endDate, long hourlyCents) {
    super(id, startDate, endDate);
    this.hourlyCents = hourlyCents;
  }

  public String getTitle() {
    return "Services Agreement #" + super.getId();
  }

  //TODO: Implement
  public String getPriceDescriptor() {
    return "";
  }
}
