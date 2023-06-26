//thread group is a group of threads based on some functionality. it is a single unit
//thread group contains threads and can also caontain subgroup threads
//every thread is a part of some thread group
//every thread is a child of system thread group
//system group contains various system level threads such as follows
//finalizer,reference handler,signal dispatcher,main thread group
//thread group class is present in java.langpackage and its the direct child class of object
//Its main objective is to perform common task ex whats group family,friends
//system thread acts as a root of thread groups

public class multie{
public static void main(String args[]){
System.out.println(Thread.currentThread().getThreadGroup().getName());	//o/p 
System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());	// group=system ,group name=system
//current thread=main thread ,current thread group=main thread group

}
}