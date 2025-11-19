public class Store{
    void GetSoap(int money){
        System.out.println(money);
        System.out.println("misuru");
    }
    void GetChacolate(int money){
        System.out.println(money);
        System.out.println("chacolate");
    }
    void GetPowder(int money){
        System.out.println(money);
        System.out.println("powder");
    }
    public static void main(String[] args) {
        Store items = new Store();
        items.GetSoap(20);
        items.GetChacolate(30);
        items.GetPowder(40);
        
    }
}