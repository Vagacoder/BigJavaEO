package bigjava;

/*
 * E26.1 Write a JSF application that reports the values of the following system 
 * properties of the web server:
• The Java version (java.version)
• The operating system name (os.name)
• The operating system version (os.version)

 * Supply a bean that uses the getProperties method of the System class.
 
 */
@ManagedBean
@SessionScoped
public class SystemInfoBean {

    public String getJavaVersion(){
        // * both work
        // return java.lang.Runtime.version().toString();
        return System.getProperty("java.version");
    }

    public String getOsName(){
        return System.getProperty("os.name");
    }

    public String getOsVersion(){
        return System.getProperty("os.version");
    }
}