
public class naturalSum {

	public static void main(String[] args) {
		System.out.println(iterate(1, 100));
		System.out.println(recurse(1, 100));
	}

	public static int iterate(int start, int end) {
		int i, sum = 0;
		for (i = start; i <= end; i++) {
			// Add every number up to the end
			sum += i;
		}
		return sum;
	}
	
	public static int recurse(int start, int end) {
		// If the end has been reached, just return the end
		if (start == end) return end;
		// Add the number to the next number.
		return start + recurse(start + 1, end);
	}
}
