package co.com.sofka.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {

    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long sum(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }

    public Long Resta(Long number1, Long number2) {
        logger.info( "Substraction {} - {}", number1, number2 );
        return number1 - number2;
    }
    public Long Multiplicacion(Long number1, Long number2) {
        logger.info( "Multiplication {} * {}", number1, number2 );
        return number1 * number2;
    }
    public String Division(Long number1, Long number2) {
        logger.info( "Division {} / {}", number1, number2 );
        String Result;
        try{
            Result =String.valueOf(number1/number2);
        }catch(ArithmeticException e){
            Result = "null";
        }
        return Result;
    }
}
