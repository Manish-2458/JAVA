package JavaAssignments.AS7;
class PurchaseProduct{
    private String name;
    private double unitprice;
    PurchaseProduct(){
        name="no product";
        unitprice=0.0;
    }
    PurchaseProduct(String name,double unitprice){
        this.name=name;
        this.unitprice=unitprice;
        System.out.println("Name of the customer:"+name);
        System.out.println("Unit Price is:"+unitprice);
    }
    void getPrice(){
        System.out.println(unitprice);
    }
}
class WeighedProduct extends PurchaseProduct{
    private double weight;
    double Unitprice;
    WeighedProduct(String name,double unitprice,double weight){
        super(name,unitprice);
        Unitprice=unitprice;
        this.weight=weight;
    }
    @Override
    void getPrice(){
        System.out.println("Price of the product based on weight(in kg):"+weight*Unitprice);
    }

}
class CountedProduct extends PurchaseProduct{
    private int quantity;
    double Unitprice;
    CountedProduct(String name,double unitprice,int quantity){
        super(name,unitprice);
        Unitprice=unitprice;
        this.quantity=quantity;
    }
    @Override
    void getPrice(){
        System.out.println("Price of the product based on quantity:"+quantity*Unitprice);
    }
}
public class _3 {
    public static void main(String[] args) {
        PurchaseProduct ob=new WeighedProduct("Amar",10,45);
        PurchaseProduct ob1=new CountedProduct("Amar",20,30);
        ob.getPrice();
        ob1.getPrice();
    }
}
