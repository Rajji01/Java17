/*
package practise_by_me;

public class Access_mod_{  // it is wrong because  public class name must be same as class name
    public static void main(String[] args) {
        System.out.println("hi");


    }
}
*/

package practise_by_me;

public class Access_mod{
    public static void main(String[] args) {
        System.out.println("hi");
        B obj= new B();
        obj.A();
    }

}
class  B // non public class
{
    void A() {
        System.out.println();
        System.out.println("hello");
    }
}