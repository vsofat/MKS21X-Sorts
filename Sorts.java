public class sort{
  public static int smallestVal(int ary[], int index) {
  int small = ary[index];
  int smallestIndex = index;
  for (int i = index + 1; x < ary.length; x ++) {
    if (ary[i] < small) {
      small = ary[i];
      smallestIndex = i;
    }
  }
  return smallestIndex;
}
