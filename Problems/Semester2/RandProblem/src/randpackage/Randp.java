package randpackage;

public class Randp {
	private int[] nums;
    private int numsLeft;
	public int range;
    
    public Randp(int n) {
       this.nums = new int [n];
       this.numsLeft = n;
       this.range = n;
       
       initNums(n);
    }
	
    private void initNums(int n) {
		for(int i = 0; i < nums.length; i++) {
			this.nums[i] = i + 1;
		}
    }
	
    public int nextInt() {
    	if(this.numsLeft > 0) {
    		//variable to store return value
    		int numToReturn;
    		int randNum = (int)(Math.random() * range);
    		//assign numToReturn to a value in the array
    		numToReturn = nums[randNum];
    		//edit the Array to remove the value
    		editArr(randNum);
    		this.numsLeft--;
    		return numToReturn;
    	} else {
    		return 0;
    	}
    }
    
    public void editArr(int location) {
    	for(int i = location; i < nums.length; i++) {
    		if (i == nums.length - 1) {
    			nums[i] = 0;
    		} else {
    			nums[i] = nums[i + 1];
    		}
    	}
    	range--;
    }
}
