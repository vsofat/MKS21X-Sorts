public class Sorts{
  /*public static int smallestVal(int ary[], int index) {
  int small = ary[index];
  int smallestIndex = index;
  for (int i = index + 1; i < ary.length; i++) {
    if (ary[i] < small) {
      small = ary[i];
      smallestIndex = i;
    }
  }
  return smallestIndex;
} */

public static void selectionSort(int[] ary){
  if(ary.length!=0){
  int placeHolder;
  int indexVal;
  for(int i = 0; i<ary.length; i++){
    placeHolder = ary[i];
    indexVal = i;
    for(int j = i; j < ary.length; j++){
      if(ary[j]<placeHolder){
        placeHolder=ary[j];
        indexVal=j;
      }}
    ary[indexVal]=ary[i];
    ary[i]=placeHolder;
  }
}
}

public static void bubbleSort(int[] data){
    boolean status = false;
    int current;
    while(!status){
      status = true;
      for(int index = 0;index<data.length-1;index++){
        if(data[index]>data[index+1]){
          current=data[index];
          data[index]=data[index+1];
          data[index+1]=current;
          status = false;
        }
      }
    }
  }
  public static void insertionSort(int ary[]) {
  	    for (int i = 1;  i < ary.length; i ++) {
  	      int orig = ary[i];
  	      for (int j = i - 1; j >= 0; j --) {
  	        if (orig < ary[j]) {
  	          ary[j + 1] = ary[j];
  	          ary[j] = orig;
  	        }
  	        else {
  	          j = -1;
  	        }
  	      }
  	    }
  	  }
}
