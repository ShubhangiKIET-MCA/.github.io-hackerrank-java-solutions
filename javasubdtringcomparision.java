


public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        smallest = s.substring(0,k);
        largest = s.substring(0,k);
//         "Compare to" method doesn't turn just the equel case it also turns a value.
        for(int i=0; i<=s.length()-k; i++ ){
            String str = s.substring(i,k+i);
            if (smallest.compareTo(str)>0){
                smallest = str;
            }
            if(largest.compareTo(str)<0){
                largest=str;
            }
        }  
        return smallest + "\n" + largest;
    }
    