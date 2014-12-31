package array;  
public class Statistics 
{
    private int[] theInts;    
    public Statistics()
    {
        theInts = new int[100];
          
        for(int i = 0; i<theInts.length; i++)
        {
            theInts[i]=(int)(Math.random()*100)+1;
        }
    }    
    public String toString()
    {
        String theArray="";
        for(int i = 0; i<theInts.length; i++)
        {
            if(i%10==0) theArray+="\n";
            theArray+=theInts[i] + "\t";
        }
        return theArray;
    }
    public double average()
    {
        double sum = 0;
        for(int i = 0; i<theInts.length; i++)
        {
            sum += theInts[i];
        }
        return sum/theInts.length;
    }
    public int min()
    {
        int min = theInts[0];
        for(int i = 0; i<theInts.length; i++)
        {
            if(theInts[i] < min) min = theInts[i];                 
        }    
        return min;
    }    
    public int max()
    {
       int max = theInts[0];
       for(int i = 0; i<theInts.length; i++)
       {
           if(theInts[i] > max) max = theInts[i];
       }
       return max;
    }
    public int mode()
    {
    int mode = 0;
    int numTimes = 0;    
    for(int i = 0; i<theInts.length; i++)
    {
        int count = 0;
        for(int j = 0; j<theInts.length; j++)
        {
            if(theInts[i] == theInts[j]) count++;
        }         
        if(count > numTimes)
        {
            mode = theInts[i];
            numTimes = count;            
        }    
        if(count == numTimes && theInts[i]!=mode) mode = -1;
    }
    return mode;
    }
    public int numTimesMode()
    {    
    int numTimes = 0;
    for(int i = 0; i < theInts.length; i++) 
    {
        int count = 0;
        for(int j = 0; j < theInts.length; j++) 
        {
            if(theInts[j] == theInts[i]) count++;
        }
        if(count > numTimes) 
        {
            numTimes = count;
        }
    }
    return numTimes;
    }
    public boolean findint_linear (int n)
    {
        for(int i = 0; i<theInts.length; i++)  if(theInts[i] == n) return true;
        return false;
    }
    public double median()
    {         
        if (theInts.length % 2 == 0) 
        {
            double first = theInts[(theInts.length/2-1)];
            double last = theInts[(theInts.length/2)]; 
            return ((first+last)/2.0);  
        }
        else return theInts[((theInts.length+1)/2)-1];              
    }
    public boolean findint_binary(int n)
    {
        int low = 0;
        int high = theInts.length-1;
        bubbleSort();
        while(low<=high)
        {
            int mid = ((high + low)/2);
            if(n == theInts[mid]) return true;
            else if(theInts[mid] > n) high = mid-1;
            else low = mid+1;
        }
        return false;
    }
    public void bubbleSort()
    {
        boolean a = false;
        while(a == false)
        {
            a = true;
            for(int i = 0; i<theInts.length-1; i++)
            {
                if(theInts[i] > theInts[i+1])
                {
                int temp = theInts[i+1];
                theInts[i+1] = theInts[i];
                theInts[i] = temp;
                a = false;
                }
            }
        }        
    }
    public void selectionSort()
    {              
        for(int a = 0; a<theInts.length; a++)
        {
            int min = theInts[a];
            int minPosition = a;            
            for(int i = a; i<theInts.length; i++)
            {
                if(theInts[i] < min) 
                {
                min = theInts[i];
                minPosition = i;    
                }
            }               
            int temp = theInts[a];
            theInts[a] = theInts[minPosition];
            theInts[minPosition] = temp;                
        }
    }    
    public void insertionSort()
    {                        
        int i;
        for (int j = 1; j < theInts.length; j++)
        {
            int min = theInts[j];
            for(i = j - 1; (i >= 0) && (theInts[i] > min); i--)
            {
                theInts[i+1] = theInts[i];
            }
            theInts[i+1] = min;
        }
    }   
}
