import java.util.*;

public class EncryptionProgram {

    private Scanner scanner;
    private Random random;
    private ArrayList<Character> list;
    private ArrayList<Character> shuffledList;
    private char character;
    private String line;
    private char[] letters;
    private char[] secretLetters;
    EncryptionProgram(){
         scanner = new Scanner(System.in);
         random = new Random();
         list = new ArrayList<>();
         shuffledList = new ArrayList<>();
         character = ' ';

         newKey();
         askQuestion();

    }
    private void askQuestion(){
        while(true){
            System.out.println("*******************************************************");
            System.out.println("What do you want to do? ");
            System.out.println("(N)ewKey, (G)etKey, (E)ncrypt, (D)ecrypt, (Q)uit");
            char response = Character.toUpperCase(scanner.nextLine().charAt(0));

            switch(response){
                case 'N':
                    newKey();
                    break;
                case 'G':
                    getKey();
                    break;
                case 'E':
                    encrypt();
                    break;
                case 'D':
                    decrypt();
                    break;
                case 'Q':
                    quit();
                    break;
                default:
                    System.out.println("Invalid choice ");

            }
        }

    }
    private void newKey(){

        character = ' ';
        list.clear();
        shuffledList.clear();

        for(int i = 32; i<127; i++ ){
            list.add(Character.valueOf(character));
            character++;
        }
        shuffledList = new ArrayList<>(list);
        Collections.shuffle(shuffledList);
        System.out.println("A new key has been created");

    }

    private void getKey(){
        System.out.println("Key: ");
        for(Character x : list){
            System.out.print(x);
        }
        System.out.println();
        for(Character x : shuffledList){
            System.out.print(x);
        }
        System.out.println();

    }
    private void encrypt(){

    }
    private void decrypt(){

    }
    private void quit(){

    }

}
