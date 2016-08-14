import java.util.LinkedList;


public class MaxValueOfWindow {
	public static int[] getMaxValueOfWindow(int[] arr, int w ) {
		if(arr == null || w < 1 || arr.length < w) {
			return null;
		}
		LinkedList<Integer> qmax = new  LinkedList<Integer>();
		int[] res = new int[arr.length - w +1];
		int index = 0;
		for(int i = 0 ; i < arr.length; i++ ) {
			while(qmax.isEmpty() && arr[qmax.peekLast()] <= arr[i]  ){
				qmax.pollLast();
			}
			//当窗口不为空并且窗口比当前元素小的值都已经移出本窗口，那么开始往该窗口中添加该元素
			qmax.addLast(i);
			//检查该窗口中的第一个值是否已经过期
			if(qmax.peekFirst() == i -w) {
				qmax.pollFirst();
			}
			//当窗口中元素了以后，应该进行的操作
			if( i  >= w - 1) {
				res[index ++] = arr[qmax.peekFirst()];
			}
		}
		return res;
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
