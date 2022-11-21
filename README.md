# Ice Cream Truck

Who else remembers the sheer unadulterated pleasure of scoring a treat from the ice cream truck? How about the excitement upon first hearing the telltale jingle in the distance, the race to form a line, and the dizzying menu of seemingly endless choices plastered on the door? Snow cones, firecrackers, ice cream-cookie sandwiches ... the list went on and on.

## Steps
We will need to track the customers that come to our shop. For that, we can implement an Queue. This can be achieved by following our example in [Module 16: Collections > Queue](https://replit.com/@RevUp5/Queue-erickpacheco2#Main.java)


0. Create a new file `Line.java`.
1. Add the following code to your new file.
   
  ```java
    import java.util.*;
    
    public class Line() {
      
      ArrayDeque<Integer> queue = new ArrayDeque<>();
      
    }
    
  ```
  
  The statement we added creates an ArrayDeque, a subtype of Queue, and assigns it to a corresponding reference variable. This queue can store Integer objects.
  
  Remember, the Common queue operations


    offer: add to the end of the data structure
    poll: remove from the front of the data structure
    peek: get the first element in the data structure

Customers line up to the `Ice Cream Parlor` (queue), so there should be a getter and setter method for the customers. Below what you have so far, inside the Line class, add the following code:



3. customer replies with order
4. The attendant then grabs the ice cream from the back
5. attendant gives the ice cream to the customer
6. attendant 