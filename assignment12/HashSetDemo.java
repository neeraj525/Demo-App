import java.util.*;
            class HashSetDemo{
                public static void main(String args[]){
                    HashSet hs1=new HashSet();
                    
                    HashSet hs2=new HashSet();
                    hs1.add("B");
                    hs1.add("A");
                    hs1.add("D");
                    hs1.add("E");
                    hs1.add("C");
                    hs1.add("F");
                    
                    hs2.add("G");
                    hs2.add("Z");
                    hs2.add("X");
                    hs2.add("B");
                    hs2.add("C");
                    
                    if(hs1.retainAll(hs2)){
                    System.out.println("The Set is :"+ hs1);
                }
            }
                
            }
