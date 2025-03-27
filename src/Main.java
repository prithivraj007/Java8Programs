import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.*;

@FunctionalInterface
interface  PrintFun{
    void print();
}
public class Main {

    // 1.Write a lambda expression to print "Hello, Java 8!".
    private void printHello(){
        PrintFun pf = ()->System.out.println("Hello, Java 8!");
        pf.print();
    }

    // 2.Use Predicate to check if a number is even.
    private void evenNumber(int num){
        Predicate<Integer> predicate = i->i%2==0;
        System.out.println(predicate.test(num));
    }

    // 3. Write a program using Consumer to print a list of integers.
    private void printList(){
        List<Integer> list  = Arrays.asList(1,2,3,4,56,7);
        Consumer<List<Integer>> consumer= i->i.forEach(System.out::print);
        consumer.accept(list);
        System.out.println();
    }

    //4.Implement a Function to find the square of a number.
    private void square(int num){
        Function<Integer,Integer> function = i->i*i;
        System.out.println(function.apply(num));
    }

    //5.Use Supplier to generate a random number.
    private void randomNumber(){
        Supplier<Integer> supplier = ()->(int)(Math.random()*10);
        System.out.println(supplier.get());
        System.out.println(supplier.get());
    }

    private void threadCreation(){
        Runnable runnable = ()->{
            try {
                Thread.sleep(500);
                for(int i = 0; i < 10; i++){
                    System.out.println("run method: "+Thread.currentThread().getName());
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        };
        Thread thread = new Thread(runnable);
        thread.start();
        for(int i = 0; i < 10; i++){
           System.out.println("Main Thread: "+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args){
        Main mainC = new Main();
        mainC.printHello();
        mainC.evenNumber(10);
        mainC.printList();
        mainC.square(5);
        mainC.randomNumber();
        mainC.threadCreation();
    }
}
