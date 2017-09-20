package lesson9.labs.prob8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class PuttingIntoPractice{
    public static void main(String ...args){    
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Milan");
		
		List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300), 
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 500),
            new Transaction(mario, 2012, 710),	
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );	
        
        
        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
		Function<Transaction, Integer> byValue = t->t.getValue();
		transactions.stream()
					.sorted(Comparator.comparing(byValue))
					//.sorted(Comparator.comparing(byValue).reversed())
					.filter(n->n.getYear() >= 2011)		
					.forEach(System.out::println);
      
        // Query 2: What are all the unique cities where the traders work?
        List<Trader> traders = Arrays.asList(raoul, mario, alan, brian);
        traders.stream()
        		.map(n->n.getCity())
        		.distinct()
        		.forEach(System.out::println);

        // Query 3: Find all traders from Cambridge and sort them by name.
        traders.stream()
        		.sorted(Comparator.comparing(Trader::getName))
        		.filter(n->n.getCity().equals("Cambridge"))	
        		.forEach(System.out::println);
   
        
        // Query 4: Return a string of all traders names sorted alphabetically.
        traders.stream()
        		.sorted(Comparator.comparing(Trader::getName))
        		.map(t->t.getName())
        		.forEach(System.out::println);
        

        // Query 5: Are there any trader based in Milan?
        
       //long traderInCity =  traders.stream().filter(t->t.getCity().equals("Milan")).count();
       // if(traderInCity>0){System.out.println("Yes");} else {System.out.println("No");}
        
        boolean isCityExist = traders.stream().filter(t->t.getCity().equals("Milan")).findAny().isPresent();
        System.out.println("\nCity Exist: " +isCityExist);
   
     // Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
        transactions.stream().filter(t->t.getTrader().getCity()=="Milan").forEach(t->t.getTrader().setCity("Cambridge"));
        transactions.forEach(System.out::println);
        
        
        // Query 7: What's the highest value in all the transactions?
        transactions.stream().max(Comparator.comparing(Transaction::getValue)).ifPresent(a->System.out.println("Highest Value: "+a.getValue()));
        
    }
}
