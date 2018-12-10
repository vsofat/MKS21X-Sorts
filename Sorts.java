public class Sorts{
  public static int smallestVal(int ary[], int index) {
  int small = ary[index];
  int smallestIndex = index;
  for (int i = index + 1; i < ary.length; i++) {
    if (ary[i] < small) {
      small = ary[i];
      smallestIndex = i;
    }
  }
  return smallestIndex;
}

public static void selectionSort(int [] ary) {
  int smallest;
  // you put the objects in order based off their values, which is why you need smallest
  for(int i = 0; i < ary.length; i++){
    smallest = smallestVal(ary,i);
    ary[i] = smallest;
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
}
