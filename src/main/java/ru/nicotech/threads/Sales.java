package ru.nicotech.threads;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;

@AllArgsConstructor()
@Data() public class Sales {
   @Setter private String Region;
   @Setter private String Country;
   @Setter private String ItemType;
   @Setter private String SalesChannel;
   @Setter private String OrderPriority;
   @Setter private String OrderDate;
   @Setter private String OrderID;
   @Setter private String ShipDate;
   @Setter private String UnitsSold;
   @Setter private String UnitPrice;
   @Setter private String UnitCost;
   @Setter private String TotalRevenue;
   @Setter private String TotalCost;
   @Setter private String TotalProfit;

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

    /*public Sales(String region,
                 String country,
                 String itemType,
                 String salesChannel,
                 String orderPriority,
                 String orderDate,
                 String orderID,
                 String shipDate,
                 String unitsSold,
                 String unitPrice,
                 String unitCost,
                 String totalRevenue,
                 String totalCost,
                 String totalProfit) {

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
    }*/
}

