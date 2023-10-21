package org.example.model;

public interface Data {
    /** sum() - Функция суммирует число numberA и numberB
     */
    String sum(Number numberA, Number numberB);
    /** subtraction() - Функция вычитает число numberA и numberB
     */
    String subtraction(Number numberA, Number numberB);
    /** division() - Функция делит число numberA на numberB
     */
    String division(Number numberA, Number numberB);
    /** multiplication() - Функции умножает число numberA на numberB
     */
    String multiplication(Number numberA, Number numberB);

    String sumComplex(Integer numA, Integer numB, Integer numA2, Integer numB2);

    String subtractionComplex(Integer numA, Integer numB, Integer numA2, Integer numB2);

    String multiplicationComplex(Integer numA, Integer numB, Integer numA2, Integer numB2);

    String divisionComplex(Integer numA, Integer numB, Integer numA2, Integer numB2);

}
