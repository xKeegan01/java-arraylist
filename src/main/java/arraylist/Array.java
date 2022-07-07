package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Array {

    public static void main(String[] args) {


        Books book1 = new Books("Clash of Civilizations", 1996);
        Books book2 = new Books("Thinking in Java", 1998);
        Books book3 = new Books("Rise and Kill First", 2018);
        Books book4 = new Books("Metro 2033", 2002 );

        //class array list
        List<String> books = new ArrayList<>();
        books.add(book1.getName());
        books.add(book2.getName());
        books.add(book3.getName());
        books.add(book4.getName());
        //print array of books names
        System.out.println("BOOKS NAMES --> " + books);

        List<Integer> years = new ArrayList<>();
        years.add(book1.getYear());
        years.add(book2.getYear());
        years.add(book3.getYear());
        years.add(book4.getYear());
        //print array of years
        System.out.println("PUBLICATION YEARS --> " + years);

        //class array list
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Audi"));
        cars.add(new Car("Toyota"));
        cars.add(new Car("Volkswagen"));
        cars.add(new Car("Subaru"));
        cars.add(new Car("Mazda"));
        cars.add(new Car("BMW"));
        //print element of array cars
        cars.forEach(car -> System.out.println("--> " + car.getName()));

        //integer arraylist
        List<Integer> numbers = new ArrayList<>();
        int start = 0;
        int end = 39;
        while (start <= end) {
            numbers.add(start++);
        }
        start++;

        List<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++ ) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            }
        }
        System.out.println("EVEN NUMBERS -> " + evenNumbers);
        System.out.println("NUMBERS ARRAY -> " + numbers);

        List<String> oss = new ArrayList<>();
        oss.add("windows 7");
        oss.add("macOS ventura");
        oss.add("kali linux");
        oss.add("windows 10");
        oss.add("ubuntu");
        System.out.println("OPERATIONAL SYSTEMS " + oss);
        oss.add(0, "mint");
        System.out.println("OPERATIONAL SYSTEMS: updated " + oss);
    }
}
