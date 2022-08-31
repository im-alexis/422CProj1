public class Problem2 {
    static void problem2Solution(String input){
        int runningSum = 0;
        int startIndex = 0;
        for(int i = 0; i < input.length(); i++){
            if((input.charAt(i) >= 0x41) && (input.charAt(i) <= 0x5A)){
                runningSum = runningSum + (input.charAt(i) - 0x40);
            }
           else if((input.charAt(i) >= 0x61) && (input.charAt(i) <= 0x7A)){
                runningSum = runningSum + (input.charAt(i) - 0x60);
            }
           else{
               runningSum = runningSum + 0;
            }
            if(input.charAt(i) == ' '){
                if(runningSum >= 100){
                    System.out.println(input.substring(startIndex,i+1));


                }
                runningSum = 0;
                startIndex = i + 1;
            }
        }
    }
}
