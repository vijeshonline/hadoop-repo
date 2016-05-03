package minitemppkg;

import javax.xml.soap.Text;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.mapreduce.Mapper;

public class MtMapper extends Mapper<LongWritable, Text, Text, Text> {

}
