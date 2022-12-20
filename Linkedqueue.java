package CircularQ;

public class Linkedqueue {
	Node2 head;

	public Linkedqueue() {
		this.head = null;
	}

	public void enqueue(int data) {
		Node2 newnode = new Node2(data);
		if (head == null) {
			head = newnode;
		} else {
			Node2 temp = head;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(newnode);

		}

	}
	public int dequeue() {
		
		if(head==null) {
			System.out.println("queue is empty");
			return 0;
		}
		int temp=head.getData();
		head=head.getNext();
		return temp;
		
	}
public void display1() {
	if(head==null) {
		System.out.println("queue is empty");
	}
	else {
	Node2 meranode=head;
	while(meranode.getNext()!=null) {
		System.out.println(meranode.getData());
		meranode=meranode.getNext();
	}
	System.out.println(meranode.getData());
	
	}
	
	
	
}

		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

