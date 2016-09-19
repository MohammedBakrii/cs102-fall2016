package topic01.files;

import java.util.ArrayList;

public class ArraysReview {
    public static void main(String []args){
        
        int x = 1;
        int y = 2;
        
        //static array
        Double [] V = new Double [2];
        V[0]=9.3;
        V[1]=8.4;
        
        String firstName = "Ahmed";
        String lastName = "Kamel";
        
        int [] [] intMatrix = new int [3][4];
        
        
        
        String [] name ={"Ahmed", "Kamel"};
        
        ArrayList<String> stringList = new ArrayList<String>();
        
        
        System.out.println(name[0]);
        System.out.println(name[1]);
        
        Integer [] intArray = {12, -17, -6,9,2};
        int x0 = intArray[0];
        
        int [] ArrayOfInt = new int [6];
        
        for (int i = 0; i<intArray.length; i++){
            System.out.printf("A[%d] = %d\n", i, intArray[i]);
        }       
        
        for (int i = 0; i<name.length; i++){
            System.out.printf("name[%d] = %s\n", i, name[i]);
        } 
        
        for (int i = 0; i<ArrayOfInt.length; i++){
            System.out.printf("ArrayOfInt[%d] = %d\n", i, ArrayOfInt[i]);
        } 
        
        
        //fill the matrix such m[i][j]=i+j
        for (int i=0;i<intMatrix.length;i++){
            for (int j=0;j<intMatrix[i].length;j++){
                intMatrix[i][j]=i+j;
            }
        }
        
        System.out.printf("intMatrix: \n");
        for (int i=0;i<intMatrix.length;i++){
            for (int j=0;j<intMatrix[i].length;j++){
                System.out.printf("%d\t", intMatrix[i][j]);
            }
            System.out.println("");
        }
        
        System.out.println("Size of name: "+ name.length);
        
        System.out.println("Size of StringList: "+ stringList.size());
        stringList.add("Mohamed");
        System.out.println("Size of StringList: "+ stringList.size());
       stringList.add("Ahmed");
        System.out.println("Size of StringList: "+ stringList.size());
       stringList.remove(0);
        System.out.println("Size of StringList: "+ stringList.size());
       
        
        for (int i=0;i<stringList.size();i++){
            System.out.printf("stringList[%d]= %s\n", i, stringList.get(i));
        }
        
    }    
}
