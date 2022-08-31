public class Problem1 {
    static public int problem1Solution (String input, int adjacent){
       int total ,highest ,num;
        total = highest = 1;
    for(int i = 0; i < input.length(); i++){
        if((input.length() - i) - 1 < adjacent){
            break;
        }
        for(int j = 0; j < adjacent; j++){
            num = input.charAt(j + i) - '0';
            total = total * num;
        }
        if (total > highest){
            highest = total;
        }
        total = 1;
    }
        return highest;
    }
}
