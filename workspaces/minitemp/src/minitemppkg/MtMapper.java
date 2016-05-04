package minitemppkg;

import java.io.IOException;
import java.util.StringTokenizer;


import org.apache.hadoop.io.Text;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.mapreduce.Mapper;

//inside extends mapper, <arg1=inputKey, arg2=inputValue, arg3=outputKey, arg4=outputValue>
public class MtMapper extends Mapper<LongWritable, Text, Text, IntWritable> { 
	IntWritable one = new IntWritable(1);
	Text word = new Text();
	public void setup(Context context){
		System.out.println("\n*********Setup !!!");
	}
	public void cleanup(Context context){
		System.out.println("\n*********CLEANUP !!!:");
	}
    public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        String line = value.toString();
        StringTokenizer tokenizer = new StringTokenizer(line);
        //System.out.println("*********Mapper:"+" key: "+ key + " Value:"+line);
        while (tokenizer.hasMoreTokens()) {
        	//System.out.println("Mapper: key: "+word+", value: "+one);
            word.set(tokenizer.nextToken());
            context.write(word, one); //goes to reducer
        }
    }
}
