package com.week10.assesment;

public class Pyramid1 {

	public static void main(String[] args) {
		int star=1;
    for(int row=1;row<=9;row++) {
    	for(int col=1;col<=star;col++) {
    		System.out.print("*");
    		
    	}
    	System.out.println();
    	if(row>9/2) {
    		star--;;
    	}
    	else {
        	star++;

    	}
    }
	}

}
