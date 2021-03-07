//What? - tier dono service
/*How? 
class:
start
    User
        spirit -donor
            blessing
            oath
            blood-pact
        knight -recipient
            member
            founder

    Organization
        club
        kingdom
*/
public class start {
    // Static method
    static String getUserName() {
        String username = "Tom";
        return username;
    }
    static boolean getStatus(){
        boolean isknight = true;
        return isknight;
    }
  
    // Public method
    public void myPublicMethod() {
      System.out.println("Public methods must be called by creating objects");
    }
  
    // Main method
    public static void main(String[] args) {
        
        String userName = getUserName(); // Call the static method getUserName

        boolean isknight = getStatus(); // Call the static method getStatus

        User newUser = new User(); // Create an object of newUser
        if(isknight == true)
            newUser.knight(); // Call the public method knight
        else
            newUser.spirit();

    }
  }