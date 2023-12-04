import java.util.ArrayList;
import java.util.List;
//gym and admin
public class Gym {
    // Attributes
    private String name;
    private String address;
    private String phoneNumber;
    public static List<Equipment> sportsEquipments = new ArrayList<>();
    public static List<Coach> coaches = new ArrayList<>(); // Initialize the list
    public static List<Customer> customers = new ArrayList<>();
    public static List<Subscription> subscriptions = new ArrayList<>();


    public Gym(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static List<Equipment> getSportsEquipments() {
        return sportsEquipments;
    }

    public static void setSportsEquipments(List<Equipment> sportsEquipments) {
        Gym.sportsEquipments = sportsEquipments;
    }

    public static List<Coach> getCoaches() {
        return coaches;
    }

    public static void setCoaches(List<Coach> coaches) {
        Gym.coaches = coaches;
    }

    public static List<Customer> getCustomers() {
        return customers;
    }

    public static void setCustomers(List<Customer> customers) {
        Gym.customers = customers;
    }

    public static List<Subscription> getSubscriptions() {
        return subscriptions;
    }

    public static void setSubscriptions(List<Subscription> subscriptions) {
        Gym.subscriptions = subscriptions;
    }
}
