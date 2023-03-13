package HashMap;

import java.util.HashMap;

public class CountWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="This this is is done by Shankar Shankar";
		String[] split=str.split(" ");
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		int count=0;
		for(int i=0;i<split.length;i++)
		{
			if(map.containsKey(split[i]))
			{
				count=map.get(split[i]);
				map.put(split[i], count+1);
			}
			else
			{
				map.put(split[i], 1);
			}
			
		}
		System.out.println(map);
		
		System.out.println(map.get("Shankar"));

	}

}