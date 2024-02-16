package org.Assignments.Strings;

public class ReverseString
{
    public static void main(String[] args)
    {
        String s1 = "JavaJ2eeStrutsHibernate";

        String s2 = "StrutsHibernateJavaJ2ee";

        //Step 1

        if(s1.length() != s2.length())
        {
            System.out.println("String2 is not rotated version of String1");
        }
        else
        {
            //Step 2

            String s3 = s1 + s1;

            //Step 3

            if(s3.contains(s2))
            {
                System.out.println("String2 is a rotated version of String1");
            }
            else
            {
                System.out.println("String2 is not rotated version of String1");
            }
        }
    }
}