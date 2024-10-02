package src.Lab11;

public class Rolling {
    public static void main(String[] args) {
        int first = (int)(Math.random()*6) + 1, second = (int)(Math.random()*6)+1;
        System.out.println("The first die comes up " + first);
        System.out.println("The second die coes up " + second);
        System.out.println("Your total roll is " + (first+second));
    } 
}
