class Largest{
    public static void main(String[] args) {
        int a=23;
        int b=6;
        int c=65;
        if(a>b && a>c){
            System.out.println(a+ " is Largest");
        }else if(b> a&& b>c){
            System.out.println(b+ " is Largest");        
        }else{
            System.out.println(c+ " is Largest");
        }
    }
}