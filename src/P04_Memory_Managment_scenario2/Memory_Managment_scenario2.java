package P04_Memory_Managment_scenario2;

public class Memory_Managment_scenario2 {
    public static void main(String[] args) {
    /*
    * in this scenario one object created from student [in m1()] and set i value 10 and sign to m2() and m2+
    * plus 10 value to it [st1.i+=10;] so in output m1 print 20 .
    * */
        Memory_Managment_scenario2 sc2 = new Memory_Managment_scenario2();
        sc2.m1();

    }
    public void m1(){
        Student st1 = new Student();
        st1.i=10;
        m2(st1);
        System.out.println(st1.i);
    }
    public void m2(Student st1){
        st1.i+=10;
        System.out.println(st1.i);


    }
    /*
     * if want to print 10 in out we should create a new obj:
     * Example:
     * */
    public void m3(Student st1){
        st1=new Student();           /*new obj from Student that didn't have any value (st1.i=0)*/
        st1.i+=10;                  /* i variable have value 0 and plus to 10*/
        System.out.println(st1.i); /*print 10 in out*/
    }
    /*if want to don't change st1 value in future should use final
    * Example:
    * */
    public void m4(final Student st1){
        st1.i+=10;
        System.out.println(st1.i);
    }
}
