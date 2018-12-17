package configuracion;

import java.io.FileWriter;
import java.io.InputStream;
import java.util.Properties;

public class ConfBaseDatos 
{
    Properties p = new Properties();
    private String user;
    private String password;
    private String database;
    private String driver;
        
    public ConfBaseDatos() 
    {
        try 
        {
            InputStream propertiesStream = ClassLoader.getSystemResourceAsStream("configuracion/configBD.properties");
            this.p.load(propertiesStream);
            propertiesStream.close();
            this.user     = p.getProperty("user");
            this.password = p.getProperty("password");
            this.database = p.getProperty("database");
            this.driver   = p.getProperty("driver");
        } 
        catch (Exception e) 
        {
            System.err.println("Error reading file " + e.getMessage());
        }
    }
    
    public String getUser()
    {
        return this.user;
    }
    public String getPassword()
    {
        return this.password;
    }
    public String getDatabase()
    {
        return this.database;
    }
    public String getDriver()
    {
        return this.driver;
    }
}
