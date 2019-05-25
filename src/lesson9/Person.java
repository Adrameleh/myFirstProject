package lesson9;

public class Person {
    private int age;
    private String name;
    private String sername;
    private long phoneNumber;

    public Person(){

    }

    public Person(int newAge){
        age=newAge;
    }

    public Person(String newName){
        name=newName;
    }



    public Person(long newPhoneNumber){
        phoneNumber = newPhoneNumber;
    }

    public Person(int newAge, String newName){
        age=newAge;
        name=newName;
    }



    public Person(int newAge, long newPhoneNumber){
        age=newAge;
        phoneNumber = newPhoneNumber;
    }

    public Person(String newName, String newSername){
        sername=newSername;
        name=newName;
    }



    public Person(String newSerame, long newPhoneNumber){
        phoneNumber = newPhoneNumber;
        sername=newSerame;
    }

    public Person(int newAge, String newName, String newSername){
        sername=newSername;
        name=newName;
        age=newAge;
    }



    public Person(int newAge, String newSername, long newPhoneNumber){
        sername=newSername;
        age=newAge;
        phoneNumber = newPhoneNumber;
    }

    public Person(long newPhoneNumber, String newName, String newSername){
        sername=newSername;
        name=newName;
        phoneNumber = newPhoneNumber;
    }

    public Person(int newAge, long newPhoneNumber, String newName, String newSername){
        sername=newSername;
        name=newName;
        phoneNumber = newPhoneNumber;
        age=newAge;
    }
}
