/**
* Universidad Del Valle de Guatemala
* Pablo Diaz 13203
* Feb 11, 2017
**/

package smtp;

import java.io.Serializable;

/**
 *
 * @author SDX
 */
public class User implements Serializable {

    private String emailAdress;

    public User(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    @Override
    public String toString() {
        return "User{" + "emailAdress=" + emailAdress + '}';
    }
    
    
}
