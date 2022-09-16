/*
 * @author Cipta Ramadhani
 * Buku Dasar Algoritma dan Struktur Data Bahasa Java
 */

class data
{
    int nilai;
    data next;
    
    public data(int n,data nex)
    {
        nilai=n;
        next=nex;
    }            
}

public class single_linkedlist 
{
    private static data head;
    private static int list;
    
    public single_linkedlist()
    {
        head=null;
    }
    
    static boolean isempty()
    {
        return head==null;
    }
    
    static void insert(int n)
    {
        data temp;
        temp=new data(n, head);
        head=temp;
        System.out.println("nilai "+n+" masuk linked list");
        list++;
    }
    
    static void insertafter(int n,int indeks)
    {
        if(isempty())
            System.out.println("linked list kosong");
        else
        {
            if(indeks>list)
                System.out.println("maaf, indeks melebihi panjang list");
            else
            {
                data temp=head;
                data fixed;
                for(int i=1;i<indeks;i++)
                {
                    temp=temp.next;
                }
                fixed=new data(n, temp.next);
                temp.next=fixed;
                System.out.println("nilai "+n+" masuk linked list");
                list++;
            }
        }        
    }
    
    static void insertbefore(int n,int indeks)
    {
        if(isempty())
            System.out.println("linked list kosong");
        else
        {
            if(indeks>list)
                System.out.println("maaf, indeks melebihi panjang list");
            else
            {
                data temp=head;
                data fixed;
                for(int i=0;i<indeks-1;i++)
                {
                    temp=temp.next;
                }
                
                if((head.nilai==temp.nilai)&&(indeks==1))
                {
                    temp=new data(n, head);
                    head=temp;
                    System.out.println("nilai "+n+" masuk linked list");
                    list++;
                }else
                {
                    fixed=new data(n, temp.next);
                    temp.next=fixed;
                    System.out.println("nilai "+n+" masuk linked list sebelum indeks "+indeks);
                    list++;
                }                
            }
        }
    }
    
    static void delete()
    {
        if(isempty())
        {
            System.out.println("linked list kosong");                         
        }else
        {
            System.out.println("nilai "+head.nilai+" terhapus");
            head=head.next;
            list--;
        }
    }
    
    static void del_linked(int indeks)
    {
        if(isempty())        
            System.out.println("linked list kosong");
        else
        {
            if(indeks>list)
                System.out.println("maaf, indeks melebihi panjang list");
            else
            {
                data temp=head;
                for(int i=1;i<indeks-1;i++)
                {
                    temp=temp.next;
                }   
                
                if((head.nilai==temp.nilai)&&(indeks==1))
                {
                    System.out.println("nilai "+head.nilai+" pada indeks "+indeks+" dihapus");
                    head=head.next;
                    list--;
                }else
                {
                    System.out.println("nilai "+temp.next.nilai+" pada indeks "+indeks+" dihapus");
                    temp.next=temp.next.next;
                    list--;
                }
            }
        }        
    }
    
    static void findlist(int i)
    {
        data temp=head;
        int x=0;
        boolean hasil=false;
        while(temp!=null)
        {
            x++;
            if(temp.nilai==i)
            {
                hasil=true;
                break;
            }
            temp=temp.next;
        }
        
        if(hasil)
            System.out.println("nilai ditemukan pada lsit ke "+x);
        else
            System.out.println("maaf, data tidak ditemukan");
    }
    
    static void display()
    {
        data temp=head;
        System.out.println("jumlah data dalam linked lsit :"+list);
        while(temp!=null)
        {
            System.out.println("isi linked list :"+temp.nilai);
            temp=temp.next;
        }
    }
    
    
    public static void main(String[] args) {
        
        single_linkedlist a=new single_linkedlist();
        a.delete();
        a.insert(12);
        a.insert(2);
        a.insert(1);
        a.insert(34);
        a.delete();
        a.insertafter(13, 1);
        a.insertbefore(15, 1);
        a.del_linked(2);
        a.findlist(15);
        a.display();
    }
}
