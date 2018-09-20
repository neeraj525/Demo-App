import java.util.*;
    import java.io.*;
    class HashMapDemo
    {
        public static void main(String args[])
        {
            HashMap hm=new HashMap();
            hm.put("101",new String("neeraj"));
            hm.put("102",new String("rahul"));
            hm.put("103",new String("neeraj"));
            hm.put("104",new String("ashok"));
            hm.put("105",new String("ashruti"));
            
            Set set=hm.entrySet();
            Iterator i=set.iterator();
            while(i.hasNext()){
                Map.Entry me=(Map.Entry)i.next();
                System.out.println(me.getKey()+":");
                System.out.println(me.getValue()+":");
            }
        }
    }
    