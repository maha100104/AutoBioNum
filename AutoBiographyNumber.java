import java.util.*;

public class autobiographicNumber {
    public static void findAuto(String s)
    {
        int sum=0,count=0;
        for(int i=0;i<s.length();i++)
        {
            sum=sum+Integer.parseInt(s.charAt(i)+"");
        }
        if(sum==s.length())
        {
            int arr[]=new int[10];
            for(int i=0;i<s.length();i++)
            {
                arr[Integer.parseInt(s.charAt(i)+"")]++;
            }
            for(int i=0;i<s.length();i++)
            {
                if(arr[i]!=0)
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        findAuto(s);

    }
}
/*
Output:
AutoBiography Number : 1201
count : 3*/
