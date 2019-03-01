package gci.contracts;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Contract {
  private final String id;
  private final LocalDate startDate;
  private final LocalDate endDate;
  private List<Invoice> invoices;

  public Contract(String id, LocalDate startDate, LocalDate endDate) {
    this.id = id;
    this.startDate = startDate;
    this.endDate = endDate;
    this.invoices = new ArrayList<Invoice>();
  }

  public String getId() {
    return id;
  }

  public List<Invoice> getRecentInvoices() {
    return invoices;
  }

  public LocalDate getStartDate() {
    return startDate;
  }

  public LocalDate getEndDate() {
    return endDate;
  }

  public void addInvoice(Invoice invoice) {
    invoices.add(invoice);
  }

  public boolean isExpiring() {
    return LocalDate.now().isAfter(getEndDate().minusDays(90));
  }

  abstract String getTitle();

  abstract String getPriceDescriptor();
 
}
