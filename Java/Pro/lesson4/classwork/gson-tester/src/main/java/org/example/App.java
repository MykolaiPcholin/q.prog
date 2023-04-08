package org.example;

import com.google.gson.*;

import java.util.Arrays;

class Address {
    String country;
    String city;

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

class Person {
    String name;
    int age;
    Address address;
    String[] phones;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", phones=" + Arrays.toString(phones) +
                '}';
    }
}

public class App {

    static String JSON = """
        {
            "name": "Vsevolod",
            "age": 36,
            "address": {
                "country": "UA",
                "city": "Kyiv"
            },
            phones: ["123456", "456546456"]
        }
    """;

    public static void main( String[] args ) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Person person = gson.fromJson(JSON, Person.class);
        System.out.println(person);

        String json = gson.toJson(person);
        System.out.println(json);
    }
}
