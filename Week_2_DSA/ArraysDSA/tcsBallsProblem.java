import java.util.ArrayList;
import java.util.List;

class tcsBallsProblem{
    public static void main(String[] args) {
        int G = 1, Y = 1, R = 1;
        List<String> allArrangements = countFunc(G,Y,R);
        System.out.println("All Arrangements: "+allArrangements);
        System.out.println("Size of Arrangements: "+allArrangements.size());
    }

    public static List<String> countFunc(int green, int yellow, int red){
        List<String> result = new ArrayList<>();
        serviceArrangements(green,yellow,red, "", ' ', result);
        return result;
    }

    public static void serviceArrangements(int G, int Y, int R, String currentArrangement, char lastBall, List<String> result){
        if(G == 0 && Y == 0 && R == 0){
            result.add(currentArrangement);
            return;    
        }        

        if(G > 0 && lastBall != 'G'){
            serviceArrangements(G - 1, Y, R, currentArrangement + "G", 'G', result);
        }
        if(Y > 0 && lastBall != 'Y'){
            serviceArrangements(G, Y - 1, R, currentArrangement + "Y", 'Y', result);
        }
        if(R > 0 && lastBall != 'R'){
            serviceArrangements(G, Y, R - 1, currentArrangement+ "R", 'R', result);
        }
    }
 }