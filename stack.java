/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bab_viii;

/**
 *
 * @author Cipta Ramadhani
 */
public class stack {


    static int[] stack;
    static int ukuran;
    static int top;
    
    static void inisialisasi(int i)
    {
        ukuran=i;
        stack=new int[ukuran];
        top=0;
    }
    
    static boolean isempty()
    {
        return top<=0;
    }
    
    static boolean isfull()
    {
        return top>=ukuran;
    }
    
    static void insert(int i)
    {
        if(isfull())
            System.out.println("maaf, tumpukan penuh");
        else
        {
            System.out.println("nilai "+i+" masuk tumpukan");
            stack[top++]=i;
        }
    }
    
    static void pick()
    {
        if(isempty())
            System.out.println("maaf, tumpukan kosong");
        else
        {
            top--;
            System.out.println("nilai "+stack[top]+" keluar tumpukan");            
        }
    }
    
    static void find(int i)
    {
        boolean hasil=false;
        int temp=0;
        while(temp<top)
        {
            if(i==stack[temp])
            {
                hasil=true;
                break;
            }
             
            temp++;
        }
        
        if(hasil)
            System.out.println("nilai ditemukan pada tumpukan ke :"+temp);
        else
            System.out.println("nilai tidak ditemukan");
    }
    
    static void display()
    {
     int i=top-1;
     
     while(i>=0)
     {
         System.out.println("nilai stack ke :"+(i+1)+" :"+stack[i]);
         i--;
     }
    }            
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        stack a=new stack();
        a.inisialisasi(5);
        a.pick();
        a.insert(3);
        a.insert(2);
        a.insert(12);
        a.insert(8);
        a.insert(18);
        a.display();
        a.insert(7);
        a.pick();
        a.find(12);
        a.find(5);
        a.display();
        
    }
}
