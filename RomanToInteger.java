import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public int romanToInt(String s)
    {
        int l =s.length();
        int sum =0;
        char c[] ;

        c = s.toCharArray();
        for(int i=0;i<l;i++)
        {
            switch(c[i])
            {
                case 'I' :
                          if(i+1<l && c[i+1]=='V')
                          {
                            sum=sum+4;
                            i=i+1;
                          }
                          else if (i+1<l && c[i+1]=='X')
                          {
                            sum=sum+9;
                            i=i+1;
                          }
                         else
                         {
                             sum=sum+1;
                         }

                    break;

                case 'V' :
                          sum=sum+5;
                          break;

                case 'X' :
                         if(i+1<l && c[i+1]=='L')
                         {
                            sum=sum+40;
                            i=i+1;
                         }
                        else if (i+1<l && c[i+1]=='C')
                        {
                            sum=sum+90;
                            i=i+1;
                        }
                        else
                        {
                            sum=sum+10;
                        }
                        break;

                case 'L' :
                            sum=sum+50;
                            break;

                case 'C' :
                         if(i+1<l && c[i+1]=='D')
                         {
                             sum=sum+400;
                             i=i+1;
                         }
                         else if (i+1<l && c[i+1]=='M')
                         {
                             sum=sum+900;
                             i=i+1;
                         }
                         else
                         {
                             sum=sum+100;
                         }
                         break;

                case 'D' :
                          sum=sum+500;
                          break;

                case 'M' :
                          sum=sum+1000;
                          break;
            }
        }

    return sum;
    }

    public static void main(String[] args) {
    String s ="MCMXCIV";
    RomanToInteger romanToInteger = new RomanToInteger();
    int ans=romanToInteger.romanToInt(s);
    System.out.println(ans);
    }
}


