public class Sales {

    private String Region;
    private String Country;
    private String ItemType;
    private String SalesChannel;
    private String OrderPriority;
    private String OrderDate;
    private String OrderID;
    private String ShipDate;
    private String UnitsSold;
    private String UnitPrice;
    private String UnitCost;
    private String TotalRevenue;
    private String TotalCost;
    private String TotalProfit;

    @Override
    public String toString() {
        return Region + ',' +
                Country + ',' +
                ItemType + ',' +
                SalesChannel + ',' +
                OrderPriority + ',' +
                OrderDate + ',' +
                OrderID + ',' +
                ShipDate + ',' +
                UnitsSold + ',' +
                UnitPrice + ',' +
                UnitCost + ',' +
                TotalRevenue + ',' +
                TotalCost + ',' +
                TotalProfit + '\n';
    }

    public Sales(String region, String country, String itemType, String salesChannel, String orderPriority, String orderDate, String orderID, String shipDate, String unitsSold, String unitPrice, String unitCost, String totalRevenue, String totalCost, String totalProfit) {
        Region = region;
        Country = country;
        ItemType = itemType;
        SalesChannel = salesChannel;
        OrderPriority = orderPriority;
        OrderDate = orderDate;
        OrderID = orderID;
        ShipDate = shipDate;
        UnitsSold = unitsSold;
        UnitPrice = unitPrice;
        UnitCost = unitCost;
        TotalRevenue = totalRevenue;
        TotalCost = totalCost;
        TotalProfit = totalProfit;
    }
    public Sales(){

    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String Region) {
        this.Region = Region;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getItemType() {
        return ItemType;
    }

    public void setItemType(String ItemType) {
        this.ItemType = ItemType;
    }

    public String getSalesChannel() {
        return SalesChannel;
    }

    public void setSalesChannel(String SalesChannel) {
        this.SalesChannel = SalesChannel;
    }

    public String getOrderPriority() {
        return OrderPriority;
    }

    public void setOrderPriority(String OrderPriority) {
        this.OrderPriority = OrderPriority;
    }

    public String getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(String OrderDate) {
        this.OrderDate = OrderDate;
    }

    public String getOrderID() {
        return OrderID;
    }

    public void setOrderID(String OrderID) {
        this.OrderID = OrderID;
    }

    public String getShipDate() {
        return ShipDate;
    }

    public void setShipDate(String ShipDate) {
        this.ShipDate = ShipDate;
    }

    public String getUnitsSold() {
        return UnitsSold;
    }

    public void setUnitsSold(String UnitsSold) {
        this.UnitsSold = UnitsSold;
    }

    public String getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(String UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    public String getUnitCost() {
        return UnitCost;
    }

    public void setUnitCost(String UnitCost) {
        this.UnitCost = UnitCost;
    }

    public String getTotalRevenue() {
        return TotalRevenue;
    }

    public void setTotalRevenue(String TotalRevenue) {
        this.TotalRevenue = TotalRevenue;
    }

    public String getTotalCost() {
        return TotalCost;
    }

    public void setTotalCost(String TotalCost) {
        this.TotalCost = TotalCost;
    }

    public String getTotalProfit() {
        return TotalProfit;
    }

    public void setTotalProfit(String TotalProfit) {
        this.TotalProfit = TotalProfit;
    }

}
