package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkout(String pay){
        System.out.println("cart checked out");
    }

    public int count(){
        return 5;
    }
}
