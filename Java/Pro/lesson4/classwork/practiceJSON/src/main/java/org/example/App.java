package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Arrays;

class OrderList {
    Recipient recipient;
    String[] priceList;

    @Override
    public String toString() {
        return "OrderList{" +
                "recipient=" + recipient +
                ", priceList=" + Arrays.toString(priceList) +
                '}';
    }
}
class Recipient {
    String name;
    String phone;

    @Override
    public String toString() {
        return "Recipient{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
public class App 
{
    static String JSON = """
        {
            "recipient": {
                "name": "dsfdsf",
                "phone": "34543545"
            },
            [
                {
                    "name": "Xxxx",
                    "price": 79.5
                },
                {
                    "name": "Yyyyyy",
                    "price": 55.5
                },
                {
                    "name": "ddfdfg",
                    "price": 90
                }
            ]
        }
    """;
    public static void main( String[] args )
    {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        OrderList orderList = gson.fromJson(JSON, OrderList.class);
        System.out.println(orderList);

        String json = gson.toJson(orderList);
        System.out.println(json);
    }
}
