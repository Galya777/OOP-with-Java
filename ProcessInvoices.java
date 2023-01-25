package lab9b_zad1a;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ProcessInvoices {
    public static void main(String[] args)
    {
        Invoice[] invoices = {
                new Invoice(83, "Electric sander", 7, 57.98),
                new Invoice(24, "Power saw", 18, 99.99),
                new Invoice(7, "Sledge hammer", 11, 21.50),
                new Invoice(77, "Hammer", 76, 11.99),
                new Invoice(39, "Lawn mower", 3, 79.50),
                new Invoice(68, "Screwdriver", 106, 6.99),
                new Invoice(56, "Jig saw", 21, 11.00),
                new Invoice(3, "Wrench", 34, 7.50)
        };

        System.out.println("Invoices sorted by part description:");
        Arrays.stream(invoices).sorted(Comparator.comparing(Invoice::getPartDescription))
                .forEach(System.out::println);

        System.out.printf("%nInvoices sorted by price:%n");
        Arrays.stream(invoices).sorted(Comparator.comparing(Invoice::getPrice))
                .forEach(System.out::println);

        System.out.printf("%nInvoices mapped to description and quantity:%n");
        Arrays.stream(invoices)
                .sorted(Comparator.comparing(Invoice::getQuantity))
                .map(invoice -> String.format("Description: %-20s \t Quantity: %-5d",
                        invoice.getPartDescription(), invoice.getQuantity()))
                .forEach(System.out::println);

        System.out.printf("%nInvoices mapped to description and invoice amount:%n");
        Arrays.stream(invoices)
                .sorted(Comparator.comparing(invoice-> invoice.getQuantity()*invoice.getPrice()))
                .map(invoice -> String.format("Description: %-20s \t Invoice amount: $ %-10.2f",
                        invoice.getPartDescription(), invoice.getQuantity()*invoice.getPrice()))
                .forEach(System.out::println);


        System.out.printf("%nInvoices mapped to description and invoice amount for invoices in the range 200-500:%n");
        Arrays.stream(invoices)
                .filter(invoice -> invoice.getQuantity()*invoice.getPrice()>=200&&
                        invoice.getQuantity()*invoice.getPrice()<=500)
                .sorted(Comparator.comparing(invoice-> invoice.getQuantity()*invoice.getPrice()))
                .map(invoice -> String.format("Description: %-20s \t Invoice amount: $ %-10.2f",
                        invoice.getPartDescription(), invoice.getQuantity()*invoice.getPrice()))
                .forEach(System.out::println);

        Arrays.stream(invoices)
                .collect(Collectors.groupingBy(invoice->invoice.getQuantity()*invoice.getPrice()<=300?
                        "Below or equal to 300":"Above 300"))
                .forEach((s, invoices1)->{
                    System.out.println(s);
                    invoices1.forEach(invoice->{
                        System.out.print(invoice);
               System.out.printf("\t Invoice amount: %-10.2f", invoice.getQuantity()*invoice.getPrice());
                }); });
}


}
