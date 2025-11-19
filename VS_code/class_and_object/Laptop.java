public class Laptop{

    String laptop = "";
    String pros = "";
    int ram = 0;
    int price = 0;

    public static void main (String args[]){

        Laptop lap1 = new Laptop();

        lap1.laptop = "lenova";
        lap1.pros = "amd";
        lap1.ram = 4 ;
        lap1.price = 15000;

        Laptop lap2 = new Laptop();

        lap2.laptop = "lenova";
        lap2.pros = "amd";
        lap2.ram = 4 ;
        lap2.price = 15000;

        System.out.print(lap2.laptop);
        System.out.print(lap2.pros);
        System.out.print(lap2.ram);
        System.out.print(lap2.price);
    }



}