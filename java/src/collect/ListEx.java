package collect;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
	public static void main(String[] args) {
		List<Object> list = new ArrayList<>();
		list.add("one");
		list.add(2);
		list.add(5.5);
		list.add(false);
		list.add(3, 4); // index 3, value 4
		list.remove(0); // index 0 제거

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + "\t");
		}
	}
}
