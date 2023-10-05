package assn2;

public class Main {
   public static void main (String[] args) {
      //List lst = new ArrayList(100);
      
      /*Sample code is provided below for you to examine for testing purposes. */
      List lst = new LinkedList();

      Tester tst = new Tester();

      List alst = new ArrayList();

      tst.inSort(alst);
      tst.inSort(lst);
      tst.findLast(lst);


      tst.bubbleIns(alst);
      tst.bubbleIns(lst);

      tst.set(alst);


      tst.ins(lst); // tester object runs test of the ins op
      tst.set(lst);
      tst.ins(alst);
      tst.rem(lst); // etc.
      tst.get(lst);
      tst.find(lst);
      tst.isEmpty(lst);
      tst.size(lst);
      tst.clear(lst);



  }
}
