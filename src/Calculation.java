public class Calculation {

    public void addition(int a, int b){

        System.out.println("Addition of a + b = "+ (a + b));
    }

    public void subtraction(int a, int b){

        System.out.println("Subtraction of a - b = " + (a-b));
    }

    public void multiplication(int a, int b){

        System.out.println("Multiplication of a * b = " + (a * b));
    }
    public void divison(int a, int b){

        System.out.println("divison of a / b = " + (a / b));
    }

    public static void main(String[] args){
    //addition(7, 5);
    //subtraction(7,5);

        Calculation mac = new Calculation();
        mac.addition(7,5);
        mac.subtraction(7,5);
        mac.multiplication(7,5);
        mac.divison(7, 5);

    }
}
