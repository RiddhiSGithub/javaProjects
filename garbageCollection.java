public class garbageCollection {
    public static void main(String[] args) {
        // “garbage collection” frees up memory in a Java virtual machine.
        // It is the process of reclaiming and releasing storage space that was used for objects,
        // to make it available again to other programs running within the same JVM (Java Virtual Machine).
        // The garbage collector automatically identifies unused objects and removes them from memory.
        
        int i = 10;
        String s = "Hello";
        Object o = new Integer(47);
        System.out.println("i: "+i+"\ns: "+s+"\no: "+o);
        // Here we have created three variables - 'i', 's' and 'o'.
        // We are not using any more references to these variables after this point.
        // So they become eligible for garbage collection.
        // When the garbage collector runs next time, it will remove all these three variables from memory.
        // But before doing so, it checks if there are still some live references pointing to these variables or not?
        // In java, there are two types of garbage collections: Minor GC & Major GC.
        // Minor GC occurs when heap occupies less than threshold value.
        // Major GC occurs when heap occupies more than threshold value.
        // Garbage Collection can be triggered manually by calling System.gc() method.

        
        
    }
}
