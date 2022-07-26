import java.time.LocalDate;

public class CommericalActivity {
    private IndividualCustomer individualCustomer;
    private LocalDate startingDate;

    public CommericalActivity() {
    }

    public CommericalActivity(IndividualCustomer individualCustomer, LocalDate startingDate) {
        this.individualCustomer = individualCustomer;
        this.startingDate = startingDate;
    }

    public IndividualCustomer getIndividualCustomer() {
        return individualCustomer;
    }

    public void setIndividualCustomer(IndividualCustomer individualCustomer) {
        this.individualCustomer = individualCustomer;
    }

    public LocalDate getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(LocalDate startingDate) {
        this.startingDate = startingDate;
    }
}
