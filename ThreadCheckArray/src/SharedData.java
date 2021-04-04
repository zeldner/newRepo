/**
 * @author zeldn
 *
 */
public class SharedData 
{
	private int [] array;
	int x;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	public SharedData(int[] array, int b) {
		
		this.array = array;
		this.b = b;
	}

	/**
	 * @return
	 */
	/**
	 * @return
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/**
	 * @param winArray
	 * 
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	public int[] getArray() 
	{
		return array;
	}

	public int getB() 
	{
		return b;
	}

	public boolean getFlag() 
	{
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
