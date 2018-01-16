/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MMCTimeTable;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author 
 */
public class PerDayGenerator {
    
    private int periodAlloted[],noOfPeriods,actualPeriodAlloted[];
    PerDayGenerator(int m)
    {
        noOfPeriods=m;
        periodAlloted=new int[m];
        actualPeriodAlloted=new int[m];
        for(int i=0;i<m;i++)
            actualPeriodAlloted[i]=-1;//Makes an blank array based on  no period
    }
    int[] Generator(int table[],int size)
    {
        int copy[]=new int[table.length]; //5 hours 5 days = 25 table length
        int cnt=0;
        for(int i=0;i<noOfPeriods;i++) 
        {
            copy[i]=table[i];
            if(table[i]>0)
                cnt++;
        }
        int ctr=0;
        for(int it=0;it<noOfPeriods;)
        {
            ctr++;
            if(ctr>100)
                break;
        int val=1;
        int index[]=new int[size];  //table = number of hours of subjects in a day
        for(int i=0;i<size;i++)
        {
            if(table[i]>0)
            {
                index[i]=val;
                val++;  //number of subjects per day
            }
        }
        
        int ind=0;
        Random r=new Random(); //Creates a random number
        int rand=r.nextInt(val);
        if(val==2) 
            rand=1;
        System.out.println("rand = "+rand);
        for(int j=0;j<size;j++)
        {
            if(index[j]==rand)
            {
               ind=j;
               break;
            }
        }
        while(table[ind]>0){
        periodAlloted[it]=ind;
        System.out.print(periodAlloted[it]+" ");
        table[ind]--;
        it++;
        }
        
        }
   
        int curcnt=0;
        for(int i=0;curcnt<cnt;i=(i+1)%noOfPeriods)
        {
            Random r = new Random(); // Generate another random element
            int rand = r.nextInt(2);
            if(rand==0)
            {
                ;
            }
            else
            {
                if(actualPeriodAlloted[i]==-1)
                {
                    actualPeriodAlloted[i]=periodAlloted[curcnt];
                    curcnt++;
                }
            }
        }
        for(int i=0;i<noOfPeriods;i++)
        {
            table[i]=copy[i];
        }
    
        return actualPeriodAlloted;   
	}
}