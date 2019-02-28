import java.io.*;

public class Testing{

	public static void main(String[] args){

		int times = 20;
		int firstNum = 0;
		int secondNum = 1;

		try {

			times = Integer.parseInt(args[0]);
			firstNum = Integer.parseInt(args[1]);
			secondNum = Integer.parseInt(args[2]);

		} catch (NumberFormatException n) {

		} catch (ArrayIndexOutOfBoundsException a) {

		}

		System.out.println("Testing...\nHere are some fibonacci numbers:");

		int[] nums = {firstNum,secondNum,0};

		for(int x = 0; x < times; x++){
			System.out.println(Integer.toString(nums[1]));
			nums[2] = nums[0] + nums[1];
			nums[0] = nums[1];
			nums[1] = nums[2];

		}


	}

}
