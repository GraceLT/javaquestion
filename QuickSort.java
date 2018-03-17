package practice;

import java.awt.Window.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class QuickSort {

    public void quicksort(int low,int high,int[]a) {
    	 int start = low;
         int end = high;
         int key = a[low];
         
         
         while(end>start){
             //�Ӻ���ǰ�Ƚ�
             while(end>start&&a[end]>=key)  //���û�бȹؼ�ֵС�ģ��Ƚ���һ����ֱ���бȹؼ�ֵС�Ľ���λ�ã�Ȼ���ִ�ǰ����Ƚ�
                 end--;
             if(a[end]<=key){
                 int temp = a[end];
                 a[end] = a[start];
                 a[start] = temp;
             }
             //��ǰ����Ƚ�
             while(end>start&&a[start]<=key)//���û�бȹؼ�ֵ��ģ��Ƚ���һ����ֱ���бȹؼ�ֵ��Ľ���λ��
                start++;
             if(a[start]>=key){
                 int temp = a[start];   
                 a[start] = a[end];
                 a[end] = temp;
             }
         //��ʱ��һ��ѭ���ȽϽ������ؼ�ֵ��λ���Ѿ�ȷ���ˡ���ߵ�ֵ���ȹؼ�ֵС���ұߵ�ֵ���ȹؼ�ֵ�󣬵������ߵ�˳���п����ǲ�һ���ģ���������ĵݹ����
         }
         //�ݹ�
         if(start>low) quicksort(low,start-1,a);//������С���һ������λ�õ��ؼ�ֵ����-1
         if(end<high) quicksort(end+1,high,a);//�ұ����С��ӹؼ�ֵ����+1�����һ��
     
    	
    }
    public static void main(String[]args) {
    	 
    	int[]a= {9,8,7,6,5,4};
    	QuickSort q1=new QuickSort();
    	q1.quicksort(0, a.length-1, a);
    	for(int i:a)
    		System.out.print(i);
    	Map<Integer,Double> m1=new HashMap<Integer,Double>();
    	m1.put(0, 1.2);
    	m1.put(1,2.4);
    	m1.put(2, 1.1);
    	Integer[]array=new Integer[m1.size()];
        m1.keySet().toArray(array);
        for(int i=array.length-1;i>0;i--)
        	for(int j=0;j<i;j++) {
        		if(m1.get(array[j])>m1.get(array[j+1])) {
        			double bigger=m1.get(array[j]);
        			double smaller=m1.get(array[j+1]);
        			m1.put(j,smaller);
        			m1.put(j+1,bigger);
        		}
        	}
       System.out.print(m1);
       Set s1=new HashSet<String>();
       s1.add("apple");
       s1.add("orange");
       s1.add("pear");
       System.out.print(s1);
       Set s2=new TreeSet<String>();
       s2.add("apple");
       s2.add("orange");
       s2.add("pear");
      
       System.out.print(s2);
    }
}
