package ru.aston.Haslavskiy_DU.task1.Enums;

public enum Service {
    Service1 ("10000"), //стрижка
    Service2 ("15000"),// прививка
    Service3 ("20000"),// кастрация
    Service4 ("50000.45");
    private String price; // усыпление

    Service(String price) {
        this.price=price;
    }

    public String getPrice() {
        return price;
    }
}

// test only test
//second commit