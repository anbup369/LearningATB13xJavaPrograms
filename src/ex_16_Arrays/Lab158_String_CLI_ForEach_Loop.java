package ex_16_Arrays;

public class Lab158_String_CLI_ForEach_Loop {
    public static void main(String[] pramod) {//getting CLI input from edit configuration
        // 10 pramod true

//for loop to get cli input
        for (int i = 0; i < pramod.length; i++) {
            System.out.println(pramod[i]);
        }

        System.out.println(" -- ");
//enhanced for loop or for each loop- getting cli input
        for(String arg:pramod){
            System.out.println(arg);
        }
    }
}
