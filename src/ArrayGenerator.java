public class ArrayGenerator {
    ArrayList<int[]> list = new ArrayList<>();
	  
	  
	  public void permutation(int[] arr, int[] data) {
		    if(data.length == 0)  list.add(arr);
				
		    for(int i = 0; i < data.length; ++i) {
				int[] concatArr = new int[arr.length + 1];
				for(int j = 0; j < arr.length; ++j) {
					concatArr[j] = arr[j];
				}
				concatArr[concatArr.length - 1] = data[i];
				int index = 0;
				int[] subData = new int[data.length - 1];
				for(int j = 0; j < data.length; ++j) {
					if(j == i)     continue;
					subData[index] = data[j];
					++index;
				}
				permutation(concatArr, subData);
			}
		}

	
	public static void main(String[] args) {
		SortAlgsTest a = new SortAlgsTest();
		int[] b = {1, 2, 3, 4, 5};
		int[] c = new int[0];
		a.permutation(c, b );
        for(int i = 0; i < a.list.size(); ++i) {
        	System.out.println(java.util.Arrays.toString(a.list.get(i)));
        }
      }

}
