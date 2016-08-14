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
			//�����ڲ�Ϊ�ղ��Ҵ��ڱȵ�ǰԪ��С��ֵ���Ѿ��Ƴ������ڣ���ô��ʼ���ô�������Ӹ�Ԫ��
			qmax.addLast(i);
			//���ô����еĵ�һ��ֵ�Ƿ��Ѿ�����
			if(qmax.peekFirst() == i -w) {
				qmax.pollFirst();
			}
			//��������Ԫ�����Ժ�Ӧ�ý��еĲ���
			if( i  >= w - 1) {
				res[index ++] = arr[qmax.peekFirst()];
			}
		}
		return res;
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
