package collect;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {
	public static void main(String[] args) {
		Set<String> hs = new HashSet<>();
		hs.add("apple");
		hs.add("peach");
		hs.add("melon");
		hs.add("grape");
		hs.add("melon");
		System.out.println(hs);
		for (String str : hs) {
			System.out.println(str);
		}
		Iterator<String> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
