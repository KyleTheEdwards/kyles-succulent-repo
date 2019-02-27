import java.io.*;

public class Testing{

	public static void main(String[] args){

		int times = 20;

		try {

			times = Integer.parseInt(args[0]);

		} catch (NumberFormatException n) {

			times = 20;

		} catch (ArrayIndexOutOfBoundsException a) {

			times = 20;
			
		}

		System.out.println("Testing...\nHere are some fibonacci numbers:");

		int[] nums = {0,1,0};

		for(int x = 0; x < times; x++){
			System.out.println(Integer.toString(nums[1]));
			nums[2] = nums[0] + nums[1];
			nums[0] = nums[1];
			nums[1] = nums[2];

		}


	}

}