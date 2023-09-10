package com.gl.question3;

import java.util.Arrays;

public class MapFilter {

	public static void main(String[] args) {
		int arr[]={1,2,3,4,5};
		System.out.println(Arrays.stream(arr).filter(x->x%2!=0).map(x->x*x).sum());

	}

}
