//package p;

public class CalculateStats{
	   public static void main(String args[]){
	      MarkStore myStore = new MarkStore();
	      myStore.makeNewRecord("Joe",57);
	      myStore.makeNewRecord("Steve",83);
	      myStore.makeNewRecord("James",61);
	      System.out.println(myStore.getMark("Steve"));
	      double average = myStore.getAverageMark();
	      System.out.println(average);
	   }
	}
