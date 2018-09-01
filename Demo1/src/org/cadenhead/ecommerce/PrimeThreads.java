package org.cadenhead.ecommerce;


public class PrimeThreads {
    public static void main(String[] args){
        String[] args1 = {"-1","10","3000","20"};
        PrimeThreads pt = new PrimeThreads(args1);
    }

    public PrimeThreads(String[] args){
        PrimeFinder[] finder = new PrimeFinder[args.length];
            for (int i = 0; i < args.length; i++) {
                try {
                try {
                    long count = Long.parseLong(args[i]);
                    finder[i] = new PrimeFinder(count);
                    System.out.println("Looking for Prime " + count);
                } catch (NumberFormatException nfe) {
                    System.out.println("Error: " + nfe.getMessage());
                }
                }catch (NegativeNumberException nne){
                    System.out.println(nne.getMessage());
                }
            }

        boolean complete = false;
        while (!complete){
            complete = true;
            for (int j = 0; j < finder.length; j++){
                if (finder[j] == null)
                    continue;
                if(!finder[j].finished){
                    complete = false;
                }else {
                    displayResult(finder[j]);
                    finder[j] = null;
                }
            }
            try{
                Thread.sleep(1000);
            }catch (InterruptedException ie){}
        }
    }


    private void displayResult(PrimeFinder finder){
        System.out.println("Prime " + finder.target + " is " + finder.prime);
    }
}
