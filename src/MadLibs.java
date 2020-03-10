import java.util.Random;
import java.util.Scanner;

public class MadLibs {
    Scanner scanner = new Scanner(System.in);
    String story;
    String name;
    String adjective1;
    String adjective2;
    String noun1;
    String noun2;
    String noun3;
    String adverb;
    String randomNums;
    Random rand = new Random();

    //getters

    public String getStory(){
        return story;
    }
    public String getName(){
        return name;
    }
    public String getAdjective1(){
        return adjective1;
    }
    public String getAdjective2(){
        return adjective2;
    }

    public String getNoun1() {
        return noun1;
    }

    public String getNoun2() {
        return noun2;
    }

    public String getNoun3() {
        return noun3;
    }

    public String getAdverb() {
        return adverb;
    }

    public String getRandomNums() {
        return randomNums;
    }

    //Setters

    public void setStory (String newStory){
        this.story = newStory;
    }
    public void setName(String newName) {
        this.name = newName;
    }

    public void setAdjective1(String newAdjective1) {
        this.adjective1 = newAdjective1;
    }

    public void setAdjective2(String newAdjective2) {
        this.adjective2 = newAdjective2;
    }

    public void setNoun1(String newNoun1) {
        this.noun1 = newNoun1;
    }

    public void setNoun2(String newNoun2) {
        this.noun2 = newNoun2;
    }

    public void setNoun3(String newNoun3) {
        this.noun3 = newNoun3;
    }

    public void setAdverb(String newAdverb) {
        this.adverb = newAdverb;
    }

    public void setRandomNums() {
        // the first line int num  we  get a random number
        int num = Math.abs(rand.nextInt()) % 100;
        //then we set the int index  to 0
        int index = 0;
        // then we create an array of 3 number which start  array 0, array 1, array2. All of them are the same type
        // int[] means the symbol of array and then we initialize the array with int[3]
        int[] numberHolder = new int[3];
        //then we create a while loop which the index will start from 0 and will stop at the 3rd array which is number2
        while (index < numberHolder.length) {
            // we will have access to array 1, then array and then array 3 and add the number of index.
            // because we added random number from %100 which is 10.
            // in the first array, we will have 10 + 0 = 10
            // in the second array, we will have 10 + 1 = 11
            // in the third array, we will have 10 + 2 = 12
            numberHolder[index] = num + index;
            // then we will increment the index with index++
            index++;
        }
        // then by incrementing index++ the first index is 0, the second is 1 and the third one is 2
        // it will be NOT  10 + 0 = 10
        //  NOT 10 + 1 = 11
        //but --> YES 10 + 2 = 12
        randomNums = " not " +numberHolder[0]+ ", not" +numberHolder[1]+ ", but" + numberHolder[2];
    }

    // print instructions

    public void printInstructions() {
        System.out.println("welcome to the Madlibs Game. If you type in"
        + "words, we will give you an story. Start bye typing in a name");
    }

    public void enterName(){
        setName(scanner.nextLine());
    }
    public void enterNoun1(){
        System.out.println("give me a noun!");
        setNoun1(scanner.nextLine());
    }
    public void enterNoun2(){
        System.out.println("give me another noun!");
        setNoun2(scanner.nextLine());
    }
    public void enterNoun3(){
        System.out.println("give me the last noun!");
        setNoun3(scanner.nextLine());
    }
    public void enterAdjective1(){
        System.out.println("I need an adjective!");
        setAdjective1(scanner.nextLine());
    }
    public void enterAdjective2(){
        System.out.println("I need another adjective!");
        setAdjective2(scanner.nextLine());
    }
    public void enterAdverb(){
        System.out.println("Please I need an Adverb");
        setAdverb(scanner.nextLine());
    }

    public void putTogetherTheStory(){
        String story;
        int num = Math.abs(rand.nextInt()) % 2;
                if (num == 0) {
                    story = " Jesse and her Best friend "
                            + getName() + " went to disneyland" + "They saw a "
                            + getNoun1() + " in a show at the Magic Kingdom" + " and ate a "
                            + getAdjective1() + " feast for dinner. The next day I " + " ran "
                            + getAdverb() + " to meet mickey mouse in his "
                            + getNoun2() + " ." + " and then that nigth i gazed at the "
                            + getRandomNums() + " "
                            + getAdjective2() + " fireworks shooting from the "
                            + getNoun3() + ".";
                } else {
                    story = " Amanada and her friend "
                            + getName() + " went to the zoo last summer" + " they saw a huge "
                            + getNoun1() + " and a little tiny "
                            + getNoun2() + " that nigth they decided to climb "
                            + getAdverb() + " into the "
                            + getNoun3() + " to get a closer look " + "the zoo was"
                            + getAdjective1() + "  but the didn't care " + " until..."
                            + getRandomNums() + ". "
                            + getAdjective2() + " apes yelled in their faces, making " + " Amanda and "
                            + getName() + " sprint all the way back home ";
                }
                setStory(story);

    }

    public void play(){

        enterName();
        enterNoun1();
        enterAdjective1();
        enterAdjective2();
        enterNoun2();
        enterAdverb();
        enterNoun3();
        setRandomNums();
        putTogetherTheStory();
        System.out.println(getStory());

    }
    public static void main(String[] args) {

        //todocode application here

        MadLibs game =new MadLibs();
        game.printInstructions();
        game.play();
    }
}
