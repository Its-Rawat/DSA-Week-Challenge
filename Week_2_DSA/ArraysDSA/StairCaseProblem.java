
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Refer to this Page for Question: https://www.hackerrank.com/challenges/staircase/problem?isFullScreen=true
*/

class StairCaseProblem{
    public static void main(String[] args) {
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        try {
                n = Integer.parseInt(bufferReader.readLine().trim());        
        } catch (Exception e) {
        }
        for(int i = 0; i < n; i++){
            
            // for white spaces.
            for(int j = 0; j < n - i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++){
                System.out.print("#");
            }
            System.out.println("");
        }
    
    }
}