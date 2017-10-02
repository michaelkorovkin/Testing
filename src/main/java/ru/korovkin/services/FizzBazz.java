package ru.korovkin.services;

/**
 * Created by michael on 02.10.17.
 */
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by michael on 02.10.17.
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class FizzBazz {
    @WebMethod
    public void fizzBazz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println(i + " FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println(i + " Fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + " Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
