package oopExercises.friends;

import java.util.ArrayList;

public class Friend {
    private String myName = null;
    private ArrayList<String> myFriends = new ArrayList<>();
    private int counter = 0;

    protected void setMyName(String myName){
        this.myName = myName;
    }

    protected String getMyName(){
        return myName;
    }

    protected int getCounter(){
        return counter;
    }

    protected void letsBeFriends(String friend){
        if(!friend.isEmpty()) {
            myFriends.add(friend);
            counter++;
        }
        else{
            System.out.printf("%s can't make friends now.%n", myName);
        }
    }

    @Override
    public String toString(){
        return String.format("%s is friends with %s.", myName, String.join(", ", myFriends));
    }
}
