# stack

```java
import java.util.Stack;

public class StackImpl {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack <>();

		stack.push(3);
		stack.push(1);
		stack.push(2);
		stack.pop();
		stack.push(3);
		stack.push(6);
		stack.pop();

		while(!stack.empty()) {
			System.out.println(stack.peek() + " "); // peek : top에 있는 item을 삭제하지 않고 해당 item 반환
			stack.pop();
		}
	}
}
```

# queue

```java
import java.util.LinkedList;
import java.util.Queue;

public class QueueImpl {
	public static void main(String[] args) {
		Queue<Integer> q= new LinkedList<>();

		q.offer(5);
		q.offer(2);
		q.offer(4);
		q.offer(5);
		q.offer(7); // push
		q.poll(); // shift

		while(!q.isEmpty()) {
			System.out.println(q.poll() + " ");
		}
	}
}
```
