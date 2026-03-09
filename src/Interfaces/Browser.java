package Interfaces;

public class Browser {

    Stack pageStack;
    public  Browser(Stack stack){
        pageStack=stack;
    }


    void goToPrevious(){
        pageStack.pop();
        System.out.println("Opening the prev Page");
        pageStack.top();


    }
}
