/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author EBDA3
 */
public class JUnitTestForShoppingCart {
    
    public JUnitTestForShoppingCart() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void req1() 
     {
         ShoppingCart sc =new ShoppingCart();
         int expPCount =0;
         assertTrue (sc.products.size()==expPCount);
     }
     @Test
     public void req2 ()
     {
         double actPrice=127;
         int actCount=0;
         double expPrice=0;
         int expCount =1;
         
         product p = new product ("Java Book" ,127);
         ShoppingCart sc =new ShoppingCart ();
         sc.addProduct(p);
            for (int i=0;i<sc.products.size();i++)
         {
             expPrice+=sc.products.get(i).price;
         }
     
         actCount=sc.products.size();
         
         assertEquals(expCount ,actCount);
         assertTrue(expPrice==actPrice);
                     
         
     }
     @Test
     public void req3()
     {
         double actPrice=227;
         int actCount=0;
         double expPrice=0;
         int expCount =2;
         ShoppingCart sc =new ShoppingCart ();
         product p=new product ("java Book " ,127 );
         sc.products.add(p);
         p=new product ("eb design Book " ,100);
         sc.products.add(p);
            for (int i=0;i<sc.products.size();i++)
         {
             expPrice+=sc.products.get(i).price;
         }
     
         actCount=sc.products.size();
         
         assertEquals(expCount ,actCount);
         assertTrue(expPrice==actPrice);
         
     }
     
}
