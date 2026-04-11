class MedianFinder {
ArrayList<Integer> li ;
    public MedianFinder() {
        li = new ArrayList<>();
    }
    
    public void addNum(int num) {
        li.add(num);
    }
    
    public double findMedian() {
        if(li.size() == 1) return li.get(0);
       else if(li.size()%2 != 0){
            return (double)li.get(li.size()/2);
        }else{
double n1 = (double)li.get(li.size()/2 - 1);
double n2 = (double)li.get(li.size()/2 );
return (n1+n2)/2;
        }
    }
}
