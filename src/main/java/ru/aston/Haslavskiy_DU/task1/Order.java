package ru.aston.Haslavskiy_DU.task1;

import ru.aston.Haslavskiy_DU.task1.Enums.Service;
import ru.aston.Haslavskiy_DU.task1.Interfaces.Discount;

import java.math.BigDecimal;

public abstract class Order implements Discount {
    int id;
    Client client;
    String petName;
    Service service;
    public Order(int id, Client client, String petName, Service service) {
        this.id = id;
        this.client = client;
        this.petName=petName;
        this.service=service;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void makeDiscount() {
        //null
    }
        }

