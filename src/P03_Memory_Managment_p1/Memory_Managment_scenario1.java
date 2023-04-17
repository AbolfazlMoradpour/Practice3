package P03_Memory_Managment_p1;
public class Memory_Managment_scenario1 {
    public static void main(String[] args) {
        /*
         * - meta space divide to two part [heap & stack].
         * - heap : space for creating and saving obj and local variables.(for variables in methods jvm create heap space).
         * - stack: space for calling methods (after calling method stack will be destroyed).
         * Example:
         * */
        Student st1 = new Student();    /*create a space in heap for Student by (new) and its fields and create a space in stack and+
         linked its heap space to stack space by(=).*/


    /*
    * - in this scenario in stack create space for main method and m1&m2.
    *
    * - set i value in stack for m1 method and set 10 for it so print method print 10 in output.
    *
    * - in stack create space for m2 method and create i+=10 value for it, but it's called in m1+
    * method and give i value from m1 stack space so i in m2 give 10 value so in output m2 print 20.
    * */
        Memory_Managment_scenario1 sc1 = new Memory_Managment_scenario1();
        sc1.m1();
    }
    public void m1(){
        int i = 10 ;
        m2(i);
        System.out.println(i);  /*print 10 in out*/
    }
   public void m2(int i){
        i+=10;  /*set i value =i=10+10 (print 20)*/
   }
}
