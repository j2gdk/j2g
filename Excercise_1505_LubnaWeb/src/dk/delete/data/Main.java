package dk.delete.data;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	  public void validateEmail(String emailStr) 
		   {
		        Matcher matcher = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE).matcher(emailStr);
		        if(matcher.find())
		        {
		            System.out.println("The given email is valid");
		        }
		        else
		        {
		            System.out.println("The given email is invalid");
		        }
		    }
		}
		