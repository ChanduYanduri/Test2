import com.sun.org.apache.xpath.internal.SourceTree;

public class HelloJava {

    //non static area so need to create object in the main method

    public void changeName(String name){

        System.out.println(name);
    }

    public void changeAddress(String address){

        System.out.println(address);
    }

    public void changeMob(String mobile){

        System.out.println(mobile);
    }

    //statci area so no need to create object in main method, straight away we can call the object

    public static void changeDob(String Dob){

        System.out.println(Dob);
    }


    public static void main(String[] args){
        //for calling non static method we need to create new object
        HelloJava mac = new HelloJava();
        mac.changeName("Chandra Kumar");
        mac.changeAddress("5 Ashford Green, Watford");
        mac.changeMob("07932775877");

        //for calling static method no need to create new object, we can call straight away
        changeDob("29/05/1979");





}
}
