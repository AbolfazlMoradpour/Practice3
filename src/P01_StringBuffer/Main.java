package P01_StringBuffer;
public class Main {
    public static void main(String[] args) {
        /*
        * - StringBuffer have a Default Capacity (16).
        * - if input string is 5 character this number is + to 16.
        * -
        * */
        StringBuffer sb1 = new StringBuffer("Mahsa");
        System.out.println(sb1.length());   /*print string length*/
        System.out.println(sb1.capacity()); /*print how many memory space created for string (Mahsa) */

        /*
        * - if you want to use default capacity (16) for string+
        * should use append() method .
        * Example:
        * */
        StringBuffer sb2 = new StringBuffer();
        sb2.append("Mahsa");    /*should set (Mahsa) to 16 bit capacity and don't create new spaces*/
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());

        /*
        * for increase capacity form 16 to how many you need you should set+
        * new capacity in StringBuffer(example :50) method.
        * Example:
        * */
        StringBuffer sb3 = new StringBuffer(50);    /*get new capacity*/
        System.out.println(sb3.capacity());

        /*
        * - we can turn String Buffer&Builder to immutable Class (String) .
        * - if we convert String Buffer&Builder to String Class we don't have+
        * Capacity feature but we still have length().
        * Example :
        * */
        StringBuffer sb4 = new StringBuffer("Hello world");
        String st1 = sb4.toString();    /*Convert StringBuffer to String Class*/
        System.out.println(st1.length());

        /*
        * if we increase capacity but it too large we could set capacity+
        * how much String is.
        * Example :
        * */
        StringBuffer sb5 = new StringBuffer(50);    /*but it's too long*/
        sb5.trimToSize();
        System.out.println(sb5.length());
        System.out.println(sb5.capacity());
    }
}
