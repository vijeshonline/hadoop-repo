package minitemppkg;

import javax.xml.soap.Text;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.mapreduce.Reducer;

public class MtReducer extends Reducer<Text, IntWritable, Text, IntWritable> {

}
