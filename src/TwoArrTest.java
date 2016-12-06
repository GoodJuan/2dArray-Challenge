
public class TwoArrTest {

	
	public static void printIntArr(int[][] arr){
		int count = 0;
		
		for (int i = 0; i < arr.length; i++){
			for (int z = 0; z < arr[0].length; z++){
				System.out.print(arr[i][z] + ", ");
				count++;
				if (count == arr[0].length){
					System.out.println();
					count = 0;
				}
			}
		}
		System.out.println("\n\n");
	}
	
	asdasd
	public static void main(String[] args) {
		int[][] test = new int[3][4];
		for (int i = 0; i < test.length; i++){
			for (int z = 0; z< test[0].length; z++){
				int rand = (int)(Math.random()*9+1);
				test[i][z] = rand;
			}
		}

		int[][] array = new int[3][4];
		for (int a = 0; a < array.length; a++){
			for (int b = 0; b< array[0].length; b++){
				int lul = (int)(Math.random()*9+1);
				array[a][b] = lul;
			}
		}
		
		
		printIntArr(test);
		printIntArr(array);

	}

}
