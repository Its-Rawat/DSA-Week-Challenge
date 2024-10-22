class Basics{
    public static void main(String[] args){
        
        String[] names;

        int size = 20;

        names = new String[size];

        names[0] = "Aditya";
        names[1] = "Aayush";
        names[2] = "Deewanshi";


        for(int i = 0; i < 3; i++){
            System.out.println("Index["+i+"] have Name: "+names[i]);
        }
        
    }
}
