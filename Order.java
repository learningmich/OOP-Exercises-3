public class Order
{
  private Customer owner;
    private String order;

    public Order(){
        owner = null;
        order = "unassigned";
    }

    public String getOrder () {
        return order;
    }

    public String getCustomerName() {
        return owner.getName();
    }

    public void setOrder (String customerOrder) {
        order = customerOrder;
    }

    public void setCustomerName(Customer customer) {
        owner = customer;
    }



    public String toString() {
		return "Customer Name: " + owner.getName() + "\n"
            + "Order: " + order;
    }
	
}
