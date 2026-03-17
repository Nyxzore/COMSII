//package p;
package p;

import java.util.LinkedList;

public class MarkStore {
	public LinkedList<MarkRecord> allMarks = new LinkedList<>();
	
	public void makeNewRecord(String s, int x) {
		MarkRecord new_record = new MarkRecord();
		new_record.name = s;
		new_record.mark = x;
		allMarks.add(new_record);
	}
	public double getMark(String name) {
		for (MarkRecord marks : allMarks){
			if (marks.name.equals(name)){return marks.mark;}
		}
		return -1.0;
	}
	public double getAverageMark(){
		int count = 0;
		double sum = 0.0;
		for (MarkRecord marks : allMarks){
			sum += marks.mark;
			count++;
		}
		return sum/count;
	}
}
