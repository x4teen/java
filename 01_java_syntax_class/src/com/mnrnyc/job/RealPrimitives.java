package com.mnrnyc.job;

public class RealPrimitives {
	
    public static void main(String[] args) {
        float f = 1.1f; // a single-precision 32 bit IEEE 754 floating point
        double d = 1.1d ; // a double precision 64 bit IEEE 754 floating point
        
        double d1 = 123.4;
        double d2 = 1.234e2; // same values as d1, but in scientific notation
        float f1 = 123.4f;
        System.out.println("Output = " + d1 + " " + d2 + " " +f1);
    }
}
