package problem2;

public class IntegerList
{
    int[] list; //values in the list
    private int numOfInt ;
    private int currSize ;

    public void increaseSize(){
        if(currSize == 0){
            currSize = 1;
        }else{
            currSize= currSize * 2;
        }
        int[] temp = new int[currSize];
        for (int i = 0; i < list.length; i++) {
            temp[i] = list[i];
        }
        list = temp;
    }

    public void addElement(int newVal){
        if(numOfInt == currSize){
            increaseSize();
        }
        list[numOfInt] = newVal;
        numOfInt ++;

    }
    public void removeFirst(int newVal){
        for(int i= 0; i< numOfInt; i++){
            if(list[i] == newVal){
                for(int j = i; j<numOfInt - 1;j++){
                    list[j] = list[j+1];
                }
                numOfInt --;
                break;
            }
        }
    }

    public void removeAll(int newVal){
        for(int i= 0; i< numOfInt; i++){
            if(list[i] == newVal){
                for(int j = i; j<numOfInt - 1;j++){
                    list[j] = list[j+1];
                }
                numOfInt --;
                i--;
            }
        }

    }

    //-------------------------------------------------------

//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size) { list = new int[size]; numOfInt = size;currSize = size;}
    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++)
            list[i] = (int)(Math.random() * 100) + 1;
    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<numOfInt; i++)
            System.out.println(i + ":\t" + list[i]);
    }
}