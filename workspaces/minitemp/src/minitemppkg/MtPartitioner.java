package minitemppkg;

import java.util.Random;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;


public class MtPartitioner extends Partitioner<Text, IntWritable> {
	

	@Override
	public int getPartition(Text key, IntWritable value, int reduceTaskCount) {
		// TODO Auto-generated method stub
		//used to select a partitioner depending on conditions. Here just randomly.
		Random rand = new Random();//test code
		int rd = rand.nextInt(100); //test code
		
		int reducer = rd % reduceTaskCount;
		
		System.out.println("\nPartitioner: " + reducer  + "/" +reduceTaskCount +" Key: "+key+" value: "+value);
		return reducer;
	}

}
