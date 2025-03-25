public class PersonCustomerTest {
    public static void main(String[] args){
        Customer customer = new Customer("Adriana", "dfg iuyr,45", "123456",
                "sdf456", false);



        System.out.println("Name: " +customer.getName());
        System.out.println("Address: "+customer.getAddress());
        System.out.println("Phone number is: "+customer.getPhone());
        System.out.println("Customer number: "+ customer.getCustomerNumber());
        System.out.println("Maillist: "+customer.getMailList());
    }



}