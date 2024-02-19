package Homework10;


public class Madde1 {
    public static void main(String[] args) {

        //Generic Method

        GenericClass<String> stringGenericClass = new GenericClass<>("Generic metotları öğreniyorum");
        stringGenericClass.printGenericField();

        GenericClass<Integer> integerGenericClass = new GenericClass<>(20);
        integerGenericClass.printGenericField();

        GenericClass<Double> doubleGenericClass = new GenericClass<>(5.5);
        doubleGenericClass.printGenericField();

        System.out.println("--------------------");

    }
}
