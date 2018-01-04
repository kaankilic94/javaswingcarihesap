
public class Validation {
    
    final private String PHONE_PATTERN = "(([\\+]90?)|([0]?))([ ]?)((\\([0-9]{3}\\))|([0-9]{3}))([ ]?)([0-9]{3})(\\s*[\\-]?)([0-9]{2})(\\s*[\\-]?)([0-9]{2})";
    final private String LETTER_PATTERN = "^[a-zA-Z]+$";
    public boolean telefonMu(String tel){
        if (tel.matches(PHONE_PATTERN)) {
            return true;
        }
        return false;
    }
    
    public boolean sayiMi(String data){
        
        for (char c :  data.toCharArray())
         {
             if (!Character.isDigit(c)) {
                 return false;
             }
        }
        
        return true;
    }
    
    public boolean harfMi(String harf){
        for (char c :  harf.toCharArray())
         {
             if (!Character.isAlphabetic(c)) {
                 return false;
             }
        }
        return true;
    }
}
