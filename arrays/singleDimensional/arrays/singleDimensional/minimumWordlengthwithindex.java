package arrays.singleDimensional;

public class minimumWordlengthwithindex {
        public static void main(String[] args) {
        String [] SA = {"Chai","Coffee","tea","Water","Coke"};

        System.out.println("The shortest word is " + smallest(SA));
    }

    public static String smallest(String SA[]) {
        
        int index = 0;
        int firstLength = SA[0].length();
        for (int i = 0; i < SA.length; i++){
            if(SA[i].length() < firstLength){
                index = i;
                firstLength = SA[i].length();  
            }   
                
        }
        System.out.println("index value is: "+ index); 
        return SA[index];
}
}
