# ucsc-codegen-demo
## Customer parser and compiler for JVM built from scratch using ASM and Java
### Inspired from the Ballerina Session Conducted at UCSC by WSO2

Generic implementation which works with any input code given in the new language format (using Func, Stmt, Expr classes)  
Samples: Factorial and Fibonacci

```
// Sample factorial function in Java
public class Fac {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println(fac(n));
    }

    public static int fac(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * fac(n-1);
    }
}
```

```
// Sample fibonacci function in Java
public class Fib {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println(fib(n));
    }

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}
```
