package org.cadenhead.ecommerce;

/**
 * Created by viruser on 2018/8/31.
 */
public class NewPrimeThreads {
    public static void main(String[] arguments) {
        String[] args1 = {"-1","10","3000","20"};
        try {
            NewPrimeFinder[] finder = new NewPrimeFinder[args1.length];
            for (int i = 0; i < args1.length; i++) {
                long count = Long.parseLong(args1[i]);
                finder[i] = new NewPrimeFinder(count);
                System.out.println("Looking for prime " + count);
            }
            boolean complete = false;
            while (!complete) {
                complete = true;
                for (int j = 0; j < finder.length; j++) {
                    if (!finder[j].finished)
                        complete = false;
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ie) {
                    // do nothing
                }
            }
            for (int j = 0; j < finder.length; j++) {
                System.out.println("Prime " + finder[j].target
                        + " is " + finder[j].prime);
            }
        } catch (NumberFormatException nfe) {
            System.out.println("Error: " + nfe.getMessage());
        } catch (NegativeNumberException nne) {
            System.out.println("Error: " + nne.getMessage());
        }
    }
}