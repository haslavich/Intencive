package ru.aston.Haslavskiy_DU.task1;

public class Client {
    String name;
    String soName;
    int age;

    public Client(String name, String soName, int age) {
        this.name = name;
        this.soName = soName;
        if (age<=0) throw new IllegalArgumentException("Age must be pozitive!"); else this.age=age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSoName() {
        return soName;
    }
    public void setSoName(String soName) {
        this.soName = soName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
