import businessreg.*;
import tax.*;
import nationalId.*;
import passport.*;
public class Main {
    public static void main(String[] args) {
        taxservice tax =new taxservice();
        taxinfo Taxinfo=new taxinfo();
        businessreg business=new businessreg();
        businessinfo info=new businessinfo();
        idservice idservices=new idservice();
        idinfo idinformation= new idinfo();
        passportinfo passportinformation=new passportinfo();
        passportservice passport =new passportservice();
        Taxinfo.displaytaxinfo();
        tax.calculatetax();
        business.registerbusiness();
        info.businessinfo();
        idservices.registerid();
        idinformation.displayNationalidinfo();
        passportinformation.displaypassportinfo();
        passport.applypassport();



        }
    }
