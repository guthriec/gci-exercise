package gci.contracts;

import java.time.LocalDate;

public class Invoice {
  private final long id;
  private final long centsDue;
  private final LocalDate dueDate;
  private boolean isPaid;

  public Invoice(long id, long centsDue, LocalDate dueDate) {
    this.id = id;
    this.centsDue = centsDue;
    this.dueDate = dueDate;
    this.isPaid = false;
  }

  public long getId() {
    return id;
  }

  public long getCentsDue() {
    return centsDue;
  }

  public LocalDate getDueDate() {
    return dueDate;
  }

  public void setPaid() {
    isPaid = true;
  }

  public boolean isPastDueDate() {
    return (LocalDate.now().isAfter(dueDate) && !isPaid);
  }
}
