Find Prime Numbers in Java, C++ and PHP

I made these scripts to kinda test the performance differences between Java and CPP.
I added PHP just to see how big of a difference it makes.

These programs will find Prime numbers greater than 1 Billion.

When i ran all of them at once on a quad core cpu (so that every program uses one core),
to my surprise, Java performed faster than CPP. And PHP was far behind, when Java and CPP generated almost 20 numbers, PHP generated 1.

To run these:

PHP:
> php PrimeNumbers.php

Java:
> javac PrimeNumbers.php
> java PrimeNumbers

C++:
> g++ PrimeNumbers.cpp
> ./a.out

Please note that I made these just for testing, so code isn't commented and needs cleaning. 
