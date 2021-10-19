package comp2011.a1;

/**
 * 
 * @author Yixin Cao (September 11, 2021)
 *
 * A circularly and doubly linked list. 
 * 
 * The task is to split the original list into three circularly and doubly linked lists of equal length.
 * 
 * For simplicity, you can assume that the length of the input is a multiple of three. 
 * There are nine in the example in {@code main}.
 * 
 * You are not allowed to use the {@code insert} method or write a method that adding nodes to a list.
 * 
 */
public class CDList { // Please change! In Eclipse, press Alt-Shift-R on the class name.
    class DNode {
        int element;
        DNode previous, next;

        DNode(int data) { this.element = data; }
    }

	private DNode head;

	// this method is provided for the purpose of test (in the main).
	// it's not for your use.
	public void insert(int e) {
		DNode newNode = new DNode(e);
		if (head == null) {
			newNode.next = newNode;
			newNode.previous = newNode;
			head = newNode;
			return;
		}
		newNode.next = head;
		newNode.previous = head.previous;
		head.previous = newNode;
		newNode.previous.next = newNode;
	}
	
    /**
     * VERY IMPORTANT.
     * 
     * I've discussed this question with the following students:
     *     1. 
     *     2. 
     *     3. 
     *     ... 
     * 
     * I've sought help from the following Internet resources and books:
     *     1. 
     *     2. 
     *     3. 
     *     ... 
     * 
     * Running time: O( n ).   
     */ 
	public CDList_20084459d_ZHOUTuohan[] split() {
		CDList_20084459d_ZHOUTuohan[] ans = new CDList_20084459d_ZHOUTuohan[3];
		for(int i=0; i<3; i++) ans[i] = new CDList_20084459d_ZHOUTuohan();
		
		int n = size();
		int k3 = n/3;
		int k2 = (n-k3)/2;
		int k1 = n-k3-k2;
		
		DNode h = head;
		// first k1
		if( k1==0 ) ans[0].head = null;
		else{
			DNode last = h;
			for(int i=0; i<k1-1; i++) last = last.next;
			DNode nh = last.next;
			
			h.previous = last;
			last.next = h;
			
			ans[0].head = h;
			h = nh;
		}
		
		// next k2
		if( k2==0 ) ans[1].head = null;
		else{
			DNode last = h;
			for(int i=0; i<k2-1; i++) last = last.next;
			DNode nh = last.next;
			
			h.previous = last;
			last.next = h;
			
			ans[1].head = h;
			h = nh;
		}
		
		// last k3
		if( k3==0 ) ans[2].head = null;
		else{
			DNode last = h;
			for(int i=0; i<k3-1; i++) last = last.next;

			h.previous = last;
			last.next = h;
			
			ans[2].head = h;
		}
		
		return ans;	
	}

	// Bonus question.
	public CDList_20084459d_ZHOUTuohan[] split(int d) {
		return null;	
	}

	// return the list's size
	public int size(){
		if( head==null ) return 0;
		
		int n = 1;
		DNode cur = head;
		while( cur!=null && cur.next!=head ){
			n += 1;
			cur = cur.next;
		}
		return n;
	}
	
	public String toString() {
        if (head == null) return "The list is empty.";
        StringBuilder sb = new StringBuilder();
        DNode cur = head;
        sb.append(cur.element);
        cur = cur.next;
        while ( cur != head ) {
            sb.append(", " + cur.element);
            cur = cur.next;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] a = {11, 12, 13, 55, 52, 58, 29, 26, 20};
        CDList_20084459d_ZHOUTuohan l = new CDList_20084459d_ZHOUTuohan();
        for (int i: a) l.insert(i);
        System.out.println(l);
        CDList_20084459d_ZHOUTuohan[] lists = l.split();
        System.out.println(lists[0]);
        System.out.println(lists[1]);
        System.out.println(lists[2]);
    }
}
