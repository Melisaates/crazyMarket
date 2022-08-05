/**
 * maintains a customer queue in a circular array TODO: methodlari implement
 * ediniz, fazla method-field ekleyebilirsiniz.
 */
public class QServer {
    int size=size();
    Customer[] queue;

    int front = 0, back = 0; // head&tail of queue
    
    /**
     * enqueue a customer to queue
     */
    boolean enqueue(Customer customer) {
        if((front    ==  (back+1)    %   size) || (front == 1 && back == size)){
            System.out.println("FULL");
            return false;
      //(back == (front - 1) % (size)))
        }
        else{
            
            back=(back+1)%size;
            queue[back]=customer;
            
            
           return true;

        }
        
    }

    /**
     * dequeue a customer from queue
     * 
     */
    Customer dequeue() {
        Customer c=queue[front];

        if(isEmpty()){
            return null;
        }
        else{
            if(front==back){
                front=-1;
                back=-1;
            }

            front=(front+1) % size;
            return c;
        }

    }

    /**
     * peek a customer in queue
     * 
     */
    Customer peek() {
        if(isEmpty()!=true){
            return queue[front];
        }
        return null;
        
    }

    /** kuruktaki toplam eleman sayisi */
    int size() {
        int i=front;
        for(;i<=back;i++){

        }
        return i;
    }

    boolean isEmpty() {
         if(front==0){
            return true;
         }
         else{
             return false;
         }
        
    }
   
}
