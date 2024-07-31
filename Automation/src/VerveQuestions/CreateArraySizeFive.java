package VerveQuestions;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class CreateArraySizeFive {      //to create array with size 5 and add some +ve integers and find their sum
	public static void main(String[] args) {
		int[] a=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
	
	   System.out.println(sum);

	}
}
	


