import java.util.ArrayList;

public class UserName {
    // The list of possible user names, based on a user’s first and last names and initialized by the constructor.
    private ArrayList<String> possibleNames;

    /** Constructs a UserName object as described in part (a).
     * Precondition: firstName and lastName have length greater than 0
     * and contain o
     * nly uppercase and lowercase letters.
     */
    public UserName(String firstName, String lastName) {
        for(int i = 1; i < firstName.length(); i++){
            possibleNames.add(lastName + firstName.substring(0, i));
        }
    }

    /** Returns true if arr contains name, and false otherwise. */
    public boolean isUsed(String name, String[] arr)
    {
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == name){
                return true;
            }
        }
        return false;
    }

    /** Removes strings from possibleNames that are found in usedNames as described in part (b).
     */
    public void setAvailableUserNames(String[] usedNames) {
        for(int i = 0; i < usedNames.length; i++){
            for(int j = 0; j < possibleNames.size(); j++){
                if(possibleNames.get(j) == usedNames[i]){
                    possibleNames.remove(j);
                }
            }
        }
    }
}
