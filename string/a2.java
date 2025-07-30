public class a2 {
    public static void main(String[] args) {
        String s="hello";
        String n="";
        for(int i=0;i<s.length();i++){
            boolean isDuplicate = false;
            for(int j=0;j<n.length();j++){
                if(s.charAt(i)==n.charAt(j)){
                    isDuplicate=true;
                    break;
                }
            }
            if(!isDuplicate){
            n=n+s.charAt(i);
        }
        }
        System.out.println(n);

    }
}
