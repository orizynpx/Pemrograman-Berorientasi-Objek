package Meeting4;

public class Main {
    public static void main(String[] args) {
        Account myAccount = new Account(1000, "Sulaiman", "358");
        System.out.println(myAccount.getBalance());
        myAccount.increaseBalance(100);
        System.out.println(myAccount.getBalance());
        myAccount.decreaseBalance(100);
        System.out.println(myAccount.getBalance());
    }
}

class User {
}
abstract class Employee extends User {

}

class Teacher extends Employee {
    public Teacher() {
    }
}

class StudentMhs extends User {

}