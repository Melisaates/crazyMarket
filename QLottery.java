import java.util.Random;
/**Melisa ATES
 * 20120205045
 * atesmel12@gmail.com
 * TODO: indeksle cikarma islemenin ve ekleme isleminin verimli oldugu bir
 * implementasyon yapmaniz istenmektedir.
 */

public class QLottery {
    Node head;

    static class Node{
        Customer customer;
        Node next;
        Node prev;
        int no;

        Node(Customer customer){
            this.customer=customer;
        }
    }
    public void add(Customer cr){//Döngü head ile başlar ve aradığımız her node'a null değerine ulaşana kadar döngü döner.
		Node c=new Node(cr);

        c.next=this.head;
        if(head!=null){
            head.prev=c;
        }
        head=c;
        c.prev=null;
        
    }

    public boolean subtract(){
		Customer cs=new Customer();
        Node x=new Node(cs);
        Random random = new Random();
        x.no = random. nextInt();

        if(head==null){//bos ise
			return false;
		}
		else{
		

        if(x.prev != null ){
            x.prev.next=x.next;
        }
        else{
            head=x.next;
        }
        if(x.next!=null){
            x.next.prev=x.prev;
        }
        return true;
	}

    }

}
