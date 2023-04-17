package P02_Array;

public class Main {
    public static void main(String[] args) {
        /*
        * - Array is a Collection of space in ram that connected together+
        * and they are same kind.
        * - Arrays are Reference Data Type.
        * - Spaces in ram that created in ram after set never change.
        *Example :
        * */
        int ar1[]= new int[3];               /*Primitive Datatype*/
        student ar2 [] = new student [3];   /*Reference Datatype*/


        /*
        * -in primitive Arrays for ich index's set space in ram+
         * and they give same address .
         * - in reference arrays for ich index create a object from Class+
         * and all of them give same address.
         * Example:
        * */
        int n =10;
        int ar3 []= new int[n];
        System.out.println(ar3);    /*print ar3 index's space address*/


        int ar4 [] ={1,2,1,3,4,5};               /*other way to write arrays*/
        int ar5 [] = new int[]{1,2,1,3,4,5};    /*other way to write arrays*/


        /*
        * in arrays we have a feature that name in length and it is a field.
        * Example:
        * */
        int ar6 [] = new int[10];
        System.out.println(ar6.length);


        /*
        * for print a index we should :
        * */
        int ar7 []= new int[]{1,3,5,2,5};
        System.out.println(ar7[2]); /*should print index number 3 (5)*/


        /*
        * for print last index of array that is no possible to count we should:
        *  */
        int ar8 []= new int[]{1,2,3,21,2,41,24,4,24,23,4,36,345,23,422,1,345,23521,777};
        System.out.println(ar8.length-1);   /*should print the last index*/


        /*
        * in Reference Arrays default value is null and in primitive arrays default value is 0.
        * Example:
        * */
        student ar9 [] = new student[7];
        int ar10 [] = new int[3];
        System.out.println(ar9[0]);      /*should print null*/
        System.out.println(ar10[2]);    /*should print 0*/


        /*for set value for index's in primitive arrays should:
        * */
        int[] ar11 = new int[7];
        ar11[2]=12;                      /*set 12 for index number 3 */
        System.out.println(ar11[2]);    /*should print 12*/


        /*
        * for set address for index's in Reference arrays should:
        * */
        student[] ar12 = new student[21];
        ar12 [0]= new student();    /*new object created and index give new address*/
        ar12[2]=new student();
        System.out.println(ar12[0]);    /*should print index space address*/
        System.out.println(ar12[2]);    /*should print index space address*/


        /*
        * if want to print length of a array by a method we should:
        * */
       int[] ar13 = new int[3];
       ar13[0]=12;
       ar13[1]=1;
       ar13[2]=22;
       print_length(ar13);  /*print length of ar13*/

       /*
       * we could create a array without name and print length of it.
       * Example:
       * */
       print_length(new int []{12,33});

       /*
       * print array with arity:
       * */
       arity_print_length(ar13);
    }
    public static void print_length(int[] numbers){
        for(int i=0;i<=numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }
    /*
     * for printing a array other way is arity:
     * */
    public static void arity_print_length(int... numbers){
        for (int j=0 ; j<=numbers.length;j++){
            System.out.println(numbers[j]);
        }
    /*
    * - if arity didn't give input , jvm set a array by 0 value for it(create a anonymous array).
    * - arity can be int-string-float-double and .... .
    * */
    }
}
