package Demo_list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Spliterator;
import java.util.TreeSet;

public class Demo_ArrayList {

	private static final Object Object = null;

	public static void main(String[] args) {
		
		
//		ArrayList<Object> l = new ArrayList<Object>();
//		
//		l.add("Dhanush");
//		l.add(2);
//		l.add("Dhanush");
//		l.add(true);
//		l.add("Siddarth");
//		l.add('K');
//		l.add(5.678f);
//		
//		ArrayList<Object> l1 = new ArrayList<Object>();
//		
//		l1.add("Dhanush");
//		l1.add(2);
//		l1.add("Dhanush");
//		l1.add(true);
//		l1.add("Siddarth");
//		l1.add('K');
//		l1.add(5);
//		
//		System.out.println(l);
//		System.out.println(l.contains('O'));
//		System.out.println(l.get(4));
//		System.out.println(l.equals(l1));
//		System.out.println(l.getFirst());
//		System.out.println(l.getLast());
//		System.out.println(l.indexOf("Dhanush"));
//		System.out.println(l.isEmpty());
//		System.out.println(l.lastIndexOf("Dhanush"));
//		System.out.println(l.remove(0));
//		System.out.println(l);
////		System.out.println(l.removeAll(l));
////		System.out.println(l);
//		System.out.println(l.removeFirst());
//		System.out.println(l);
//		System.out.println(l.removeLast());
//		System.out.println(l);
//		System.out.println(l.set(2, "Kishore"));
//		System.out.println(l);
////		l.clear();
////		System.out.println(l);
//		
//		//to convert arraylist to array
//		Object ar[] = l.toArray();
//		
//		for(Object i:ar) {
//			System.out.println(i);
//		}
//		System.err.println("++++++++++++++++++++");
//		Iterator it = l.iterator();
//		
////		System.out.println(it.next());
////		System.out.println(it.next());
//		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		
		//Linked-List
//		LinkedList<Object> k = new LinkedList<Object>();		
//		k.add("Dhanush");
//		k.add(2);
//		k.add("Dhanush");
//		k.add(true);
//		k.add("Siddarth");
//		k.add('K');
//		k.add(5);
//		
//		System.out.println(k);
//		System.out.println(k.poll());
//		System.out.println(k);
//		System.out.println(k.pollFirst());
//		System.out.println(k);
//		System.out.println(k.pollLast());
//		System.out.println(k);
//		
//		System.out.println(k.peekFirst());
//		System.out.println(k);
//		
//		System.out.println(k.peekLast());
//		System.out.println(k);
//		
//		System.out.println(k.pop());
//		System.out.println(k);
		
//		set
//		Hash set	
//		HashSet<Object> h  = new HashSet<Object>();
//		
//		h.add("Kishore");
//		h.add(true);
//		h.add('C');
//		h.add(45);
//		h.add(67.7f);
//		h.add(45);
//		h.add(null);
//		
//		System.out.println(h);
//		System.out.println(h.remove(45));
//		System.out.println(h);
//		System.out.println(h.size());
//		
//		Spliterator sp = h.spliterator();
//		
//		sp.forEachRemaining(q -> System.out.println(q));
		
		//Treeset
//		TreeSet<Character> t = new TreeSet<Character>();
//		t.add('A');
//		t.add('2');
//		t.add('!');
//		t.add('a');
//		t.add('Z');
//		System.out.println(t);
//		System.out.println(t.ceiling('2'));
//		System.out.println(t.floor('A'));
//		System.out.println(t.higher('2'));
//		System.out.println(t.lower('2'));
		
		
		HashMap <Object,Object> m = new HashMap <Object,Object>();

		m.put("Name", "Praveen");
		m.put("Age", "2");
		m.put("City", "Salem");
		m.put(null, "Praveen");
		m.put(2, 20);
		
		
		System.out.println(m);
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.containsKey(null));
		System.out.println(m.containsKey("State"));
		System.out.println(m.containsValue("Salem"));
		System.out.println(m.replace("City", "Chennai"));
		System.out.println(m);
	
	}

}
