public class Main {
    public static void main(String[] args) {
       EnhancedPlayer a1=new EnhancedPlayer("abc",20,"gun");
        System.out.println("intial health is "+a1.getHealth());
        a1.loseHealth(10);
        System.out.println("...............................");
        System.out.println("intial health is "+a1.getHealth());
        a1.loseHealth(10);
        System.out.println("...............................");
        System.out.println("intial health is "+a1.getHealth());


    }
}