package projects.src.main.java.assignment_3.item_package;

public class Item    // Item class reps an item in the context of a shop
{

    private String name;
    private String type;
    private String description;
    private double price;

    public Item(String oName, String oType, String oDescription, double oPrice)
    {
        this.name = oName;
        this.type = oType;
        this.description=oDescription;
        this.price = oPrice;
    }

    public void setName(String pName){name=pName;}
    public void setType(String pType){type=pType;}
    public void setDescription(String pDescription){description=pDescription;}
    public void setPrice(double pPrice){price=pPrice;};

    public String getName(){return name;}
    public String getType(){return type;}
    public String getDescription(){return description;}
    public double getPrice(){return price;}

    @Override
    public String toString()
    {
        //String str= "Name               Type                        Description                                         Price \n";
        String str;
        str= name + "\t\t\t" + type + "\t\t\t" + description + "\t\t\t\t\t\t\t" + price ;
        return str;

    }
}   // end class Item
