import java.io.*; import java.util.*; import java.text.*; import java.math.*; 
public class Solution {
private static PriorityQueue<Long> minHeap = new PriorityQueue<>();                           
private static PriorityQueue<Long> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); 
private static HashMap hm=new HashMap(); 
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for(int i=0; i < n; i++) {
         medianTracker(in);
    }
 }
public static void medianTracker(Scanner in) {
    String op=in.next();
    long num=in.nextInt();
    if(op.equals("a")) {
        addNumber(num,hm);
        getMedian();
    }
    else if(op.equals("r"))  {
        boolean check=delNumber(num,hm); 
        if(check==true) 
{ getMedian(); 
} 
        else 
            System.out.println("Wrong!");
    }
}
private static void addNumber(long num, HashMap hm) {
  if (maxHeap.isEmpty()) {
        maxHeap.add(num);  
    }
    else if (maxHeap.size() == minHeap.size()) {
      if (num > maxHeap.peek()) {
            minHeap.add(num);
            maxHeap.add(minHeap.remove());
        }
        else {
          maxHeap.add(num);
        }
    }
    else if (maxHeap.size() > minHeap.size()) 
    {
        if (num > maxHeap.peek()) {
            minHeap.add(num);
        }
        else {
            maxHeap.add(num);
            minHeap.add(maxHeap.remove());
        }
    }

  if(hm.containsKey(num)){hm.put(num,((Long)hm.get(num)+1));}
     else{ hm.put(num,(long)1);} 
     }
    
 private static boolean delNumber(long num,HashMap hm) {
     if((!hm.containsKey(num) )|| ((long)hm.get(num)<=0)) {return false;}
    else  {            
       long value=(Long)(hm.get(num))-1;
       hm.put(num,value);
      if (maxHeap.size() > minHeap.size() ){
          if (num <= maxHeap.peek()){
             maxHeap.remove(num);
            if(maxHeap.size()==0){return false;}
           }
        else  {
            
            minHeap.remove(num);
            minHeap.add(maxHeap.remove());
        }            
         }

   else if (maxHeap.size() == minHeap.size()) {
       if (num > maxHeap.peek()) {
            minHeap.remove(num);      
        }
        else {
            maxHeap.remove(num);
            maxHeap.add(minHeap.remove());  
        }
    }
    return true;
     }
}

private static void getMedian() { 
   double res; if (maxHeap.size() > minHeap.size()) {
        res=maxHeap.peek();
     }
    else 
        {
        res=(maxHeap.peek() + minHeap.peek()) / 2.0;
        }

        if((double)(res - (long) res)==0.0){ 
            System.out.printf("%.0f\n", res);
        }
       else{
            System.out.printf("%.1f\n", res);
       }
}
}
