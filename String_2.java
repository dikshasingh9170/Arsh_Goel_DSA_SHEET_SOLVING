import java.util.*;
class String_2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }
            else{
                hm.put(s.charAt(i),1);
            }
        }
        for(Map.Entry<Character,Integer> e:hm.entrySet()){
            if(e.getValue()>1){
                System.out.println(e.getKey()+"-"+e.getValue());
            }
        }
    }
}
