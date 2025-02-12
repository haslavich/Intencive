package ru.aston.Haslavskiy_DU.task1;

import ru.aston.Haslavskiy_DU.task1.Enums.Service;

import java.math.BigDecimal;

public class StartApp {
    public static void main(String[] args) throws Exception {
        Client client1=new Client("Alex","Ivanov",35);
        Client client2=new Client("Oleg","Petrov",30);
        Client client3=new Client("Semen","Sidorov",60);
        Order cat=new Order(1,client1,"Murzik",Service.Service4) {
            @Override
            public void makeDiscount() {
                BigDecimal discount=new BigDecimal("0.9");
                BigDecimal bufer=new BigDecimal(service.getPrice());
                BigDecimal total=bufer.multiply(discount);
                System.out.println("Your final price is "+total);
                }
        };
        Order dog=new Order(2,client2,"Sharik",Service.Service2) {
            @Override
            public void makeDiscount() {
                BigDecimal discount=new BigDecimal("0.85");
                BigDecimal bufer=new BigDecimal(service.getPrice());
                BigDecimal total=bufer.multiply(discount);
                System.out.println("Your final price is "+ total);
            }
        };
        cat.makeDiscount();
        dog.makeDiscount();
    }
}
