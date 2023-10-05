package assn2;

public class Tester {
   
   public void ins (List ls ) {
      System.out.println("== Test of ins op ==========");
      ls.clear();
      System.out.println(ls.ins(0,10.0)); 
      System.out.println(ls);
      ls.ins(0,11.1); ls.ins(1,12.2);
      System.out.println(ls);
      System.out.println(ls.ins(14,111.1));
      System.out.println(ls.ins(3,101.01));
      System.out.println(ls); 
      return;
   }
    public void findLast(List ls){
       System.out.println("=== Test of findLast op =======");
       ls.clear();
       ls.ins(0,5.3); ls.ins(1,6.43); ls.ins(2,3.3); ls.ins(3, 6.43);
       System.out.println(ls.size());
       System.out.println("This is lastFind Return val " + ls.findLast(6.43));
       System.out.println(ls);
       System.out.println("===  Test of findlast op LINKEDLIST");
       ls.clear();
       ls.ins(0,5.3); ls.ins(1,6.43); ls.ins(2,3.3); ls.ins(3, 3.3);
       System.out.println("This is lastFind LINKED LIST return val " + ls.findLast(3.3));
       System.out.println(ls);
    }

   public void inSort(List ls){
       System.out.println("==Test of insort op arraylist ===");
       ls.clear();
       ls.ins(0,3.0); ls.ins(1,3.3); ls.ins(2,13.3);
       System.out.println(ls);
       System.out.println(ls.size());
       System.out.println(ls.inSort(4.5));
       System.out.println(ls);
       System.out.println("=== Test of insort op LINKEDLIST ===");
       ls.clear();
       ls.ins(0,3.0); ls.ins(1,3.3); ls.ins(2,13.3);
       System.out.print("return val of insort linkedList " +ls.inSort(6.4));
       System.out.println(ls);
   }

   public void bubbleIns(List ls){
       System.out.println("=== Test of bubbleIns op arrayList == ");
       ls.clear();
       ls.ins(0,3.3); ls.ins(1,6.43); ls.ins(2,-4.5); ls.ins(3, 6.43);
       System.out.println(ls);
       System.out.println("This is bubbleIns arraylist return val " + ls.bubbleIns(6.43));
       System.out.println(ls);
       System.out.println("=== Test of bubbleIns op LINKEDLIST===");
       ls.clear();
       ls.ins(0,3.3); ls.ins(1,3.2); ls.ins(2,-4.5); ls.ins(3, 6.43);
       System.out.println("This is bubbleIns LINKEDLIST return val "+ ls.bubbleIns(3.2));
       System.out.println(ls);
   }
   public void set( List ls) {

       System.out.println("== Test of set op ===========");
       ls.clear();
       ls.ins(0,11.1); ls.ins(1,12.2);
       System.out.println(ls.set(0,3.4));
       System.out.println(ls);
       return;


   }


   public void rem (List ls) {
     System.out.println("== Test of rem op ==========");
     ls.clear();
     System.out.println(ls.rem(0)); 
     System.out.println(ls);
     ls.ins(0,11.1); ls.ins(1,12.2); ls.ins(2,13.3);
     System.out.println(ls);
     System.out.println(ls.rem(0));
     System.out.println(ls.rem(1));
     System.out.println(ls); 
     System.out.println(ls.size());
     ls.ins(0,14.4); ls.ins(1,17.7);
     System.out.println(ls);
     System.out.println(ls.rem(1));
     System.out.println(ls); 
     System.out.println(ls.rem(100));
     System.out.println(ls);
     return;
   }
   
   public void get (List ls) {
     System.out.println("== Test of get op ==========");
     ls.clear();
     System.out.println(ls.get(0)); 
     System.out.println(ls);
     ls.ins(0,11.1); ls.ins(1,12.2); ls.ins(2,13.3);
     System.out.println(ls);
     System.out.println(ls.get(0));
     System.out.println(ls.get(1));
     System.out.println(ls.get(100));
     System.out.println(ls); 
     System.out.println(ls.size());
     ls.ins(0,14.4); ls.ins(1,17.7);
     System.out.println(ls);
     System.out.println(ls.get(1));
     System.out.println(ls); 
     System.out.println(ls.get(-100));
     System.out.println(ls);
     return;
   }
   
   public void find (List ls) {
     System.out.println("== Test of find op =========");
     ls.clear();
     System.out.println(ls.find(12.2));
     ls.ins(0,11.1);
     System.out.println(ls.find(11.1));
     System.out.println(ls.find(12.2));
     ls.ins(0,22.2); ls.ins(1,33.3); ls.ins(0,44.4);
     System.out.println(ls.find(33.3));
     System.out.println(ls.find(11.1));
     System.out.println(ls.find(-5.5));
     ls.clear();
     System.out.println(ls.find(11.1));
     return;
   }

   public void isEmpty (List ls) {
      System.out.println("== Test of isEmpty op =======");
      ls.clear();
      System.out.println(ls.isEmpty());
      ls.ins(0,1.1);
      System.out.println(ls.isEmpty());
      ls.ins(0,2.2);
      System.out.println(ls.isEmpty());
      ls.rem(0);
      System.out.println(ls.isEmpty());
      ls.rem(100);
      System.out.println(ls.isEmpty());
      ls.rem(0);
      System.out.println(ls.isEmpty());
      return;
   }
   
   public void contains(List ls) {
      System.out.println("== Test of contains op ======");
      ls.clear();
      return;
   }
   
   public void size (List ls) {
      System.out.println("== Test of size op ==========");
      ls.clear();
      System.out.println(ls.size());
      ls.ins(0,1.1); System.out.println(ls.size());
      ls.ins(0,2.2); System.out.println(ls.size());
      for (int i=2; i<20; i++) { ls.ins(i,i*1.1); }
      System.out.println(ls.size());
      for (int i=0; i<5; i++) { ls.rem(0); }
      System.out.println(ls.size());
      ls.clear();
      System.out.println(ls.size());
      return;
   }
   
   public void clear (List ls) {
      System.out.println("== Test of clear op =========");
      System.out.println(ls.size());
      double n = ls.get(0);
      System.out.println(ls.find(n));
      ls.clear();
      System.out.println(ls.size());
      System.out.println(ls.get(0));
      System.out.println(ls.get(100));
      System.out.println(ls.find(n));
      return;
   }

}
