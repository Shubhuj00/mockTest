class Fibonacci{
    public static void main(String[] args) {
       int n=10;
       int i=1;
       int s1=0;
       int s2=1;
       int s=0;
        System.out.print(s1+ " ");
        System.out.print(s2+ " ");
        while(i<n-1){
            s=s1+s2;
            System.out.print(s+ " ");
            s1=s2;
            s2=s;
            i++;
        }
    }
}