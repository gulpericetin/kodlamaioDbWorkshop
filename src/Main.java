public class Main {
    public static void main(String[] args) {
        Canal canal = new Canal(1,"Internet");

        Customer customer1 = new IndividualCustomer(1,"235467",canal,"Gülperi","Çetin","0987654321");
        System.out.println(customer1.getId());
        System.out.println(customer1.getCustomerNo());
        System.out.println(customer1.getCanal().getName());
    }
}
