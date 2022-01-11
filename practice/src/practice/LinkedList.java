package practice;

public class LinkedList {
    public Object object;
    public LinkedList nextLinkedList; 
    
    LinkedList(Vehicle vehicle) {
        this.object = vehicle;
    }
    
    public String toString() {
        String desc = this.object + " nextLinkedList= " + this.nextLinkedList;
        return desc;
    }
    
    public static void main(String[] args) {
        Vehicle car = new Vehicle("sakurai");
        Vehicle train = new Vehicle("rikuto");
        car.id = 1;
        
        LinkedList list1 = new LinkedList(car);
        LinkedList list2 = new LinkedList(train);
        System.out.println(list1);
    }
}