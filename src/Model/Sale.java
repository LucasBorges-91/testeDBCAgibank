package Model;

public class Sale {

    private Integer id;
    private Item item;
    private String SalesmanName;

    public Sale() {}

    public Sale(Integer id, Item item, String salesmanName) {
        this.id = id;
        this.item = item;
        SalesmanName = salesmanName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getSalesmanName() {
        return SalesmanName;
    }

    public void setSalesmanName(String salesmanName) {
        SalesmanName = salesmanName;
    }
}
