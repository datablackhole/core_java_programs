// Explicit class import (industry std as it improves readability)
import java.util.ArrayList;
import java.util.Date;

// Implicit class import  (reduces readabiblity)
import java.util.*;
import java.io.*;
import java.lang.*;
import java.text.*;

// Static import allows members (fields and methods) defined in a class as public static to be used in Java code without specifying the class in which the field is defined
import static java.lang.System.*;

class p$ImportStatements{
	public static void main(String[] args) {
		Date d = new Date();
		ArrayList a = new ArrayList();
		out.println(d);
		out.println();
	}
}
