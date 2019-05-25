package prototype;

public class Person implements Cloneable {
    private String name;
    private int age;
    private Address address;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    // 重写clone()方法要实现Cloneable方法，否则抛CloneNotSupportException异常
//    @Override
//    protected Person clone() {
//        try {
//            return (Person) super.clone();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }


    @Override
    protected Person clone() {
        Person person = null;
        try {
            person = (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        if (person != null) {
            person.address = address.clone(); // Address要深复制，否则会出现只拷贝Address引用的情况，导致复制的对象都指向同一个Address引用没有开辟Address的内存空间
        }
        return person;
    }
}
