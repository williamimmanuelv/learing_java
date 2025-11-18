public class Method_overloading{
    void sum(){
        System.out.println("sum 1");
    }
    void sum(int input){
        System.out.println("sum 2");
    }
    public static void main(String[] args) {
        Method_overloading funOverloading = new Method_overloading();
        funOverloading.sum(44);
        funOverloading.sum();

        
    }
}