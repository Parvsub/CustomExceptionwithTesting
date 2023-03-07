package CustomException;


import org.junit.Assert;
import org.junit.Test;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exceptregix {
    @Test
    public void exptreg1() throws EnterProperAlphabet {
        except exceptObj = new except();
        boolean res = exceptObj.exptregFirst("Praveen");
        Assert.assertEquals(true,res);
    }
    @Test
    public void exptreg2() throws EnterProperAlphabet {
        except exceptObj = new except();
        boolean res = exceptObj.exptregLast("Kumar");
        Assert.assertEquals(true,res);
    }
    @Test
    public void exptreg3() throws EnterProperAlphabet {
        except exceptObj = new except();
        boolean res = exceptObj.exptregMobile("91 9945678322");
        Assert.assertEquals(false,res);
    }

    @Test
    public void exptreg4() throws EnterProperAlphabet {
        except exceptObj = new except();
        boolean res = exceptObj.exptregEmail("abc.xyz@bl.co.in");
        Assert.assertEquals(true,res);
    }

    @Test
    public void exptreg5() throws EnterProperAlphabet {
        except exceptObj = new except();
        boolean res = exceptObj.exptregPassword("Pravee125@");
        Assert.assertEquals(true,res);
    }
}

class except {
    public boolean exptregFirst(String FirstName) throws EnterProperAlphabet {
        try {
            Pattern pattern = Pattern.compile("[A-Z]{1}[a-z]+");
            Matcher m = pattern.matcher(FirstName);
            boolean b = m.matches();
            System.out.println(b);
            return b;
        } catch (Exception e) {
            throw new EnterProperAlphabet("Enter the proper FirstName");
        } finally {
            System.out.println("End");
            return true;
        }
    }

    public boolean exptregLast(String LastName) throws EnterProperAlphabet {
        try {
            Pattern pattern = Pattern.compile("[A-Z]{1}[a-z]+");
            Matcher m = pattern.matcher(LastName);
            boolean b = m.matches();
            System.out.println(b);
            return b;
        } catch (Exception e) {
            throw new EnterProperAlphabet("Enter the proper LastName");
        } finally {
            System.out.println("End");
            return true;
        }
    }

    public boolean exptregMobile(String Mobile) throws EnterProperAlphabet {
        try {
            Pattern pattern = Pattern.compile( "[91]{2}\\s[0-9]{10}+");
            Matcher m = pattern.matcher(Mobile);
            boolean b = m.matches();
            System.out.println(b);
            return b;
        } catch (Exception e) {
            throw new EnterProperAlphabet("Enter the proper Mobile");
        } finally {
            System.out.println("End");
            return true;
        }
    }

    public boolean exptregEmail(String Email) throws EnterProperAlphabet {
        try {
            Pattern pattern = Pattern.compile("[abc]{3}.[a-z]{3}+@[bl]{2}.[co]{2}.[a-z]{2}+");
            Matcher m = pattern.matcher(Email);
            boolean b = m.matches();
            System.out.println(b);
            return b;
        } catch (Exception e) {
            throw new EnterProperAlphabet("Enter the proper Email");
        } finally {
            System.out.println("End");
            return true;
        }
    }

    public boolean exptregPassword(String Password) throws EnterProperAlphabet {
        try {
            Pattern pattern = Pattern.compile("[A-Z]{1,}\\d{1,}[!@#$%^&]{1}[a-z]{1,}");
            Matcher m = pattern.matcher(Password);
            boolean b = m.matches();
            System.out.println(b);
            return b;
        } catch (Exception e) {
            throw new EnterProperAlphabet("Enter the proper Password");
        } finally {
            System.out.println("End");
            return true;
        }
    }
}




