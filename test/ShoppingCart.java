
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EBDA3
 */
class ShoppingCart {

   public ArrayList < product > products =new ArrayList() ;
   
   public void shoppingCart ()
   {
       products =new ArrayList() ;
   }

    void addProduct(product p) 
    {
        products.add(p);
    }
    void addProduct(String name ,double price) 
    {
        product p=new product(name,price);
        products.add(p);
    }
}
