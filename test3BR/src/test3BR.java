
/*BraedenRizzuto*/
import java.util.Scanner;

public class test3BR
{
	static Scanner input;
	
	public static void main( String[ ] args )
	{
		input = new Scanner ( System.in );
		int [] inputArray;// an array that should put the count in the index and put the input number in the holding value
		//inputArray= new int [inputNum];
		int count = 0;//loop control variable
		int inputNum;// the users input number
		
		while ( count <= 30 )
		{
			System.out.println ( "enter number" );
			inputNum = input.nextInt ( );
			while ( inputNum > 149 || inputNum < -149 )
				{
				System.out.print ( "enter again" );
				inputNum=input.nextInt ( );
				}
				count++;
		}
		
		}
}
	//int[count] inputNum;
		//	storeArray(inputNum, inputArray, count);
	

	/*public static void storeArray(int [] inputArray, int inputNum, int inputArray, int count)
	{
		
		inputArray[0 ]= inputArray
		inputArray[1]=
		inputArray[2 ]= inputArray
		inputArray[3 ]						
		inputArray[4 ]= inputArray
		inputArray[5 ]
		inputArray[6 ]= inputArray
		inputArray[7 ]
		inputArray[8 ]= inputArray
		inputArray[9 ]
		inputArray[10 ]= inputArray
		inputArray[11]										
		inputArray[12]= inputArray
		inputArray[13]
		inputArray[14]= inputArray
		inputArray[15 ]
		inputArray[16 ]= inputArray
		inputArray[17 ]
		inputArray[18]= inputArray
		inputArray[19]						
		inputArray[20]= inputArray
		inputArray[21]
		inputArray[22]= inputArray
		inputArray[23]
		inputArray[24]= inputArray
		inputArray[25]
		inputArray[26]= inputArray
		inputArray[27]										
		inputArray[28]= inputArray
		inputArray[29]
		inputArray[30]= inputArray
	}
		
	}*/
	

