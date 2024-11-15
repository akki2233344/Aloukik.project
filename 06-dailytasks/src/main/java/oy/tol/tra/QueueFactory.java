package oy.tol.tra;

/**
 * This class instantiates a queue implementing the {@code QueueInterface}.
 * 
 * @author Antti Juustila
 */
public class QueueFactory {

   private QueueFactory() {
   }

   /**
    * Creates an instance of QueueInterface for Integer type.
    * @param capacity Number of elements the queue can hold.
    * @return The queue object.
    */
   public static QueueInterface<Integer> createIntegerQueue(int capacity) {
      // - Instantiates your queue implementation using Integer as a template parameter, 
      //   with the given capacity,
      // - and return the object to the caller.
      return new QueueImplementation<>(capacity);
   }

   /**
    * Creates an instance of QueueInterface for Integer type.
    * Use the default constructor of the queue.
    * @return The queue object.
    */
   public static QueueInterface<Integer> createIntegerQueue() {
      // - Instantiates your queue implementation using Integer as a template parameter, 
      //   with default capacity,
      // - and return the object to the caller.
      return new QueueImplementation<>();
   }

   public static QueueInterface<String> createStringQueue(int capacity) {
      // - Instantiates your queue implementation using Integer as a template parameter, 
      //   with the given capacity,
      // - and return the object to the caller.
      return new QueueImplementation<>(capacity);
   }

   /**
    * Creates an instance of QueueInterface for Integer type.
    * Use the default constructor of the queue.
    * @return The queue object.
    */
   public static QueueInterface<String> createStringQueue() {
      // - Instantiates your queue implementation using Integer as a template parameter, 
      //   with default capacity,
      // - and return the object to the caller.
      return new QueueImplementation<>();
   }
}
