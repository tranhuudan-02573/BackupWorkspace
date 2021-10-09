package String;

import java.lang.*;
import java.io.*;
import java.util.*;

// Java program to ReverseString using StringBuilder

public class ReverseString {
	public static void main(String[] args) {
		String input = "Geeks for Geeks";

		StringBuilder input1 = new StringBuilder();

		// append a string into StringBuilder input1
		input1.append(input);

		// reverse StringBuilder input1
		input1.reverse();
		System.out.println(input1);

	}
}
