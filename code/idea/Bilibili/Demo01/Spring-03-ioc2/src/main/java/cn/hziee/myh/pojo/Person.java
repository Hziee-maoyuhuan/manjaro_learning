package cn.hziee.myh.pojo;

public class Person {
    private String name;
    private int age;

    public Person(String userName, int userAge) {
        this.name = userName;
        this.age = userAge;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
