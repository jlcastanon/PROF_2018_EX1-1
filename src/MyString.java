public class MyString{

    String s = "";

    public MyString(String s){
        this.s = s;
    }

    public int compareTo(MyString s){
        int res = 0;
        //nodo 1
        if(this.s.length() != s.s.length()){
            //nodo 2
            return this.s.length() - s.s.length();
        }
        //nodo 3
        if(this.s.length() == 0){
            //nodo 4
            return res;
        }
        //nodo 5
        for (int i=0;i < s.s.length();i++){
            res += this.s.charAt(i) -  s.s.charAt(i);
        }

        return res;
    }


}